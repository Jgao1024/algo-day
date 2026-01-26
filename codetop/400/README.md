# 题目汇总（381-400）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 918 | [环形子数组的最大和](https://leetcode.cn/problems/maximum-sum-circular-subarray/) | 中等 | 环形数组最大子数组和 | Kadane：maxSub 与 total-minSub 取最大 |
| 35 | [搜索插入位置](https://leetcode.cn/problems/search-insert-position/) | 简单 | 插入位置/下界 | 二分找第一个 `>= target` |
| 补充题13 | [中文数字转阿拉伯数字](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9813) | 中等 | 中文数解析为整数 | 按“万/亿”分节累加 |
| 321 | [拼接最大数](https://leetcode.cn/problems/create-maximum-number/) | 困难 | 两数组取 k 个组成最大数 | 枚举分配 + 单调栈取子序列 + 合并 |
| 381 | [O(1) 时间插入、删除和获取随机元素 - 允许重复](https://leetcode.cn/problems/insert-delete-getrandom-o1-duplicates-allowed/) | 困难 | 可重复随机集合 | 数组 + value->下标集合，删除用尾部覆盖 |
| 补充题20 | [立方根](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9820) | 中等 | 整数立方根向下取整 | 二分答案 |
| 214 | [最短回文串](https://leetcode.cn/problems/shortest-palindrome/) | 困难 | 在前面补最少字符成回文 | KMP 找最长回文前缀 |
| 273 | [整数转换英文表示](https://leetcode.cn/problems/integer-to-english-words/) | 困难 | 数字转英文读法 | 按 3 位一组转换再拼接单位 |
| 231 | [2的幂](https://leetcode.cn/problems/power-of-two/) | 简单 | 判断是否为 2 的幂 | 位运算：`n>0 && (n&(n-1))==0` |
| 140 | [单词拆分 II](https://leetcode.cn/problems/word-break-ii/) | 困难 | 输出所有拆分句子 | DFS + 记忆化 |
| 559 | [N叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-n-ary-tree/) | 简单 | N 叉树最大深度 | DFS |
| 173 | [二叉搜索树迭代器](https://leetcode.cn/problems/binary-search-tree-iterator/) | 中等 | BST 中序迭代器 | 栈模拟中序，均摊 O(1) |
| 767 | [重构字符串](https://leetcode.cn/problems/reorganize-string/) | 中等 | 相邻字符不相同重排 | 计数 + 偶/奇下标填充 |
| 补充题24 | [双栈排序](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/g_AqwsSEUwlRSevnStPkEA/) | 中等 | 用一个辅助栈排序栈 | 插入排序式栈操作 |
| 剑指 Offer 59 - I | [滑动窗口的最大值](https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/) | 困难 | 每个窗口最大值 | 单调队列（存下标） |
| 875 | [爱吃香蕉的珂珂](https://leetcode.cn/problems/koko-eating-bananas/) | 中等 | 最小吃香蕉速度 | 二分答案 + 计算耗时 |
| 530 | [二叉搜索树的最小绝对差](https://leetcode.cn/problems/minimum-absolute-difference-in-bst/) | 简单 | BST 相邻值最小差 | 中序遍历比较相邻 |
| 面试题 16.06 | [最小差](https://leetcode.cn/problems/smallest-difference-lcci/) | 中等 | 两数组最小绝对差 | 排序 + 双指针 |
| 1013 | [将数组分成和相等的三个部分](https://leetcode.cn/problems/partition-array-into-three-parts-with-equal-sum/) | 简单 | 三段和相等 | 扫描找前两段 `sum/3` |
| 726 | [原子的数量](https://leetcode.cn/problems/number-of-atoms/) | 困难 | 化学式计数并按字典序输出 | 栈 + Map 合并，最后 TreeMap 排序 |
