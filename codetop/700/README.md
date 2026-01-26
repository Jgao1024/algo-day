# 题目汇总（681-700）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 388 | [文件的最长绝对路径](https://leetcode.cn/problems/longest-absolute-file-path/) | 中等 | 解析文件系统字符串求最长文件路径 | 逐行按层级更新路径长度数组 |
| 1008 | [先序遍历构造二叉树](https://leetcode.cn/problems/construct-binary-search-tree-from-preorder-traversal/) | 中等 | 由先序构造 BST | 递归 + 上界 bound，线性构造 |
| 812 | [最大三角形面积](https://leetcode.cn/problems/largest-triangle-area/) | 简单 | 三点最大面积 | 暴力枚举三点 + 叉积 |
| 面试题 02.08 | [环路检测](https://leetcode.cn/problems/linked-list-cycle-lcci/) | 中等 | 找链表入环点 | Floyd 快慢指针 |
| 1488 | [避免洪水泛滥](https://leetcode.cn/problems/avoid-flood-in-the-city/) | 中等 | 安排抽干避免湖泊重复下雨 | lastRain + TreeSet 选晴天抽指定湖 |
| 244 | [最短单词距离 II](https://leetcode.cn/problems/shortest-word-distance-ii/) | 中等 | 多次查询两词最短距离 | 预处理下标列表 + 双指针 |
| 631 | [设计 Excel 求和公式](https://leetcode.cn/problems/design-excel-sum-formula/) | 困难 | 支持 set/get/sum 的表格 | 保存公式依赖，get 递归求值 |
| 850 | [矩形面积 II](https://leetcode.cn/problems/rectangle-area-ii/) | 困难 | 多矩形并集面积（取模） | 扫描线 + 线段树（y 离散化） |
| 795 | [区间子数组个数](https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/) | 中等 | 最大值落在 [L,R] 的子数组数 | atMost(R) - atMost(L-1) |
| 1365 | [有多少小于当前数字的数字](https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/) | 简单 | 每个数比它小的个数 | 计数排序 + 前缀和 |
| 1248 | [统计「优美子数组」](https://leetcode.cn/problems/count-number-of-nice-subarrays/) | 中等 | 恰好 k 个奇数的子数组数 | 前缀奇数计数 + 频次累加 |
| 1020 | [飞地的数量](https://leetcode.cn/problems/number-of-enclaves/) | 中等 | 不连边界的陆地数量 | 边界 flood fill 后计数 |
| 901 | [股票价格跨度](https://leetcode.cn/problems/online-stock-span/) | 中等 | 在线求跨度 | 单调栈（price+span） |
| 589 | [N叉树的前序遍历](https://leetcode.cn/problems/n-ary-tree-preorder-traversal/) | 简单 | N 叉树前序 | 栈迭代（子节点逆序入栈） |
| 1373 | [二叉搜索子树的最大键值和](https://leetcode.cn/problems/maximum-sum-bst-in-binary-tree/) | 困难 | 子树为 BST 时的最大节点和 | 后序返回 isBST/min/max/sum |
| 1186 | [删除一次得到子数组最大和](https://leetcode.cn/problems/maximum-subarray-sum-with-one-deletion/) | 中等 | 最多删 1 个元素的最大子数组和 | DP：keep / del |
| 184 | [部门工资最高的员工](https://leetcode.cn/problems/department-highest-salary/) | 中等 | 每个部门最高薪员工 | 先求部门 maxSalary 再 join |
| 1400 | [构造 K 个回文字符串](https://leetcode.cn/problems/construct-k-palindrome-strings/) | 中等 | 能否分成 k 个回文串 | oddCount <= k 且 k<=n |
| 1226 | [哲学家进餐](https://leetcode.cn/problems/the-dining-philosophers/) | 中等 | 并发无死锁进餐 | Semaphore 限流 + 叉子按序加锁 |
| 1464 | [数组中两元素的最大乘积](https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/) | 简单 | 最大 \((a-1)(b-1)\) | 找最大与次大 |
