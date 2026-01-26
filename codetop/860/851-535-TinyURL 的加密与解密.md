# 535. TinyURL 的加密与解密

- 题号：535
- 难度：中等
- LeetCode：[TinyURL 的加密与解密](https://leetcode.cn/problems/encode-and-decode-tinyurl/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 用自增 id 生成短码（base62），并用哈希表保存映射：
  - `encode(longUrl)`：若已存在直接返回；否则生成短码并保存 `code -> url`、`url -> code`
  - `decode(shortUrl)`：取出短码查表返回原 url

## Java 最佳实现

```java
import java.util.HashMap;
import java.util.Map;

public class Codec {
    private static final String PREFIX = "http://tinyurl.com/";
    private static final char[] BASE62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private long id = 1;
    private final Map<String, String> codeToUrl = new HashMap<>();
    private final Map<String, String> urlToCode = new HashMap<>();

    public String encode(String longUrl) {
        String code = urlToCode.get(longUrl);
        if (code != null) return PREFIX + code;

        code = toBase62(id++);
        codeToUrl.put(code, longUrl);
        urlToCode.put(longUrl, code);
        return PREFIX + code;
    }

    public String decode(String shortUrl) {
        String code = shortUrl.substring(PREFIX.length());
        return codeToUrl.get(code);
    }

    private String toBase62(long x) {
        StringBuilder sb = new StringBuilder();
        while (x > 0) {
            int r = (int) (x % 62);
            sb.append(BASE62[r]);
            x /= 62;
        }
        return sb.reverse().toString();
    }
}
```

## 复杂度分析
- 时间：均摊 \(O(1)\)
- 空间：\(O(N)\)

## 相关题目
- 355 设计推特：哈希映射
- 146 LRU 缓存：哈希 + 双向链表
