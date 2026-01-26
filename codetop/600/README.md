# 题目汇总（581-600）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1129 | [颜色交替的最短路径](https://leetcode.cn/problems/shortest-path-with-alternating-colors/) | 中等 | 边颜色交替的最短路 | BFS + 上一条边颜色状态 |
| 505 | [迷宫 II](https://leetcode.cn/problems/the-maze-ii/) | 中等 | 滚动到停点的最短距离 | Dijkstra（停点图带权） |
| 524 | [通过删除字母匹配到字典里最长单词](https://leetcode.cn/problems/longest-word-in-dictionary-through-deleting/) | 中等 | 找可由删除得到的最长词 | 双指针判断子序列 |
| 341 | [扁平化嵌套列表迭代器](https://leetcode.cn/problems/flatten-nested-list-iterator/) | 中等 | 嵌套列表迭代输出整数 | 栈展开：`hasNext()` 展开到整数 |
| 1048 | [最长字符串链](https://leetcode.cn/problems/longest-string-chain/) | 中等 | 单词链最长长度 | DP：删 1 字符找前驱 |
| 1410 | [HTML 实体解析器](https://leetcode.cn/problems/html-entity-parser/) | 中等 | 实体字符替换 | 扫描 + 匹配固定 6 种实体 |
| 1358 | [包含所有三种字符的子字符串数目](https://leetcode.cn/problems/number-of-substrings-containing-all-three-characters/) | 中等 | 至少含 a/b/c 的子串数 | 滑窗：满足后收缩，答案加 `left` |
| 290 | [单词规律](https://leetcode.cn/problems/word-pattern/) | 简单 | 模式与单词一一对应 | 双向 HashMap |
| 310 | [最小高度树](https://leetcode.cn/problems/minimum-height-trees/) | 中等 | 树的中心节点 | 拓扑剥叶子到剩 1~2 个 |
| 1490 | [克隆 N 叉树](https://leetcode.cn/problems/clone-n-ary-tree/) | 中等 | 深拷贝 N 叉树 | DFS + Map 记忆化 |
| 491 | [递增子序列](https://leetcode.cn/problems/non-decreasing-subsequences/) | 中等 | 非递减子序列去重枚举 | 回溯 + 同层去重 |
| 1035 | [不相交的线](https://leetcode.cn/problems/uncrossed-lines/) | 中等 | 最大不交叉连线数 | LCS DP |
| 724 | [寻找数组的中心索引](https://leetcode.cn/problems/find-pivot-index/) | 简单 | 左右和相等的下标 | 前缀和：`left == sum-left-nums[i]` |
| 剑指 Offer 67 | [把字符串转换成整数](https://leetcode.cn/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/) | 中等 | atoi 转换并处理溢出 | 扫描 + 溢出截断 |
| 剑指 Offer 32 - II | [从上到下打印二叉树 II](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/) | 简单 | 层序遍历分层输出 | BFS 队列按层 size |
| 345 | [反转字符串中的元音字母](https://leetcode.cn/problems/reverse-vowels-of-a-string/) | 简单 | 仅反转元音位置 | 双指针找元音交换 |
| 1114 | [按序打印](https://leetcode.cn/problems/print-in-order/) | 简单 | 三线程保证顺序 | CountDownLatch 串行 |
| 992 | [K 个不同整数的子数组](https://leetcode.cn/problems/subarrays-with-k-different-integers/) | 困难 | 恰好 K 种不同数的子数组 | atMost(K)-atMost(K-1) |
| 1092 | [最短公共超序列](https://leetcode.cn/problems/shortest-common-supersequence/) | 困难 | 最短同时包含两串的序列 | LCS DP + 回溯构造 |
| 594 | [最长和谐子序列](https://leetcode.cn/problems/longest-harmonious-subsequence/) | 简单 | 最大值最小值差 1 的子序列 | 计数：`cnt[x]+cnt[x+1]` |
