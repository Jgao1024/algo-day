# 剑指 Offer 60. n个骰子的点数

- 题号：剑指 Offer 60
- 难度：中等
- LeetCode：[n个骰子的点数](https://leetcode.cn/problems/nge-tou-zi-de-dian-shu-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- DP 计数：`dp[s]` 表示当前骰子数下，点数和为 `s` 的组合数。
- 从 1 个骰子开始迭代到 n 个骰子，最后把计数除以 \(6^n\) 转成概率。

## Java 最佳实现

```java
class Solution {
    public double[] dicesProbability(int n) {
        long[] dp = new long[6 * n + 1];
        for (int s = 1; s <= 6; s++) {
            dp[s] = 1;
        }

        for (int i = 2; i <= n; i++) {
            long[] ndp = new long[6 * n + 1];
            for (int s = i; s <= 6 * i; s++) {
                long ways = 0;
                for (int face = 1; face <= 6; face++) {
                    if (s - face < i - 1) break;
                    ways += dp[s - face];
                }
                ndp[s] = ways;
            }
            dp = ndp;
        }

        double denom = Math.pow(6, n);
        double[] res = new double[5 * n + 1];
        for (int s = n; s <= 6 * n; s++) {
            res[s - n] = dp[s] / denom;
        }
        return res;
    }
}
```

## 复杂度分析
- 时间：\(O(n \cdot 6 \cdot 6n)\)
- 空间：\(O(6n)\)

## 相关题目
- 50 Pow(x, n)：这里用到了 \(6^n\)
