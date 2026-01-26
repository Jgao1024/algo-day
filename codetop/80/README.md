# 题目汇总（61-80）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 34 | [在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | 中等 | 二分查找左右边界 | lowerBound 找左边界，upperBound 找右边界+1 |
| 155 | [最小栈](https://leetcode.cn/problems/min-stack/) | 简单 | 栈支持取最小值 | 双栈：最小栈同步保存“当前最小值” |
| 129 | [求根到叶子节点数字之和](https://leetcode.cn/problems/sum-root-to-leaf-numbers/) | 中等 | 根到叶路径当数字求和 | DFS：cur=cur*10+val，叶子累加 |
| 101 | [对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | 简单 | 判断二叉树是否镜像 | 递归判断左右子树镜像（交叉比较） |
| 394 | [字符串解码](https://leetcode.cn/problems/decode-string/) | 中等 | k[xx] 展开字符串 | 双栈：次数栈 + 字符串栈，遇 ] 回拼 |
| 39 | [组合总和](https://leetcode.cn/problems/combination-sum/) | 中等 | 找所有组合凑 target | 回溯：可重复选，start 不变 + 剪枝 |
| 470 | [用 Rand7() 实现 Rand10()](https://leetcode.cn/problems/implement-rand10-using-rand7/) | 中等 | 随机数分布映射 | 拒绝采样：两次 rand7 得 1..49，取 1..40 映射 |
| 104 | [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | 简单 | 求树高 | DFS：1+max(left,right) |
| 64 | [最小路径和](https://leetcode.cn/problems/minimum-path-sum/) | 中等 | 网格 DP 最短路径 | 一维 dp：dp[j]=min(上,左)+grid |
| 128 | [最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/) | 中等 | 连续整数最长长度 | HashSet：只从“无前驱”的起点扩展 |
| 110 | [平衡二叉树](https://leetcode.cn/problems/balanced-binary-tree/) | 简单 | 高度差不超过 1 | 后序：返回高度，不平衡返回 -1 |
| 144 | [二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/) | 简单 | 根-左-右遍历 | 迭代栈：出栈记录，先压右再压左 |
| 122 | [买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | 简单 | 多次交易最大利润 | 贪心：累加所有正差价 |
| 695 | [岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/) | 中等 | 网格连通块面积 | DFS/BFS：遇 1 就搜索并置 0，取最大 |
| 221 | [最大正方形](https://leetcode.cn/problems/maximal-square/) | 中等 | 全 1 正方形最大面积 | DP：min(上,左,左上)+1（滚动数组） |
| 48 | [旋转图像](https://leetcode.cn/problems/rotate-image/) | 中等 | 原地旋转矩阵 90° | 转置 + 每行反转 |
| 234 | [回文链表](https://leetcode.cn/problems/palindrome-linked-list/) | 简单 | 判断链表回文 | 找中点 + 反转后半段 + 对比 |
| 14 | [最长公共前缀](https://leetcode.cn/problems/longest-common-prefix/) | 简单 | 多字符串公共前缀 | 逐个字符串收缩前缀 |
| 98 | [验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) | 中等 | BST 合法性 | 中序遍历严格递增（prev 比较） |
| 240 | [搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/) | 中等 | 行列递增矩阵查找 | 右上角出发，大了左移，小了下移 |
