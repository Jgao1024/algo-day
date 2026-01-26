# 题目汇总（1121-1140）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1563 | [石子游戏 V](https://leetcode.cn/problems/stone-game-v/) | 困难 | 区间 DP | 前缀和 + 双指针分界 + bestL/bestR |
| 588 | [设计内存文件系统](https://leetcode.cn/problems/design-in-memory-file-system/) | 困难 | 设计题 | Trie（目录树）+ TreeMap 保序 |
| 361 | [轰炸敌人](https://leetcode.cn/problems/bomb-enemy/) | 中等 | 网格题 | 行段/列段击杀数复用扫描 |
| 1518 | [换酒问题](https://leetcode.cn/problems/water-bottles/) | 简单 | 模拟 | 空瓶累加换酒直到不足 |
| 549 | [二叉树中最长的连续序列](https://leetcode.cn/problems/binary-tree-longest-consecutive-sequence-ii/) | 中等 | 树 DP | DFS 返回 inc/dec，拐点合并 |
| 609 | [在系统中查找重复文件](https://leetcode.cn/problems/find-duplicate-file-in-system/) | 中等 | 字符串解析 | content -> paths 分组 |
| 面试题 17.21 | [直方图的水量](https://leetcode.cn/problems/volume-of-histogram-lcci/) | 困难 | 双指针 | leftMax/rightMax 一次遍历 |
| 569 | [员工薪水中位数](https://leetcode.cn/problems/median-employee-salary/) | 困难 | SQL | row_number + cnt 取中位行 |
| 307 | [区域和检索 - 数组可修改](https://leetcode.cn/problems/range-sum-query-mutable/) | 中等 | 数据结构 | 树状数组（BIT） |
| 1498 | [满足条件的子序列数目](https://leetcode.cn/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/) | 中等 | 双指针 | 排序 + \(2^{(r-l)}\) 计数 |
| 929 | [独特的电子邮件地址](https://leetcode.cn/problems/unique-email-addresses/) | 简单 | 字符串 | 规范化后 HashSet 去重 |
| 1314 | [矩阵区域和](https://leetcode.cn/problems/matrix-block-sum/) | 中等 | 前缀和 | 二维前缀和 4 次相减 |
| 919 | [完全二叉树插入器](https://leetcode.cn/problems/complete-binary-tree-inserter/) | 中等 | 设计题 | 队列维护第一个不满节点 |
| 865 | [具有所有最深结点的最小子树](https://leetcode.cn/problems/smallest-subtree-with-all-the-deepest-nodes/) | 中等 | 树 | 后序返回(深度,节点) |
| 956 | [最高的广告牌](https://leetcode.cn/problems/tallest-billboard/) | 困难 | DP | dp[差值]=较高高度（差值背包） |
| 255 | [验证前序遍历序列二叉搜索树](https://leetcode.cn/problems/verify-preorder-sequence-in-binary-search-tree/) | 中等 | 栈 | 单调栈 + lower 下界 |
| 562 | [矩阵中最长的连续1线段](https://leetcode.cn/problems/longest-line-of-consecutive-one-in-matrix/) | 中等 | DP | 4 方向滚动数组统计 |
| 1147 | [段式回文](https://leetcode.cn/problems/longest-chunked-palindrome-decomposition/) | 困难 | 贪心 | 双指针拼块，匹配就切分 |
| 515 | [在每个树行中找最大值](https://leetcode.cn/problems/find-largest-value-in-each-tree-row/) | 中等 | BFS | 层序遍历逐层取 max |
| 636 | [函数的独占时间](https://leetcode.cn/problems/exclusive-time-of-functions/) | 中等 | 栈 | 调用栈 + prev 切片计时 |
