# 题目汇总（161-180）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 287 | [寻找重复数](https://leetcode.cn/problems/find-the-duplicate-number/) | 中等 | 数组判环找入口 | Floyd 快慢指针：把 `i->nums[i]` 当 next，入口即重复数 |
| 328 | [奇偶链表](https://leetcode.cn/problems/odd-even-linked-list/) | 中等 | 链表重排（按位置奇偶） | odd/even 两链拆分，最后 odd 尾接 even 头 |
| 120 | [三角形最小路径和](https://leetcode.cn/problems/triangle/) | 中等 | 三角形路径最小和 | 自底向上 dp：`dp[j]=min(dp[j],dp[j+1])+val` |
| 106 | [从中序与后序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) | 中等 | 根据遍历重建二叉树 | 后序末尾为根，中序切分区间，递归先建右再建左 |
| 516 | [最长回文子序列](https://leetcode.cn/problems/longest-palindromic-subsequence/) | 中等 | 回文子序列最长长度 | 区间 dp：相等 +2，否则取 max(去左/去右) |
| 230 | [二叉搜索树中第K小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/) | 中等 | BST 第 k 小 | 迭代中序遍历，第 k 个即答案 |
| 9 | [回文数](https://leetcode.cn/problems/palindrome-number/) | 简单 | 判断整数回文 | 反转一半：比较 x==rev 或 x==rev/10 |
| 剑指 Offer 62 | [圆圈中最后剩下的数字](https://leetcode.cn/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/) | 简单 | 约瑟夫环 | 递推：`ans=(ans+m)%i` |
| 189 | [轮转数组](https://leetcode.cn/problems/rotate-array/) | 中等 | 数组右旋 k | 三次翻转：全反转 + 前 k 反转 + 后段反转 |
| 96 | [不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/) | 中等 | BST 数量（卡特兰） | dp：枚举根，`dp[i]+=dp[left]*dp[right]` |
| 44 | [通配符匹配](https://leetcode.cn/problems/wildcard-matching/) | 困难 | `?/*` 模式匹配 | 双指针贪心：记录最近 `*`，失败就让 `*` 多吞一位 |
| 384 | [打乱数组](https://leetcode.cn/problems/shuffle-an-array/) | 中等 | 等概率洗牌 | Fisher–Yates：从后往前随机交换 |
| 剑指 Offer 21 | [调整数组顺序使奇数位于偶数前面](https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/) | 简单 | 奇偶分区 | 双指针：左找偶右找奇，交换 |
| 85 | [最大矩形](https://leetcode.cn/problems/maximal-rectangle/) | 困难 | 矩阵最大 1 矩形 | 逐行累积高度成直方图，单调栈求最大矩形 |
| 679 | [24 点游戏](https://leetcode.cn/problems/24-game/) | 困难 | 4 数运算凑 24 | 回溯：每次选两数做 +-*/，浮点容差判断 |
| 887 | [鸡蛋掉落](https://leetcode.cn/problems/super-egg-drop/) | 困难 | 最少次数测楼层 | 换维 dp：按次数推覆盖层数 `dp[k]=dp[k]+dp[k-1]+1` |
| 97 | [交错字符串](https://leetcode.cn/problems/interleaving-string/) | 中等 | 两串交错组成第三串 | dp 前缀可达，一维滚动 |
| 210 | [课程表 II](https://leetcode.cn/problems/course-schedule-ii/) | 中等 | 输出拓扑序 | Kahn BFS：入度 0 入队，出完则成功 |
| 400 | [第N个数字](https://leetcode.cn/problems/nth-digit/) | 中等 | 数字序列定位第 n 位 | 按位数分段减 n，定位到具体数字与位下标 |
| 416 | [分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/) | 中等 | 子集和=总和一半 | 01 背包：`dp[j]|=dp[j-x]`，倒序更新 |
