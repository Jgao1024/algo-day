# 28. 实现 strStr()

- 题号：28
- 难度：简单
- LeetCode：[实现 strStr()](https://leetcode.cn/problems/implement-strstr/)

## 题目描述
给定字符串 `haystack` 和 `needle`，返回 `needle` 在 `haystack` 中第一次出现的下标；若不存在返回 -1。`needle` 为空返回 0。

## 示例
- `haystack = "sadbutsad", needle = "sad"`，输出 `0`
- `haystack = "leetcode", needle = "leeto"`，输出 `-1`

## 最佳解法思路
- KMP：先构建 `needle` 的前缀函数 `next[]`，再线性扫描 `haystack`，遇到不匹配就根据 `next` 回退。

## Java 最佳实现

```java
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int[] next = buildNext(needle);

        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            char c = haystack.charAt(i);
            while (j > 0 && c != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (c == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    private int[] buildNext(String p) {
        int[] next = new int[p.length()];
        int j = 0;
        for (int i = 1; i < p.length(); i++) {
            char c = p.charAt(i);
            while (j > 0 && c != p.charAt(j)) {
                j = next[j - 1];
            }
            if (c == p.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
```

## 复杂度分析
- 时间：\(O(n+m)\)
- 空间：\(O(m)\)

## 相关题目
- 459 重复的子字符串（KMP）
- 28 实现 strStr()（本题）
