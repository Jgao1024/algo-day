# 题目汇总（601-620）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 332 | [重新安排行程](https://leetcode.cn/problems/reconstruct-itinerary/) | 困难 | 用完所有机票且字典序最小 | 欧拉路径（Hierholzer）+ 小根堆 |
| 745 | [前缀和后缀搜索](https://leetcode.cn/problems/prefix-and-suffix-search/) | 困难 | 同时匹配前缀+后缀 | 预处理 `prefix#suffix -> 最大下标` |
| 剑指 Offer 47 | [礼物的最大价值](https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/) | 中等 | 网格最大路径和 | 一维 DP（来自上/左） |
| 1190 | [反转每对括号间的子串](https://leetcode.cn/problems/reverse-substrings-between-each-pair-of-parentheses/) | 中等 | 括号内反转 | 先配对括号 + 指针跳转反向 |
| 1642 | [可以到达的最远建筑](https://leetcode.cn/problems/furthest-building-you-can-reach/) | 中等 | 砖/梯子最远到哪 | 小根堆：大爬升用梯子、小爬升用砖 |
| 1160 | [拼写单词](https://leetcode.cn/problems/find-words-that-can-be-formed-by-characters/) | 简单 | 可拼写单词长度和 | 字符计数 |
| 475 | [供暖器](https://leetcode.cn/problems/heaters/) | 简单 | 最小供暖半径 | 对每个房子二分最近供暖器 |
| 881 | [救生艇](https://leetcode.cn/problems/boats-to-save-people/) | 中等 | 最少船数 | 排序 + 双指针贪心配对 |
| 713 | [乘积小于K的子数组](https://leetcode.cn/problems/subarray-product-less-than-k/) | 中等 | 统计乘积 < k | 正数滑动窗口 |
| 1654 | [到家的最少跳跃次数](https://leetcode.cn/problems/minimum-jumps-to-reach-home/) | 中等 | 最少跳跃到 x | BFS（位置 + 是否刚后跳） |
| 1245 | [树的直径](https://leetcode.cn/problems/tree-diameter/) | 中等 | 树上最长路径 | 两次 BFS/DFS 求直径 |
| 377 | [组合总和 Ⅳ](https://leetcode.cn/problems/combination-sum-iv/) | 中等 | 方案数（顺序算不同） | dp[i]+=dp[i-num] |
| 733 | [图像渲染](https://leetcode.cn/problems/flood-fill/) | 简单 | 连通块染色 | BFS/DFS |
| 797 | [所有可能的路径](https://leetcode.cn/problems/all-paths-from-source-to-target/) | 中等 | DAG 所有路径 | DFS 回溯输出所有路径 |
| 446 | [等差数列划分 II - 子序列](https://leetcode.cn/problems/arithmetic-slices-ii-subsequence/) | 困难 | 统计等差子序列个数 | DP + Map（差值 -> 计数） |
| 剑指 Offer 16 | [数值的整数次方](https://leetcode.cn/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/) | 中等 | x 的 n 次幂 | 快速幂（迭代平方） |
| 406 | [根据身高重建队列](https://leetcode.cn/problems/queue-reconstruction-by-height/) | 中等 | 还原队列 | 身高降序 + 按 k 插入 |
| 478 | [在圆内随机生成点](https://leetcode.cn/problems/generate-random-point-in-a-circle/) | 中等 | 圆内均匀随机点 | 极坐标：r*sqrt(U) + 随机角度 |
| 424 | [替换后的最长重复字符](https://leetcode.cn/problems/longest-repeating-character-replacement/) | 中等 | 最长可替换子串 | 滑动窗口 + maxCnt |
| 654 | [最大二叉树](https://leetcode.cn/problems/maximum-binary-tree/) | 中等 | 构建最大二叉树 | 单调栈线性构建 |
