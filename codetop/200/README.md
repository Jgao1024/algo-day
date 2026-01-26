# 题目汇总（181-200）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 611 | [有效三角形的个数](https://leetcode.cn/problems/valid-triangle-number/) | 中等 | 统计可组成三角形的三元组 | 排序 + 双指针：固定最大边 \(c\)，满足时一次加 `j-i` |
| 63 | [不同路径 II](https://leetcode.cn/problems/unique-paths-ii/) | 中等 | 网格路径计数（有障碍） | 一维 DP：障碍 `dp[j]=0`，否则 `dp[j]+=dp[j-1]` |
| 395 | [至少有K个重复字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-least-k-repeating-characters/) | 中等 | 每个字符出现次数都 \(\ge k\) 的最长子串 | 枚举不同字符种类数 1..26 + 滑动窗口计数 |
| 84 | [柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram/) | 困难 | 柱状图最大矩形面积 | 单调递增栈：弹栈高度做高，用 i 与新栈顶算宽 |
| 264 | [丑数 II](https://leetcode.cn/problems/ugly-number-ii/) | 中等 | 第 n 个丑数（2/3/5） | DP + 三指针 `p2/p3/p5` 去重生成 |
| 253 | [会议室 II](https://leetcode.cn/problems/meeting-rooms-ii/) | 中等 | 最少会议室数量 | 起止时间分离排序 + 双指针比较 `start` 与最早 `end` |
| 673 | [最长递增子序列的个数](https://leetcode.cn/problems/number-of-longest-increasing-subsequence/) | 中等 | LIS 的个数 | DP：`len[i]` + `cnt[i]`，长度变长覆盖，相同累加 |
| 1004 | [最大连续1的个数 III](https://leetcode.cn/problems/max-consecutive-ones-iii/) | 中等 | 最多翻转 k 个 0 的最长 1 串 | 滑动窗口：窗口内 0 数量 \(\le k\) |
| 51 | [N皇后](https://leetcode.cn/problems/n-queens/) | 困难 | N 皇后所有方案 | 回溯按行放，列/两对角线数组判冲突 |
| 134 | [加油站](https://leetcode.cn/problems/gas-station/) | 中等 | 找可绕行一圈的起点 | 总和判可行；`tank<0` 起点跳到 `i+1` |
| 补充题9 | [36进制加法](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/XcKQwnwCh5nZsz-DLHJwzQ/) | 中等 | 0-9+a-z 进制加法 | 模拟竖式：`%36` 当前位，`/36` 进位 |
| 剑指 Offer 29 | [顺时针打印矩阵](https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/) | 简单 | 螺旋遍历矩阵 | 四边界收缩模拟 |
| 剑指 Offer 27 | [二叉树的镜像](https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/) | 简单 | 交换左右子树 | 递归 swap 并继续 |
| 670 | [最大交换](https://leetcode.cn/problems/maximum-swap/) | 中等 | 交换两位使数最大 | 记录每个数字最后出现位置，贪心优先提升高位 |
| 面试题 02.05 | [链表求和](https://leetcode.cn/problems/sum-lists-lcci/) | 中等 | 低位在前的链表加法 | 模拟加法 + carry，哑节点构造结果 |
| 349 | [两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/) | 简单 | 两数组去重交集 | HashSet：一个存、一个扫、结果再转数组 |
| 剑指 Offer 39 | [数组中出现次数超过一半的数字](https://leetcode.cn/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/) | 简单 | 多数元素 | Boyer-Moore 投票 |
| 补充题14 | [阿拉伯数字转中文数字](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9814) | 中等 | 数字转中文读法 | 按 4 位分段（万/亿）+ 段内千百十个处理零 |
| 111 | [二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/) | 简单 | 最近叶子深度 | BFS 层序：遇到第一个叶子即返回 |
| 443 | [压缩字符串](https://leetcode.cn/problems/string-compression/) | 中等 | 原地字符串压缩 | 双指针：写字符 + 写次数数字串 |
