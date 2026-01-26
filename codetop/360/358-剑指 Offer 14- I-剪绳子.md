# 剑指 Offer 14- I. 剪绳子

- 题号：剑指 Offer 14- I
- 难度：中等
- LeetCode：[剪绳子](https://leetcode.cn/problems/jian-sheng-zi-lcof/)

## 题目描述
给定绳子长度 `n`，把绳子剪成至少两段，使各段长度乘积最大，返回最大乘积。

## 示例
- 示例  
输入：`n = 10`  
输出：`36`

## 最佳解法思路
- 数学贪心（推荐）  
尽量剪成 3：  
当剩余长度为 4 时不要剪成 `3+1`，而是 `2+2`。  
`n<=3` 时必须至少剪一次，所以直接返回 `n-1`。

## Java 最佳实现

```java
class Solution {
    public int cuttingRope(int n) {
        if (n <= 3) return n - 1;
        int res = 1;
        while (n > 4) {
            res *= 3;
            n -= 3;
        }
        return res * n;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(1)\)

## 相关题目
- 343 整数拆分
- 剑指 Offer 14- II 剪绳子 II（取模）

## 总结（速记）
- **尽量拆 3，剩 4 拆 2+2；n<=3 返回 n-1**。
