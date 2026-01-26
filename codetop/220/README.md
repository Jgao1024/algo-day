# 题目汇总（201-220）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 279 | [完全平方数](https://leetcode.cn/problems/perfect-squares/) | 中等 | DP 求最少完全平方数个数 | DP：`dp[i]=min(dp[i-j*j]+1)` |
| 316 | [去除重复字母](https://leetcode.cn/problems/remove-duplicate-letters/) | 中等 | 去重且字典序最小的子序列 | 单调栈 + 计数/是否在栈 |
| 71 | [简化路径](https://leetcode.cn/problems/simplify-path/) | 中等 | Unix 路径规范化 | 栈（`..` 弹出、`.` 忽略） |
| 344 | [反转字符串](https://leetcode.cn/problems/reverse-string/) | 简单 | 原地反转字符数组 | 双指针交换 |
| 763 | [划分字母区间](https://leetcode.cn/problems/partition-labels/) | 中等 | 每个字母只出现在一个区间 | 贪心：记录最后出现位置 |
| 343 | [整数拆分](https://leetcode.cn/problems/integer-break/) | 中等 | 拆分使乘积最大 | 贪心：尽量拆成 3 |
| 12 | [整数转罗马数字](https://leetcode.cn/problems/integer-to-roman/) | 中等 | 整数映射到罗马数字 | 贪心：从大到小减 |
| 494 | [目标和](https://leetcode.cn/problems/target-sum/) | 中等 | 给符号使表达式结果为 target | 转子集和计数：0/1 背包 |
| 剑指 Offer 61 | [扑克牌中的顺子](https://leetcode.cn/problems/bu-ke-pai-zhong-de-shun-zi-lcof/) | 简单 | 0 作癞子判断能否成顺子 | 排序 + 去重 + 跨度判断 |
| 剑指 Offer 52 | [两个链表的第一个公共节点](https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/) | 简单 | 两链表相交点 | 双指针切换走同路程 |
| 86 | [分隔链表](https://leetcode.cn/problems/partition-list/) | 中等 | 按 x 分隔且保持相对顺序 | 双链表拼接 |
| 1444 | [切披萨的方案数](https://leetcode.cn/problems/number-of-ways-of-cutting-a-pizza/) | 困难 | 切成 k 份且每份至少 1 个苹果 | 二维后缀和 + DP |
| 509 | [斐波那契数](https://leetcode.cn/problems/fibonacci-number/) | 简单 | 斐波那契递推 | 迭代 DP |
| 18 | [四数之和](https://leetcode.cn/problems/4sum/) | 中等 | 四元组去重求和 | 排序 + 双指针 |
| 459 | [重复的子字符串](https://leetcode.cn/problems/repeated-substring-pattern/) | 简单 | 判断是否由子串重复组成 | KMP 前缀函数 |
| 168 | [Excel表列名称](https://leetcode.cn/problems/excel-sheet-column-title/) | 简单 | 数字转列名 | 26 进制（无 0）转换 |
| 1047 | [删除字符串中的所有相邻重复项](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/) | 简单 | 相邻相同就消除 | 栈（数组模拟） |
| 647 | [回文子串](https://leetcode.cn/problems/palindromic-substrings/) | 中等 | 统计回文子串个数 | 中心扩展 |
| 503 | [下一个更大元素 II](https://leetcode.cn/problems/next-greater-element-ii/) | 中等 | 循环数组下一个更大值 | 单调栈 + 遍历 2n |
| 1044 | [最长重复子串](https://leetcode.cn/problems/longest-duplicate-substring/) | 困难 | 最长重复子串 | 二分长度 + Rolling Hash |
