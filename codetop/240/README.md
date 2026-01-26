# 题目汇总（221-240）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 剑指 Offer 34 | [二叉树中和为某一值的路径](https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/) | 中等 | 根到叶路径和为 target 的所有路径 | DFS 回溯记录路径 |
| 37 | [解数独](https://leetcode.cn/problems/sudoku-solver/) | 困难 | 填充数独 | 回溯 + 位运算剪枝 |
| 567 | [字符串的排列](https://leetcode.cn/problems/permutation-in-string/) | 中等 | 判断 s2 是否含 s1 的排列子串 | 固定窗口 + 计数差 |
| 556 | [下一个更大元素 III](https://leetcode.cn/problems/next-greater-element-iii/) | 中等 | 下一个更大排列（int 范围） | next permutation + 溢出判断 |
| 378 | [有序矩阵中第K小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-sorted-matrix/) | 中等 | 有序矩阵第 k 小 | 按值二分 + 计数 |
| 剑指 Offer 03 | [数组中重复的数字](https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/) | 简单 | 数组中任意重复数 | 原地交换归位 |
| 692 | [前K个高频单词](https://leetcode.cn/problems/top-k-frequent-words/) | 中等 | TopK 高频词（频次降序，字典序升序） | 哈希计数 + 小根堆 |
| 380 | [常数时间插入、删除和获取随机元素](https://leetcode.cn/problems/insert-delete-getrandom-o1/) | 中等 | O(1) 插入/删除/随机取 | 数组 + 哈希表（交换删除） |
| 115 | [不同的子序列](https://leetcode.cn/problems/distinct-subsequences/) | 困难 | s 的子序列等于 t 的个数 | DP：一维倒序累加 |
| 6 | [Z 字形变换](https://leetcode.cn/problems/zigzag-conversion/) | 中等 | Z 字形重排 | 按行模拟 |
| 17 | [电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) | 中等 | 电话按键组合 | 回溯枚举 |
| 191 | [位1的个数](https://leetcode.cn/problems/number-of-1-bits/) | 简单 | 统计二进制 1 的个数 | `n &= n-1` |
| 410 | [分割数组的最大值](https://leetcode.cn/problems/split-array-largest-sum/) | 困难 | 分成 m 段最小化最大段和 | 答案二分 + 贪心切段 |
| 154 | [寻找旋转排序数组中的最小值 II](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array-ii/) | 困难 | 旋转数组最小值（含重复） | 二分，无法判断时 `r--` |
| 337 | [打家劫舍 III](https://leetcode.cn/problems/house-robber-iii/) | 中等 | 树上打家劫舍 | 树形 DP（偷/不偷） |
| 剑指 Offer 45 | [把数组排成最小的数](https://leetcode.cn/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/) | 中等 | 拼接成最小数字 | 排序：比较 `a+b` 与 `b+a` |
| 260 | [只出现一次的数字 III](https://leetcode.cn/problems/single-number-iii/) | 中等 | 两个只出现一次的数 | 异或 + lowbit 分组 |
| 622 | [设计循环队列](https://leetcode.cn/problems/design-circular-queue/) | 中等 | 循环队列 | 数组 + head + size |
| 剑指 Offer 48 | [最长不含重复字符的子字符串](https://leetcode.cn/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/) | 中等 | 最长无重复子串 | 滑动窗口 + last 位置 |
| 301 | [删除无效的括号](https://leetcode.cn/problems/remove-invalid-parentheses/) | 困难 | 删除最少括号使合法，输出所有 | BFS 分层 + visited |
