# 题目汇总（401-420）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1027 | [最长等差数列](https://leetcode.cn/problems/longest-arithmetic-subsequence/) | 中等 | DP 求最长等差子序列 | 二维 DP（差值范围固定可用数组） |
| 剑指 Offer 17 | [打印从1到最大的n位数](https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/) | 简单 | 构造 1..(10^n-1) | 直接生成数组 |
| 421 | [数组中两个数的最大异或值](https://leetcode.cn/problems/maximum-xor-of-two-numbers-in-an-array/) | 中等 | 最大 XOR | 按位贪心 + 前缀集合校验 |
| 剑指 Offer 60 | [n个骰子的点数](https://leetcode.cn/problems/nge-tou-zi-de-dian-shu-lcof/) | 中等 | n 个骰子点数概率 | DP 计数迭代 |
| 补充题7 | [木头切割问题](https://mp.weixin.qq.com/s/FQma0bdAWbzLMmCKhZRk7w) | 中等 | 切成 k 段求最大长度 | 二分答案 + 可行性检查 |
| 480 | [滑动窗口中位数](https://leetcode.cn/problems/sliding-window-median/) | 困难 | 窗口中位数 | 双堆 + 延迟删除 |
| 1233 | [删除子文件夹](https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/) | 中等 | 过滤子路径 | 排序 + 前缀判断 |
| 面试题 02.02 | [返回倒数第 k 个节点](https://leetcode.cn/problems/kth-node-from-end-of-list-lcci/) | 简单 | 链表倒数第 k 个 | 快慢指针 |
| 1658 | [将 x 减到 0 的最小操作数](https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/) | 中等 | 两端删除最少次数 | 转化为最长子数组和=total-x（滑窗） |
| 1280 | [学生们参加各科测试的次数](https://leetcode.cn/problems/students-and-examinations/) | 简单 | 全组合 + 计数输出 | Map 统计 (student, subject) 次数 |
| 350 | [两个数组的交集 II](https://leetcode.cn/problems/intersection-of-two-arrays-ii/) | 简单 | 交集含重复次数 | HashMap 计数 |
| 119 | [杨辉三角 II](https://leetcode.cn/problems/pascals-triangle-ii/) | 简单 | 第 k 行 | 一维 DP 从后往前更新 |
| 补充题3 | [求区间最小数乘区间和的最大值](https://mp.weixin.qq.com/s/UFv7pt_djjZoK_gzUBrRXA) | 困难 | max(min*sum) | 单调栈求边界 + 前缀和 |
| 703 | [数据流中的第K大元素](https://leetcode.cn/problems/kth-largest-element-in-a-stream/) | 简单 | 数据流第 k 大 | 小根堆维护 k 个最大值 |
| 剑指 Offer 25 | [合并两个排序的链表](https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/) | 简单 | 合并有序链表 | 迭代 + dummy |
| 1109 | [航班预订统计](https://leetcode.cn/problems/corporate-flight-bookings/) | 中等 | 区间加法统计 | 差分数组 + 前缀和 |
| 剑指 Offer 41 | [数据流中的中位数](https://leetcode.cn/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/) | 困难 | 数据流中位数 | 双堆平衡 |
| 1438 | [绝对差不超过限制的最长连续子数组](https://leetcode.cn/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | 中等 | max-min <= limit | 滑窗 + 单调队列（max/min） |
| 补充题12 | [二叉树的下一个节点](https://mp.weixin.qq.com/s/yewlHvHSilMsrUMFIO8WAA) | 中等 | 中序后继 | 右子树最左 / 向上找祖先 |
| 1011 | [在 D 天内送达包裹的能力](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/) | 中等 | 最小运载能力 | 二分答案 + 天数模拟 |
