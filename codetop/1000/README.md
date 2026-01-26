# 题目汇总（981-1000）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 957 | [N 天后的牢房](https://leetcode.cn/problems/prison-cells-after-n-days/) | 中等 | 8 格状态演化 N 天 | 状态压缩 + 找循环 |
| 750 | [角矩形的数量](https://leetcode.cn/problems/number-of-corner-rectangles/) | 中等 | 统计四角都是 1 的矩形 | 行对统计公共 1 列数 \(C(c,2)\) |
| 面试题 03.02 | [栈的最小值](https://leetcode.cn/problems/min-stack-lcci/) | 简单 | 支持 getMin 的栈 | 双栈同步维护最小值 |
| 面试题 01.03 | [URL化](https://leetcode.cn/problems/string-to-url-lcci/) | 简单 | 空格替换为 %20 | 扫描前 length 构造 |
| 385 | [迷你语法分析器](https://leetcode.cn/problems/mini-parser/) | 中等 | 解析嵌套整数列表 | 栈解析：`[` 入栈 `]` 出栈 |
| 801 | [使序列递增的最小交换次数](https://leetcode.cn/problems/minimum-swaps-to-make-sequences-increasing/) | 中等 | 两数组严格递增的最少交换 | DP：keep/swap 两状态 |
| 1368 | [使网格图至少有一条有效路径的最小代价](https://leetcode.cn/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/) | 困难 | 修改箭头最小代价 | 0-1 BFS 最短路 |
| 650 | [只有两个键的键盘](https://leetcode.cn/problems/2-keys-keyboard/) | 中等 | 复制粘贴最少步数 | 质因数分解：因子和 |
| 1080 | [根到叶路径上的不足节点](https://leetcode.cn/problems/insufficient-nodes-in-root-to-leaf-paths/) | 中等 | 剪掉不达标路径节点 | DFS 剪枝返回子树 |
| 1259 | [不相交的握手](https://leetcode.cn/problems/handshakes-that-dont-cross/) | 困难 | 不交叉配对数量 | Catalan DP |
| 1145 | [二叉树着色游戏](https://leetcode.cn/problems/binary-tree-coloring-game/) | 中等 | 二号玩家是否必胜 | 计算 x 的 L/R/父区域大小 |
| 436 | [寻找右区间](https://leetcode.cn/problems/find-right-interval/) | 中等 | 为每个区间找右侧最小起点 | start 排序 + lower_bound |
| 667 | [优美的排列 II](https://leetcode.cn/problems/beautiful-arrangement-ii/) | 中等 | 构造差值种类为 k 的排列 | 前 k+1 左右夹逼构造 |
| 656 | [金币路径](https://leetcode.cn/problems/coin-path/) | 困难 | 最小花费且字典序最小路径 | 反向 DP + next 恢复路径 |
| 1584 | [连接所有点的最小费用](https://leetcode.cn/problems/min-cost-to-connect-all-points/) | 中等 | MST 最小总曼哈顿距离 | Prim \(O(n^2)\) |
| 730 | [统计不同回文子序列](https://leetcode.cn/problems/count-different-palindromic-subsequences/) | 困难 | 不同非空回文子序列数 | 区间 DP + next/prev |
| 725 | [分隔链表](https://leetcode.cn/problems/split-linked-list-in-parts/) | 中等 | 均分链表成 k 段 | 先算长度再按 base/extra 切 |
| 878 | [第 N 个神奇数字](https://leetcode.cn/problems/nth-magical-number/) | 困难 | 第 n 个可被 a 或 b 整除的数 | 二分答案 + 容斥计数 |
| 1261 | [在受污染的二叉树中查找元素](https://leetcode.cn/problems/find-elements-in-a-contaminated-binary-tree/) | 中等 | 还原树并查询 | DFS 还原 + HashSet |
| 374 | [猜数字大小](https://leetcode.cn/problems/guess-number-higher-or-lower/) | 简单 | 猜数字二分 | 标准二分 |
