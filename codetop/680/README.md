# 题目汇总（661-680）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 769 | [最多能完成排序的块](https://leetcode.cn/problems/max-chunks-to-make-sorted/) | 中等 | 排列可切块排序 | 扫描前缀最大值 `mx`，当 `mx==i` 可切一块 |
| 面试题 02.04 | [分割链表](https://leetcode.cn/problems/partition-list-lcci/) | 中等 | 稳定分割链表 | 两条链表（<x 与 >=x）收集后拼接 |
| 853 | [车队](https://leetcode.cn/problems/car-fleet/) | 中等 | 车队数量 | 按位置降序扫到达时间，时间变大开新队 |
| 275 | [H指数 II](https://leetcode.cn/problems/h-index-ii/) | 中等 | H 指数（二分） | 二分 h：检查 `citations[n-h] >= h` |
| 357 | [计算各个位数不同的数字个数](https://leetcode.cn/problems/count-numbers-with-unique-digits/) | 中等 | 计数无重复数字 | 组合计数：`9*9*8*...` 累加到 n（最多 10 位） |
| 736 | [Lisp 语法解析](https://leetcode.cn/problems/parse-lisp-expression/) | 困难 | 解析/求值表达式 | 递归求值 + 作用域栈；顶层按空格拆 token（忽略嵌套括号） |
| 477 | [汉明距离总和](https://leetcode.cn/problems/total-hamming-distance/) | 中等 | 所有数对汉明距离和 | 按位统计：贡献 `ones*(n-ones)` |
| 610 | [判断三角形](https://leetcode.cn/problems/triangle-judgement/) | 简单 | 三角形判定 | 判断三组“两边和 > 第三边” |
| 940 | [不同的子序列 II](https://leetcode.cn/problems/distinct-subsequences-ii/) | 困难 | 不同非空子序列数 | DP：`new=2*dp-last[c]`，答案 `dp-1` |
| 784 | [字母大小写全排列](https://leetcode.cn/problems/letter-case-permutation/) | 简单 | 字母大小写枚举 | 回溯：字母两分支、数字不分叉 |
| 面试题 17.08 | [马戏团人塔](https://leetcode.cn/problems/circus-tower-lcci/) | 中等 | 叠人塔最大人数 | 排序（同高体重降序）+ 体重 LIS |
| 1360 | [日期之间隔几天](https://leetcode.cn/problems/number-of-days-between-two-dates/) | 简单 | 日期差天数 | 日期转“从 1971-01-01 起的天数”再做差 |
| 1367 | [二叉树中的列表](https://leetcode.cn/problems/linked-list-in-binary-tree/) | 中等 | 链表是否为树路径 | 遍历树找起点 + 向下匹配 |
| 1263 | [推箱子](https://leetcode.cn/problems/minimum-moves-to-move-a-box-to-their-target-location/) | 困难 | 最少推箱次数 | BFS 按推箱次数；推前先 BFS 判玩家可达背后格 |
| 298 | [二叉树最长连续序列](https://leetcode.cn/problems/binary-tree-longest-consecutive-sequence/) | 中等 | 父子连续+1最长链 | DFS 返回单链长度，命中 `child==cur+1` 则接上 |
| 423 | [从英文中重建数字](https://leetcode.cn/problems/reconstruct-original-digits-from-english/) | 中等 | 英文乱序还原数字 | 计数：先用唯一字母定 0/2/4/6/8，再扣除推其余 |
| 1135 | [最低成本联通所有城市](https://leetcode.cn/problems/connecting-cities-with-minimum-cost/) | 中等 | 最小联通成本 | Kruskal 最小生成树 + 并查集 |
| 859 | [亲密字符串](https://leetcode.cn/problems/buddy-strings/) | 简单 | 一次交换能否相等 | 相等看是否有重复字母；不等看是否恰好两处错位可交叉 |
| 1116 | [打印零与奇偶数](https://leetcode.cn/problems/print-zero-even-odd/) | 中等 | 并发按序打印 | 三信号量：zero 控节奏，奇偶线程打印后唤醒 zero |
| 1087 | [字母切换](https://leetcode.cn/problems/brace-expansion/) | 中等 | 花括号展开 | 解析分段选项 + 回溯做笛卡尔积（选项排序保证字典序） |
