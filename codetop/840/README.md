# 题目汇总（821-840）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 面试题 16.22 | [兰顿蚂蚁](https://leetcode.cn/problems/langtons-ant-lcci/) | 中等 | 模拟 K 步后的棋盘打印 | HashSet 存黑格 + 模拟，最后按边界输出 |
| 1512 | [好数对的数目](https://leetcode.cn/problems/number-of-good-pairs/) | 简单 | 统计相等元素对数 | 频次计数：累加历史出现次数 |
| 1401 | [圆和矩形是否有重叠](https://leetcode.cn/problems/circle-and-rectangle-overlapping/) | 中等 | 圆与轴对齐矩形相交判断 | 圆心到矩形最近点距离 <= r |
| 568 | [最大休假天数](https://leetcode.cn/problems/maximum-vacation-days/) | 困难 | 飞行+每周休假最大值 | 按周 DP：from->to 转移取 max |
| 1298 | [你能从盒子里获得的最大糖果数](https://leetcode.cn/problems/maximum-candies-you-can-get-from-boxes/) | 困难 | 盒子/钥匙/包含关系收集糖果 | BFS：可开盒入队，开盒拿钥匙和新盒 |
| 1561 | [你可以获得的最大硬币数目](https://leetcode.cn/problems/maximum-number-of-coins-you-can-get/) | 中等 | 三人轮流取堆的最大收益 | 排序 + 双指针，每轮取次大 |
| 1062 | [最长重复子串](https://leetcode.cn/problems/longest-repeating-substring/) | 中等 | 最长出现 ≥2 次的子串长度 | DP 求 s 与自身最长公共子串（位置不同） |
| 1382 | [将二叉搜索树变平衡](https://leetcode.cn/problems/balance-a-binary-search-tree/) | 中等 | 让 BST 高度平衡 | 中序转有序数组 + 二分建树 |
| 1034 | [边框着色](https://leetcode.cn/problems/coloring-a-border/) | 中等 | 连通块边界染色 | BFS 找连通块，判边界后统一改色 |
| 606 | [根据二叉树创建字符串](https://leetcode.cn/problems/construct-string-from-binary-tree/) | 简单 | 前序 + 括号规则构造字符串 | 递归：右存在时左空要补 "()" |
| 471 | [编码最短长度的字符串](https://leetcode.cn/problems/encode-string-with-shortest-length/) | 困难 | 最短 k[pattern] 编码 | 区间 DP：切分 + 检测重复模式 |
| 87 | [扰乱字符串](https://leetcode.cn/problems/scramble-string/) | 困难 | 递归切分交换判断等价 | 记忆化 DFS + 字符计数剪枝 |
| 920 | [播放列表的数量](https://leetcode.cn/problems/number-of-music-playlists/) | 困难 | 满足间隔 k 的播放列表计数 | DP：加新歌/加旧歌（受 k 限制） |
| 464 | [我能赢吗](https://leetcode.cn/problems/can-i-win/) | 中等 | 轮流取数达标博弈 | 状压 DFS + 记忆化 |
| 1093 | [大样本统计](https://leetcode.cn/problems/statistics-from-a-large-sample/) | 中等 | 从计数数组求五数统计 | 一次扫 min/max/mean/mode + 累计找中位数 |
| LCP 12 | [小张刷题计划](https://leetcode.cn/problems/xiao-zhang-shua-ti-ji-hua/) | 中等 | 连续分段，日内可“免做最长题”一次 | 二分最大日耗时 + 贪心 check |
| 371 | [两整数之和](https://leetcode.cn/problems/sum-of-two-integers/) | 简单 | 不用 + - 求和 | 异或求和 + 与运算求进位循环 |
| 953 | [验证外星语词典](https://leetcode.cn/problems/verifying-an-alien-dictionary/) | 简单 | 自定义字母序比较单词序列 | rank 映射 + 逐对比较 |
| 面试题 16.02 | [单词频率](https://leetcode.cn/problems/words-frequency-lcci/) | 中等 | 设计词频查询类 | HashMap 预统计，get O(1) |
| 1191 | [K 次串联后最大子数组之和](https://leetcode.cn/problems/k-concatenation-maximum-sum/) | 中等 | k 次拼接后的最大子数组和 | Kadane + 前后缀 + 总和分类讨论 |
