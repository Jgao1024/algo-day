# 剑指 Offer 14- II. 剪绳子 II

- 题号：剑指 Offer 14- II
- 难度：中等
- LeetCode：[剪绳子 II](https://leetcode.cn/problems/jian-sheng-zi-ii-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 贪心：尽量切成长度为 3 的段乘积最大（取模）
  - `n <= 3` 时必须至少切一刀，返回 `n-1`
  - 否则不断取 3：`res = res * 3 % MOD`，直到剩余 `n <= 4`，最后乘上剩余值

## Java 最佳实现

```java
class Solution {
    private static final long MOD = 1000000007L;

    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        long res = 1;
        while (n > 4) {
            res = (res * 3) % MOD;
            n -= 3;
        }
        res = (res * n) % MOD;
        return (int) res;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)（循环次数约 \(n/3\)）
- 空间：\(O(1)\)

## 相关题目
- 343 整数拆分：不取模版本
- 剑指 Offer 14-I 剪绳子：DP/贪心
