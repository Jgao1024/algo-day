# 题目汇总（41-60）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 22 | [括号生成](https://leetcode.cn/problems/generate-parentheses/) | 中等 | 回溯生成有效括号 | 约束 left/right：left<n 才放 '('，right<left 才放 ')' |
| 232 | [用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/) | 简单 | 用栈模拟队列 | 双栈：入队进 in；出队/取头用 out；out 空就把 in 倒过去（均摊 O(1)） |
| 704 | [二分查找](https://leetcode.cn/problems/binary-search/) | 简单 | 有序数组找目标下标 | 标准二分，闭区间 [l,r]，l<=r |
| 148 | [排序链表](https://leetcode.cn/problems/sort-list/) | 中等 | 链表排序 | 归并：快慢找中点切分 + 合并两个有序链表，O(nlogn) |
| 94 | [二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | 简单 | 中序遍历 | 迭代栈：一路压左，弹出访问，转向右 |
| 69 | [x 的平方根](https://leetcode.cn/problems/sqrtx/) | 简单 | 整数平方根 | 二分找最后一个满足 mid^2<=x 的 mid（用 long 防溢出） |
| 239 | [滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) | 困难 | 每个窗口取最大值 | 单调队列存下标且值递减；过期弹头，小值弹尾，头即最大 |
| 32 | [最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/) | 困难 | 最长连续有效括号 | 栈 + 哨兵 -1：遇 ')' 弹栈，空了压断点，否则 i-peek 更新答案 |
| 31 | [下一个排列](https://leetcode.cn/problems/next-permutation/) | 中等 | 找下一个字典序 | 找转折点 i，找替换点 j 交换，再反转后缀 |
| 8 | [字符串转换整数 (atoi)](https://leetcode.cn/problems/string-to-integer-atoi/) | 中等 | 字符串转 int | 扫描：跳空格/判符号/累加数字；提前判溢出并截断 |
| 2 | [两数相加](https://leetcode.cn/problems/add-two-numbers/) | 中等 | 链表表示大整数相加 | 按位相加 + carry，新建结果链表 |
| 70 | [爬楼梯](https://leetcode.cn/problems/climbing-stairs/) | 简单 | 计数 DP | dp[i]=dp[i-1]+dp[i-2]，滚动变量 |
| 322 | [零钱兑换](https://leetcode.cn/problems/coin-change/) | 中等 | 最少硬币数 | 完全背包 dp[amount]：dp[i]=min(dp[i],dp[i-c]+1) |
| 43 | [字符串相乘](https://leetcode.cn/problems/multiply-strings/) | 中等 | 大数乘法 | 竖式：m+n 数组累加，低位 i+j+1，进位加到 i+j |
| 76 | [最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/) | 困难 | 最短覆盖 t 的子串 | 滑动窗口：missing==0 时收缩左边到刚好不满足，更新最短 |
| 41 | [缺失的第一个正数](https://leetcode.cn/problems/first-missing-positive/) | 困难 | 缺失最小正整数 | 原地哈希：把 x 放到 x-1，再找第一个 nums[i]!=i+1 |
| 105 | [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | 中等 | 重建二叉树 | 前序定根，中序切左右；哈希存中序下标递归建树 |
| 78 | [子集](https://leetcode.cn/problems/subsets/) | 中等 | 生成幂集 | 回溯：每到节点加入 path，从 idx 往后枚举选择 |
| 剑指 Offer 22 | [链表中倒数第k个节点](https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/) | 简单 | 倒数第 k 个节点 | 快慢指针：快先走 k 步，再一起走到尾 |
| 151 | [翻转字符串里的单词](https://leetcode.cn/problems/reverse-words-in-a-string/) | 中等 | 反转单词顺序 | 从后往前扫描提取单词，手动控制空格 |
