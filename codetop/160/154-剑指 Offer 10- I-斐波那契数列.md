# 剑指 Offer 10- I. 斐波那契数列

- 题号：剑指 Offer 10- I
- 难度：简单
- LeetCode：[斐波那契数列](https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/)

## 题目描述
求斐波那契数列第 `n` 项（对 \(10^9+7\) 取模）。

## 示例
- 示例  
输入：`n = 5`  
输出：`5`

## 最佳解法思路
- 思路1（推荐）：滚动 DP  
`F(0)=0, F(1)=1`，从 2 开始迭代：`F(i)=F(i-1)+F(i-2)`，每步取模。

## Java 最佳实现

```java
class Solution {
    private static final int MOD = 1000000007;

    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1;
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
- 剑指 Offer 10-II 青蛙跳台阶：同型
- 70 爬楼梯：同型

## 总结（速记）
- 两个变量滚动就够了：`a=F(i-2), b=F(i-1)`。
