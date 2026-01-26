# 题目汇总（421-440）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 714 | [买卖股票的最佳时机含手续费](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) | 中等 | 股票 DP 两状态 | `cash/hold` 动态规划 |
| 325 | [和等于 k 的最长子数组长度](https://leetcode.cn/problems/maximum-size-subarray-sum-equals-k/) | 中等 | 前缀和最长长度 | 前缀和 + HashMap（记录最早下标） |
| 187 | [重复的DNA序列](https://leetcode.cn/problems/repeated-dna-sequences/) | 中等 | 固定窗口找重复 | 2bit 编码 + 滚动窗口计数 |
| 241 | [为运算表达式设计优先级](https://leetcode.cn/problems/different-ways-to-add-parentheses/) | 中等 | 枚举所有结果 | 分治 + 记忆化 |
| 331 | [验证二叉树的前序序列化](https://leetcode.cn/problems/verify-preorder-serialization-of-a-binary-tree/) | 中等 | 序列合法性 | 槽位计数 `slots` |
| 237 | [删除链表中的节点](https://leetcode.cn/problems/delete-node-in-a-linked-list/) | 简单 | 指定节点删除 | 覆盖当前节点并跳过 next |
| 873 | [最长的斐波那契子序列的长度](https://leetcode.cn/problems/length-of-longest-fibonacci-subsequence/) | 中等 | DP 求最长长度 | `dp[j][i]` + 值到下标映射 |
| 382 | [链表随机节点](https://leetcode.cn/problems/linked-list-random-node/) | 中等 | 等概率抽样 | 蓄水池抽样 |
| 781 | [森林中的兔子](https://leetcode.cn/problems/rabbits-in-forest/) | 中等 | 计数分组 | `ceil(cnt/(x+1))` 分组求和 |
| 870 | [优势洗牌](https://leetcode.cn/problems/advantage-shuffle/) | 中等 | 最大化优势次数 | 贪心：大能赢就用大，否则送小 |
| 652 | [寻找重复的子树](https://leetcode.cn/problems/find-duplicate-subtrees/) | 中等 | 找重复结构 | 后序序列化 + 计数 |
| 376 | [摆动序列](https://leetcode.cn/problems/wiggle-subsequence/) | 中等 | 最长摆动 | 贪心/DP：`up/down` |
| 877 | [石子游戏](https://leetcode.cn/problems/stone-game/) | 中等 | 先手必胜 | 结论：直接返回 true |
| 373 | [查找和最小的K对数字](https://leetcode.cn/problems/find-k-pairs-with-smallest-sums/) | 中等 | TopK 最小和 | 小根堆多路扩展 `(i,j)` |
| 365 | [水壶问题](https://leetcode.cn/problems/water-and-jug-problem/) | 中等 | 可达性判断 | `gcd(x,y)` + 裴蜀定理 |
| 915 | [分割数组](https://leetcode.cn/problems/partition-array-into-disjoint-intervals/) | 中等 | 最小分割点 | `rightMin` + `leftMax` |
| 786 | [第 K 个最小的素数分数](https://leetcode.cn/problems/k-th-smallest-prime-fraction/) | 困难 | 第 K 小分数 | 小根堆：固定分母推进分子 |
| 剑指 Offer 63 | [股票的最大利润](https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/) | 中等 | 一次交易最大利润 | 维护最小价 + 更新答案 |
| 309 | [最佳买卖股票时机含冷冻期](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | 中等 | 股票 DP 含冷冻 | 三状态：`hold/sold/rest` |
| 90 | [子集 II](https://leetcode.cn/problems/subsets-ii/) | 中等 | 子集去重 | 回溯 + 排序跳过重复 |
