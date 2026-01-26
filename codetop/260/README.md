# 题目汇总（241-260）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 426 | [将二叉搜索树转化为排序的双向链表](https://leetcode.cn/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/) | 中等 | BST 中序转循环双向链表 | 中序遍历 + `prev/head` 串联 |
| 222 | [完全二叉树的节点个数](https://leetcode.cn/problems/count-complete-tree-nodes/) | 中等 | 完全二叉树快速计数 | 左右高度判满 + 递归 |
| 剑指 Offer 11 | [旋转数组的最小数字](https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/) | 简单 | 旋转数组找最小值 | 二分与右端比较（重复 `r--`） |
| 剑指 Offer 53 - I | [在排序数组中查找数字 I](https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/) | 简单 | 有序数组计数 | `lowerBound(t+1)-lowerBound(t)` |
| 528 | [按权重随机选择](https://leetcode.cn/problems/random-pick-with-weight/) | 中等 | 按权重随机返回下标 | 前缀和 + 二分 |
| 108 | [将有序数组转换为二叉搜索树](https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/) | 简单 | 构造高度平衡 BST | 分治取中点 |
| 188 | [买卖股票的最佳时机 IV](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iv/) | 困难 | 最多 k 次交易 | DP `buy/sell`（大 k 转贪心） |
| 130 | [被围绕的区域](https://leetcode.cn/problems/surrounded-regions/) | 中等 | 被围住的 O 变 X | 边界 BFS/DFS 染色 |
| 剑指 Offer 33 | [二叉搜索树的后序遍历序列](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/) | 中等 | 验证 BST 后序 | 反向遍历 + 单调栈 |
| 863 | [二叉树中所有距离为 K 的结点](https://leetcode.cn/problems/all-nodes-distance-k-in-binary-tree/) | 中等 | 距离为 K 的节点 | `parent` 映射 + BFS 分层 |
| 面试题 17.14 | [最小K个数](https://leetcode.cn/problems/smallest-k-lcci/) | 中等 | 取最小 k 个 | QuickSelect |
| 80 | [删除排序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/) | 中等 | 每个元素最多保留两次 | 双指针 `nums[slow-2]` |
| 674 | [最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/) | 简单 | 连续递增长度最大值 | 一次遍历计数 |
| 167 | [两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/) | 简单 | 有序数组找 target | 两端双指针 |
| 100 | [相同的树](https://leetcode.cn/problems/same-tree/) | 简单 | 判断两棵树是否相同 | 递归同时遍历 |
| 242 | [有效的字母异位词](https://leetcode.cn/problems/valid-anagram/) | 简单 | 字符频次是否一致 | 26 计数数组 |
| 557 | [反转字符串中的单词 III](https://leetcode.cn/problems/reverse-words-in-a-string-iii/) | 简单 | 单词内反转 | `char[]` 分段反转 |
| 977 | [有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/) | 简单 | 平方后仍保持有序 | 两端双指针从后填 |
| 补充题22 | [IP地址与整数的转换](https://mp.weixin.qq.com/s/UWCuEtNS2kuAuDY-eIbghg/) | 中等 | IPv4 与整数互转 | 位运算（256 进制） |
| 77 | [组合](https://leetcode.cn/problems/combinations/) | 中等 | 从 1..n 选 k 个 | 回溯 + 剪枝 |
