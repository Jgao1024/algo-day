# 题目汇总（441-460）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 976 | [三角形的最大周长](https://leetcode.cn/problems/largest-perimeter-triangle/) | 简单 | 排序找最大合法三元组 | 排序后从右往左，首个满足 \(a+b>c\) 直接返回 |
| 593 | [有效的正方形](https://leetcode.cn/problems/valid-square/) | 中等 | 判断 4 点能否构成正方形 | 6 个平方距离排序：4 边相等且>0，2 对角线相等且=2*边 |
| 983 | [最低票价](https://leetcode.cn/problems/minimum-cost-for-tickets/) | 中等 | 买 1/7/30 日票最省钱 | 按天 DP：出行日取 `min(dp[i-1]+c1, dp[i-7]+c7, dp[i-30]+c30)` |
| 369 | [给单链表加一](https://leetcode.cn/problems/plus-one-linked-list/) | 中等 | 链表表示整数 +1 | 递归到尾部 +1，回溯传进位；头部仍进位则补新头 |
| 738 | [单调递增的数字](https://leetcode.cn/problems/monotone-increasing-digits/) | 中等 | 最大的单调递增数字 | 从右往左找降序点：前一位-1，后缀全置 9 |
| 463 | [岛屿的周长](https://leetcode.cn/problems/island-perimeter/) | 简单 | 计算岛屿边界长度 | 每个陆地先 +4，遇到相邻陆地就 -1（四方向） |
| 147 | [对链表进行插入排序](https://leetcode.cn/problems/insertion-sort-list/) | 中等 | 链表插入排序 | `dummy` 维护已排序链表，逐个找位置插入 |
| 632 | [最小区间](https://leetcode.cn/problems/smallest-range-covering-elements-from-k-lists/) | 困难 | 覆盖 K 个有序列表的最小区间 | 最小堆维护当前最小值 + 记录当前最大值，弹最小推进其列表 |
| 621 | [任务调度器](https://leetcode.cn/problems/task-scheduler/) | 中等 | 含冷却时间的最短调度长度 | 频次公式：`max(len, (maxCnt-1)*(n+1)+maxNum)` |
| 1049 | [最后一块石头的重量 II](https://leetcode.cn/problems/last-stone-weight-ii/) | 中等 | 两堆差最小 | 0/1 背包凑到 `sum/2` 最近，答案 `sum-2*j` |
| 814 | [二叉树剪枝](https://leetcode.cn/problems/binary-tree-pruning/) | 中等 | 删除不含 1 的子树 | 后序：先剪左右，再判断叶子 0 则置空 |
| 399 | [除法求值](https://leetcode.cn/problems/evaluate-division/) | 中等 | 变量除法查询 | 建图（双向带权），每个 query BFS/DFS 累乘找路径 |
| 1339 | [分裂二叉树的最大乘积](https://leetcode.cn/problems/maximum-product-of-splitted-binary-tree/) | 中等 | 切一条边最大化两部分和乘积 | 先求 total，再遍历每个子树和 `sub`，更新 `sub*(total-sub)` |
| 52 | [N皇后 II](https://leetcode.cn/problems/n-queens-ii/) | 困难 | 统计 N 皇后方案数 | 回溯逐行放，列/对角线占用标记剪枝 |
| 633 | [平方数之和](https://leetcode.cn/problems/sum-of-square-numbers/) | 中等 | 是否存在 \(a^2+b^2=c\) | 双指针 `l=0,r=sqrt(c)`，按和大小移动 |
| 820 | [单词的压缩编码](https://leetcode.cn/problems/short-encoding-of-words/) | 中等 | 最短编码长度 | Set 删除所有真后缀，剩余词贡献 `len+1` |
| 1209 | [删除字符串中的所有相邻重复项 II](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string-ii/) | 中等 | 删除连续 k 个相同字符 | 栈存字符+计数，计数到 k 就弹栈 |
| 补充题11 | [翻转URL字符串里的单词](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9811) | 中等 | `%20` 分隔的单词倒序 | 扫描按 `%20` 分词，反转后用 `%20` 连接 |
| 212 | [单词搜索 II](https://leetcode.cn/problems/word-search-ii/) | 困难 | 网格中找多单词 | Trie + DFS 回溯，命中 `word` 加入答案并去重 |
| 132 | [分割回文串 II](https://leetcode.cn/problems/palindrome-partitioning-ii/) | 困难 | 最少切割使每段是回文 | 预处理回文 `pal` + `dp` 最少切割 |
