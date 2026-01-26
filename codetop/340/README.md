# 题目汇总（321-340）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 剑指 Offer 38 | [字符串的排列](https://leetcode.cn/problems/zi-fu-chuan-de-pai-lie-lcof/) | 中等 | 字符串全排列（去重） | 排序 + used 回溯，同层跳过重复字符 |
| 剑指 Offer 46 | [把数字翻译成字符串](https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/) | 中等 | 数字解码计数 | DP：单个必选，两位在 10..25 则加 dp[i-2] |
| 面试题 08.12 | [八皇后](https://leetcode.cn/problems/eight-queens-lcci/) | 困难 | N 皇后输出棋盘 | 回溯逐行放，列/两对角线剪枝 |
| 171 | [Excel表列序号](https://leetcode.cn/problems/excel-sheet-column-number/) | 简单 | 26 进制转换 | ans=ans*26+(c-'A'+1) |
| 836 | [矩形重叠](https://leetcode.cn/problems/rectangle-overlap/) | 简单 | 判断矩形是否有正面积交集 | 用严格不分离条件：min右>max左 且 min上>max下 |
| 36 | [有效的数独](https://leetcode.cn/problems/valid-sudoku/) | 中等 | 数独合法性校验 | 行/列/九宫格三组标记一次扫描 |
| 581 | [最短无序连续子数组](https://leetcode.cn/problems/shortest-unsorted-continuous-subarray/) | 简单 | 找最短需排序区间 | 左扫最大定右边界，右扫最小定左边界 |
| 面试题 16.25 | [LRU缓存](https://leetcode.cn/problems/lru-cache-lcci/) | 中等 | LRU 设计 | LinkedHashMap(accessOrder) 超容删除 eldest |
| 127 | [单词接龙](https://leetcode.cn/problems/word-ladder/) | 困难 | 最短变换序列长度 | BFS：逐位替换 26 字母生成邻居，字典去重 |
| 452 | [用最少数量的箭引爆气球](https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/) | 中等 | 区间最少点覆盖 | 按右端点排序贪心，start>pos 就新箭 |
| 118 | [杨辉三角](https://leetcode.cn/problems/pascals-triangle/) | 简单 | 逐行构造三角形 | row[j]=prev[j-1]+prev[j]，首尾为 1 |
| 902 | [最大为 N 的数字组合](https://leetcode.cn/problems/numbers-at-most-n-given-digit-set/) | 困难 | 计数不超过 N 的可构造数 | 先算短位数总量，再逐位统计小于分支，不能匹配就停 |
| 68 | [文本左右对齐](https://leetcode.cn/problems/text-justification/) | 困难 | 字符串排版 | 贪心分行；非末行空格均分，前 extra 个多 1 |
| 845 | [数组中的最长山脉](https://leetcode.cn/problems/longest-mountain-in-array/) | 中等 | 先升后降最长长度 | 一次遍历 up/down，下降后再上升则重置 |
| 486 | [预测赢家](https://leetcode.cn/problems/predict-the-winner/) | 中等 | 先手是否不输 | 区间分差 dp：max(拿左-对手分差, 拿右-对手分差) |
| 73 | [矩阵置零](https://leetcode.cn/problems/set-matrix-zeroes/) | 中等 | 原地清零行列 | 第一行/列做标记，最后处理首行首列 |
| 456 | [132模式](https://leetcode.cn/problems/132-pattern/) | 中等 | 是否存在 132 | 从右往左单调栈，third 记录可用“2” |
| 907 | [子数组的最小值之和](https://leetcode.cn/problems/sum-of-subarray-minimums/) | 中等 | 最小值贡献求和 | 单调栈算 left/right 距离，贡献=arr[i]*L*R |
| 149 | [直线上最多的点数](https://leetcode.cn/problems/max-points-on-a-line/) | 困难 | 同一直线最大点数 | 枚举点 i，统计最简 dy/dx 斜率，重复点单独叠加 |
| 剑指 Offer 50 | [第一个只出现一次的字符](https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/) | 简单 | 找首个唯一字符 | 计数一次，再按顺序找第一个 count==1 |
