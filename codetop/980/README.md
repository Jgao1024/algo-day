# 题目汇总（961-980）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 741 | [摘樱桃](https://leetcode.cn/problems/cherry-pickup/) | 困难 | 去一趟再回来的最大樱桃数 | 两人同步走的三维 DP（压成二维） |
| 276 | [栅栏涂色](https://leetcode.cn/problems/paint-fence/) | 简单 | 相邻最多两根同色的涂法数 | DP（same/diff） |
| 267 | [回文排列 II](https://leetcode.cn/problems/palindrome-permutation-ii/) | 中等 | 生成所有回文排列 | 统计 + 生成半边去重回溯 |
| 1344 | [时钟指针的夹角](https://leetcode.cn/problems/angle-between-hands-of-a-clock/) | 中等 | 求时针分针最小夹角 | 直接算角度取 min(d,360-d) |
| 174 | [地下城游戏](https://leetcode.cn/problems/dungeon-game/) | 困难 | 求进入起点的最小初始血量 | 从终点反推 DP（至少为 1） |
| 1673 | [找出最具竞争力的子序列](https://leetcode.cn/problems/find-the-most-competitive-subsequence/) | 中等 | 字典序最小的长度 k 子序列 | 单调栈（可删除 n-k 个） |
| 1122 | [数组的相对排序](https://leetcode.cn/problems/relative-sort-array/) | 简单 | 按 arr2 顺序优先排序 | 计数/哈希 + 剩余升序 |
| 466 | [统计重复个数](https://leetcode.cn/problems/count-the-repetitions/) | 困难 | S1^n1 中最多包含多少个 S2^n2 | 模拟匹配 + 循环节加速 |
| 1462 | [课程安排 IV](https://leetcode.cn/problems/course-schedule-iv/) | 中等 | 查询先修关系是否成立 | 拓扑序 + 可达性传递闭包 |
| LCP 07 | [传递信息](https://leetcode.cn/problems/chuan-di-xin-xi/) | 简单 | 恰好 k 轮到终点的方案数 | 按轮次 DP |
| 面试题 04.01 | [节点间通路](https://leetcode.cn/problems/route-between-nodes-lcci/) | 中等 | 有向图可达性 | BFS/DFS |
| 1061 | [按字典序排列最小的等效字符串](https://leetcode.cn/problems/lexicographically-smallest-equivalent-string/) | 中等 | 等价类替换成最小字母 | 并查集（代表元取最小） |
| 860 | [柠檬水找零](https://leetcode.cn/problems/lemonade-change/) | 简单 | 是否能正确找零 | 贪心：优先用 10+5 |
| 962 | [最大宽度坡](https://leetcode.cn/problems/maximum-width-ramp/) | 中等 | 求最大 j-i 且 A[i]<=A[j] | 单调递减栈 + 反向扫描 |
| 1022 | [从根到叶的二进制数之和](https://leetcode.cn/problems/sum-of-root-to-leaf-binary-numbers/) | 简单 | 所有根到叶的二进制值求和 | DFS 累积 (cur<<1)+val |
| 988 | [从叶结点开始的最小字符串](https://leetcode.cn/problems/smallest-string-starting-from-leaf/) | 中等 | 叶到根字典序最小字符串 | DFS 路径，叶子反转比较 |
| 1523 | [在区间范围内统计奇数数目](https://leetcode.cn/problems/count-odd-numbers-in-an-interval-range/) | 简单 | 统计 [low,high] 奇数个数 | odd(x)=(x+1)/2 前缀差 |
| 1566 | [重复至少 K 次且长度为 M 的模式](https://leetcode.cn/problems/detect-pattern-of-length-m-repeated-k-or-more-times/) | 简单 | 是否存在长度 m 重复 k 次的模式 | 相邻块逐位对比 |
| 1188 | [设计有限阻塞队列](https://leetcode.cn/problems/design-bounded-blocking-queue/) | 中等 | 有界阻塞队列 | Lock + Condition（notFull/notEmpty） |
| 659 | [分割数组为连续子序列](https://leetcode.cn/problems/split-array-into-consecutive-subsequences/) | 中等 | 能否拆成若干长度≥3连续序列 | 贪心：优先接到已有序列 |
