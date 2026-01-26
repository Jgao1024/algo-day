# 题目汇总（21-40）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 236 | [二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) | 中等 | 二叉树 LCA | 后序 DFS：左右都找到则当前为 LCA，否则向上返回非空 |
| 141 | [环形链表](https://leetcode.cn/problems/linked-list-cycle/) | 简单 | 判断链表是否有环 | Floyd 快慢指针相遇判圈 |
| 300 | [最长上升子序列](https://leetcode.cn/problems/longest-increasing-subsequence/) | 中等 | LIS 长度 | tails + 二分（扑克牌法）\(O(n\log n)\) |
| 54 | [螺旋矩阵](https://leetcode.cn/problems/spiral-matrix/) | 中等 | 螺旋遍历矩阵 | top/bottom/left/right 四边界收缩模拟 |
| 143 | [重排链表](https://leetcode.cn/problems/reorder-list/) | 中等 | 重排链表顺序 | 中点 + 反转后半段 + 交错合并 |
| 23 | [合并K个排序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) | 困难 | 合并 k 条升序链表 | 小根堆多路合并 \(O(N\log k)\) |
| 415 | [字符串相加](https://leetcode.cn/problems/add-strings/) | 简单 | 字符串大数加法 | 从后往前逐位相加 + carry，最后反转 |
| 56 | [合并区间](https://leetcode.cn/problems/merge-intervals/) | 中等 | 合并重叠区间 | 按起点排序后扫描合并 |
| 160 | [相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) | 简单 | 找相交起点 | 双指针换头走 A+B，对齐后在交点相遇 |
| 72 | [编辑距离](https://leetcode.cn/problems/edit-distance/) | 困难 | 字符串最少编辑 | dp[i][j]，插入/删除/替换取最小（滚动数组） |
| 42 | [接雨水](https://leetcode.cn/problems/trapping-rain-water/) | 困难 | 计算可接雨水量 | 双指针 + leftMax/rightMax，谁低动谁 |
| 124 | [二叉树中的最大路径和](https://leetcode.cn/problems/binary-tree-maximum-path-sum/) | 困难 | 最大路径和 | 后序 DFS：返回单边最大贡献，节点作拐点更新全局 |
| 1143 | [最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/) | 中等 | LCS 长度 | dp[i][j]：相等走左上+1，否则取上/左最大（滚动） |
| 93 | [复原IP地址](https://leetcode.cn/problems/restore-ip-addresses/) | 中等 | 复原所有 IP | 回溯切 4 段，校验 0~255 与前导零，长度剪枝 |
| 82 | [删除排序链表中的重复元素 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/) | 中等 | 删除所有重复段 | dummy + 扫描，遇重复段整体跳过 |
| 19 | [删除链表的倒数第N个节点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) | 中等 | 删除倒数第 n | dummy + 快慢指针对齐，slow 指向待删前驱 |
| 142 | [环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/) | 中等 | 找入环点 | Floyd 相遇后，头指针与相遇点同速前进得入环点 |
| 4 | [寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) | 困难 | 两有序数组中位数 | 在短数组二分切分，保证左半<=右半取边界 |
| 199 | [二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/) | 中等 | 右侧可见节点 | BFS 分层取每层最后一个（或 DFS 先右后左） |
| 165 | [比较版本号](https://leetcode.cn/problems/compare-version-numbers/) | 中等 | 版本号比较 | 双指针逐段解析数字并比较，缺失段视为 0 |
