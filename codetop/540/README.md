# 题目汇总（521-540）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 697 | [数组的度](https://leetcode.cn/problems/degree-of-an-array/) | 简单 | 最短子数组保持数组度 | 统计 cnt/first/last，取最小区间 |
| 805 | [数组的均值分割](https://leetcode.cn/problems/split-array-with-same-average/) | 困难 | 是否能分成同均值两组 | 转换为子集和为 0，DP+HashSet |
| 538 | [把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/) | 简单 | BST 变“更大和树” | 反向中序累加 sum |
| 剑指 Offer 13 | [机器人的运动范围](https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/) | 中等 | 数位和约束可达格子数 | BFS/DFS + visited |
| 967 | [连续差相同的数字](https://leetcode.cn/problems/numbers-with-same-consecutive-differences/) | 中等 | 生成满足相邻差为 k 的数 | DFS 从首位扩展 |
| 326 | [3的幂](https://leetcode.cn/problems/power-of-three/) | 简单 | 判断是否为 3^x | 循环除以 3 |
| 1024 | [视频拼接](https://leetcode.cn/problems/video-stitching/) | 中等 | 覆盖 [0,time] 最少区间数 | 贪心扫描 far/end（跳跃游戏） |
| 面试题 08.11 | [硬币](https://leetcode.cn/problems/coin-lcci/) | 中等 | 1/5/10/25 凑 n 的方案数 | 完全背包 1D dp（取模） |
| 1156 | [单字符重复子串的最大长度](https://leetcode.cn/problems/swap-for-longest-repeated-character-substring/) | 中等 | 最多交换一次的最长同字符段 | 段压缩 + 合并隔 1 段 |
| 217 | [存在重复元素](https://leetcode.cn/problems/contains-duplicate/) | 简单 | 判断是否有重复 | HashSet 判重 |
| 1235 | [规划兼职工作](https://leetcode.cn/problems/maximum-profit-in-job-scheduling/) | 困难 | 不重叠工作最大收益 | 按 end 排序 + dp + 二分 |
| 807 | [保持城市天际线](https://leetcode.cn/problems/max-increase-to-keep-city-skyline/) | 中等 | 天际线不变的最大增量 | 行列最大值取 min  |
| 687 | [最长同值路径](https://leetcode.cn/problems/longest-univalue-path/) | 中等 | 同值路径最大边数 | 后序 dfs：左右可接长度相加 |
| 980 | [不同路径 III](https://leetcode.cn/problems/unique-paths-iii/) | 困难 | 走遍所有可走格子的路径数 | 回溯 DFS + remain 计数 |
| 面试题 16.16 | [部分排序](https://leetcode.cn/problems/sub-sort-lcci/) | 中等 | 最短排序区间 | 两次扫描定 left/right |
| 968 | [监控二叉树](https://leetcode.cn/problems/binary-tree-cameras/) | 困难 | 最少摄像头覆盖整树 | 后序 3 状态贪心 |
| 922 | [按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii/) | 简单 | 偶位放偶数奇位放奇数 | 新数组双指针填充 |
| 582 | [杀死进程](https://leetcode.cn/problems/kill-process/) | 中等 | 杀死进程及所有子孙 | 建图 parent->children DFS/BFS |
| 补充题19 | [判断一个点是否在三角形内](https://mp.weixin.qq.com/s/UK7ilkFeEDQeVWvLDHbuKA) | 中等 | 点是否在三角形内（含边界） | 叉积同向判断 |
| 280 | [摆动排序](https://leetcode.cn/problems/wiggle-sort/) | 中等 | 变成 <= >= <= 交替 | 一次遍历，不满足就交换相邻 |
