# 题目汇总（901-920）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 944 | [删列造序](https://leetcode.cn/problems/delete-columns-to-make-sorted/) | 简单 | 删掉破坏排序的列 | 逐列检查相邻行是否非降 |
| 803 | [打砖块](https://leetcode.cn/problems/bricks-falling-when-hit/) | 困难 | 打砖后掉落数量 | 反向处理 + 并查集 + 虚拟 top |
| 1202 | [交换字符串中的元素](https://leetcode.cn/problems/smallest-string-with-swaps/) | 中等 | 最小字典序重排 | 并查集分组，组内下标/字符排序回填 |
| 1489 | [找到最小生成树里的关键边和伪关键边](https://leetcode.cn/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/) | 困难 | MST 边分类 | Kruskal 求 base；对每边做 skip/pick 对比 |
| 1319 | [连通网络的操作次数](https://leetcode.cn/problems/number-of-operations-to-make-network-connected/) | 中等 | 最少操作连通 | 边数不足直接 -1；并查集分量-1 |
| 778 | [水位上升的泳池中游泳](https://leetcode.cn/problems/swim-in-rising-water/) | 困难 | 最小时间到终点 | Dijkstra：路径代价=max(经过高度) 最小 |
| 995 | [K 连续位的最小翻转次数](https://leetcode.cn/problems/minimum-number-of-k-consecutive-bit-flips/) | 困难 | 最少区间翻转 | 贪心 + 翻转奇偶滑窗 |
| 1588 | [所有奇数长度子数组的和](https://leetcode.cn/problems/sum-of-all-odd-length-subarrays/) | 简单 | 统计奇数长度子数组和 | 贡献法：每个元素出现的奇数次数 |
| 170 | [两数之和 III - 数据结构设计](https://leetcode.cn/problems/two-sum-iii-data-structure-design/) | 简单 | 数据结构 add/find | HashMap 计数；find 遍历 key |
| 1310 | [子数组异或查询](https://leetcode.cn/problems/xor-queries-of-a-subarray/) | 中等 | 多次区间 xor | 前缀异或 |
| 1442 | [形成两个异或相等数组的三元组数目](https://leetcode.cn/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/) | 中等 | 统计三元组 | 前缀异或 + 频次/下标和哈希 |
| 1012 | [至少有 1 位重复的数字](https://leetcode.cn/problems/numbers-with-repeated-digits/) | 困难 | 统计有重复数字的数 | 反向数不重复数量（排列计数） |
| 1043 | [分隔数组以得到最大和](https://leetcode.cn/problems/partition-array-for-maximum-sum/) | 中等 | 分段最大化 | dp[i]=max(dp[i-l]+max*l) |
| 1610 | [可见点的最大数目](https://leetcode.cn/problems/maximum-number-of-visible-points/) | 困难 | 角度内最多点 | atan2 排序 + 复制 + 滑窗 |
| 1052 | [爱生气的书店老板](https://leetcode.cn/problems/grumpy-bookstore-owner/) | 中等 | 最大满意人数 | base + 固定窗口增益最大化 |
| 644 | [最大平均子段和 II](https://leetcode.cn/problems/maximum-average-subarray-ii/) | 困难 | 长度≥k 最大平均 | 二分平均 + 前缀最小值判定 |
| 1178 | [猜字谜](https://leetcode.cn/problems/number-of-valid-words-for-each-puzzle/) | 困难 | 每个谜面有效单词数 | bitmask 计数 + 子集枚举（含首字母） |
| 363 | [矩形区域不超过 K 的最大数值和](https://leetcode.cn/problems/max-sum-of-rectangle-no-larger-than-k/) | 困难 | 二维最大子矩形≤k | 压缩成一维 + TreeSet 前缀 |
| 1046 | [最后一块石头的重量](https://leetcode.cn/problems/last-stone-weight/) | 简单 | 碰撞模拟 | 大根堆反复取两块 |
| 1575 | [统计所有可行路径](https://leetcode.cn/problems/count-all-possible-routes/) | 困难 | 路径数计数 | 记忆化 DFS(pos,fuel) |
