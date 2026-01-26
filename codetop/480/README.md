# 题目汇总（461-480）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 205 | [同构字符串](https://leetcode.cn/problems/isomorphic-strings/) | 简单 | 判断两字符串是否一一映射 | 双向映射数组校验 |
| 387 | [字符串中的第一个唯一字符](https://leetcode.cn/problems/first-unique-character-in-a-string/) | 简单 | 找第一个只出现一次的字符下标 | 计数两遍扫描 |
| 539 | [最小时间差](https://leetcode.cn/problems/minimum-time-difference/) | 中等 | 计算最小分钟差（含跨天） | 1440 桶 + 相邻差 + 首尾差 |
| 311 | [稀疏矩阵的乘法](https://leetcode.cn/problems/sparse-matrix-multiplication/) | 中等 | 稀疏矩阵乘法加速 | 只遍历非零元素（预存 mat2 非零） |
| 473 | [火柴拼正方形](https://leetcode.cn/problems/matchsticks-to-square/) | 中等 | 能否分成 4 条等长边 | 回溯放 4 边 + 排序剪枝 |
| 796 | [旋转字符串](https://leetcode.cn/problems/rotate-string/) | 简单 | 判断是否为旋转关系 | `(s+s).contains(goal)` |
| 面试题 08.02 | [迷路的机器人](https://leetcode.cn/problems/robot-in-a-grid-lcci/) | 中等 | 障碍网格找一条路径 | DFS + 记忆化 bad[][] |
| 1424 | [对角线遍历 II](https://leetcode.cn/problems/diagonal-traverse-ii/) | 中等 | 非规则二维数组对角线输出 | 按 i+j 分组，deque 头插 |
| 27 | [移除元素](https://leetcode.cn/problems/remove-element/) | 简单 | 原地移除指定值并返回新长度 | 快慢指针覆盖 |
| 1325 | [删除给定值的叶子节点](https://leetcode.cn/problems/delete-leaves-with-a-given-value/) | 中等 | 反复删除值为 target 的叶子 | 后序递归删除 |
| 1288 | [删除被覆盖区间](https://leetcode.cn/problems/remove-covered-intervals/) | 中等 | 删除完全被其他区间覆盖的区间 | 排序（start↑ end↓）+ 扫描 |
| 面试题 01.05 | [一次编辑](https://leetcode.cn/problems/one-away-lcci/) | 中等 | 判断两字符串编辑距离是否 ≤1 | 双指针一次跳过 |
| 303 | [区域和检索 - 数组不可变](https://leetcode.cn/problems/range-sum-query-immutable/) | 简单 | 多次区间求和 | 前缀和 |
| 393 | [UTF-8 编码验证](https://leetcode.cn/problems/utf-8-validation/) | 中等 | 校验字节序列是否为 UTF-8 | 判首字节长度 + 校验 10xxxxxx |
| 面试题 08.05 | [递归乘法](https://leetcode.cn/problems/recursive-mulitply-lcci/) | 中等 | 不用乘除实现乘法 | 拆半递归 + 位运算 |
| 513 | [找树左下角的值](https://leetcode.cn/problems/find-bottom-left-tree-value/) | 中等 | 找最后一层最左节点值 | BFS 每层第一个 |
| 694 | [不同岛屿的数量](https://leetcode.cn/problems/number-of-distinct-islands/) | 中等 | 统计不同形状岛屿 | DFS 记录相对坐标做签名 |
| 785 | [判断二分图](https://leetcode.cn/problems/is-graph-bipartite/) | 中等 | 无向图是否可二分染色 | BFS/DFS 染色判冲突 |
| 1031 | [两个非重叠子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-two-non-overlapping-subarrays/) | 中等 | 两段固定长度不重叠最大和 | 前缀和 + 左侧最优滚动 |
| 剑指 Offer 15 | [二进制中1的个数](https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/) | 简单 | 统计二进制 1 的个数 | `n &= (n-1)` 消 1 |
