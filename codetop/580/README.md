# 题目汇总（561-580）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 剑指 Offer 49 | [丑数](https://leetcode.cn/problems/chou-shu-lcof/) | 中等 | 第 n 个丑数 | DP 三指针 `p2/p3/p5` 生成递增序列 |
| 1094 | [拼车](https://leetcode.cn/problems/car-pooling/) | 中等 | 区间上下车容量校验 | 差分数组 + 前缀和，过程检查是否超 capacity |
| 653 | [两数之和 IV - 输入 BST](https://leetcode.cn/problems/two-sum-iv-input-is-a-bst/) | 简单 | BST 中是否存在两数和 | DFS + HashSet，查 `k-x` |
| LCP 09 | [最小跳跃次数](https://leetcode.cn/problems/zui-xiao-tiao-yue-ci-shu/) | 困难 | 跳出数组最少步数 | BFS；左跳用 `left` 指针批量入队去重 |
| 455 | [分发饼干](https://leetcode.cn/problems/assign-cookies/) | 简单 | 最大满足孩子数 | 排序 + 双指针贪心（小饼干喂小胃口） |
| 773 | [滑动谜题](https://leetcode.cn/problems/sliding-puzzle/) | 困难 | 2x3 最短交换步数 | BFS 状态字符串 + 0 的可交换邻接表 |
| 216 | [组合总和 III](https://leetcode.cn/problems/combination-sum-iii/) | 中等 | 1..9 选 k 个和为 n | 回溯组合（递增选取） |
| 813 | [最大平均值和的分组](https://leetcode.cn/problems/largest-sum-of-averages/) | 中等 | 分组最大化平均值和 | DP 切分 + 前缀和，枚举最后一刀位置 |
| 541 | [反转字符串 II](https://leetcode.cn/problems/reverse-string-ii/) | 简单 | 每 2k 反转前 k | 按块处理：反转区间 `[i, i+k)` |
| 583 | [两个字符串的删除操作](https://leetcode.cn/problems/delete-operation-for-two-strings/) | 中等 | 最少删除变相同 | LCS：答案 `m+n-2*lcs` |
| 792 | [匹配子序列的单词数](https://leetcode.cn/problems/number-of-matching-subsequences/) | 中等 | 统计子序列单词数 | 26 桶存“等待字符”的指针，扫一遍 s 推进 |
| 705 | [设计哈希集合](https://leetcode.cn/problems/design-hashset/) | 简单 | HashSet 设计 | 值域固定直接 boolean 数组 |
| 904 | [水果成篮](https://leetcode.cn/problems/fruit-into-baskets/) | 中等 | 至多两种值的最长子数组 | 滑动窗口，map 计数，超 2 种就缩窗 |
| 1669 | [合并两个链表](https://leetcode.cn/problems/merge-in-between-linked-lists/) | 中等 | 替换 list1 的一段 | 定位 `preA/afterB/tail2` 后两次拼接 |
| 1151 | [最少交换次数来组合所有的 1](https://leetcode.cn/problems/minimum-swaps-to-group-all-1s-together/) | 中等 | 让 1 连续的最少交换 | 窗口长度=ones，找窗口内 1 最大值 |
| 314 | [二叉树的垂直遍历](https://leetcode.cn/problems/binary-tree-vertical-order-traversal/) | 中等 | 按列输出二叉树 | BFS 带列号，map 收集并用 min/max 列输出 |
| 391 | [完美矩形](https://leetcode.cn/problems/perfect-rectangle/) | 困难 | 矩形是否完美覆盖 | 面积相等 + 角点奇偶性只剩外接四角 |
| 490 | [迷宫](https://leetcode.cn/problems/the-maze/) | 中等 | 球滚动能否到达 | BFS/DFS：停点为节点，四方向滚到墙 |
| 474 | [一和零](https://leetcode.cn/problems/ones-and-zeroes/) | 中等 | 0/1 容量下最多选多少串 | 二维 0/1 背包倒序更新 |
| 740 | [删除与获得点数](https://leetcode.cn/problems/delete-and-earn/) | 中等 | 删数得分最大化 | 合并同值成 points，转打家劫舍 DP |
