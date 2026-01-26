# 题目汇总（481-500）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 89 | [格雷编码](https://leetcode.cn/problems/gray-code/) | 中等 | 生成 n 位格雷码序列 | 公式：`i^(i>>1)` |
| 剑指 Offer 59 - II | [队列的最大值](https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/) | 中等 | 支持取最大值的队列 | 单调队列维护最大值 |
| 428 | [序列化和反序列化 N 叉树](https://leetcode.cn/problems/serialize-and-deserialize-n-ary-tree/) | 困难 | N 叉树编码/解码 | 前序 + 子节点数量 |
| 剑指 Offer 58 - I | [翻转单词顺序](https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/) | 简单 | 反转句子单词顺序 | `trim + split("\\s+") + 倒序拼接` |
| 1493 | [删掉一个元素以后全为 1 的最长子数组](https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/) | 中等 | 删 1 个数后最长连续 1 | 滑窗：窗口内最多 1 个 0 |
| 404 | [左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/) | 简单 | 求所有左叶子节点之和 | DFS：判断左叶子累加 |
| 449 | [序列化和反序列化二叉搜索树](https://leetcode.cn/problems/serialize-and-deserialize-bst/) | 中等 | BST 编码/解码 | 前序 + 上下界重建 |
| 1353 | [最多可以参加的会议数目](https://leetcode.cn/problems/maximum-number-of-events-that-can-be-attended/) | 中等 | 最大参加会议数量 | 贪心 + 小根堆（最早结束优先） |
| 剑指 Offer 19 | [正则表达式匹配](https://leetcode.cn/problems/zheng-ze-biao-da-shi-pi-pei-lcof/) | 困难 | `.` 与 `*` 的匹配 | DP：`dp[i][j]` |
| 剑指 Offer 53 - II | [0～n-1中缺失的数字](https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/) | 简单 | 有序数组缺失 1 个数 | 二分找 `nums[i]!=i` |
| 414 | [第三大的数](https://leetcode.cn/problems/third-maximum-number/) | 简单 | 第三大（去重） | 一次遍历维护前三大 |
| 1002 | [查找常用字符](https://leetcode.cn/problems/find-common-characters/) | 简单 | 多个字符串的公共字符 | 26 频次取最小值 |
| 1539 | [第 k 个缺失的正整数](https://leetcode.cn/problems/kth-missing-positive-number/) | 简单 | 找第 k 个缺失正数 | 二分：`missing=arr[i]-(i+1)` |
| 65 | [有效数字](https://leetcode.cn/problems/valid-number/) | 困难 | 判断字符串是否为数字 | 扫描 + 状态标记 |
| 263 | [丑数](https://leetcode.cn/problems/ugly-number/) | 简单 | 判断是否只含 2/3/5 因子 | 除尽 2/3/5 |
| 951 | [翻转等价二叉树](https://leetcode.cn/problems/flip-equivalent-binary-trees/) | 中等 | 允许任意节点左右翻转 | 递归：同向/交叉匹配 |
| 886 | [可能的二分法](https://leetcode.cn/problems/possible-bipartition/) | 中等 | 互相讨厌的人分两组 | 二分图染色 |
| 949 | [给定数字能组成的最大时间](https://leetcode.cn/problems/largest-time-for-given-digits/) | 简单 | 4 个数拼最大合法时间 | 枚举 24 种排列 |
| 256 | [粉刷房子](https://leetcode.cn/problems/paint-house/) | 简单 | 相邻不同色的最小花费 | DP 三色滚动 |
| 面试题 02.07 | [链表相交](https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/) | 简单 | 两链表相交节点 | 双指针切换走同路程 |
