# 剑指 Offer 58 - I. 翻转单词顺序

- 题号：剑指 Offer 58 - I
- 难度：简单
- LeetCode：[翻转单词顺序](https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 倒序拼接（推荐）  
先 `trim()` 去掉首尾空格，再按连续空白 `split("\\\\s+")` 得到单词数组，倒序用空格拼接。

## Java 最佳实现

```java
class Solution {
    public String reverseWords(String s) {
        if (s == null) return "";
        s = s.trim();
        if (s.length() == 0) return "";

        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(n)\)

## 相关题目
- 151 翻转字符串里的单词

## 总结（速记）
- **`trim + split("\\\\s+") + 倒序拼接`**。
