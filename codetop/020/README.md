# 题目汇总（1-20）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 3 | [无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) | 中等 | 最长无重复子串长度 | 滑动窗口，记录字符上次出现位置，重复则移动左边界 |
| 146 | [LRU缓存机制](https://leetcode.cn/problems/lru-cache/) | 中等 | 设计 LRU 缓存 | 哈希表定位 + 双向链表维护访问顺序，超容量淘汰尾节点 |
| 206 | [反转链表](https://leetcode.cn/problems/reverse-linked-list/) | 简单 | 反转单链表 | 三指针迭代：保存 next，再改指向，整体推进 |
| 215 | [数组中的第K个最大元素](https://leetcode.cn/problems/kth-largest-element-in-an-array/) | 中等 | 选择第 k 大 | QuickSelect 平均 \(O(n)\)；或小根堆保留 k 个 |
| 25 | [K 个一组翻转链表](https://leetcode.cn/problems/reverse-nodes-in-k-group/) | 困难 | 每 k 个节点翻转 | 分段找 kth，原地反转段并接回（dummy + groupPrev） |
| 15 | [三数之和](https://leetcode.cn/problems/3sum/) | 中等 | 找和为 0 的不重复三元组 | 排序 + 枚举 i + 双指针，注意去重与剪枝 |
| 53 | [最大子数组和](https://leetcode.cn/problems/maximum-subarray/) | 中等 | 连续子数组最大和 | Kadane：dp=max(nums[i], dp+nums[i]) |
| 补充题4 | [手撕快速排序](https://leetcode.cn/problems/sort-an-array/) | 中等 | 数组排序 | 随机快排 partition；或归并最坏 \(O(n\log n)\) |
| 5 | [最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/) | 中等 | 最长回文子串 | 枚举中心（奇/偶）向两侧扩展，更新最优区间 |
| 21 | [合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/) | 简单 | 合并两个升序链表 | dummy + 双指针逐个比较接到尾部 |
| 102 | [二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | 中等 | BFS 按层输出 | 队列 BFS，每轮用 size 分层 |
| 33 | [搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) | 中等 | 旋转数组查找 | 改造二分：判断哪半有序，再决定收缩区间 |
| 200 | [岛屿数量](https://leetcode.cn/problems/number-of-islands/) | 中等 | 网格连通块计数 | DFS/BFS 染色：遇到 1 扩张并标 0，计数+1 |
| 1 | [两数之和](https://leetcode.cn/problems/two-sum/) | 简单 | 找两数和为 target | 哈希补数：遍历查 need 是否出现过 |
| 46 | [全排列](https://leetcode.cn/problems/permutations/) | 中等 | 枚举所有排列 | 回溯 + used[] 逐位选择未使用元素 |
| 88 | [合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) | 简单 | 原地合并有序数组 | 从后往前双指针写入，避免覆盖有效元素 |
| 20 | [有效的括号](https://leetcode.cn/problems/valid-parentheses/) | 简单 | 括号匹配 | 栈：左括号入栈，右括号匹配栈顶 |
| 121 | [买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | 简单 | 一次交易最大利润 | 一趟维护前缀最小价格，更新最大差值 |
| 92 | [反转链表 II](https://leetcode.cn/problems/reverse-linked-list-ii/) | 中等 | 反转指定区间 | dummy + 头插法：不断把 cur.next 插到 pre 后 |
| 103 | [二叉树的锯齿形层次遍历](https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/) | 中等 | 层序交替方向 | BFS 分层 + Deque 按方向 addFirst/addLast |
