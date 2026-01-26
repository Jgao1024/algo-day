# 题目汇总（361-380）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 405 | [数字转换为十六进制数](https://leetcode.cn/problems/convert-a-number-to-hexadecimal/) | 简单 | int 转 16 进制 | `&0xf` 取低 4 位 + `>>>4` 无符号右移 |
| 补充题8 | [计算数组的小和](https://mp.weixin.qq.com/s/rMsbcUf9ZPhvfRoyZGW6HA) | 中等 | 数组小和统计 | 归并排序：`a[i] < a[j]` 时贡献 `a[i]*(右侧剩余个数)` |
| 722 | [删除注释](https://leetcode.cn/problems/remove-comments/) | 中等 | 删除行/块注释 | 扫描 + `inBlock` 状态机，块注释可跨行 |
| 57 | [插入区间](https://leetcode.cn/problems/insert-interval/) | 困难 | 插入并合并区间 | 一次扫描：左段直接放，中段合并，右段直接放 |
| 895 | [最大频率栈](https://leetcode.cn/problems/maximum-frequency-stack/) | 困难 | 频率最高且最近 | `freq` + `group[f]` 栈组 + `maxFreq` |
| 852 | [山脉数组的峰顶索引](https://leetcode.cn/problems/peak-index-in-a-mountain-array/) | 简单 | 找峰顶下标 | 二分：看 `mid` 与 `mid+1` 上坡/下坡决定方向 |
| 补充题17 | [两个有序数组第k小的数](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9817) | 困难 | 两有序数组第 k 小 | 每次丢掉 `k/2` 个元素（二分淘汰） |
| 30 | [串联所有单词的子串](https://leetcode.cn/problems/substring-with-concatenation-of-all-words/) | 困难 | 单词拼接子串起点 | 按单词长度分组滑窗，超频就缩窗 |
| 392 | [判断子序列](https://leetcode.cn/problems/is-subsequence/) | 简单 | 子序列判断 | 双指针扫 `t`，匹配到就推进 `s` |
| 1293 | [网格中的最短路径](https://leetcode.cn/problems/shortest-path-in-a-grid-with-obstacles-elimination/) | 困难 | 带清障次数的最短路 | BFS 状态 `(r,c,rem)` + `best[r][c]` 剪枝 |
| 889 | [根据前序和后序遍历构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/) | 中等 | 前序+后序构树 | 前序定根，后序定位左子树大小递归切分 |
| 1171 | [从链表中删去总和值为零的连续节点](https://leetcode.cn/problems/remove-zero-sum-consecutive-nodes-from-linked-list/) | 中等 | 删除和为 0 的连续段 | 前缀和两遍：记录“最后一次出现”并跳指针 |
| 159 | [至多包含两个不同字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-most-two-distinct-characters/) | 中等 | 至多 2 种字符滑窗 | 计数 + distinct，超 2 就收缩 |
| 剑指 Offer 65 | [不用加减乘除做加法](https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/) | 简单 | 位运算加法 | `sum=a^b`，`carry=(a&b)<<1` 迭代到 carry 为 0 |
| 701 | [二叉搜索树中的插入操作](https://leetcode.cn/problems/insert-into-a-binary-search-tree/) | 中等 | BST 插入 | 迭代找空位挂新节点 |
| 252 | [会议室](https://leetcode.cn/problems/meeting-rooms/) | 简单 | 区间是否重叠 | 按 start 排序后看相邻是否交叉 |
| 117 | [填充每个节点的下一个右侧节点指针 II](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/) | 中等 | next 指针连接层序 | 用 `dummy/tail` 串下一层，靠 next 横扫当前层 |
| 1146 | [快照数组](https://leetcode.cn/problems/snapshot-array/) | 中等 | 可回溯数组 | 每下标记录 `(snap,val)` 列表，get 二分 |
| 716 | [最大栈](https://leetcode.cn/problems/max-stack/) | 简单 | 支持 popMax 的栈 | 双向链表 + TreeMap 定位最近的最大值节点 |
| 454 | [四数相加 II](https://leetcode.cn/problems/4sum-ii/) | 中等 | 四数组和为 0 计数 | `A+B` 频次哈希 + 匹配 `-(C+D)` |
