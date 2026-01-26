# 题目汇总（81-100）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 543 | [二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) | 简单 | 二叉树最长路径（边数） | 后序 DFS：返回深度，用左右深度之和更新全局 |
| 162 | [寻找峰值](https://leetcode.cn/problems/find-peak-element/) | 中等 | 找任意峰值下标 | 二分：比较 `mid` 与 `mid+1`，上坡往右否则往左 |
| 662 | [二叉树最大宽度](https://leetcode.cn/problems/maximum-width-of-binary-tree/) | 中等 | 按编号计算层宽 | BFS + 下标编号，层内 `last-first+1`（每层归一化） |
| 179 | [最大数](https://leetcode.cn/problems/largest-number/) | 中等 | 排列拼接成最大数字 | 字符串排序：按 `(b+a)` 与 `(a+b)` 比较决定先后 |
| 113 | [路径总和 II](https://leetcode.cn/problems/path-sum-ii/) | 中等 | 根到叶路径和为目标的所有方案 | DFS + 回溯，命中时拷贝 path |
| 152 | [乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/) | 中等 | 连续子数组最大乘积 | 同时维护 max/min DP（负数会翻转） |
| 62 | [不同路径](https://leetcode.cn/problems/unique-paths/) | 中等 | 网格路径条数 | 一维 DP：`dp[j] += dp[j-1]` |
| 560 | [和为K的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/) | 中等 | 连续子数组计数 | 前缀和 + HashMap 计数：累加 `count[sum-k]` |
| 198 | [打家劫舍](https://leetcode.cn/problems/house-robber/) | 中等 | 不能偷相邻房子的最大收益 | DP 滚动：`max(prev1, prev2 + x)` |
| 112 | [路径总和](https://leetcode.cn/problems/path-sum/) | 简单 | 是否存在根到叶路径和为目标 | DFS 递减 target，到叶子判断剩余为 0 |
| 24 | [两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/) | 中等 | 成对交换链表节点 | dummy + 指针交换 `prev->a->b` 变 `prev->b->a` |
| 227 | [基本计算器 II](https://leetcode.cn/problems/basic-calculator-ii/) | 中等 | 计算 `+ - * /` 表达式 | 栈：`* /` 立即合并，最后求和 |
| 83 | [删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/) | 简单 | 有序链表去重（保留一个） | 一次遍历，相等就跳过 `next` |
| 226 | [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | 简单 | 交换左右子树 | 递归：swap 后继续递归 |
| 209 | [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/) | 中等 | 最短连续子数组和 \(\ge target\) | 滑动窗口：右扩左缩更新答案 |
| 169 | [多数元素](https://leetcode.cn/problems/majority-element/) | 简单 | 出现次数 \(>n/2\) 的元素 | Boyer-Moore 投票 |
| 283 | [移动零](https://leetcode.cn/problems/move-zeroes/) | 简单 | 0 移到末尾保持顺序 | 覆盖写非 0，最后补 0 |
| 139 | [单词拆分](https://leetcode.cn/problems/word-break/) | 中等 | 字符串能否拆成字典单词 | `dp[i]` + set，按 maxLen 限制枚举 |
| 718 | [最长重复子数组](https://leetcode.cn/problems/maximum-length-of-repeated-subarray/) | 中等 | 最长公共子数组长度 | DP 公共后缀，`j` 逆序滚动 |
| 补充题6 | [手撕堆排序](https://leetcode.cn/problems/sort-an-array/) | 中等 | 堆排序升序 | 建大根堆 + 交换堆顶到末尾并下沉 |
