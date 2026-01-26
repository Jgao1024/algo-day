# 题目汇总（261-280）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 257 | [二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/) | 简单 | 二叉树所有根到叶路径 | DFS + 路径拼接/回溯 |
| 268 | [缺失数字](https://leetcode.cn/problems/missing-number/) | 简单 | 0..n 缺一个数 | 异或 0..n 与数组 |
| 面试题 17.24 | [最大子矩阵](https://leetcode.cn/problems/max-submatrix-lcci/) | 困难 | 最大和子矩阵坐标 | 固定上下边界 + Kadane |
| 13 | [罗马数字转整数](https://leetcode.cn/problems/roman-to-integer/) | 简单 | 罗马转十进制 | 当前值与下一个比较，减法对则减 |
| 235 | [二叉搜索树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/) | 简单 | BST LCA | 利用 BST 分叉点迭代 |
| 131 | [分割回文串](https://leetcode.cn/problems/palindrome-partitioning/) | 中等 | 回文切分所有方案 | DP 预处理回文 + 回溯枚举切点 |
| 438 | [找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) | 中等 | 找所有异位词起点 | 固定窗口 + 计数差分 + diff |
| 862 | [和至少为 K 的最短子数组](https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/) | 困难 | 含负数的最短长度 | 前缀和 + 单调队列 |
| 剑指 Offer 32 - III | [从上到下打印二叉树 III](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/) | 中等 | 之字形层序 | BFS 分层 + LinkedList 头尾插 |
| 876 | [链表的中间结点](https://leetcode.cn/problems/middle-of-the-linked-list/) | 简单 | 找中点 | 快慢指针 |
| 554 | [砖墙](https://leetcode.cn/problems/brick-wall/) | 中等 | 竖线穿最少砖 | 统计砖缝位置最大频次 |
| 109 | [有序链表转换二叉搜索树](https://leetcode.cn/problems/convert-sorted-list-to-binary-search-tree/) | 中等 | 有序链表转平衡 BST | 转数组 + 中点递归 |
| 204 | [计数质数](https://leetcode.cn/problems/count-primes/) | 简单 | 统计小于 n 的质数 | 埃氏筛 |
| 617 | [合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) | 简单 | 两棵树按节点相加 | 递归原地合并 |
| 剑指 Offer 24 | [反转链表](https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/) | 简单 | 反转单链表 | 迭代三指针 |
| 946 | [验证栈序列](https://leetcode.cn/problems/validate-stack-sequences/) | 中等 | 判断入栈出栈序列合法性 | 栈模拟，能弹就弹 |
| 面试题 08.06 | [汉诺塔问题](https://leetcode.cn/problems/hanota-lcci/) | 简单 | 汉诺塔移动 | 递归三步 move(n-1)/move(1)/move(n-1) |
| 面试题 10.03 | [搜索旋转数组](https://leetcode.cn/problems/search-rotate-array-lcci/) | 中等 | 旋转数组搜索（可重复） | 二分变体，三值相等时收缩 |
| 1262 | [可被三整除的最大和](https://leetcode.cn/problems/greatest-sum-divisible-by-three/) | 中等 | 最大和 %3==0 | dp[3] 记录各余数最大和 |
| 525 | [连续数组](https://leetcode.cn/problems/contiguous-array/) | 中等 | 0/1 数量相等最长子数组 | 0->-1，前缀和首次位置 |
