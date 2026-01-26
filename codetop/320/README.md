# 题目汇总（301-320）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 剑指 Offer 31 | [栈的压入、弹出序列](https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/) | 中等 | 判断出栈序列是否合法 | 模拟栈：按 pushed 入栈，能弹就弹匹配 popped |
| 386 | [字典序排数](https://leetcode.cn/problems/lexicographical-numbers/) | 中等 | 生成 1..n 的字典序 | 迭代 DFS：能下潜 `*10` 就下潜，否则回退到能 `+1` 的前缀 |
| 剑指 Offer 07 | [重建二叉树](https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/) | 中等 | 前序+中序构建二叉树 | 分治递归：前序定根，中序切左右，哈希表定位根下标 |
| 735 | [行星碰撞](https://leetcode.cn/problems/asteroid-collision/) | 中等 | 相向行星碰撞模拟 | 栈：只处理 `top>0 && cur<0` 的碰撞，循环消到稳定 |
| 60 | [第k个排列](https://leetcode.cn/problems/permutation-sequence/) | 困难 | 第 k 个字典序排列 | 阶乘数系统：`k--` 0 基，每位用 `k/(i-1)!` 选数字 |
| 628 | [三个数的最大乘积](https://leetcode.cn/problems/maximum-product-of-three-numbers/) | 简单 | 三数最大乘积 | 一次遍历维护 3 个最大和 2 个最小，比较两种候选 |
| 238 | [除自身以外数组的乘积](https://leetcode.cn/problems/product-of-array-except-self/) | 中等 | 不用除法构造乘积数组 | 前缀积写入 + 右侧乘积变量从右往左补上 |
| 306 | [累加数](https://leetcode.cn/problems/additive-number/) | 中等 | 字符串是否能拆成累加序列 | 枚举前两段 + 字符串加法校验后续前缀匹配（注意前导 0） |
| 166 | [分数到小数](https://leetcode.cn/problems/fraction-to-recurring-decimal/) | 中等 | 循环小数表示 | 长除法 + 余数位置哈希：余数重复处插括号 |
| 658 | [找到 K 个最接近的元素](https://leetcode.cn/problems/find-k-closest-elements/) | 中等 | 有序数组找最接近的 k 个数 | 二分窗口左边界：比较 `x-arr[mid]` 与 `arr[mid+k]-x` |
| 435 | [无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals/) | 中等 | 最少删除使区间不重叠 | 按结束点贪心：重叠就删（等价保留结束更早的） |
| 523 | [连续的子数组和](https://leetcode.cn/problems/continuous-subarray-sum/) | 中等 | 是否存在长度≥2 且和为 k 倍数 | 前缀和取模：记录余数最早位置，间隔 ≥2 即可 |
| 974 | [和可被 K 整除的子数组](https://leetcode.cn/problems/subarray-sums-divisible-by-k/) | 中等 | 计数：和能被 k 整除 | 前缀余数计数：`ans += count[mod]` 后 `count[mod]++` |
| 912 | [排序数组](https://leetcode.cn/problems/sort-an-array/) | 中等 | 实现 \(O(n\log n)\) 排序 | 归并排序：分治 + 合并，`tmp` 复用 |
| 202 | [快乐数](https://leetcode.cn/problems/happy-number/) | 简单 | 平方和迭代是否到 1 | Floyd 判环：状态转移当 next，快慢指针判断 |
| 315 | [计算右侧小于当前元素的个数](https://leetcode.cn/problems/count-of-smaller-numbers-after-self/) | 困难 | 右侧更小元素计数 | 归并排序统计：合并时 `rightCount` 累加到左元素答案 |
| 1312 | [让字符串成为回文串的最少插入次数](https://leetcode.cn/problems/minimum-insertion-steps-to-make-a-string-palindrome/) | 困难 | 最少插入变回文 | 区间 DP：两端相等缩一圈，否则 `min(dp[i+1][j],dp[i][j-1])+1` |
| 407 | [接雨水 II](https://leetcode.cn/problems/trapping-rain-water-ii/) | 困难 | 二维接雨水总量 | 最小堆+BFS：从边界扩张，更新围墙高度并累加水量 |
| 437 | [路径总和 III](https://leetcode.cn/problems/path-sum-iii/) | 中等 | 任意起点向下路径计数 | 前缀和计数 + DFS 回溯：累加 `count[sum-target]` |
| 补充题21 | [字符串相减](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/RtAoA1hdf0h1PaVxRj_fzA/) | 中等 | 大整数字符串减法 | 先比大小定符号，竖式减法处理借位并去前导 0 |
