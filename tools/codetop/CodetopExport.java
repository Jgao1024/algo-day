import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * CodeTop 题目导出器
 * 从 codetop.cc 分页读取题目列表，并生成 Markdown
 *
 * @author: sy
 * @create time: 2025/01/07
 */
public class CodetopExport {

    private static final String BASE_URL = "https://codetop.cc";
    private static final int TOTAL_PAGES = 58;
    private static final int PAGE_SIZE = 20;
    private static final Path OUT_DIR = Path.of("codetop");

    public static void main(String[] args) throws Exception {
        Files.createDirectories(OUT_DIR);

        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(30))
                .build();

        int globalIndex = 1;
        for (int page = 1; page <= TOTAL_PAGES; page++) {
            PageResult pageResult = fetchPage(client, page);
            if (pageResult.items.isEmpty()) {
                break;
            }

            int folderName = page * PAGE_SIZE;
            Path folder = OUT_DIR.resolve(String.valueOf(folderName));
            Files.createDirectories(folder);

            List<SummaryRow> rows = new ArrayList<>();
            for (Question q : pageResult.items) {
                String idxStr = String.format("%03d", globalIndex);
                String safeTitle = sanitizeFileName(q.title);
                String fileName = idxStr + "-" + q.frontendId + "-" + safeTitle + ".md";
                Path mdPath = folder.resolve(fileName);

                writeFile(mdPath, buildProblemMd(q));
                rows.add(new SummaryRow(q.frontendId, q.title, q.difficultyText(), q.leetcodeUrl));
                globalIndex++;
            }

            int start = (page - 1) * PAGE_SIZE + 1;
            int end = Math.min(page * PAGE_SIZE, pageResult.totalCount);
            Path summaryPath = folder.resolve("README.md");
            writeFile(summaryPath, buildSummaryMd(start, end, rows));
        }
    }

    private static PageResult fetchPage(HttpClient client, int page) throws Exception {
        String url = BASE_URL + "/api/questions/?page=" + page;
        String body = httpGet(client, url);

        Object parsed = Json.parse(body);
        if (!(parsed instanceof Map)) {
            return new PageResult(0, List.of());
        }
        Map<?, ?> root = (Map<?, ?>) parsed;

        int count = toInt(root.get("count"), 0);
        Object listObj = root.get("list");
        if (!(listObj instanceof List)) {
            return new PageResult(count, List.of());
        }

        List<?> list = (List<?>) listObj;
        List<Question> out = new ArrayList<>(list.size());
        for (Object it : list) {
            if (!(it instanceof Map)) continue;
            Map<?, ?> item = (Map<?, ?>) it;
            Object lcObj = item.get("leetcode");
            if (!(lcObj instanceof Map)) continue;
            Map<?, ?> lc = (Map<?, ?>) lcObj;

            String frontendId = toStr(lc.get("frontend_question_id"));
            String title = toStr(lc.get("title"));
            String slug = toStr(lc.get("slug_title"));
            int level = toInt(lc.get("level"), 0);

            String leetcodeUrl = buildLeetcodeUrl(frontendId, title, slug);
            out.add(new Question(frontendId, title, slug, level, leetcodeUrl));
        }

        return new PageResult(count, out);
    }

    private static String buildLeetcodeUrl(String frontendId, String title, String slug) {
        if (slug != null && !slug.isEmpty()) {
            return "https://leetcode.cn/problems/" + slug + "/";
        }
        String keyword = (frontendId != null && !frontendId.isEmpty()) ? frontendId : title;
        if (keyword == null) keyword = "";
        return "https://leetcode.cn/problemset/all/?search=" + urlEncode(keyword);
    }

    private static String buildProblemMd(Question q) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ").append(q.frontendId).append(". ").append(q.title).append("\n\n");
        sb.append("- 题号：").append(q.frontendId).append("\n");
        sb.append("- 难度：").append(q.difficultyText()).append("\n");
        sb.append("- LeetCode：[").append(q.title).append("](").append(q.leetcodeUrl).append(")\n\n");

        sb.append("## 题目描述\n");
        sb.append("见题面链接。\n\n");

        sb.append("## 示例\n");
        sb.append("见题面链接。\n\n");

        sb.append("## 最佳解法思路\n");
        sb.append("- TODO\n\n");

        sb.append("## Java 最佳实现\n\n");
        sb.append("```java\n");
        sb.append("// TODO\n");
        sb.append("```\n\n");

        sb.append("## 复杂度分析\n");
        sb.append("- 时间：TODO\n");
        sb.append("- 空间：TODO\n\n");

        sb.append("## 相关题目\n");
        sb.append("- TODO\n");
        return sb.toString();
    }

    private static String buildSummaryMd(int start, int end, List<SummaryRow> rows) {
        StringBuilder sb = new StringBuilder();
        sb.append("# 题目汇总（").append(start).append("-").append(end).append("）\n\n");
        sb.append("| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |\n");
        sb.append("| --- | --- | --- | --- | --- |\n");
        for (SummaryRow r : rows) {
            sb.append("| ").append(escapePipes(r.frontendId)).append(" | ")
                    .append("[").append(escapePipes(r.title)).append("](").append(r.leetcodeUrl).append(")")
                    .append(" | ").append(escapePipes(r.difficulty)).append(" | - | - |\n");
        }
        return sb.toString();
    }

    private static String escapePipes(String s) {
        if (s == null) return "";
        return s.replace("|", "\\|");
    }

    private static void writeFile(Path path, String content) throws IOException {
        Files.createDirectories(path.getParent());
        Files.writeString(path, content, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    private static String httpGet(HttpClient client, String url) throws Exception {
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(60))
                .header("User-Agent", "Mozilla/5.0")
                .GET()
                .build();
        HttpResponse<String> resp = client.send(req, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        if (resp.statusCode() >= 200 && resp.statusCode() < 300) {
            return resp.body();
        }
        throw new IOException("HTTP " + resp.statusCode() + " for " + url);
    }

    private static String sanitizeFileName(String s) {
        if (s == null) return "";
        String out = s;
        out = out.replace("/", " ");
        out = out.replace("\\", " ");
        out = out.replace(":", " ");
        out = out.replace("*", " ");
        out = out.replace("?", " ");
        out = out.replace("\"", " ");
        out = out.replace("<", " ");
        out = out.replace(">", " ");
        out = out.replace("|", " ");
        out = out.replaceAll("\\s+", " ").trim();
        if (out.isEmpty()) out = "题目";
        return out;
    }

    private static String urlEncode(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8);
    }

    private static int toInt(Object o, int def) {
        if (o == null) return def;
        if (o instanceof Number) return ((Number) o).intValue();
        try {
            return Integer.parseInt(String.valueOf(o));
        } catch (Exception e) {
            return def;
        }
    }

    private static String toStr(Object o) {
        if (o == null) return "";
        return String.valueOf(o);
    }

    private static class PageResult {
        final int totalCount;
        final List<Question> items;

        PageResult(int totalCount, List<Question> items) {
            this.totalCount = totalCount;
            this.items = items;
        }
    }

    private static class Question {
        final String frontendId;
        final String title;
        final String slug;
        final int level;
        final String leetcodeUrl;

        Question(String frontendId, String title, String slug, int level, String leetcodeUrl) {
            this.frontendId = frontendId;
            this.title = title;
            this.slug = slug;
            this.level = level;
            this.leetcodeUrl = leetcodeUrl;
        }

        String difficultyText() {
            if (level == 1) return "简单";
            if (level == 2) return "中等";
            if (level == 3) return "困难";
            return "-";
        }
    }

    private static class SummaryRow {
        final String frontendId;
        final String title;
        final String difficulty;
        final String leetcodeUrl;

        SummaryRow(String frontendId, String title, String difficulty, String leetcodeUrl) {
            this.frontendId = frontendId;
            this.title = title;
            this.difficulty = difficulty;
            this.leetcodeUrl = leetcodeUrl;
        }
    }

    private static class Json {
        static Object parse(String s) {
            if (s == null) return null;
            return new Parser(s).parseValue();
        }

        private static class Parser {
            private final String s;
            private final int n;
            private int i;

            Parser(String s) {
                this.s = s;
                this.n = s.length();
                this.i = 0;
            }

            Object parseValue() {
                skipWs();
                if (i >= n) return null;
                char c = s.charAt(i);
                if (c == '{') return parseObject();
                if (c == '[') return parseArray();
                if (c == '"') return parseString();
                if (c == 't') return parseLiteral("true", Boolean.TRUE);
                if (c == 'f') return parseLiteral("false", Boolean.FALSE);
                if (c == 'n') return parseLiteral("null", null);
                return parseNumber();
            }

            private Object parseObject() {
                i++;
                skipWs();
                Map<String, Object> map = new LinkedHashMap<>();
                if (i < n && s.charAt(i) == '}') {
                    i++;
                    return map;
                }
                while (i < n) {
                    skipWs();
                    String key = parseString();
                    skipWs();
                    expect(':');
                    Object val = parseValue();
                    map.put(key, val);
                    skipWs();
                    char c = peek();
                    if (c == ',') {
                        i++;
                        continue;
                    }
                    if (c == '}') {
                        i++;
                        break;
                    }
                    break;
                }
                return map;
            }

            private Object parseArray() {
                i++;
                skipWs();
                List<Object> list = new ArrayList<>();
                if (i < n && s.charAt(i) == ']') {
                    i++;
                    return list;
                }
                while (i < n) {
                    Object v = parseValue();
                    list.add(v);
                    skipWs();
                    char c = peek();
                    if (c == ',') {
                        i++;
                        continue;
                    }
                    if (c == ']') {
                        i++;
                        break;
                    }
                    break;
                }
                return list;
            }

            private String parseString() {
                expect('\"');
                StringBuilder sb = new StringBuilder();
                while (i < n) {
                    char c = s.charAt(i++);
                    if (c == '\"') break;
                    if (c == '\\\\') {
                        if (i >= n) break;
                        char e = s.charAt(i++);
                        if (e == '\"' || e == '\\\\' || e == '/') sb.append(e);
                        else if (e == 'b') sb.append('\b');
                        else if (e == 'f') sb.append('\f');
                        else if (e == 'n') sb.append('\n');
                        else if (e == 'r') sb.append('\r');
                        else if (e == 't') sb.append('\t');
                        else if (e == 'u') {
                            int code = 0;
                            for (int k = 0; k < 4 && i < n; k++) {
                                char h = s.charAt(i++);
                                int v;
                                if (h >= '0' && h <= '9') v = h - '0';
                                else if (h >= 'a' && h <= 'f') v = 10 + (h - 'a');
                                else if (h >= 'A' && h <= 'F') v = 10 + (h - 'A');
                                else v = 0;
                                code = (code << 4) + v;
                            }
                            sb.append((char) code);
                        } else {
                            sb.append(e);
                        }
                    } else {
                        sb.append(c);
                    }
                }
                return sb.toString();
            }

            private Object parseNumber() {
                int start = i;
                if (peek() == '-') i++;
                while (i < n) {
                    char c = s.charAt(i);
                    if (c >= '0' && c <= '9') i++;
                    else break;
                }
                boolean isDouble = false;
                if (i < n && s.charAt(i) == '.') {
                    isDouble = true;
                    i++;
                    while (i < n) {
                        char c = s.charAt(i);
                        if (c >= '0' && c <= '9') i++;
                        else break;
                    }
                }
                if (i < n && (s.charAt(i) == 'e' || s.charAt(i) == 'E')) {
                    isDouble = true;
                    i++;
                    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
                    while (i < n) {
                        char c = s.charAt(i);
                        if (c >= '0' && c <= '9') i++;
                        else break;
                    }
                }
                String num = s.substring(start, i);
                try {
                    if (isDouble) return Double.parseDouble(num);
                    long v = Long.parseLong(num);
                    if (v >= Integer.MIN_VALUE && v <= Integer.MAX_VALUE) return (int) v;
                    return v;
                } catch (Exception e) {
                    return 0;
                }
            }

            private Object parseLiteral(String lit, Object val) {
                if (s.startsWith(lit, i)) {
                    i += lit.length();
                    return val;
                }
                return null;
            }

            private void skipWs() {
                while (i < n) {
                    char c = s.charAt(i);
                    if (c == ' ' || c == '\n' || c == '\r' || c == '\t') i++;
                    else break;
                }
            }

            private char peek() {
                if (i >= n) return '\0';
                return s.charAt(i);
            }

            private void expect(char c) {
                if (i < n && s.charAt(i) == c) {
                    i++;
                    return;
                }
                i++;
            }
        }
    }
}

