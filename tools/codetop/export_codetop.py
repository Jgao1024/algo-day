import json
import re
import ssl
import urllib.parse
import urllib.request
from pathlib import Path

BASE_URL = "https://codetop.cc"
TOTAL_PAGES = 58
PAGE_SIZE = 20
OUT_DIR = Path("codetop")

_SSL_CTX = ssl._create_unverified_context()


def http_get(url: str) -> str:
    req = urllib.request.Request(url, headers={"User-Agent": "Mozilla/5.0"})
    with urllib.request.urlopen(req, context=_SSL_CTX, timeout=60) as resp:
        return resp.read().decode("utf-8", "ignore")


def sanitize_file_name(name: str) -> str:
    if not name:
        return "题目"
    name = re.sub(r'[\\\\/:*?"<>|]', " ", name)
    name = re.sub(r"\s+", " ", name).strip()
    return name or "题目"


def difficulty_text(level) -> str:
    try:
        level = int(level)
    except Exception:
        return "-"
    return "简单" if level == 1 else "中等" if level == 2 else "困难" if level == 3 else "-"


def build_leetcode_url(frontend_id: str, title: str, slug: str) -> str:
    if slug:
        return f"https://leetcode.cn/problems/{slug}/"
    keyword = frontend_id or title or ""
    return "https://leetcode.cn/problemset/all/?search=" + urllib.parse.quote(keyword, safe="")


def build_problem_md(frontend_id: str, title: str, difficulty: str, leetcode_url: str) -> str:
    return (
        f"# {frontend_id}. {title}\n\n"
        f"- 题号：{frontend_id}\n"
        f"- 难度：{difficulty}\n"
        f"- LeetCode：[{title}]({leetcode_url})\n\n"
        "## 题目描述\n"
        "见题面链接。\n\n"
        "## 示例\n"
        "见题面链接。\n\n"
        "## 最佳解法思路\n"
        "- TODO\n\n"
        "## Java 最佳实现\n\n"
        "```java\n"
        "// TODO\n"
        "```\n\n"
        "## 复杂度分析\n"
        "- 时间：TODO\n"
        "- 空间：TODO\n\n"
        "## 相关题目\n"
        "- TODO\n"
    )


def escape_pipes(s: str) -> str:
    return (s or "").replace("|", "\\|")


def build_summary_md(start: int, end: int, rows) -> str:
    out = [f"# 题目汇总（{start}-{end}）", ""]
    out.append("| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |")
    out.append("| --- | --- | --- | --- | --- |")
    for r in rows:
        out.append(
            f"| {escape_pipes(r['id'])} | "
            f"[{escape_pipes(r['title'])}]({r['url']}) | "
            f"{escape_pipes(r['diff'])} | - | - |"
        )
    out.append("")
    return "\n".join(out)


def write_text(path: Path, content: str):
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(content, encoding="utf-8")


def main():
    OUT_DIR.mkdir(parents=True, exist_ok=True)

    global_index = 1
    total_count = 0

    for page in range(1, TOTAL_PAGES + 1):
        url = f"{BASE_URL}/api/questions/?page={page}"
        data = json.loads(http_get(url))

        total_count = int(data.get("count") or 0)
        items = data.get("list") or []
        if not items:
            break

        folder = OUT_DIR / str(page * PAGE_SIZE)
        folder.mkdir(parents=True, exist_ok=True)

        rows = []
        for it in items:
            lc = (it or {}).get("leetcode") or {}
            frontend_id = str(lc.get("frontend_question_id") or "").strip()
            title = str(lc.get("title") or "").strip()
            slug = str(lc.get("slug_title") or "").strip()
            level = lc.get("level")

            diff = difficulty_text(level)
            leetcode_url = build_leetcode_url(frontend_id, title, slug)

            idx_str = f"{global_index:03d}"
            file_name = f"{idx_str}-{frontend_id}-{sanitize_file_name(title)}.md"
            write_text(folder / file_name, build_problem_md(frontend_id, title, diff, leetcode_url))

            rows.append({"id": frontend_id, "title": title, "diff": diff, "url": leetcode_url})
            global_index += 1

        start = (page - 1) * PAGE_SIZE + 1
        end = min(page * PAGE_SIZE, total_count)
        write_text(folder / "README.md", build_summary_md(start, end, rows))

    return total_count


if __name__ == "__main__":
    main()

