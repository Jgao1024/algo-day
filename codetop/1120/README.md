# 题目汇总（1101-1120）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| LCP 17 | [速算机器人](https://leetcode.cn/problems/nGK0Fy/) | 简单 | 操作序列的最终数值 | 观察 \(x+y\) 每步翻倍，答案 \(2^n\) |
| 927 | [三等分](https://leetcode.cn/problems/three-equal-parts/) | 困难 | 二进制数组切成三段等值 | 统计 1，定位三段起点，对齐尾部逐位比对 |
| 1405 | [最长快乐字符串](https://leetcode.cn/problems/longest-happy-string/) | 中等 | 不出现三连字符的最长串 | 贪心 + 大根堆，必要时用第二多字符 |
| 1306 | [跳跃游戏 III](https://leetcode.cn/problems/jump-game-iii/) | 中等 | 从 start 能否跳到 0 | BFS/DFS + visited 防重复 |
| 367 | [有效的完全平方数](https://leetcode.cn/problems/valid-perfect-square/) | 简单 | 判断是否为完全平方数 | 二分查找整数平方 |
| 面试题 03.03 | [堆盘子](https://leetcode.cn/problems/stack-of-plates-lcci/) | 中等 | 多组定容量栈的设计 | ArrayList 存多栈，push/pop/popAt |
| LCP 04 | [覆盖](https://leetcode.cn/problems/broken-board-dominoes/) | 困难 | 破损棋盘多米诺最大覆盖 | 二分图最大匹配（增广路） |
| 1168 | [水资源分配优化](https://leetcode.cn/problems/optimize-water-distribution-in-a-village/) | 困难 | 供水最小成本 | 虚拟点连井边 + 最小生成树 Kruskal |
| 1341 | [电影评分](https://leetcode.cn/problems/movie-rating/) | 中等 | SQL：最多评分用户/二月最高均分电影 | 映射 + 计数；按月聚合 sum/count 比较 |
| 514 | [自由之路](https://leetcode.cn/problems/freedom-trail/) | 困难 | 旋转 ring 拼出 key 最少步数 | 位置表 + DP 转移（旋转距离） |
| 1570 | [两个稀疏向量的点积](https://leetcode.cn/problems/dot-product-of-two-sparse-vectors/) | 中等 | 稀疏向量点积 | 存非零项，下标双指针归并 |
| 1615 | [最大网络秩](https://leetcode.cn/problems/maximal-network-rank/) | 中等 | 两点度数之和（去重边）最大 | 度数统计 + 邻接矩阵枚举两点 |
| 643 | [子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i/) | 简单 | 固定长度子数组最大平均 | 滑动窗口维护最大和 |
| 258 | [各位相加](https://leetcode.cn/problems/add-digits/) | 简单 | 反复求各位和至一位数 | 数字根公式 \(1+(n-1)\%9\) |
| 598 | [范围求和 II](https://leetcode.cn/problems/range-addition-ii/) | 简单 | 多次左上子矩阵 +1 的最大值个数 | 取所有操作的最小行/列交集面积 |
| 765 | [情侣牵手](https://leetcode.cn/problems/couples-holding-hands/) | 困难 | 最少交换使情侣相邻 | 并查集连通块：答案=情侣数-连通块数 |
| 728 | [自除数](https://leetcode.cn/problems/self-dividing-numbers/) | 简单 | 能被每位数字整除的数 | 枚举 + 按位检查 |
| 1107 | [每日新用户统计](https://leetcode.cn/problems/new-users-daily-count/) | 中等 | SQL：90 天内每日首登用户数 | 取每用户最早 login 日期，再按天计数 |
| 1420 | [生成数组](https://leetcode.cn/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/) | 困难 | 计数：长度 n，最大值 m，代价 k | DP + 前缀和优化到 \(O(nmk)\) |
| 717 | [1比特与2比特字符](https://leetcode.cn/problems/1-bit-and-2-bit-characters/) | 简单 | 判断最后字符是否 1 比特 0 | 贪心解析到倒数第二位 |
