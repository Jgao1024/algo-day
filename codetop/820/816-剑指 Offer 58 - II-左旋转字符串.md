# 剑指 Offer 58 - II. 左旋转字符串

- 题号：剑指 Offer 58 - II
- 难度：简单
- LeetCode：[左旋转字符串](https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 左旋 `n` 位：直接拼接 `s[n..] + s[0..n)`。

## Java 最佳实现

```java
class Solution {
    public String reverseLeftWords(String s, int n) {
        n %= s.length();
        return s.substring(n) + s.substring(0, n);
    }
}
```

## 复杂度分析
- 时间：\(O(|s|)\)
- 空间：\(O(|s|)\)

## 相关题目
- 189 轮转数组：同类“旋转”问题
