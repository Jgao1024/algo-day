# 题目汇总（741-760）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 剑指 Offer 68 - II | [二叉树的最近公共祖先](https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/) | 简单 | 求 LCA | 递归：左右都命中则当前是 LCA，否则返回非空一侧 |
| 211 | [添加与搜索单词 - 数据结构设计](https://leetcode.cn/problems/design-add-and-search-words-data-structure/) | 中等 | Trie 支持 `.` 通配 | Trie 插入；搜索遇 `.` 就枚举分支递归 |
| 403 | [青蛙过河](https://leetcode.cn/problems/frog-jump/) | 困难 | 能否到终点 | `pos -> step集合` DP，尝试 `k-1,k,k+1` 扩展 |
| 1089 | [复写零](https://leetcode.cn/problems/duplicate-zeros/) | 简单 | 原地把 0 复写一次 | 先算虚拟长度，再从右往左写回 |
| 1240 | [铺瓷砖](https://leetcode.cn/problems/tiling-a-rectangle-with-the-fewest-squares/) | 困难 | 最少正方形铺满矩形 | DFS 状态为每列高度，优先填最低列，放最大正方形剪枝 |
| 696 | [计数二进制子串](https://leetcode.cn/problems/count-binary-substrings/) | 简单 | 统计 01/10 连续子串 | 统计连续段长度，累加 `min(prev,cur)` |
| 351 | [安卓系统手势解锁](https://leetcode.cn/problems/android-unlock-patterns/) | 中等 | 统计合法解锁手势数 | 回溯 + `skip` 中间点限制 + 对称性加速 |
| 432 | [全 O(1) 的数据结构](https://leetcode.cn/problems/all-oone-data-structure/) | 困难 | O(1) 维护计数并取最大最小 key | 双向桶链表（按计数）+ key->桶 哈希映射 |
| 1208 | [尽可能使字符串相等](https://leetcode.cn/problems/get-equal-substrings-within-budget/) | 中等 | 最长预算内子串 | 滑动窗口维护改动代价和 `<=maxCost` |
| 1505 | [最多 K 次交换相邻数位后得到的最小整数](https://leetcode.cn/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/) | 困难 | 限制交换次数的最小字典序 | 贪心选最小可前移数字 + 树状数组算需要交换次数 |
| 991 | [坏了的计算器](https://leetcode.cn/problems/broken-calculator/) | 中等 | 最少操作从 start 到 target | 逆向贪心：target 奇数+1，偶数/2，最后补差 |
| 面试题 17.07 | [婴儿名字](https://leetcode.cn/problems/baby-names-lcci/) | 中等 | 同义词合并频次 | 并查集合并同义词（字典序小做根）再汇总计数 |
| 501 | [二叉搜索树中的众数](https://leetcode.cn/problems/find-mode-in-binary-search-tree/) | 简单 | BST 里出现最多的值 | 中序遍历统计连续次数，维护 max 并收集答案 |
| 剑指 Offer 14- II | [剪绳子 II](https://leetcode.cn/problems/jian-sheng-zi-ii-lcof/) | 中等 | 最大乘积取模 | 贪心尽量切 3（n<=3 返回 n-1），循环乘 3 取模 |
| 面试题 08.01 | [三步问题](https://leetcode.cn/problems/three-steps-problem-lcci/) | 简单 | 1/2/3 步爬楼梯计数 | DP：`dp[i]=dp[i-1]+dp[i-2]+dp[i-3]` 滚动取模 |
| 259 | [较小的三数之和](https://leetcode.cn/problems/3sum-smaller/) | 中等 | 统计三元组和 < target | 排序后固定 i，双指针，满足时一次加 `r-l` |
| 779 | [第K个语法符号](https://leetcode.cn/problems/k-th-symbol-in-grammar/) | 中等 | Kth 符号 | 规律：答案=bitCount(k-1) 的奇偶性 |
| 413 | [等差数列划分](https://leetcode.cn/problems/arithmetic-slices/) | 中等 | 连续等差子数组个数 | `cur` 记录以 i 结尾的个数，差相同则 `cur++` 并累加 |
| 827 | [最大人工岛](https://leetcode.cn/problems/making-a-large-island/) | 困难 | 翻转一个 0 的最大岛面积 | 先染色算每岛面积，再对每个 0 合并四邻不同岛 |
| 1110 | [删点成林](https://leetcode.cn/problems/delete-nodes-and-return-forest/) | 中等 | 删除节点返回森林 | 后序 DFS：删除节点则子节点成新根，否则回接 |
