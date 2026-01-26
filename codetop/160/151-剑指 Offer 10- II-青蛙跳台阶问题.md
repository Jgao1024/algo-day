# 剑指 Offer 10- II. 青蛙跳台阶问题

- 题号：剑指 Offer 10- II
- 难度：简单
- LeetCode：[青蛙跳台阶问题](https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)

## 题目描述
一只青蛙一次可以跳 1 级或 2 级台阶，求跳上 n 级台阶的总方法数（结果对 \(10^9+7\) 取模）。

## 示例
- 示例  
输入：`n = 7`  
输出：`21`

## 最佳解法思路
- 思路1（推荐）：滚动 DP  
`dp[i] = dp[i-1] + dp[i-2]`，和斐波那契同型。  
用两个变量滚动，边加边取模。

## Java 最佳实现

```java
class Solution {
    private static final int MOD = 1000000007;

    public int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            if (c >= MOD) c -= MOD;
            a = b;
            b = c;
        }
        return b;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(1)\)

## 相关题目
- 剑指 Offer 10-I 斐波那契数列：同型滚动 DP
- 70 爬楼梯：同型（不取模）

## 总结（速记）
- 跳台阶就是斐波那契：`dp[i]=dp[i-1]+dp[i-2]`，记得取模。
