# 题目汇总（881-900）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1064 | [不动点](https://leetcode.cn/problems/fixed-point/) | 简单 | 找最小 i 使 arr[i]=i | 二分查找边界 |
| 982 | [按位与为零的三元组](https://leetcode.cn/problems/triples-with-bitwise-and-equal-to-zero/) | 困难 | 统计 a&b&c==0 的三元组 | 预处理两两 AND 计数 + 枚举第三个数 |
| 1163 | [按字典序排在最后的子串](https://leetcode.cn/problems/last-substring-in-lexicographical-order/) | 困难 | 找字典序最大的子串 | 双指针找最大后缀（线性） |
| 1472 | [设计浏览器历史记录](https://leetcode.cn/problems/design-browser-history/) | 中等 | visit/back/forward | 数组 + `cur/end` 指针截断前进历史 |
| 1170 | [比较字符串最小字母出现频次](https://leetcode.cn/problems/compare-strings-by-frequency-of-the-smallest-character/) | 简单 | 比较 f(query) 与 f(words) | words 频次排序 + 二分 upperBound |
| 1239 | [串联字符串的最大长度](https://leetcode.cn/problems/maximum-length-of-a-concatenated-string-with-unique-characters/) | 中等 | 拼接后字符全唯一的最大长度 | 回溯 + bitmask 剪枝 |
| 1006 | [笨阶乘](https://leetcode.cn/problems/clumsy-factorial/) | 中等 | 特殊运算阶乘 | 找规律：n<=4 特判，其余看 n%4 |
| 1396 | [设计地铁系统](https://leetcode.cn/problems/design-underground-system/) | 中等 | 统计线路平均耗时 | inMap + route 聚合（total/count） |
| 1624 | [两个相同字符之间的最长子字符串](https://leetcode.cn/problems/largest-substring-between-two-equal-characters/) | 简单 | 两端相同的最大夹心长度 | 记录首次出现位置 |
| 1648 | [销售价值减少的颜色球](https://leetcode.cn/problems/sell-diminishing-valued-colored-balls/) | 中等 | 最大收益卖球 | 贪心按层卖 + 等差求和 |
| 1010 | [总持续时间可被 60 整除的歌曲](https://leetcode.cn/problems/pairs-of-songs-with-total-durations-divisible-by-60/) | 简单 | 统计和为 60 倍数的对数 | 余数计数：`need=(60-r)%60` |
| 1105 | [填充书架](https://leetcode.cn/problems/filling-bookcase-shelves/) | 中等 | 书架最小总高度 | DP：枚举最后一层起点 |
| 1103 | [分糖果 II](https://leetcode.cn/problems/distribute-candies-to-people/) | 简单 | 依次发 1,2,3... 糖果 | 直接模拟 |
| 978 | [最长湍流子数组](https://leetcode.cn/problems/longest-turbulent-subarray/) | 中等 | 相邻大小交替的最长子数组 | up/down 动态维护 |
| 1473 | [给房子涂色 III](https://leetcode.cn/problems/paint-house-iii/) | 困难 | 最小成本且街区数为 target | DP：位置/颜色/街区数（滚动数组） |
| 655 | [输出二叉树](https://leetcode.cn/problems/print-binary-tree/) | 中等 | 把树打印成矩阵 | 先求高度定宽度，再区间中点递归填值 |
| 368 | [最大整除子集](https://leetcode.cn/problems/largest-divisible-subset/) | 中等 | 最大整除集合 | 排序 + DP + 前驱回溯 |
| 370 | [区间加法](https://leetcode.cn/problems/range-addition/) | 中等 | 多次区间加值 | 差分数组 + 前缀和 |
| 1551 | [使数组中所有元素相等的最小操作数](https://leetcode.cn/problems/minimum-operations-to-make-array-equal/) | 中等 | 奇数数组变相等最少操作 | 数学：floor(n^2/4) |
| 453 | [最小移动次数使数组元素相等](https://leetcode.cn/problems/minimum-moves-to-equal-array-elements/) | 简单 | n-1 个+1 的最少次数 | 转化：对齐到最小值，sum-min*n |
