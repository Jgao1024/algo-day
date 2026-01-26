# 题目汇总（921-940）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 576 | [出界的路径数](https://leetcode.cn/problems/out-of-boundary-paths/) | 中等 | 网格内走步出界计数 | DP 按步数滚动，出界累加 |
| 1289 | [下降路径最小和  II](https://leetcode.cn/problems/minimum-falling-path-sum-ii/) | 困难 | 不能选同列的最小下降路径和 | DP：上一行最小/次小优化 |
| 1301 | [最大得分的路径数目](https://leetcode.cn/problems/number-of-paths-with-max-score/) | 困难 | 最大得分与方案数 | DP 同时维护 best + ways |
| 1449 | [数位成本和为目标值的最大数字](https://leetcode.cn/problems/form-largest-integer-with-digits-that-add-up-to-target/) | 困难 | 成本和为 target 的最大数字 | 完全背包 dp[t] 最大位数 + 贪心回溯 |
| 1631 | [最小体力消耗路径](https://leetcode.cn/problems/path-with-minimum-effort/) | 中等 | 最小化路径上的最大高度差 | Dijkstra：dist=最小可能最大边权 |
| 1334 | [阈值距离内邻居最少的城市](https://leetcode.cn/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) | 中等 | 阈值内可达邻居最少（并列取大） | Floyd 全源最短路后计数 |
| 634 | [寻找数组的错位排列](https://leetcode.cn/problems/find-the-derangement-of-an-array/) | 中等 | 错位排列数 | DP：`dp[n]=(n-1)(dp[n-1]+dp[n-2])` |
| 828 | [统计子串中的唯一字符](https://leetcode.cn/problems/count-unique-characters-of-all-substrings-of-a-given-string/) | 困难 | 所有子串的唯一字符贡献和 | 按字符贡献 `(i-prev)*(next-i)` |
| 面试题 01.09 | [字符串轮转](https://leetcode.cn/problems/string-rotation-lcci/) | 简单 | 判断旋转字符串 | `s1+s1` 包含 `s2` |
| 645 | [错误的集合](https://leetcode.cn/problems/set-mismatch/) | 简单 | 找重复数和缺失数 | 计数/标记一次扫描 |
| 502 | [IPO](https://leetcode.cn/problems/ipo/) | 困难 | 做最多 k 个项目最大资金 | capital 排序 + 利润大根堆 |
| 面试题 04.05 | [合法二叉搜索树](https://leetcode.cn/problems/legal-binary-search-tree-lcci/) | 中等 | 判断 BST | 中序遍历严格递增 |
| 937 | [重新排列日志文件](https://leetcode.cn/problems/reorder-data-in-log-files/) | 简单 | 字母日志排序 + 数字日志保序 | 自定义比较器排序 |
| 1381 | [设计一个支持增量操作的栈](https://leetcode.cn/problems/design-a-stack-with-increment-operation/) | 中等 | 栈底 k 个元素增量 | 差分 inc 延迟下传 |
| 1204 | [最后一个能进入电梯的人](https://leetcode.cn/problems/last-person-to-fit-in-the-elevator/) | 中等 | 最后一个累计重量不超 1000 | SQL：窗口函数前缀和 |
| 面试题 10.01 | [合并排序的数组](https://leetcode.cn/problems/sorted-merge-lcci/) | 简单 | 合并两个有序数组到 A | 从后往前双指针 |
| 1292 | [元素和小于等于阈值的正方形的最大边长](https://leetcode.cn/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/) | 中等 | 最大边长满足正方形和 <= threshold | 二维前缀和 + 二分边长 |
| 163 | [缺失的区间](https://leetcode.cn/problems/missing-ranges/) | 中等 | 补出缺失区间 | 扫描相邻间隙（long 防溢出） |
| 690 | [员工的重要性](https://leetcode.cn/problems/employee-importance/) | 简单 | 递归/迭代累加下属重要性 | Map 建索引 + BFS/DFS |
| 372 | [超级次方](https://leetcode.cn/problems/super-pow/) | 中等 | 大指数取模幂 | 快速幂 + 按十进制位迭代 |
