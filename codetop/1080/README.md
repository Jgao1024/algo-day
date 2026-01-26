# 题目汇总（1061-1080）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1504 | [统计全 1 子矩形](https://leetcode.cn/problems/count-submatrices-with-all-ones/) | 中等 | 全 1 子矩形数量 | 行转柱状图 + 单调栈计数 |
| 1222 | [可以攻击国王的皇后](https://leetcode.cn/problems/queens-that-can-attack-the-king/) | 中等 | 找 8 方向最近皇后 | 八方向扩散 |
| 1647 | [字符频次唯一的最小删除次数](https://leetcode.cn/problems/minimum-deletions-to-make-character-frequencies-unique/) | 中等 | 频次去重最少删除 | 频次统计 + 集合占用 |
| 710 | [黑名单中的随机数](https://leetcode.cn/problems/random-pick-with-blacklist/) | 困难 | 在黑名单外等概率随机 | 小区间随机 + 黑到白映射 |
| 218 | [天际线问题](https://leetcode.cn/problems/the-skyline-problem/) | 困难 | 建筑轮廓关键点 | 扫描线 + TreeMap 多重集 |
| 1232 | [缀点成线](https://leetcode.cn/problems/check-if-it-is-a-straight-line/) | 简单 | 判断共线 | 叉积/交叉相乘 |
| 566 | [重塑矩阵](https://leetcode.cn/problems/reshape-the-matrix/) | 简单 | 矩阵 reshape | 一维下标映射 |
| 补充题15 | [自然数数组的排序](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9815) | 中等 | 0..n-1 下标归位排序 | 原地交换归位（循环排序） |
| 面试题 02.03 | [删除中间节点](https://leetcode.cn/problems/delete-middle-node-lcci/) | 简单 | 给定节点删除 | 复制后继值并跳过 |
| 面试题 04.06 | [后继者](https://leetcode.cn/problems/successor-lcci/) | 中等 | BST 中序后继 | 右子树最左 / 从根找候选 |
| 1003 | [检查替换后的词是否有效](https://leetcode.cn/problems/check-if-word-is-valid-after-substitutions/) | 中等 | 消除 abc 后是否为空 | 栈模拟消除 |
| 1166 | [设计文件系统](https://leetcode.cn/problems/design-file-system/) | 中等 | create/get 路径值 | HashMap 存路径，校验父路径 |
| 648 | [单词替换](https://leetcode.cn/problems/replace-words/) | 中等 | 用词根替换单词 | Trie 找最短词根 |
| 323 | [无向图中连通分量的数目](https://leetcode.cn/problems/number-of-connected-components-in-an-undirected-graph/) | 中等 | 无向图连通分量数 | 并查集合并边 |
| 932 | [漂亮数组](https://leetcode.cn/problems/beautiful-array/) | 中等 | 构造满足条件的排列 | 分治构造（奇偶扩展） |
| 689 | [三个无重叠子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-3-non-overlapping-subarrays/) | 困难 | 选 3 段长度 k 最大和 | 窗口和 + 左右最优预处理 |
| 126 | [单词接龙 II](https://leetcode.cn/problems/word-ladder-ii/) | 困难 | 输出所有最短转换序列 | BFS 建最短路图 + DFS 回溯 |
| 1456 | [定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | 中等 | 固定长度元音最大数 | 固定窗口 |
| 777 | [在LR字符串中交换相邻字符](https://leetcode.cn/problems/swap-adjacent-in-lr-string/) | 中等 | 是否可变换 | 忽略 X 双指针 + 位置约束 |
| 458 | [可怜的小猪](https://leetcode.cn/problems/poor-pigs/) | 困难 | 最少猪数区分桶 | 状态数 \(t^p\) 覆盖 buckets |
