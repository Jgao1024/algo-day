# 剑指 Offer 56 - I. 数组中数字出现的次数

- 题号：剑指 Offer 56 - I
- 难度：中等
- LeetCode：[数组中数字出现的次数](https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 异或：整体异或得到 `a ^ b`，取 `lowbit` 把数组分两组分别异或，就能得到两个只出现一次的数。

## Java 最佳实现

```java
class Solution {
    public int[] singleNumbers(int[] nums) {
        int xor = 0;
        for (int x : nums) xor ^= x;
        int lowbit = xor & -xor;

        int a = 0, b = 0;
        for (int x : nums) {
            if ((x & lowbit) == 0) a ^= x;
            else b ^= x;
        }
        return new int[]{a, b};
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(1)\)

## 相关题目
- 136 只出现一次的数字：缺一个数的异或
