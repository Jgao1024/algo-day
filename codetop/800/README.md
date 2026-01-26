# 题目汇总（781-800）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 342 | [4的幂](https://leetcode.cn/problems/power-of-four/) | 简单 | 判断是否为 4 的幂 | 位运算：2 的幂且落在奇数位 |
| 989 | [数组形式的整数加法](https://leetcode.cn/problems/add-to-array-form-of-integer/) | 简单 | 数组表示大整数 + k | 从末位模拟加法 + 进位 |
| 201 | [数字范围按位与](https://leetcode.cn/problems/bitwise-and-of-numbers-range/) | 中等 | 区间按位与 | 找公共前缀：同时右移直到相等 |
| 1081 | [不同字符的最小子序列](https://leetcode.cn/problems/smallest-subsequence-of-distinct-characters/) | 中等 | 去重且字典序最小 | 单调栈 + 计数/是否在栈 |
| 319 | [灯泡开关](https://leetcode.cn/problems/bulb-switcher/) | 中等 | 最终亮灯数量 | 完全平方数个数 \(\lfloor\sqrt{n}\rfloor\) |
| 1100 | [长度为 K 的无重复字符子串](https://leetcode.cn/problems/find-k-length-substrings-with-no-repeated-characters/) | 中等 | 统计固定长度无重复子串 | 固定窗口 + 频次/dup 计数 |
| 1154 | [一年中的第几天](https://leetcode.cn/problems/day-of-the-year/) | 简单 | 日期转年内第几天 | 解析 + 月份累加（闰年） |
| 剑指 Offer 57 | [和为s的两个数字](https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/) | 简单 | 有序数组两数之和 | 双指针 |
| 847 | [访问所有节点的最短路径](https://leetcode.cn/problems/shortest-path-visiting-all-nodes/) | 困难 | 访问全节点最短步数 | 状态压缩 BFS（node,mask）多源 |
| 834 | [树中距离之和](https://leetcode.cn/problems/sum-of-distances-in-tree/) | 困难 | 每个点到所有点距离和 | 换根 DP：两次 DFS |
| 剑指 Offer 64 | [求1+2+…+n](https://leetcode.cn/problems/qiu-12n-lcof/) | 中等 | 不能用循环/条件求和 | 递归 + `&&` 短路 |
| 1139 | [最大的以 1 为边界的正方形](https://leetcode.cn/problems/largest-1-bordered-square/) | 中等 | 边界全为 1 的最大正方形面积 | 预处理 right/down 连续 1 + 枚举边长 |
| 面试题 17.22 | [单词转换](https://leetcode.cn/problems/word-transformer-lcci/) | 中等 | 单词最短转换路径 | BFS + 父指针回溯（通配符索引） |
| 529 | [扫雷游戏](https://leetcode.cn/problems/minesweeper/) | 中等 | 点击后展开棋盘 | DFS/BFS 模拟展开 |
| 770 | [基本计算器 IV](https://leetcode.cn/problems/basic-calculator-iv/) | 困难 | 代入后输出化简多项式 | 递归下降解析 + 多项式加减乘 |
| 333 | [最大 BST 子树](https://leetcode.cn/problems/largest-bst-subtree/) | 中等 | 最大 BST 子树节点数 | 后序返回 isBST/min/max/size |
| 990 | [等式方程的可满足性](https://leetcode.cn/problems/satisfiability-of-equality-equations/) | 中等 | 判断等式/不等式是否矛盾 | 并查集 |
| 879 | [盈利计划](https://leetcode.cn/problems/profitable-schemes/) | 困难 | 计数满足人数与利润方案 | 0/1 背包 DP（人数×利润） |
| 931 | [下降路径最小和](https://leetcode.cn/problems/minimum-falling-path-sum/) | 中等 | 下降路径最小和 | DP 一维滚动 |
| 665 | [非递减数列](https://leetcode.cn/problems/non-decreasing-array/) | 简单 | 至多改 1 次变非递减 | 贪心修复降序点 |
