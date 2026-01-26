# 题目汇总（641-660）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1038 | [从二叉搜索树到更大和树](https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/) | 中等 | BST 变成累加树 | 反向中序（右根左）累加 `sum` 并回写 |
| 821 | [字符的最短距离](https://leetcode.cn/problems/shortest-distance-to-a-character/) | 简单 | 每个位置到目标字符最近距离 | 左到右 + 右到左 两次遍历取最小 |
| 面试题 02.01 | [移除重复节点](https://leetcode.cn/problems/remove-duplicate-node-lcci/) | 简单 | 链表去重 | HashSet 记录出现过的值，重复就跳过 |
| 668 | [乘法表中第k小的数](https://leetcode.cn/problems/kth-smallest-number-in-multiplication-table/) | 困难 | 乘法表第 k 小 | 二分答案 `x`，计数 `<=x` 为 `sum(min(n,x/i))` |
| 剑指 Offer 55 - I | [二叉树的深度](https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/) | 简单 | 求树高度 | 递归 `1+max(left,right)` |
| 1343 | [大小为 K 且平均值大于等于阈值的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) | 中等 | 固定窗口计数 | 长度 k 滑动窗口，比较 `sum >= threshold*k` |
| 95 | [不同的二叉搜索树 II](https://leetcode.cn/problems/unique-binary-search-trees-ii/) | 中等 | 生成所有 BST | 区间递归枚举根 + 记忆化 |
| 1073 | [负二进制数相加](https://leetcode.cn/problems/adding-two-negabinary-numbers/) | 中等 | base -2 加法 | 逐位相加，`digit=sum&1`，`carry=(sum-digit)/-2` |
| 721 | [账户合并](https://leetcode.cn/problems/accounts-merge/) | 中等 | 邮箱合并账号 | 并查集按邮箱 union，最后按根分组并排序邮箱 |
| 327 | [区间和的个数](https://leetcode.cn/problems/count-of-range-sum/) | 困难 | 统计区间和落在范围内的数量 | 前缀和 + 归并分治计数（双指针） |
| 面试题 16.01 | [交换数字](https://leetcode.cn/problems/swap-numbers-lcci/) | 中等 | 交换数组两个数 | 临时变量交换返回 |
| 719 | [找出第 k 小的距离对](https://leetcode.cn/problems/find-k-th-smallest-pair-distance/) | 困难 | 数对距离第 k 小 | 排序后二分距离，双指针计数 `<=d` 的对数 |
| LCP 18 | [早餐组合](https://leetcode.cn/problems/2vYnGI/) | 简单 | 组合数不超过 x | drinks 排序，对每个 staple 二分上界累加取模 |
| 910 | [最小差值 II](https://leetcode.cn/problems/smallest-range-ii/) | 中等 | 加减 K 后最小差 | 排序枚举分界点，算 newHigh/newLow |
| 1668 | [最大重复子字符串](https://leetcode.cn/problems/maximum-repeating-substring/) | 简单 | word 连续重复最多次 | 逐次追加 word，判断是否仍是子串 |
| 299 | [猜数字游戏](https://leetcode.cn/problems/bulls-and-cows/) | 简单 | Bulls/Cows 计数 | 先算 bulls，再对非 bulls 做数字频次 min 求 cows |
| 313 | [超级丑数](https://leetcode.cn/problems/super-ugly-number/) | 中等 | 第 n 个超级丑数 | DP + 每个质数一个指针，多路归并取最小候选 |
| 1594 | [矩阵的最大非负积](https://leetcode.cn/problems/maximum-non-negative-product-in-a-matrix/) | 中等 | 最大乘积路径且非负 | 网格 DP 同时维护 max/min 乘积（负数翻转） |
| 397 | [整数替换](https://leetcode.cn/problems/integer-replacement/) | 中等 | 最少替换到 1 | 贪心：偶数除2；奇数根据 `n&3` 选 +1/-1（特判3） |
| 1290 | [二进制链表转整数](https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/) | 简单 | 二进制链表转十进制 | 遍历 `ans=ans*2+val` |
