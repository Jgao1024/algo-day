# Codetop 题目汇总

| 序号 | 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- | --- |
| 001 | 3 | [无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) | 中等 | 最长无重复子串长度 | 滑动窗口，记录字符上次出现位置，重复则移动左边界 |
| 002 | 146 | [LRU缓存机制](https://leetcode.cn/problems/lru-cache/) | 中等 | 设计 LRU 缓存 | 哈希表定位 + 双向链表维护访问顺序，超容量淘汰尾节点 |
| 003 | 206 | [反转链表](https://leetcode.cn/problems/reverse-linked-list/) | 简单 | 反转单链表 | 三指针迭代：保存 next，再改指向，整体推进 |
| 004 | 215 | [数组中的第K个最大元素](https://leetcode.cn/problems/kth-largest-element-in-an-array/) | 中等 | 选择第 k 大 | QuickSelect 平均 \(O(n)\)；或小根堆保留 k 个 |
| 005 | 25 | [K 个一组翻转链表](https://leetcode.cn/problems/reverse-nodes-in-k-group/) | 困难 | 每 k 个节点翻转 | 分段找 kth，原地反转段并接回（dummy + groupPrev） |
| 006 | 15 | [三数之和](https://leetcode.cn/problems/3sum/) | 中等 | 找和为 0 的不重复三元组 | 排序 + 枚举 i + 双指针，注意去重与剪枝 |
| 007 | 53 | [最大子数组和](https://leetcode.cn/problems/maximum-subarray/) | 中等 | 连续子数组最大和 | Kadane：dp=max(nums[i], dp+nums[i]) |
| 008 | 补充题4 | [手撕快速排序](https://leetcode.cn/problems/sort-an-array/) | 中等 | 数组排序 | 随机快排 partition；或归并最坏 \(O(n\log n)\) |
| 009 | 5 | [最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/) | 中等 | 最长回文子串 | 枚举中心（奇/偶）向两侧扩展，更新最优区间 |
| 010 | 21 | [合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/) | 简单 | 合并两个升序链表 | dummy + 双指针逐个比较接到尾部 |
| 011 | 102 | [二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | 中等 | BFS 按层输出 | 队列 BFS，每轮用 size 分层 |
| 012 | 33 | [搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) | 中等 | 旋转数组查找 | 改造二分：判断哪半有序，再决定收缩区间 |
| 013 | 200 | [岛屿数量](https://leetcode.cn/problems/number-of-islands/) | 中等 | 网格连通块计数 | DFS/BFS 染色：遇到 1 扩张并标 0，计数+1 |
| 014 | 1 | [两数之和](https://leetcode.cn/problems/two-sum/) | 简单 | 找两数和为 target | 哈希补数：遍历查 need 是否出现过 |
| 015 | 46 | [全排列](https://leetcode.cn/problems/permutations/) | 中等 | 枚举所有排列 | 回溯 + used[] 逐位选择未使用元素 |
| 016 | 88 | [合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) | 简单 | 原地合并有序数组 | 从后往前双指针写入，避免覆盖有效元素 |
| 017 | 20 | [有效的括号](https://leetcode.cn/problems/valid-parentheses/) | 简单 | 括号匹配 | 栈：左括号入栈，右括号匹配栈顶 |
| 018 | 121 | [买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | 简单 | 一次交易最大利润 | 一趟维护前缀最小价格，更新最大差值 |
| 019 | 92 | [反转链表 II](https://leetcode.cn/problems/reverse-linked-list-ii/) | 中等 | 反转指定区间 | dummy + 头插法：不断把 cur.next 插到 pre 后 |
| 020 | 103 | [二叉树的锯齿形层次遍历](https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/) | 中等 | 层序交替方向 | BFS 分层 + Deque 按方向 addFirst/addLast |
| 021 | 236 | [二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) | 中等 | 二叉树 LCA | 后序 DFS：左右都找到则当前为 LCA，否则向上返回非空 |
| 022 | 141 | [环形链表](https://leetcode.cn/problems/linked-list-cycle/) | 简单 | 判断链表是否有环 | Floyd 快慢指针相遇判圈 |
| 023 | 300 | [最长上升子序列](https://leetcode.cn/problems/longest-increasing-subsequence/) | 中等 | LIS 长度 | tails + 二分（扑克牌法）\(O(n\log n)\) |
| 024 | 54 | [螺旋矩阵](https://leetcode.cn/problems/spiral-matrix/) | 中等 | 螺旋遍历矩阵 | top/bottom/left/right 四边界收缩模拟 |
| 025 | 143 | [重排链表](https://leetcode.cn/problems/reorder-list/) | 中等 | 重排链表顺序 | 中点 + 反转后半段 + 交错合并 |
| 026 | 23 | [合并K个排序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) | 困难 | 合并 k 条升序链表 | 小根堆多路合并 \(O(N\log k)\) |
| 027 | 415 | [字符串相加](https://leetcode.cn/problems/add-strings/) | 简单 | 字符串大数加法 | 从后往前逐位相加 + carry，最后反转 |
| 028 | 56 | [合并区间](https://leetcode.cn/problems/merge-intervals/) | 中等 | 合并重叠区间 | 按起点排序后扫描合并 |
| 029 | 160 | [相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) | 简单 | 找相交起点 | 双指针换头走 A+B，对齐后在交点相遇 |
| 030 | 72 | [编辑距离](https://leetcode.cn/problems/edit-distance/) | 困难 | 字符串最少编辑 | dp[i][j]，插入/删除/替换取最小（滚动数组） |
| 031 | 42 | [接雨水](https://leetcode.cn/problems/trapping-rain-water/) | 困难 | 计算可接雨水量 | 双指针 + leftMax/rightMax，谁低动谁 |
| 032 | 124 | [二叉树中的最大路径和](https://leetcode.cn/problems/binary-tree-maximum-path-sum/) | 困难 | 最大路径和 | 后序 DFS：返回单边最大贡献，节点作拐点更新全局 |
| 033 | 1143 | [最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/) | 中等 | LCS 长度 | dp[i][j]：相等走左上+1，否则取上/左最大（滚动） |
| 034 | 93 | [复原IP地址](https://leetcode.cn/problems/restore-ip-addresses/) | 中等 | 复原所有 IP | 回溯切 4 段，校验 0~255 与前导零，长度剪枝 |
| 035 | 82 | [删除排序链表中的重复元素 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/) | 中等 | 删除所有重复段 | dummy + 扫描，遇重复段整体跳过 |
| 036 | 19 | [删除链表的倒数第N个节点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) | 中等 | 删除倒数第 n | dummy + 快慢指针对齐，slow 指向待删前驱 |
| 037 | 142 | [环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/) | 中等 | 找入环点 | Floyd 相遇后，头指针与相遇点同速前进得入环点 |
| 038 | 4 | [寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) | 困难 | 两有序数组中位数 | 在短数组二分切分，保证左半<=右半取边界 |
| 039 | 199 | [二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/) | 中等 | 右侧可见节点 | BFS 分层取每层最后一个（或 DFS 先右后左） |
| 040 | 165 | [比较版本号](https://leetcode.cn/problems/compare-version-numbers/) | 中等 | 版本号比较 | 双指针逐段解析数字并比较，缺失段视为 0 |
| 041 | 22 | [括号生成](https://leetcode.cn/problems/generate-parentheses/) | 中等 | 回溯生成有效括号 | 约束 left/right：left<n 才放 '('，right<left 才放 ')' |
| 042 | 232 | [用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/) | 简单 | 用栈模拟队列 | 双栈：入队进 in；出队/取头用 out；out 空就把 in 倒过去（均摊 O(1)） |
| 043 | 704 | [二分查找](https://leetcode.cn/problems/binary-search/) | 简单 | 有序数组找目标下标 | 标准二分，闭区间 [l,r]，l<=r |
| 044 | 148 | [排序链表](https://leetcode.cn/problems/sort-list/) | 中等 | 链表排序 | 归并：快慢找中点切分 + 合并两个有序链表，O(nlogn) |
| 045 | 94 | [二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | 简单 | 中序遍历 | 迭代栈：一路压左，弹出访问，转向右 |
| 046 | 69 | [x 的平方根](https://leetcode.cn/problems/sqrtx/) | 简单 | 整数平方根 | 二分找最后一个满足 mid^2<=x 的 mid（用 long 防溢出） |
| 047 | 239 | [滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) | 困难 | 每个窗口取最大值 | 单调队列存下标且值递减；过期弹头，小值弹尾，头即最大 |
| 048 | 32 | [最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/) | 困难 | 最长连续有效括号 | 栈 + 哨兵 -1：遇 ')' 弹栈，空了压断点，否则 i-peek 更新答案 |
| 049 | 31 | [下一个排列](https://leetcode.cn/problems/next-permutation/) | 中等 | 找下一个字典序 | 找转折点 i，找替换点 j 交换，再反转后缀 |
| 050 | 8 | [字符串转换整数 (atoi)](https://leetcode.cn/problems/string-to-integer-atoi/) | 中等 | 字符串转 int | 扫描：跳空格/判符号/累加数字；提前判溢出并截断 |
| 051 | 2 | [两数相加](https://leetcode.cn/problems/add-two-numbers/) | 中等 | 链表表示大整数相加 | 按位相加 + carry，新建结果链表 |
| 052 | 70 | [爬楼梯](https://leetcode.cn/problems/climbing-stairs/) | 简单 | 计数 DP | dp[i]=dp[i-1]+dp[i-2]，滚动变量 |
| 053 | 322 | [零钱兑换](https://leetcode.cn/problems/coin-change/) | 中等 | 最少硬币数 | 完全背包 dp[amount]：dp[i]=min(dp[i],dp[i-c]+1) |
| 054 | 43 | [字符串相乘](https://leetcode.cn/problems/multiply-strings/) | 中等 | 大数乘法 | 竖式：m+n 数组累加，低位 i+j+1，进位加到 i+j |
| 055 | 76 | [最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/) | 困难 | 最短覆盖 t 的子串 | 滑动窗口：missing==0 时收缩左边到刚好不满足，更新最短 |
| 056 | 41 | [缺失的第一个正数](https://leetcode.cn/problems/first-missing-positive/) | 困难 | 缺失最小正整数 | 原地哈希：把 x 放到 x-1，再找第一个 nums[i]!=i+1 |
| 057 | 105 | [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | 中等 | 重建二叉树 | 前序定根，中序切左右；哈希存中序下标递归建树 |
| 058 | 78 | [子集](https://leetcode.cn/problems/subsets/) | 中等 | 生成幂集 | 回溯：每到节点加入 path，从 idx 往后枚举选择 |
| 059 | 剑指 Offer 22 | [链表中倒数第k个节点](https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/) | 简单 | 倒数第 k 个节点 | 快慢指针：快先走 k 步，再一起走到尾 |
| 060 | 151 | [翻转字符串里的单词](https://leetcode.cn/problems/reverse-words-in-a-string/) | 中等 | 反转单词顺序 | 从后往前扫描提取单词，手动控制空格 |
| 061 | 34 | [在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | 中等 | 二分查找左右边界 | lowerBound 找左边界，upperBound 找右边界+1 |
| 062 | 155 | [最小栈](https://leetcode.cn/problems/min-stack/) | 简单 | 栈支持取最小值 | 双栈：最小栈同步保存“当前最小值” |
| 063 | 129 | [求根到叶子节点数字之和](https://leetcode.cn/problems/sum-root-to-leaf-numbers/) | 中等 | 根到叶路径当数字求和 | DFS：cur=cur*10+val，叶子累加 |
| 064 | 101 | [对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | 简单 | 判断二叉树是否镜像 | 递归判断左右子树镜像（交叉比较） |
| 065 | 394 | [字符串解码](https://leetcode.cn/problems/decode-string/) | 中等 | k[xx] 展开字符串 | 双栈：次数栈 + 字符串栈，遇 ] 回拼 |
| 066 | 39 | [组合总和](https://leetcode.cn/problems/combination-sum/) | 中等 | 找所有组合凑 target | 回溯：可重复选，start 不变 + 剪枝 |
| 067 | 470 | [用 Rand7() 实现 Rand10()](https://leetcode.cn/problems/implement-rand10-using-rand7/) | 中等 | 随机数分布映射 | 拒绝采样：两次 rand7 得 1..49，取 1..40 映射 |
| 068 | 104 | [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | 简单 | 求树高 | DFS：1+max(left,right) |
| 069 | 64 | [最小路径和](https://leetcode.cn/problems/minimum-path-sum/) | 中等 | 网格 DP 最短路径 | 一维 dp：dp[j]=min(上,左)+grid |
| 070 | 128 | [最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/) | 中等 | 连续整数最长长度 | HashSet：只从“无前驱”的起点扩展 |
| 071 | 110 | [平衡二叉树](https://leetcode.cn/problems/balanced-binary-tree/) | 简单 | 高度差不超过 1 | 后序：返回高度，不平衡返回 -1 |
| 072 | 144 | [二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/) | 简单 | 根-左-右遍历 | 迭代栈：出栈记录，先压右再压左 |
| 073 | 122 | [买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | 简单 | 多次交易最大利润 | 贪心：累加所有正差价 |
| 074 | 695 | [岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/) | 中等 | 网格连通块面积 | DFS/BFS：遇 1 就搜索并置 0，取最大 |
| 075 | 221 | [最大正方形](https://leetcode.cn/problems/maximal-square/) | 中等 | 全 1 正方形最大面积 | DP：min(上,左,左上)+1（滚动数组） |
| 076 | 48 | [旋转图像](https://leetcode.cn/problems/rotate-image/) | 中等 | 原地旋转矩阵 90° | 转置 + 每行反转 |
| 077 | 234 | [回文链表](https://leetcode.cn/problems/palindrome-linked-list/) | 简单 | 判断链表回文 | 找中点 + 反转后半段 + 对比 |
| 078 | 14 | [最长公共前缀](https://leetcode.cn/problems/longest-common-prefix/) | 简单 | 多字符串公共前缀 | 逐个字符串收缩前缀 |
| 079 | 98 | [验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) | 中等 | BST 合法性 | 中序遍历严格递增（prev 比较） |
| 080 | 240 | [搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/) | 中等 | 行列递增矩阵查找 | 右上角出发，大了左移，小了下移 |
| 081 | 543 | [二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/) | 简单 | 二叉树最长路径（边数） | 后序 DFS：返回深度，用左右深度之和更新全局 |
| 082 | 162 | [寻找峰值](https://leetcode.cn/problems/find-peak-element/) | 中等 | 找任意峰值下标 | 二分：比较 `mid` 与 `mid+1`，上坡往右否则往左 |
| 083 | 662 | [二叉树最大宽度](https://leetcode.cn/problems/maximum-width-of-binary-tree/) | 中等 | 按编号计算层宽 | BFS + 下标编号，层内 `last-first+1`（每层归一化） |
| 084 | 179 | [最大数](https://leetcode.cn/problems/largest-number/) | 中等 | 排列拼接成最大数字 | 字符串排序：按 `(b+a)` 与 `(a+b)` 比较决定先后 |
| 085 | 113 | [路径总和 II](https://leetcode.cn/problems/path-sum-ii/) | 中等 | 根到叶路径和为目标的所有方案 | DFS + 回溯，命中时拷贝 path |
| 086 | 152 | [乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/) | 中等 | 连续子数组最大乘积 | 同时维护 max/min DP（负数会翻转） |
| 087 | 62 | [不同路径](https://leetcode.cn/problems/unique-paths/) | 中等 | 网格路径条数 | 一维 DP：`dp[j] += dp[j-1]` |
| 088 | 560 | [和为K的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/) | 中等 | 连续子数组计数 | 前缀和 + HashMap 计数：累加 `count[sum-k]` |
| 089 | 198 | [打家劫舍](https://leetcode.cn/problems/house-robber/) | 中等 | 不能偷相邻房子的最大收益 | DP 滚动：`max(prev1, prev2 + x)` |
| 090 | 112 | [路径总和](https://leetcode.cn/problems/path-sum/) | 简单 | 是否存在根到叶路径和为目标 | DFS 递减 target，到叶子判断剩余为 0 |
| 091 | 24 | [两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/) | 中等 | 成对交换链表节点 | dummy + 指针交换 `prev->a->b` 变 `prev->b->a` |
| 092 | 227 | [基本计算器 II](https://leetcode.cn/problems/basic-calculator-ii/) | 中等 | 计算 `+ - * /` 表达式 | 栈：`* /` 立即合并，最后求和 |
| 093 | 83 | [删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/) | 简单 | 有序链表去重（保留一个） | 一次遍历，相等就跳过 `next` |
| 094 | 226 | [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | 简单 | 交换左右子树 | 递归：swap 后继续递归 |
| 095 | 209 | [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/) | 中等 | 最短连续子数组和 \(\ge target\) | 滑动窗口：右扩左缩更新答案 |
| 096 | 169 | [多数元素](https://leetcode.cn/problems/majority-element/) | 简单 | 出现次数 \(>n/2\) 的元素 | Boyer-Moore 投票 |
| 097 | 283 | [移动零](https://leetcode.cn/problems/move-zeroes/) | 简单 | 0 移到末尾保持顺序 | 覆盖写非 0，最后补 0 |
| 098 | 139 | [单词拆分](https://leetcode.cn/problems/word-break/) | 中等 | 字符串能否拆成字典单词 | `dp[i]` + set，按 maxLen 限制枚举 |
| 099 | 718 | [最长重复子数组](https://leetcode.cn/problems/maximum-length-of-repeated-subarray/) | 中等 | 最长公共子数组长度 | DP 公共后缀，`j` 逆序滚动 |
| 100 | 补充题6 | [手撕堆排序](https://leetcode.cn/problems/sort-an-array/) | 中等 | 堆排序升序 | 建大根堆 + 交换堆顶到末尾并下沉 |
| 101 | 739 | [每日温度](https://leetcode.cn/problems/daily-temperatures/) | 中等 | 下一个更高温度距离 | 单调递减栈存下标，遇到更高温度弹栈并写距离 |
| 102 | 468 | [验证IP地址](https://leetcode.cn/problems/validate-ip-address/) | 中等 | 判断 IPv4/IPv6 合法性 | 按 `.`/`:` 拆分（保留空段）+ 逐段规则校验 |
| 103 | 207 | [课程表](https://leetcode.cn/problems/course-schedule/) | 中等 | 判断有向图是否有环 | 拓扑排序：入度 0 入队，能处理完所有点则无环 |
| 104 | 79 | [单词搜索](https://leetcode.cn/problems/word-search/) | 中等 | 网格路径匹配字符串 | DFS 回溯：匹配则占位标记，四方向搜索，回溯恢复 |
| 105 | 138 | [复制带随机指针的链表](https://leetcode.cn/problems/copy-list-with-random-pointer/) | 中等 | 深拷贝带 random 的链表 | HashMap 记录旧->新；二次遍历连接 next/random |
| 106 | 224 | [基本计算器](https://leetcode.cn/problems/basic-calculator/) | 困难 | 括号表达式求值（+/-） | 栈存外层 `res/sign`；括号内累加，遇 `)` 合并回外层 |
| 107 | 297 | [二叉树的序列化与反序列化](https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/) | 困难 | 树与字符串互转 | 前序 DFS + `#` 标记空节点；按相同顺序递归反序列化 |
| 108 | 47 | [全排列 II](https://leetcode.cn/problems/permutations-ii/) | 中等 | 全排列去重 | 排序 + used[] 回溯；同层去重 `nums[i]==nums[i-1] && !used[i-1]` |
| 109 | 153 | [寻找旋转排序数组中的最小值](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/) | 中等 | 旋转数组最小值 | 二分：比较 `nums[mid]` 与 `nums[r]` 决定向哪半边收缩 |
| 110 | 460 | [LFU缓存](https://leetcode.cn/problems/lfu-cache/) | 困难 | LFU + 同频次 LRU 淘汰 | key->node + freq->双向链表 + minFreq；淘汰 minFreq 链表尾 |
| 111 | 55 | [跳跃游戏](https://leetcode.cn/problems/jump-game/) | 中等 | 能否到达末尾 | 贪心维护最远可达 `maxReach`，出现断点则失败 |
| 112 | 40 | [组合总和 II](https://leetcode.cn/problems/combination-sum-ii/) | 中等 | 组合求和（每数最多一次，去重） | 排序回溯：同层跳重 `i>start && a[i]==a[i-1]`，递归用 `i+1` |
| 113 | 11 | [盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | 中等 | 最大容器面积 | 双指针从两端逼近，永远移动短板 |
| 114 | 402 | [移掉K位数字](https://leetcode.cn/problems/remove-k-digits/) | 中等 | 删 k 位使结果最小 | 单调递增栈：遇更小数字就弹更大的高位；最后去前导 0 |
| 115 | 136 | [只出现一次的数字](https://leetcode.cn/problems/single-number/) | 简单 | 找唯一元素 | 全部异或，成对抵消 |
| 116 | 123 | [买卖股票的最佳时机 III](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/) | 困难 | 最多两笔交易最大利润 | 四状态 DP：buy1/sell1/buy2/sell2 逐日更新 |
| 117 | 补充题5 | [手撕归并排序](https://leetcode.cn/problems/sort-an-array/) | 中等 | 分治排序 | 归并排序：分两半递归排，再合并两段有序区间 |
| 118 | 61 | [旋转链表](https://leetcode.cn/problems/rotate-list/) | 中等 | 右旋链表 k 次 | 先求长度成环，再走 `n-(k%n)` 找新尾断开 |
| 119 | 16 | [最接近的三数之和](https://leetcode.cn/problems/3sum-closest/) | 中等 | 三数和最接近 target | 排序 + 固定 i + 双指针夹逼，更新最小差 |
| 120 | 518 | [零钱兑换 II](https://leetcode.cn/problems/coin-change-ii/) | 中等 | 组合数（硬币无限） | 完全背包组合：外层 coin，内层金额递增，dp[0]=1 |
| 121 | 958 | [二叉树的完全性检验](https://leetcode.cn/problems/check-completeness-of-a-binary-tree/) | 中等 | 完全二叉树判断 | 层序遍历：遇到 null 后不能再出现非空 |
| 122 | 剑指 Offer 51 | [数组中的逆序对](https://leetcode.cn/problems/shu-zu-zhong-de-ni-xu-dui-lcof/) | 困难 | 统计逆序对 | 归并排序：合并时累计 `mid - i + 1` |
| 123 | 498 | [对角线遍历](https://leetcode.cn/problems/diagonal-traverse/) | 中等 | 对角线遍历矩阵 | 按 `d=row+col` 模拟，偶数向上右、奇数向下左 |
| 124 | 剑指 Offer 09 | [用两个栈实现队列](https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/) | 简单 | 两栈实现队列 | `in/out` 两栈：`out` 空才把 `in` 倒过去（均摊 \(O(1)\)） |
| 125 | 26 | [删除排序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) | 简单 | 有序数组去重 | 快慢指针原地覆盖，返回 `slow+1` |
| 126 | 剑指 Offer 36 | [二叉搜索树与双向链表](https://leetcode.cn/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/) | 中等 | BST 转循环双向链表 | 中序遍历用 `pre` 串联，最后头尾相连成环 |
| 127 | 补充题1 | [排序奇升偶降链表](https://mp.weixin.qq.com/s/0WVa2wIAeG0nYnVndZiEXQ) | 中等 | 奇位升序/偶位降序链表排序 | 拆奇偶两链表，反转偶链表后归并 |
| 128 | 剑指 Offer 26 | [树的子结构](https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/) | 中等 | 判断 B 是否为 A 的子结构 | 遍历 A 选起点 + `match(a,b)` 递归匹配 |
| 129 | 114 | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) | 中等 | 前序展开为右链表 | 原地迭代：左子树搬到右边，右子树接到左子树最右端 |
| 130 | 74 | [搜索二维矩阵](https://leetcode.cn/problems/search-a-2d-matrix/) | 中等 | 矩阵整体有序查找 | 一维二分：`mid -> (mid/n, mid%n)` |
| 131 | 7 | [整数反转](https://leetcode.cn/problems/reverse-integer/) | 简单 | 反转整数并处理溢出 | 逐位弹出 + 更新前做越界判定 |
| 132 | 补充题23 | [检测循环依赖](https://mp.weixin.qq.com/s/pCRscwKqQdYYN7M1Sia7xA) | 中等 | 判断有向图是否有环 | Kahn 拓扑：`cnt!=n` 判有环 |
| 133 | 50 | [Pow(x, n)](https://leetcode.cn/problems/powx-n/) | 中等 | 快速幂 | 指数二进制拆分，`base*=base`、遇 1 位 `ans*=base` |
| 134 | 75 | [颜色分类](https://leetcode.cn/problems/sort-colors/) | 中等 | 0/1/2 原地排序 | 荷兰国旗：`low/i/high` 三指针分区 |
| 135 | 91 | [解码方法](https://leetcode.cn/problems/decode-ways/) | 中等 | 数字字符串解码数 | DP：看 1 位/2 位，滚动变量 |
| 136 | 125 | [验证回文串](https://leetcode.cn/problems/valid-palindrome/) | 简单 | 忽略非字母数字的回文判断 | 双指针跳过无效字符，统一小写比较 |
| 137 | 572 | [另一个树的子树](https://leetcode.cn/problems/subtree-of-another-tree/) | 简单 | 判断子树是否完全相同 | 遍历 root 选起点 + same(两树相同) |
| 138 | 145 | [二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/) | 中等 | 后序遍历 | 栈 + `prev` 判断孩子是否处理完 |
| 139 | 59 | [螺旋矩阵 II](https://leetcode.cn/problems/spiral-matrix-ii/) | 中等 | 生成螺旋矩阵 | 四边界收缩，按圈填充 |
| 140 | 329 | [矩阵中的最长递增路径](https://leetcode.cn/problems/longest-increasing-path-in-a-matrix/) | 困难 | 网格 DAG 最长路 | 计算出度 + 拓扑分层（从峰顶剥离） |
| 141 | 440 | [字典序的第K小数字](https://leetcode.cn/problems/k-th-smallest-in-lexicographical-order/) | 困难 | 字典序第 k 小 | 数字前缀树计数，按 steps 跳过子树或下探 |
| 142 | 135 | [分发糖果](https://leetcode.cn/problems/candy/) | 困难 | 最少糖果分配 | 左右两次扫描，合并两侧约束取最大 |
| 143 | 442 | [数组中重复的数据](https://leetcode.cn/problems/find-all-duplicates-in-an-array/) | 中等 | 找所有出现两次的数 | 值域 1..n 原地符号标记，二次访问即重复 |
| 144 | 剑指 Offer 40 | [最小的k个数](https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/) | 简单 | 取最小 k 个 | QuickSelect 平均 \(O(n)\)；或大根堆 \(O(n\log k)\) |
| 145 | 剑指 Offer 54 | [二叉搜索树的第k大节点](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/) | 简单 | BST 第 k 大 | 反向中序（右-根-左）数到第 k 个 |
| 146 | 208 | [实现 Trie (前缀树)](https://leetcode.cn/problems/implement-trie-prefix-tree/) | 中等 | 前缀树实现 | children[26] + isEnd，插入/查询沿字符走 |
| 147 | 445 | [两数相加 II](https://leetcode.cn/problems/add-two-numbers-ii/) | 中等 | 高位在前相加 | 两栈从低位相加 + carry，结果头插 |
| 148 | 10 | [正则表达式匹配](https://leetcode.cn/problems/regular-expression-matching/) | 困难 | . 与 * 正则匹配 | DP：* 分 0 次（j-2）或多次（i-1,j）两种 |
| 149 | 剑指 Offer 42 | [连续子数组的最大和](https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/) | 简单 | 最大子数组和 | Kadane：`cur=max(x,cur+x)` 更新全局最大 |
| 150 | 450 | [删除二叉搜索树中的节点](https://leetcode.cn/problems/delete-node-in-a-bst/) | 中等 | BST 删除节点 | 递归定位 + 分类；双子树用后继替换再删除 |
| 151 | 剑指 Offer 10- II | [青蛙跳台阶问题](https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/) | 简单 | 1/2 步走法数 | 滚动 DP（斐波那契同型）取模 |
| 152 | 补充题2 | [圆环回原点问题](https://mp.weixin.qq.com/s/NZPaFsFrTybO3K3s7p7EVg) | 中等 | 圆环走 m 步回到 0 | DP：`dp[step][j]=dp[step-1][j-1]+dp[step-1][j+1]` 滚动 |
| 153 | 347 | [前 K 个高频元素](https://leetcode.cn/problems/top-k-frequent-elements/) | 中等 | TopK 高频 | 频次统计 + 大小为 k 的小根堆 |
| 154 | 剑指 Offer 10- I | [斐波那契数列](https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/) | 简单 | 斐波那契取模 | 两变量滚动迭代 |
| 155 | 45 | [跳跃游戏 II](https://leetcode.cn/problems/jump-game-ii/) | 中等 | 最少跳跃次数 | 贪心分层：到边界 `end` 就步数+1，边界=下一步最远 |
| 156 | 剑指 Offer 04 | [二维数组中的查找](https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/) | 简单 | 行列有序查找 | 右上角出发：大了左移，小了下移 |
| 157 | 225 | [用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/) | 简单 | 队列模拟栈 | 单队列：push 后旋转 `size-1` 次把新元素转到队头 |
| 158 | 678 | [有效的括号字符串](https://leetcode.cn/problems/valid-parenthesis-string/) | 中等 | 带 * 的括号匹配 | 贪心区间 `[low,high]` 维护可行未匹配左括号数 |
| 159 | 295 | [数据流的中位数](https://leetcode.cn/problems/find-median-from-data-stream/) | 困难 | 动态中位数 | 双堆：左大根堆、右小根堆，保持平衡 |
| 160 | 213 | [打家劫舍 II](https://leetcode.cn/problems/house-robber-ii/) | 中等 | 圆环打家劫舍 | 拆两次线性：`max(rob(0..n-2), rob(1..n-1))` |
| 161 | 287 | [寻找重复数](https://leetcode.cn/problems/find-the-duplicate-number/) | 中等 | 数组判环找入口 | Floyd 快慢指针：把 `i->nums[i]` 当 next，入口即重复数 |
| 162 | 328 | [奇偶链表](https://leetcode.cn/problems/odd-even-linked-list/) | 中等 | 链表重排（按位置奇偶） | odd/even 两链拆分，最后 odd 尾接 even 头 |
| 163 | 120 | [三角形最小路径和](https://leetcode.cn/problems/triangle/) | 中等 | 三角形路径最小和 | 自底向上 dp：`dp[j]=min(dp[j],dp[j+1])+val` |
| 164 | 106 | [从中序与后序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) | 中等 | 根据遍历重建二叉树 | 后序末尾为根，中序切分区间，递归先建右再建左 |
| 165 | 516 | [最长回文子序列](https://leetcode.cn/problems/longest-palindromic-subsequence/) | 中等 | 回文子序列最长长度 | 区间 dp：相等 +2，否则取 max(去左/去右) |
| 166 | 230 | [二叉搜索树中第K小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/) | 中等 | BST 第 k 小 | 迭代中序遍历，第 k 个即答案 |
| 167 | 9 | [回文数](https://leetcode.cn/problems/palindrome-number/) | 简单 | 判断整数回文 | 反转一半：比较 x==rev 或 x==rev/10 |
| 168 | 剑指 Offer 62 | [圆圈中最后剩下的数字](https://leetcode.cn/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/) | 简单 | 约瑟夫环 | 递推：`ans=(ans+m)%i` |
| 169 | 189 | [轮转数组](https://leetcode.cn/problems/rotate-array/) | 中等 | 数组右旋 k | 三次翻转：全反转 + 前 k 反转 + 后段反转 |
| 170 | 96 | [不同的二叉搜索树](https://leetcode.cn/problems/unique-binary-search-trees/) | 中等 | BST 数量（卡特兰） | dp：枚举根，`dp[i]+=dp[left]*dp[right]` |
| 171 | 44 | [通配符匹配](https://leetcode.cn/problems/wildcard-matching/) | 困难 | `?/*` 模式匹配 | 双指针贪心：记录最近 `*`，失败就让 `*` 多吞一位 |
| 172 | 384 | [打乱数组](https://leetcode.cn/problems/shuffle-an-array/) | 中等 | 等概率洗牌 | Fisher–Yates：从后往前随机交换 |
| 173 | 剑指 Offer 21 | [调整数组顺序使奇数位于偶数前面](https://leetcode.cn/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/) | 简单 | 奇偶分区 | 双指针：左找偶右找奇，交换 |
| 174 | 85 | [最大矩形](https://leetcode.cn/problems/maximal-rectangle/) | 困难 | 矩阵最大 1 矩形 | 逐行累积高度成直方图，单调栈求最大矩形 |
| 175 | 679 | [24 点游戏](https://leetcode.cn/problems/24-game/) | 困难 | 4 数运算凑 24 | 回溯：每次选两数做 +-*/，浮点容差判断 |
| 176 | 887 | [鸡蛋掉落](https://leetcode.cn/problems/super-egg-drop/) | 困难 | 最少次数测楼层 | 换维 dp：按次数推覆盖层数 `dp[k]=dp[k]+dp[k-1]+1` |
| 177 | 97 | [交错字符串](https://leetcode.cn/problems/interleaving-string/) | 中等 | 两串交错组成第三串 | dp 前缀可达，一维滚动 |
| 178 | 210 | [课程表 II](https://leetcode.cn/problems/course-schedule-ii/) | 中等 | 输出拓扑序 | Kahn BFS：入度 0 入队，出完则成功 |
| 179 | 400 | [第N个数字](https://leetcode.cn/problems/nth-digit/) | 中等 | 数字序列定位第 n 位 | 按位数分段减 n，定位到具体数字与位下标 |
| 180 | 416 | [分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/) | 中等 | 子集和=总和一半 | 01 背包：`dp[j]|=dp[j-x]`，倒序更新 |
| 181 | 611 | [有效三角形的个数](https://leetcode.cn/problems/valid-triangle-number/) | 中等 | 统计可组成三角形的三元组 | 排序 + 双指针：固定最大边 \(c\)，满足时一次加 `j-i` |
| 182 | 63 | [不同路径 II](https://leetcode.cn/problems/unique-paths-ii/) | 中等 | 网格路径计数（有障碍） | 一维 DP：障碍 `dp[j]=0`，否则 `dp[j]+=dp[j-1]` |
| 183 | 395 | [至少有K个重复字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-least-k-repeating-characters/) | 中等 | 每个字符出现次数都 \(\ge k\) 的最长子串 | 枚举不同字符种类数 1..26 + 滑动窗口计数 |
| 184 | 84 | [柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram/) | 困难 | 柱状图最大矩形面积 | 单调递增栈：弹栈高度做高，用 i 与新栈顶算宽 |
| 185 | 264 | [丑数 II](https://leetcode.cn/problems/ugly-number-ii/) | 中等 | 第 n 个丑数（2/3/5） | DP + 三指针 `p2/p3/p5` 去重生成 |
| 186 | 253 | [会议室 II](https://leetcode.cn/problems/meeting-rooms-ii/) | 中等 | 最少会议室数量 | 起止时间分离排序 + 双指针比较 `start` 与最早 `end` |
| 187 | 673 | [最长递增子序列的个数](https://leetcode.cn/problems/number-of-longest-increasing-subsequence/) | 中等 | LIS 的个数 | DP：`len[i]` + `cnt[i]`，长度变长覆盖，相同累加 |
| 188 | 1004 | [最大连续1的个数 III](https://leetcode.cn/problems/max-consecutive-ones-iii/) | 中等 | 最多翻转 k 个 0 的最长 1 串 | 滑动窗口：窗口内 0 数量 \(\le k\) |
| 189 | 51 | [N皇后](https://leetcode.cn/problems/n-queens/) | 困难 | N 皇后所有方案 | 回溯按行放，列/两对角线数组判冲突 |
| 190 | 134 | [加油站](https://leetcode.cn/problems/gas-station/) | 中等 | 找可绕行一圈的起点 | 总和判可行；`tank<0` 起点跳到 `i+1` |
| 191 | 补充题9 | [36进制加法](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/XcKQwnwCh5nZsz-DLHJwzQ/) | 中等 | 0-9+a-z 进制加法 | 模拟竖式：`%36` 当前位，`/36` 进位 |
| 192 | 剑指 Offer 29 | [顺时针打印矩阵](https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/) | 简单 | 螺旋遍历矩阵 | 四边界收缩模拟 |
| 193 | 剑指 Offer 27 | [二叉树的镜像](https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/) | 简单 | 交换左右子树 | 递归 swap 并继续 |
| 194 | 670 | [最大交换](https://leetcode.cn/problems/maximum-swap/) | 中等 | 交换两位使数最大 | 记录每个数字最后出现位置，贪心优先提升高位 |
| 195 | 面试题 02.05 | [链表求和](https://leetcode.cn/problems/sum-lists-lcci/) | 中等 | 低位在前的链表加法 | 模拟加法 + carry，哑节点构造结果 |
| 196 | 349 | [两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/) | 简单 | 两数组去重交集 | HashSet：一个存、一个扫、结果再转数组 |
| 197 | 剑指 Offer 39 | [数组中出现次数超过一半的数字](https://leetcode.cn/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/) | 简单 | 多数元素 | Boyer-Moore 投票 |
| 198 | 补充题14 | [阿拉伯数字转中文数字](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9814) | 中等 | 数字转中文读法 | 按 4 位分段（万/亿）+ 段内千百十个处理零 |
| 199 | 111 | [二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/) | 简单 | 最近叶子深度 | BFS 层序：遇到第一个叶子即返回 |
| 200 | 443 | [压缩字符串](https://leetcode.cn/problems/string-compression/) | 中等 | 原地字符串压缩 | 双指针：写字符 + 写次数数字串 |
| 201 | 279 | [完全平方数](https://leetcode.cn/problems/perfect-squares/) | 中等 | DP 求最少完全平方数个数 | DP：`dp[i]=min(dp[i-j*j]+1)` |
| 202 | 316 | [去除重复字母](https://leetcode.cn/problems/remove-duplicate-letters/) | 中等 | 去重且字典序最小的子序列 | 单调栈 + 计数/是否在栈 |
| 203 | 71 | [简化路径](https://leetcode.cn/problems/simplify-path/) | 中等 | Unix 路径规范化 | 栈（`..` 弹出、`.` 忽略） |
| 204 | 344 | [反转字符串](https://leetcode.cn/problems/reverse-string/) | 简单 | 原地反转字符数组 | 双指针交换 |
| 205 | 763 | [划分字母区间](https://leetcode.cn/problems/partition-labels/) | 中等 | 每个字母只出现在一个区间 | 贪心：记录最后出现位置 |
| 206 | 343 | [整数拆分](https://leetcode.cn/problems/integer-break/) | 中等 | 拆分使乘积最大 | 贪心：尽量拆成 3 |
| 207 | 12 | [整数转罗马数字](https://leetcode.cn/problems/integer-to-roman/) | 中等 | 整数映射到罗马数字 | 贪心：从大到小减 |
| 208 | 494 | [目标和](https://leetcode.cn/problems/target-sum/) | 中等 | 给符号使表达式结果为 target | 转子集和计数：0/1 背包 |
| 209 | 剑指 Offer 61 | [扑克牌中的顺子](https://leetcode.cn/problems/bu-ke-pai-zhong-de-shun-zi-lcof/) | 简单 | 0 作癞子判断能否成顺子 | 排序 + 去重 + 跨度判断 |
| 210 | 剑指 Offer 52 | [两个链表的第一个公共节点](https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/) | 简单 | 两链表相交点 | 双指针切换走同路程 |
| 211 | 86 | [分隔链表](https://leetcode.cn/problems/partition-list/) | 中等 | 按 x 分隔且保持相对顺序 | 双链表拼接 |
| 212 | 1444 | [切披萨的方案数](https://leetcode.cn/problems/number-of-ways-of-cutting-a-pizza/) | 困难 | 切成 k 份且每份至少 1 个苹果 | 二维后缀和 + DP |
| 213 | 509 | [斐波那契数](https://leetcode.cn/problems/fibonacci-number/) | 简单 | 斐波那契递推 | 迭代 DP |
| 214 | 18 | [四数之和](https://leetcode.cn/problems/4sum/) | 中等 | 四元组去重求和 | 排序 + 双指针 |
| 215 | 459 | [重复的子字符串](https://leetcode.cn/problems/repeated-substring-pattern/) | 简单 | 判断是否由子串重复组成 | KMP 前缀函数 |
| 216 | 168 | [Excel表列名称](https://leetcode.cn/problems/excel-sheet-column-title/) | 简单 | 数字转列名 | 26 进制（无 0）转换 |
| 217 | 1047 | [删除字符串中的所有相邻重复项](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string/) | 简单 | 相邻相同就消除 | 栈（数组模拟） |
| 218 | 647 | [回文子串](https://leetcode.cn/problems/palindromic-substrings/) | 中等 | 统计回文子串个数 | 中心扩展 |
| 219 | 503 | [下一个更大元素 II](https://leetcode.cn/problems/next-greater-element-ii/) | 中等 | 循环数组下一个更大值 | 单调栈 + 遍历 2n |
| 220 | 1044 | [最长重复子串](https://leetcode.cn/problems/longest-duplicate-substring/) | 困难 | 最长重复子串 | 二分长度 + Rolling Hash |
| 221 | 剑指 Offer 34 | [二叉树中和为某一值的路径](https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/) | 中等 | 根到叶路径和为 target 的所有路径 | DFS 回溯记录路径 |
| 222 | 37 | [解数独](https://leetcode.cn/problems/sudoku-solver/) | 困难 | 填充数独 | 回溯 + 位运算剪枝 |
| 223 | 567 | [字符串的排列](https://leetcode.cn/problems/permutation-in-string/) | 中等 | 判断 s2 是否含 s1 的排列子串 | 固定窗口 + 计数差 |
| 224 | 556 | [下一个更大元素 III](https://leetcode.cn/problems/next-greater-element-iii/) | 中等 | 下一个更大排列（int 范围） | next permutation + 溢出判断 |
| 225 | 378 | [有序矩阵中第K小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-sorted-matrix/) | 中等 | 有序矩阵第 k 小 | 按值二分 + 计数 |
| 226 | 剑指 Offer 03 | [数组中重复的数字](https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/) | 简单 | 数组中任意重复数 | 原地交换归位 |
| 227 | 692 | [前K个高频单词](https://leetcode.cn/problems/top-k-frequent-words/) | 中等 | TopK 高频词（频次降序，字典序升序） | 哈希计数 + 小根堆 |
| 228 | 380 | [常数时间插入、删除和获取随机元素](https://leetcode.cn/problems/insert-delete-getrandom-o1/) | 中等 | O(1) 插入/删除/随机取 | 数组 + 哈希表（交换删除） |
| 229 | 115 | [不同的子序列](https://leetcode.cn/problems/distinct-subsequences/) | 困难 | s 的子序列等于 t 的个数 | DP：一维倒序累加 |
| 230 | 6 | [Z 字形变换](https://leetcode.cn/problems/zigzag-conversion/) | 中等 | Z 字形重排 | 按行模拟 |
| 231 | 17 | [电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) | 中等 | 电话按键组合 | 回溯枚举 |
| 232 | 191 | [位1的个数](https://leetcode.cn/problems/number-of-1-bits/) | 简单 | 统计二进制 1 的个数 | `n &= n-1` |
| 233 | 410 | [分割数组的最大值](https://leetcode.cn/problems/split-array-largest-sum/) | 困难 | 分成 m 段最小化最大段和 | 答案二分 + 贪心切段 |
| 234 | 154 | [寻找旋转排序数组中的最小值 II](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array-ii/) | 困难 | 旋转数组最小值（含重复） | 二分，无法判断时 `r--` |
| 235 | 337 | [打家劫舍 III](https://leetcode.cn/problems/house-robber-iii/) | 中等 | 树上打家劫舍 | 树形 DP（偷/不偷） |
| 236 | 剑指 Offer 45 | [把数组排成最小的数](https://leetcode.cn/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/) | 中等 | 拼接成最小数字 | 排序：比较 `a+b` 与 `b+a` |
| 237 | 260 | [只出现一次的数字 III](https://leetcode.cn/problems/single-number-iii/) | 中等 | 两个只出现一次的数 | 异或 + lowbit 分组 |
| 238 | 622 | [设计循环队列](https://leetcode.cn/problems/design-circular-queue/) | 中等 | 循环队列 | 数组 + head + size |
| 239 | 剑指 Offer 48 | [最长不含重复字符的子字符串](https://leetcode.cn/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/) | 中等 | 最长无重复子串 | 滑动窗口 + last 位置 |
| 240 | 301 | [删除无效的括号](https://leetcode.cn/problems/remove-invalid-parentheses/) | 困难 | 删除最少括号使合法，输出所有 | BFS 分层 + visited |
| 241 | 426 | [将二叉搜索树转化为排序的双向链表](https://leetcode.cn/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/) | 中等 | BST 中序转循环双向链表 | 中序遍历 + `prev/head` 串联 |
| 242 | 222 | [完全二叉树的节点个数](https://leetcode.cn/problems/count-complete-tree-nodes/) | 中等 | 完全二叉树快速计数 | 左右高度判满 + 递归 |
| 243 | 剑指 Offer 11 | [旋转数组的最小数字](https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/) | 简单 | 旋转数组找最小值 | 二分与右端比较（重复 `r--`） |
| 244 | 剑指 Offer 53 - I | [在排序数组中查找数字 I](https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/) | 简单 | 有序数组计数 | `lowerBound(t+1)-lowerBound(t)` |
| 245 | 528 | [按权重随机选择](https://leetcode.cn/problems/random-pick-with-weight/) | 中等 | 按权重随机返回下标 | 前缀和 + 二分 |
| 246 | 108 | [将有序数组转换为二叉搜索树](https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/) | 简单 | 构造高度平衡 BST | 分治取中点 |
| 247 | 188 | [买卖股票的最佳时机 IV](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iv/) | 困难 | 最多 k 次交易 | DP `buy/sell`（大 k 转贪心） |
| 248 | 130 | [被围绕的区域](https://leetcode.cn/problems/surrounded-regions/) | 中等 | 被围住的 O 变 X | 边界 BFS/DFS 染色 |
| 249 | 剑指 Offer 33 | [二叉搜索树的后序遍历序列](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/) | 中等 | 验证 BST 后序 | 反向遍历 + 单调栈 |
| 250 | 863 | [二叉树中所有距离为 K 的结点](https://leetcode.cn/problems/all-nodes-distance-k-in-binary-tree/) | 中等 | 距离为 K 的节点 | `parent` 映射 + BFS 分层 |
| 251 | 面试题 17.14 | [最小K个数](https://leetcode.cn/problems/smallest-k-lcci/) | 中等 | 取最小 k 个 | QuickSelect |
| 252 | 80 | [删除排序数组中的重复项 II](https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/) | 中等 | 每个元素最多保留两次 | 双指针 `nums[slow-2]` |
| 253 | 674 | [最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/) | 简单 | 连续递增长度最大值 | 一次遍历计数 |
| 254 | 167 | [两数之和 II - 输入有序数组](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/) | 简单 | 有序数组找 target | 两端双指针 |
| 255 | 100 | [相同的树](https://leetcode.cn/problems/same-tree/) | 简单 | 判断两棵树是否相同 | 递归同时遍历 |
| 256 | 242 | [有效的字母异位词](https://leetcode.cn/problems/valid-anagram/) | 简单 | 字符频次是否一致 | 26 计数数组 |
| 257 | 557 | [反转字符串中的单词 III](https://leetcode.cn/problems/reverse-words-in-a-string-iii/) | 简单 | 单词内反转 | `char[]` 分段反转 |
| 258 | 977 | [有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/) | 简单 | 平方后仍保持有序 | 两端双指针从后填 |
| 259 | 补充题22 | [IP地址与整数的转换](https://mp.weixin.qq.com/s/UWCuEtNS2kuAuDY-eIbghg/) | 中等 | IPv4 与整数互转 | 位运算（256 进制） |
| 260 | 77 | [组合](https://leetcode.cn/problems/combinations/) | 中等 | 从 1..n 选 k 个 | 回溯 + 剪枝 |
| 261 | 257 | [二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/) | 简单 | 二叉树所有根到叶路径 | DFS + 路径拼接/回溯 |
| 262 | 268 | [缺失数字](https://leetcode.cn/problems/missing-number/) | 简单 | 0..n 缺一个数 | 异或 0..n 与数组 |
| 263 | 面试题 17.24 | [最大子矩阵](https://leetcode.cn/problems/max-submatrix-lcci/) | 困难 | 最大和子矩阵坐标 | 固定上下边界 + Kadane |
| 264 | 13 | [罗马数字转整数](https://leetcode.cn/problems/roman-to-integer/) | 简单 | 罗马转十进制 | 当前值与下一个比较，减法对则减 |
| 265 | 235 | [二叉搜索树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/) | 简单 | BST LCA | 利用 BST 分叉点迭代 |
| 266 | 131 | [分割回文串](https://leetcode.cn/problems/palindrome-partitioning/) | 中等 | 回文切分所有方案 | DP 预处理回文 + 回溯枚举切点 |
| 267 | 438 | [找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) | 中等 | 找所有异位词起点 | 固定窗口 + 计数差分 + diff |
| 268 | 862 | [和至少为 K 的最短子数组](https://leetcode.cn/problems/shortest-subarray-with-sum-at-least-k/) | 困难 | 含负数的最短长度 | 前缀和 + 单调队列 |
| 269 | 剑指 Offer 32 - III | [从上到下打印二叉树 III](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/) | 中等 | 之字形层序 | BFS 分层 + LinkedList 头尾插 |
| 270 | 876 | [链表的中间结点](https://leetcode.cn/problems/middle-of-the-linked-list/) | 简单 | 找中点 | 快慢指针 |
| 271 | 554 | [砖墙](https://leetcode.cn/problems/brick-wall/) | 中等 | 竖线穿最少砖 | 统计砖缝位置最大频次 |
| 272 | 109 | [有序链表转换二叉搜索树](https://leetcode.cn/problems/convert-sorted-list-to-binary-search-tree/) | 中等 | 有序链表转平衡 BST | 转数组 + 中点递归 |
| 273 | 204 | [计数质数](https://leetcode.cn/problems/count-primes/) | 简单 | 统计小于 n 的质数 | 埃氏筛 |
| 274 | 617 | [合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) | 简单 | 两棵树按节点相加 | 递归原地合并 |
| 275 | 剑指 Offer 24 | [反转链表](https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/) | 简单 | 反转单链表 | 迭代三指针 |
| 276 | 946 | [验证栈序列](https://leetcode.cn/problems/validate-stack-sequences/) | 中等 | 判断入栈出栈序列合法性 | 栈模拟，能弹就弹 |
| 277 | 面试题 08.06 | [汉诺塔问题](https://leetcode.cn/problems/hanota-lcci/) | 简单 | 汉诺塔移动 | 递归三步 move(n-1)/move(1)/move(n-1) |
| 278 | 面试题 10.03 | [搜索旋转数组](https://leetcode.cn/problems/search-rotate-array-lcci/) | 中等 | 旋转数组搜索（可重复） | 二分变体，三值相等时收缩 |
| 279 | 1262 | [可被三整除的最大和](https://leetcode.cn/problems/greatest-sum-divisible-by-three/) | 中等 | 最大和 %3==0 | dp[3] 记录各余数最大和 |
| 280 | 525 | [连续数组](https://leetcode.cn/problems/contiguous-array/) | 中等 | 0/1 数量相等最长子数组 | 0->-1，前缀和首次位置 |
| 281 | 706 | [设计哈希映射](https://leetcode.cn/problems/design-hashmap/) | 简单 | 手写 `put/get/remove` | 桶数组 + 拉链法 |
| 282 | 1095 | [山脉数组中查找目标值](https://leetcode.cn/problems/find-in-mountain-array/) | 困难 | 接口访问的山脉数组查找 | 先二分找峰值，再分别二分两侧 |
| 283 | 剑指 Offer 35 | [复杂链表的复制](https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/) | 中等 | 复制带 random 指针链表 | 原地穿插复制节点，设置 random，再拆分 |
| 284 | 340 | [至多包含 K 个不同字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-most-k-distinct-characters/) | 困难 | 最长子串不同字符数 ≤ K | 滑动窗口 + 计数表，超限收缩 |
| 285 | 994 | [腐烂的橘子](https://leetcode.cn/problems/rotting-oranges/) | 中等 | 网格扩散最短时间 | 多源 BFS 分层计时 |
| 286 | 312 | [戳气球](https://leetcode.cn/problems/burst-balloons/) | 困难 | 最大化区间戳破收益 | 区间 DP：枚举最后戳的气球 |
| 287 | 233 | [数字 1 的个数](https://leetcode.cn/problems/number-of-digit-one/) | 困难 | 统计 1..n 中 '1' 出现次数 | 按位拆 high/cur/low 逐位累计 |
| 288 | 49 | [字母异位词分组](https://leetcode.cn/problems/group-anagrams/) | 中等 | 把异位词归类 | 26 频次编码做 key 哈希分组 |
| 289 | 334 | [递增的三元子序列](https://leetcode.cn/problems/increasing-triplet-subsequence/) | 中等 | 是否存在长度 3 的递增子序列 | 贪心维护 first/second |
| 290 | 1556 | [千位分隔数](https://leetcode.cn/problems/thousand-separator/) | 简单 | 整数格式化每 3 位加点 | 从右往左拼接，计数到 3 加 '.' |
| 291 | 172 | [阶乘后的零](https://leetcode.cn/problems/factorial-trailing-zeroes/) | 简单 | 统计 n! 末尾 0 | 统计 5 的因子数：n/5+n/25+... |
| 292 | 面试题 01.06 | [字符串压缩](https://leetcode.cn/problems/compress-string-lcci/) | 简单 | 连续字符压缩 | 统计每段长度拼接，比较长度返回 |
| 293 | 540 | [有序数组中的单一元素](https://leetcode.cn/problems/single-element-in-a-sorted-array/) | 中等 | 有序数组找唯一元素 | 二分看偶数位配对是否正常 |
| 294 | 107 | [二叉树的层次遍历 II](https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/) | 中等 | 自底向上层序遍历 | BFS 分层，结果 `addFirst` |
| 295 | 150 | [逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation/) | 中等 | 栈计算后缀表达式 | 遇数入栈，遇符弹两数计算 |
| 296 | 752 | [打开转盘锁](https://leetcode.cn/problems/open-the-lock/) | 中等 | 从 "0000" 到 target 的最短步数 | BFS 状态图，visited + deadends |
| 297 | 547 | [省份数量（原朋友圈）](https://leetcode.cn/problems/number-of-provinces/) | 中等 | 统计连通分量个数 | 并查集合并相连城市 |
| 298 | 354 | [俄罗斯套娃信封问题](https://leetcode.cn/problems/russian-doll-envelopes/) | 困难 | 最多嵌套信封数 | 排序（同宽高降）+ 高度 LIS |
| 299 | 28 | [实现 strStr()](https://leetcode.cn/problems/implement-strstr/) | 简单 | 子串首次出现位置 | KMP 前缀函数 + 线性匹配 |
| 300 | 680 | [验证回文字符串 Ⅱ](https://leetcode.cn/problems/valid-palindrome-ii/) | 简单 | 最多删 1 字符能否成回文 | 双指针，首次失配尝试跳过一侧 |
| 301 | 剑指 Offer 31 | [栈的压入、弹出序列](https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/) | 中等 | 判断出栈序列是否合法 | 模拟栈：按 pushed 入栈，能弹就弹匹配 popped |
| 302 | 386 | [字典序排数](https://leetcode.cn/problems/lexicographical-numbers/) | 中等 | 生成 1..n 的字典序 | 迭代 DFS：能下潜 `*10` 就下潜，否则回退到能 `+1` 的前缀 |
| 303 | 剑指 Offer 07 | [重建二叉树](https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/) | 中等 | 前序+中序构建二叉树 | 分治递归：前序定根，中序切左右，哈希表定位根下标 |
| 304 | 735 | [行星碰撞](https://leetcode.cn/problems/asteroid-collision/) | 中等 | 相向行星碰撞模拟 | 栈：只处理 `top>0 && cur<0` 的碰撞，循环消到稳定 |
| 305 | 60 | [第k个排列](https://leetcode.cn/problems/permutation-sequence/) | 困难 | 第 k 个字典序排列 | 阶乘数系统：`k--` 0 基，每位用 `k/(i-1)!` 选数字 |
| 306 | 628 | [三个数的最大乘积](https://leetcode.cn/problems/maximum-product-of-three-numbers/) | 简单 | 三数最大乘积 | 一次遍历维护 3 个最大和 2 个最小，比较两种候选 |
| 307 | 238 | [除自身以外数组的乘积](https://leetcode.cn/problems/product-of-array-except-self/) | 中等 | 不用除法构造乘积数组 | 前缀积写入 + 右侧乘积变量从右往左补上 |
| 308 | 306 | [累加数](https://leetcode.cn/problems/additive-number/) | 中等 | 字符串是否能拆成累加序列 | 枚举前两段 + 字符串加法校验后续前缀匹配（注意前导 0） |
| 309 | 166 | [分数到小数](https://leetcode.cn/problems/fraction-to-recurring-decimal/) | 中等 | 循环小数表示 | 长除法 + 余数位置哈希：余数重复处插括号 |
| 310 | 658 | [找到 K 个最接近的元素](https://leetcode.cn/problems/find-k-closest-elements/) | 中等 | 有序数组找最接近的 k 个数 | 二分窗口左边界：比较 `x-arr[mid]` 与 `arr[mid+k]-x` |
| 311 | 435 | [无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals/) | 中等 | 最少删除使区间不重叠 | 按结束点贪心：重叠就删（等价保留结束更早的） |
| 312 | 523 | [连续的子数组和](https://leetcode.cn/problems/continuous-subarray-sum/) | 中等 | 是否存在长度≥2 且和为 k 倍数 | 前缀和取模：记录余数最早位置，间隔 ≥2 即可 |
| 313 | 974 | [和可被 K 整除的子数组](https://leetcode.cn/problems/subarray-sums-divisible-by-k/) | 中等 | 计数：和能被 k 整除 | 前缀余数计数：`ans += count[mod]` 后 `count[mod]++` |
| 314 | 912 | [排序数组](https://leetcode.cn/problems/sort-an-array/) | 中等 | 实现 \(O(n\log n)\) 排序 | 归并排序：分治 + 合并，`tmp` 复用 |
| 315 | 202 | [快乐数](https://leetcode.cn/problems/happy-number/) | 简单 | 平方和迭代是否到 1 | Floyd 判环：状态转移当 next，快慢指针判断 |
| 316 | 315 | [计算右侧小于当前元素的个数](https://leetcode.cn/problems/count-of-smaller-numbers-after-self/) | 困难 | 右侧更小元素计数 | 归并排序统计：合并时 `rightCount` 累加到左元素答案 |
| 317 | 1312 | [让字符串成为回文串的最少插入次数](https://leetcode.cn/problems/minimum-insertion-steps-to-make-a-string-palindrome/) | 困难 | 最少插入变回文 | 区间 DP：两端相等缩一圈，否则 `min(dp[i+1][j],dp[i][j-1])+1` |
| 318 | 407 | [接雨水 II](https://leetcode.cn/problems/trapping-rain-water-ii/) | 困难 | 二维接雨水总量 | 最小堆+BFS：从边界扩张，更新围墙高度并累加水量 |
| 319 | 437 | [路径总和 III](https://leetcode.cn/problems/path-sum-iii/) | 中等 | 任意起点向下路径计数 | 前缀和计数 + DFS 回溯：累加 `count[sum-target]` |
| 320 | 补充题21 | [字符串相减](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/RtAoA1hdf0h1PaVxRj_fzA/) | 中等 | 大整数字符串减法 | 先比大小定符号，竖式减法处理借位并去前导 0 |
| 321 | 剑指 Offer 38 | [字符串的排列](https://leetcode.cn/problems/zi-fu-chuan-de-pai-lie-lcof/) | 中等 | 字符串全排列（去重） | 排序 + used 回溯，同层跳过重复字符 |
| 322 | 剑指 Offer 46 | [把数字翻译成字符串](https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/) | 中等 | 数字解码计数 | DP：单个必选，两位在 10..25 则加 dp[i-2] |
| 323 | 面试题 08.12 | [八皇后](https://leetcode.cn/problems/eight-queens-lcci/) | 困难 | N 皇后输出棋盘 | 回溯逐行放，列/两对角线剪枝 |
| 324 | 171 | [Excel表列序号](https://leetcode.cn/problems/excel-sheet-column-number/) | 简单 | 26 进制转换 | ans=ans*26+(c-'A'+1) |
| 325 | 836 | [矩形重叠](https://leetcode.cn/problems/rectangle-overlap/) | 简单 | 判断矩形是否有正面积交集 | 用严格不分离条件：min右>max左 且 min上>max下 |
| 326 | 36 | [有效的数独](https://leetcode.cn/problems/valid-sudoku/) | 中等 | 数独合法性校验 | 行/列/九宫格三组标记一次扫描 |
| 327 | 581 | [最短无序连续子数组](https://leetcode.cn/problems/shortest-unsorted-continuous-subarray/) | 简单 | 找最短需排序区间 | 左扫最大定右边界，右扫最小定左边界 |
| 328 | 面试题 16.25 | [LRU缓存](https://leetcode.cn/problems/lru-cache-lcci/) | 中等 | LRU 设计 | LinkedHashMap(accessOrder) 超容删除 eldest |
| 329 | 127 | [单词接龙](https://leetcode.cn/problems/word-ladder/) | 困难 | 最短变换序列长度 | BFS：逐位替换 26 字母生成邻居，字典去重 |
| 330 | 452 | [用最少数量的箭引爆气球](https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/) | 中等 | 区间最少点覆盖 | 按右端点排序贪心，start>pos 就新箭 |
| 331 | 118 | [杨辉三角](https://leetcode.cn/problems/pascals-triangle/) | 简单 | 逐行构造三角形 | row[j]=prev[j-1]+prev[j]，首尾为 1 |
| 332 | 902 | [最大为 N 的数字组合](https://leetcode.cn/problems/numbers-at-most-n-given-digit-set/) | 困难 | 计数不超过 N 的可构造数 | 先算短位数总量，再逐位统计小于分支，不能匹配就停 |
| 333 | 68 | [文本左右对齐](https://leetcode.cn/problems/text-justification/) | 困难 | 字符串排版 | 贪心分行；非末行空格均分，前 extra 个多 1 |
| 334 | 845 | [数组中的最长山脉](https://leetcode.cn/problems/longest-mountain-in-array/) | 中等 | 先升后降最长长度 | 一次遍历 up/down，下降后再上升则重置 |
| 335 | 486 | [预测赢家](https://leetcode.cn/problems/predict-the-winner/) | 中等 | 先手是否不输 | 区间分差 dp：max(拿左-对手分差, 拿右-对手分差) |
| 336 | 73 | [矩阵置零](https://leetcode.cn/problems/set-matrix-zeroes/) | 中等 | 原地清零行列 | 第一行/列做标记，最后处理首行首列 |
| 337 | 456 | [132模式](https://leetcode.cn/problems/132-pattern/) | 中等 | 是否存在 132 | 从右往左单调栈，third 记录可用“2” |
| 338 | 907 | [子数组的最小值之和](https://leetcode.cn/problems/sum-of-subarray-minimums/) | 中等 | 最小值贡献求和 | 单调栈算 left/right 距离，贡献=arr[i]*L*R |
| 339 | 149 | [直线上最多的点数](https://leetcode.cn/problems/max-points-on-a-line/) | 困难 | 同一直线最大点数 | 枚举点 i，统计最简 dy/dx 斜率，重复点单独叠加 |
| 340 | 剑指 Offer 50 | [第一个只出现一次的字符](https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/) | 简单 | 找首个唯一字符 | 计数一次，再按顺序找第一个 count==1 |
| 341 | 429 | [N叉树的层序遍历](https://leetcode.cn/problems/n-ary-tree-level-order-traversal/) | 中等 | N 叉树按层输出 | BFS 队列按层遍历，每层固定弹 size 个 |
| 342 | 409 | [最长回文串](https://leetcode.cn/problems/longest-palindrome/) | 简单 | 最长可组成回文长度 | 统计次数取偶数部分；有奇数则中心 +1 |
| 343 | 451 | [根据字符出现频率排序](https://leetcode.cn/problems/sort-characters-by-frequency/) | 中等 | 按频率排序字符串 | 计数后按频率分桶，从高到低拼接 |
| 344 | 772 | [基本计算器 III](https://leetcode.cn/problems/basic-calculator-iii/) | 困难 | 带括号 + - * / 求值 | 递归下降解析：expr(+/-) term(* /) factor(数字/括号) |
| 345 | 1206 | [设计跳表](https://leetcode.cn/problems/design-skiplist/) | 困难 | 跳表支持查/增/删 | 从高层向下找 update；随机层数插入/删除 |
| 346 | 剑指 Offer 57 - II | [和为s的连续正数序列](https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/) | 简单 | 连续正数和为 target | 滑动窗口：小了右扩，大了左缩，等于就记录 |
| 347 | 剑指 Offer 43 | [1～n整数中1出现的次数](https://leetcode.cn/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/) | 困难 | 统计数字 1 出现次数 | 数位统计 high/cur/low，cur=0/1/大于1 分情况 |
| 348 | 905 | [按奇偶排序数组](https://leetcode.cn/problems/sort-array-by-parity/) | 简单 | 偶数在前奇数在后 | 双指针两端夹逼，左找奇右找偶交换 |
| 349 | 29 | [两数相除](https://leetcode.cn/problems/divide-two-integers/) | 中等 | 不用乘除模做除法 | 位运算从高位试探，能减就置位并扣倍数 |
| 350 | 164 | [最大间距](https://leetcode.cn/problems/maximum-gap/) | 困难 | 排序后相邻最大差 | 桶：记录每桶 min/max，最大差只在相邻桶之间 |
| 351 | 223 | [矩形面积](https://leetcode.cn/problems/rectangle-area/) | 中等 | 两矩形总覆盖面积 | areaA+areaB-overlap（重叠宽高取交集） |
| 352 | 67 | [二进制求和](https://leetcode.cn/problems/add-binary/) | 简单 | 二进制字符串加法 | 从后往前逐位相加 + carry，最后反转 |
| 353 | 面试题 01.07 | [旋转矩阵](https://leetcode.cn/problems/rotate-matrix-lcci/) | 中等 | 原地顺时针旋转 90° | 先转置，再每行反转 |
| 354 | 698 | [划分为k个相等的子集](https://leetcode.cn/problems/partition-to-k-equal-sum-subsets/) | 中等 | 是否能分成 k 个等和子集 | 总和整除 + 降序回溯装桶，桶起点剪枝 |
| 355 | 133 | [克隆图](https://leetcode.cn/problems/clone-graph/) | 中等 | 图的深拷贝 | DFS/BFS + map(旧->新) 防重复与环 |
| 356 | 986 | [区间列表的交集](https://leetcode.cn/problems/interval-list-intersections/) | 中等 | 两个区间列表求交 | 双指针：交集取 max(start)/min(end)，移动 end 更小者 |
| 357 | 剑指 Offer 12 | [矩阵中的路径](https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/) | 中等 | 网格中找字符串路径 | DFS 回溯：匹配则占位标记，四方向搜索，回溯恢复 |
| 358 | 剑指 Offer 14- I | [剪绳子](https://leetcode.cn/problems/jian-sheng-zi-lcof/) | 中等 | 最大乘积 | 数学：尽量拆 3，剩 4 拆 2+2；n<=3 返回 n-1 |
| 359 | 137 | [只出现一次的数字 II](https://leetcode.cn/problems/single-number-ii/) | 中等 | 其余出现三次找唯一 | 位状态机 ones/twos 做按位计数 mod 3 |
| 360 | 99 | [恢复二叉搜索树](https://leetcode.cn/problems/recover-binary-search-tree/) | 困难 | BST 两节点交换恢复 | 中序找逆序对，记录 first/second，交换值恢复 |
| 361 | 405 | [数字转换为十六进制数](https://leetcode.cn/problems/convert-a-number-to-hexadecimal/) | 简单 | int 转 16 进制 | `&0xf` 取低 4 位 + `>>>4` 无符号右移 |
| 362 | 补充题8 | [计算数组的小和](https://mp.weixin.qq.com/s/rMsbcUf9ZPhvfRoyZGW6HA) | 中等 | 数组小和统计 | 归并排序：`a[i] < a[j]` 时贡献 `a[i]*(右侧剩余个数)` |
| 363 | 722 | [删除注释](https://leetcode.cn/problems/remove-comments/) | 中等 | 删除行/块注释 | 扫描 + `inBlock` 状态机，块注释可跨行 |
| 364 | 57 | [插入区间](https://leetcode.cn/problems/insert-interval/) | 困难 | 插入并合并区间 | 一次扫描：左段直接放，中段合并，右段直接放 |
| 365 | 895 | [最大频率栈](https://leetcode.cn/problems/maximum-frequency-stack/) | 困难 | 频率最高且最近 | `freq` + `group[f]` 栈组 + `maxFreq` |
| 366 | 852 | [山脉数组的峰顶索引](https://leetcode.cn/problems/peak-index-in-a-mountain-array/) | 简单 | 找峰顶下标 | 二分：看 `mid` 与 `mid+1` 上坡/下坡决定方向 |
| 367 | 补充题17 | [两个有序数组第k小的数](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9817) | 困难 | 两有序数组第 k 小 | 每次丢掉 `k/2` 个元素（二分淘汰） |
| 368 | 30 | [串联所有单词的子串](https://leetcode.cn/problems/substring-with-concatenation-of-all-words/) | 困难 | 单词拼接子串起点 | 按单词长度分组滑窗，超频就缩窗 |
| 369 | 392 | [判断子序列](https://leetcode.cn/problems/is-subsequence/) | 简单 | 子序列判断 | 双指针扫 `t`，匹配到就推进 `s` |
| 370 | 1293 | [网格中的最短路径](https://leetcode.cn/problems/shortest-path-in-a-grid-with-obstacles-elimination/) | 困难 | 带清障次数的最短路 | BFS 状态 `(r,c,rem)` + `best[r][c]` 剪枝 |
| 371 | 889 | [根据前序和后序遍历构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/) | 中等 | 前序+后序构树 | 前序定根，后序定位左子树大小递归切分 |
| 372 | 1171 | [从链表中删去总和值为零的连续节点](https://leetcode.cn/problems/remove-zero-sum-consecutive-nodes-from-linked-list/) | 中等 | 删除和为 0 的连续段 | 前缀和两遍：记录“最后一次出现”并跳指针 |
| 373 | 159 | [至多包含两个不同字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-most-two-distinct-characters/) | 中等 | 至多 2 种字符滑窗 | 计数 + distinct，超 2 就收缩 |
| 374 | 剑指 Offer 65 | [不用加减乘除做加法](https://leetcode.cn/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/) | 简单 | 位运算加法 | `sum=a^b`，`carry=(a&b)<<1` 迭代到 carry 为 0 |
| 375 | 701 | [二叉搜索树中的插入操作](https://leetcode.cn/problems/insert-into-a-binary-search-tree/) | 中等 | BST 插入 | 迭代找空位挂新节点 |
| 376 | 252 | [会议室](https://leetcode.cn/problems/meeting-rooms/) | 简单 | 区间是否重叠 | 按 start 排序后看相邻是否交叉 |
| 377 | 117 | [填充每个节点的下一个右侧节点指针 II](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node-ii/) | 中等 | next 指针连接层序 | 用 `dummy/tail` 串下一层，靠 next 横扫当前层 |
| 378 | 1146 | [快照数组](https://leetcode.cn/problems/snapshot-array/) | 中等 | 可回溯数组 | 每下标记录 `(snap,val)` 列表，get 二分 |
| 379 | 716 | [最大栈](https://leetcode.cn/problems/max-stack/) | 简单 | 支持 popMax 的栈 | 双向链表 + TreeMap 定位最近的最大值节点 |
| 380 | 454 | [四数相加 II](https://leetcode.cn/problems/4sum-ii/) | 中等 | 四数组和为 0 计数 | `A+B` 频次哈希 + 匹配 `-(C+D)` |
| 381 | 918 | [环形子数组的最大和](https://leetcode.cn/problems/maximum-sum-circular-subarray/) | 中等 | 环形数组最大子数组和 | Kadane：maxSub 与 total-minSub 取最大 |
| 382 | 35 | [搜索插入位置](https://leetcode.cn/problems/search-insert-position/) | 简单 | 插入位置/下界 | 二分找第一个 `>= target` |
| 383 | 补充题13 | [中文数字转阿拉伯数字](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9813) | 中等 | 中文数解析为整数 | 按“万/亿”分节累加 |
| 384 | 321 | [拼接最大数](https://leetcode.cn/problems/create-maximum-number/) | 困难 | 两数组取 k 个组成最大数 | 枚举分配 + 单调栈取子序列 + 合并 |
| 385 | 381 | [O(1) 时间插入、删除和获取随机元素 - 允许重复](https://leetcode.cn/problems/insert-delete-getrandom-o1-duplicates-allowed/) | 困难 | 可重复随机集合 | 数组 + value->下标集合，删除用尾部覆盖 |
| 386 | 补充题20 | [立方根](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9820) | 中等 | 整数立方根向下取整 | 二分答案 |
| 387 | 214 | [最短回文串](https://leetcode.cn/problems/shortest-palindrome/) | 困难 | 在前面补最少字符成回文 | KMP 找最长回文前缀 |
| 388 | 273 | [整数转换英文表示](https://leetcode.cn/problems/integer-to-english-words/) | 困难 | 数字转英文读法 | 按 3 位一组转换再拼接单位 |
| 389 | 231 | [2的幂](https://leetcode.cn/problems/power-of-two/) | 简单 | 判断是否为 2 的幂 | 位运算：`n>0 && (n&(n-1))==0` |
| 390 | 140 | [单词拆分 II](https://leetcode.cn/problems/word-break-ii/) | 困难 | 输出所有拆分句子 | DFS + 记忆化 |
| 391 | 559 | [N叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-n-ary-tree/) | 简单 | N 叉树最大深度 | DFS |
| 392 | 173 | [二叉搜索树迭代器](https://leetcode.cn/problems/binary-search-tree-iterator/) | 中等 | BST 中序迭代器 | 栈模拟中序，均摊 O(1) |
| 393 | 767 | [重构字符串](https://leetcode.cn/problems/reorganize-string/) | 中等 | 相邻字符不相同重排 | 计数 + 偶/奇下标填充 |
| 394 | 补充题24 | [双栈排序](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/g_AqwsSEUwlRSevnStPkEA/) | 中等 | 用一个辅助栈排序栈 | 插入排序式栈操作 |
| 395 | 剑指 Offer 59 - I | [滑动窗口的最大值](https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/) | 困难 | 每个窗口最大值 | 单调队列（存下标） |
| 396 | 875 | [爱吃香蕉的珂珂](https://leetcode.cn/problems/koko-eating-bananas/) | 中等 | 最小吃香蕉速度 | 二分答案 + 计算耗时 |
| 397 | 530 | [二叉搜索树的最小绝对差](https://leetcode.cn/problems/minimum-absolute-difference-in-bst/) | 简单 | BST 相邻值最小差 | 中序遍历比较相邻 |
| 398 | 面试题 16.06 | [最小差](https://leetcode.cn/problems/smallest-difference-lcci/) | 中等 | 两数组最小绝对差 | 排序 + 双指针 |
| 399 | 1013 | [将数组分成和相等的三个部分](https://leetcode.cn/problems/partition-array-into-three-parts-with-equal-sum/) | 简单 | 三段和相等 | 扫描找前两段 `sum/3` |
| 400 | 726 | [原子的数量](https://leetcode.cn/problems/number-of-atoms/) | 困难 | 化学式计数并按字典序输出 | 栈 + Map 合并，最后 TreeMap 排序 |
| 401 | 1027 | [最长等差数列](https://leetcode.cn/problems/longest-arithmetic-subsequence/) | 中等 | DP 求最长等差子序列 | 二维 DP（差值范围固定可用数组） |
| 402 | 剑指 Offer 17 | [打印从1到最大的n位数](https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/) | 简单 | 构造 1..(10^n-1) | 直接生成数组 |
| 403 | 421 | [数组中两个数的最大异或值](https://leetcode.cn/problems/maximum-xor-of-two-numbers-in-an-array/) | 中等 | 最大 XOR | 按位贪心 + 前缀集合校验 |
| 404 | 剑指 Offer 60 | [n个骰子的点数](https://leetcode.cn/problems/nge-tou-zi-de-dian-shu-lcof/) | 中等 | n 个骰子点数概率 | DP 计数迭代 |
| 405 | 补充题7 | [木头切割问题](https://mp.weixin.qq.com/s/FQma0bdAWbzLMmCKhZRk7w) | 中等 | 切成 k 段求最大长度 | 二分答案 + 可行性检查 |
| 406 | 480 | [滑动窗口中位数](https://leetcode.cn/problems/sliding-window-median/) | 困难 | 窗口中位数 | 双堆 + 延迟删除 |
| 407 | 1233 | [删除子文件夹](https://leetcode.cn/problems/remove-sub-folders-from-the-filesystem/) | 中等 | 过滤子路径 | 排序 + 前缀判断 |
| 408 | 面试题 02.02 | [返回倒数第 k 个节点](https://leetcode.cn/problems/kth-node-from-end-of-list-lcci/) | 简单 | 链表倒数第 k 个 | 快慢指针 |
| 409 | 1658 | [将 x 减到 0 的最小操作数](https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/) | 中等 | 两端删除最少次数 | 转化为最长子数组和=total-x（滑窗） |
| 410 | 1280 | [学生们参加各科测试的次数](https://leetcode.cn/problems/students-and-examinations/) | 简单 | 全组合 + 计数输出 | Map 统计 (student, subject) 次数 |
| 411 | 350 | [两个数组的交集 II](https://leetcode.cn/problems/intersection-of-two-arrays-ii/) | 简单 | 交集含重复次数 | HashMap 计数 |
| 412 | 119 | [杨辉三角 II](https://leetcode.cn/problems/pascals-triangle-ii/) | 简单 | 第 k 行 | 一维 DP 从后往前更新 |
| 413 | 补充题3 | [求区间最小数乘区间和的最大值](https://mp.weixin.qq.com/s/UFv7pt_djjZoK_gzUBrRXA) | 困难 | max(min*sum) | 单调栈求边界 + 前缀和 |
| 414 | 703 | [数据流中的第K大元素](https://leetcode.cn/problems/kth-largest-element-in-a-stream/) | 简单 | 数据流第 k 大 | 小根堆维护 k 个最大值 |
| 415 | 剑指 Offer 25 | [合并两个排序的链表](https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/) | 简单 | 合并有序链表 | 迭代 + dummy |
| 416 | 1109 | [航班预订统计](https://leetcode.cn/problems/corporate-flight-bookings/) | 中等 | 区间加法统计 | 差分数组 + 前缀和 |
| 417 | 剑指 Offer 41 | [数据流中的中位数](https://leetcode.cn/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/) | 困难 | 数据流中位数 | 双堆平衡 |
| 418 | 1438 | [绝对差不超过限制的最长连续子数组](https://leetcode.cn/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | 中等 | max-min <= limit | 滑窗 + 单调队列（max/min） |
| 419 | 补充题12 | [二叉树的下一个节点](https://mp.weixin.qq.com/s/yewlHvHSilMsrUMFIO8WAA) | 中等 | 中序后继 | 右子树最左 / 向上找祖先 |
| 420 | 1011 | [在 D 天内送达包裹的能力](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/) | 中等 | 最小运载能力 | 二分答案 + 天数模拟 |
| 421 | 714 | [买卖股票的最佳时机含手续费](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) | 中等 | 股票 DP 两状态 | `cash/hold` 动态规划 |
| 422 | 325 | [和等于 k 的最长子数组长度](https://leetcode.cn/problems/maximum-size-subarray-sum-equals-k/) | 中等 | 前缀和最长长度 | 前缀和 + HashMap（记录最早下标） |
| 423 | 187 | [重复的DNA序列](https://leetcode.cn/problems/repeated-dna-sequences/) | 中等 | 固定窗口找重复 | 2bit 编码 + 滚动窗口计数 |
| 424 | 241 | [为运算表达式设计优先级](https://leetcode.cn/problems/different-ways-to-add-parentheses/) | 中等 | 枚举所有结果 | 分治 + 记忆化 |
| 425 | 331 | [验证二叉树的前序序列化](https://leetcode.cn/problems/verify-preorder-serialization-of-a-binary-tree/) | 中等 | 序列合法性 | 槽位计数 `slots` |
| 426 | 237 | [删除链表中的节点](https://leetcode.cn/problems/delete-node-in-a-linked-list/) | 简单 | 指定节点删除 | 覆盖当前节点并跳过 next |
| 427 | 873 | [最长的斐波那契子序列的长度](https://leetcode.cn/problems/length-of-longest-fibonacci-subsequence/) | 中等 | DP 求最长长度 | `dp[j][i]` + 值到下标映射 |
| 428 | 382 | [链表随机节点](https://leetcode.cn/problems/linked-list-random-node/) | 中等 | 等概率抽样 | 蓄水池抽样 |
| 429 | 781 | [森林中的兔子](https://leetcode.cn/problems/rabbits-in-forest/) | 中等 | 计数分组 | `ceil(cnt/(x+1))` 分组求和 |
| 430 | 870 | [优势洗牌](https://leetcode.cn/problems/advantage-shuffle/) | 中等 | 最大化优势次数 | 贪心：大能赢就用大，否则送小 |
| 431 | 652 | [寻找重复的子树](https://leetcode.cn/problems/find-duplicate-subtrees/) | 中等 | 找重复结构 | 后序序列化 + 计数 |
| 432 | 376 | [摆动序列](https://leetcode.cn/problems/wiggle-subsequence/) | 中等 | 最长摆动 | 贪心/DP：`up/down` |
| 433 | 877 | [石子游戏](https://leetcode.cn/problems/stone-game/) | 中等 | 先手必胜 | 结论：直接返回 true |
| 434 | 373 | [查找和最小的K对数字](https://leetcode.cn/problems/find-k-pairs-with-smallest-sums/) | 中等 | TopK 最小和 | 小根堆多路扩展 `(i,j)` |
| 435 | 365 | [水壶问题](https://leetcode.cn/problems/water-and-jug-problem/) | 中等 | 可达性判断 | `gcd(x,y)` + 裴蜀定理 |
| 436 | 915 | [分割数组](https://leetcode.cn/problems/partition-array-into-disjoint-intervals/) | 中等 | 最小分割点 | `rightMin` + `leftMax` |
| 437 | 786 | [第 K 个最小的素数分数](https://leetcode.cn/problems/k-th-smallest-prime-fraction/) | 困难 | 第 K 小分数 | 小根堆：固定分母推进分子 |
| 438 | 剑指 Offer 63 | [股票的最大利润](https://leetcode.cn/problems/gu-piao-de-zui-da-li-run-lcof/) | 中等 | 一次交易最大利润 | 维护最小价 + 更新答案 |
| 439 | 309 | [最佳买卖股票时机含冷冻期](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | 中等 | 股票 DP 含冷冻 | 三状态：`hold/sold/rest` |
| 440 | 90 | [子集 II](https://leetcode.cn/problems/subsets-ii/) | 中等 | 子集去重 | 回溯 + 排序跳过重复 |
| 441 | 976 | [三角形的最大周长](https://leetcode.cn/problems/largest-perimeter-triangle/) | 简单 | 排序找最大合法三元组 | 排序后从右往左，首个满足 \(a+b>c\) 直接返回 |
| 442 | 593 | [有效的正方形](https://leetcode.cn/problems/valid-square/) | 中等 | 判断 4 点能否构成正方形 | 6 个平方距离排序：4 边相等且>0，2 对角线相等且=2*边 |
| 443 | 983 | [最低票价](https://leetcode.cn/problems/minimum-cost-for-tickets/) | 中等 | 买 1/7/30 日票最省钱 | 按天 DP：出行日取 `min(dp[i-1]+c1, dp[i-7]+c7, dp[i-30]+c30)` |
| 444 | 369 | [给单链表加一](https://leetcode.cn/problems/plus-one-linked-list/) | 中等 | 链表表示整数 +1 | 递归到尾部 +1，回溯传进位；头部仍进位则补新头 |
| 445 | 738 | [单调递增的数字](https://leetcode.cn/problems/monotone-increasing-digits/) | 中等 | 最大的单调递增数字 | 从右往左找降序点：前一位-1，后缀全置 9 |
| 446 | 463 | [岛屿的周长](https://leetcode.cn/problems/island-perimeter/) | 简单 | 计算岛屿边界长度 | 每个陆地先 +4，遇到相邻陆地就 -1（四方向） |
| 447 | 147 | [对链表进行插入排序](https://leetcode.cn/problems/insertion-sort-list/) | 中等 | 链表插入排序 | `dummy` 维护已排序链表，逐个找位置插入 |
| 448 | 632 | [最小区间](https://leetcode.cn/problems/smallest-range-covering-elements-from-k-lists/) | 困难 | 覆盖 K 个有序列表的最小区间 | 最小堆维护当前最小值 + 记录当前最大值，弹最小推进其列表 |
| 449 | 621 | [任务调度器](https://leetcode.cn/problems/task-scheduler/) | 中等 | 含冷却时间的最短调度长度 | 频次公式：`max(len, (maxCnt-1)*(n+1)+maxNum)` |
| 450 | 1049 | [最后一块石头的重量 II](https://leetcode.cn/problems/last-stone-weight-ii/) | 中等 | 两堆差最小 | 0/1 背包凑到 `sum/2` 最近，答案 `sum-2*j` |
| 451 | 814 | [二叉树剪枝](https://leetcode.cn/problems/binary-tree-pruning/) | 中等 | 删除不含 1 的子树 | 后序：先剪左右，再判断叶子 0 则置空 |
| 452 | 399 | [除法求值](https://leetcode.cn/problems/evaluate-division/) | 中等 | 变量除法查询 | 建图（双向带权），每个 query BFS/DFS 累乘找路径 |
| 453 | 1339 | [分裂二叉树的最大乘积](https://leetcode.cn/problems/maximum-product-of-splitted-binary-tree/) | 中等 | 切一条边最大化两部分和乘积 | 先求 total，再遍历每个子树和 `sub`，更新 `sub*(total-sub)` |
| 454 | 52 | [N皇后 II](https://leetcode.cn/problems/n-queens-ii/) | 困难 | 统计 N 皇后方案数 | 回溯逐行放，列/对角线占用标记剪枝 |
| 455 | 633 | [平方数之和](https://leetcode.cn/problems/sum-of-square-numbers/) | 中等 | 是否存在 \(a^2+b^2=c\) | 双指针 `l=0,r=sqrt(c)`，按和大小移动 |
| 456 | 820 | [单词的压缩编码](https://leetcode.cn/problems/short-encoding-of-words/) | 中等 | 最短编码长度 | Set 删除所有真后缀，剩余词贡献 `len+1` |
| 457 | 1209 | [删除字符串中的所有相邻重复项 II](https://leetcode.cn/problems/remove-all-adjacent-duplicates-in-string-ii/) | 中等 | 删除连续 k 个相同字符 | 栈存字符+计数，计数到 k 就弹栈 |
| 458 | 补充题11 | [翻转URL字符串里的单词](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9811) | 中等 | `%20` 分隔的单词倒序 | 扫描按 `%20` 分词，反转后用 `%20` 连接 |
| 459 | 212 | [单词搜索 II](https://leetcode.cn/problems/word-search-ii/) | 困难 | 网格中找多单词 | Trie + DFS 回溯，命中 `word` 加入答案并去重 |
| 460 | 132 | [分割回文串 II](https://leetcode.cn/problems/palindrome-partitioning-ii/) | 困难 | 最少切割使每段是回文 | 预处理回文 `pal` + `dp` 最少切割 |
| 461 | 205 | [同构字符串](https://leetcode.cn/problems/isomorphic-strings/) | 简单 | 判断两字符串是否一一映射 | 双向映射数组校验 |
| 462 | 387 | [字符串中的第一个唯一字符](https://leetcode.cn/problems/first-unique-character-in-a-string/) | 简单 | 找第一个只出现一次的字符下标 | 计数两遍扫描 |
| 463 | 539 | [最小时间差](https://leetcode.cn/problems/minimum-time-difference/) | 中等 | 计算最小分钟差（含跨天） | 1440 桶 + 相邻差 + 首尾差 |
| 464 | 311 | [稀疏矩阵的乘法](https://leetcode.cn/problems/sparse-matrix-multiplication/) | 中等 | 稀疏矩阵乘法加速 | 只遍历非零元素（预存 mat2 非零） |
| 465 | 473 | [火柴拼正方形](https://leetcode.cn/problems/matchsticks-to-square/) | 中等 | 能否分成 4 条等长边 | 回溯放 4 边 + 排序剪枝 |
| 466 | 796 | [旋转字符串](https://leetcode.cn/problems/rotate-string/) | 简单 | 判断是否为旋转关系 | `(s+s).contains(goal)` |
| 467 | 面试题 08.02 | [迷路的机器人](https://leetcode.cn/problems/robot-in-a-grid-lcci/) | 中等 | 障碍网格找一条路径 | DFS + 记忆化 bad[][] |
| 468 | 1424 | [对角线遍历 II](https://leetcode.cn/problems/diagonal-traverse-ii/) | 中等 | 非规则二维数组对角线输出 | 按 i+j 分组，deque 头插 |
| 469 | 27 | [移除元素](https://leetcode.cn/problems/remove-element/) | 简单 | 原地移除指定值并返回新长度 | 快慢指针覆盖 |
| 470 | 1325 | [删除给定值的叶子节点](https://leetcode.cn/problems/delete-leaves-with-a-given-value/) | 中等 | 反复删除值为 target 的叶子 | 后序递归删除 |
| 471 | 1288 | [删除被覆盖区间](https://leetcode.cn/problems/remove-covered-intervals/) | 中等 | 删除完全被其他区间覆盖的区间 | 排序（start↑ end↓）+ 扫描 |
| 472 | 面试题 01.05 | [一次编辑](https://leetcode.cn/problems/one-away-lcci/) | 中等 | 判断两字符串编辑距离是否 ≤1 | 双指针一次跳过 |
| 473 | 303 | [区域和检索 - 数组不可变](https://leetcode.cn/problems/range-sum-query-immutable/) | 简单 | 多次区间求和 | 前缀和 |
| 474 | 393 | [UTF-8 编码验证](https://leetcode.cn/problems/utf-8-validation/) | 中等 | 校验字节序列是否为 UTF-8 | 判首字节长度 + 校验 10xxxxxx |
| 475 | 面试题 08.05 | [递归乘法](https://leetcode.cn/problems/recursive-mulitply-lcci/) | 中等 | 不用乘除实现乘法 | 拆半递归 + 位运算 |
| 476 | 513 | [找树左下角的值](https://leetcode.cn/problems/find-bottom-left-tree-value/) | 中等 | 找最后一层最左节点值 | BFS 每层第一个 |
| 477 | 694 | [不同岛屿的数量](https://leetcode.cn/problems/number-of-distinct-islands/) | 中等 | 统计不同形状岛屿 | DFS 记录相对坐标做签名 |
| 478 | 785 | [判断二分图](https://leetcode.cn/problems/is-graph-bipartite/) | 中等 | 无向图是否可二分染色 | BFS/DFS 染色判冲突 |
| 479 | 1031 | [两个非重叠子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-two-non-overlapping-subarrays/) | 中等 | 两段固定长度不重叠最大和 | 前缀和 + 左侧最优滚动 |
| 480 | 剑指 Offer 15 | [二进制中1的个数](https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/) | 简单 | 统计二进制 1 的个数 | `n &= (n-1)` 消 1 |
| 481 | 89 | [格雷编码](https://leetcode.cn/problems/gray-code/) | 中等 | 生成 n 位格雷码序列 | 公式：`i^(i>>1)` |
| 482 | 剑指 Offer 59 - II | [队列的最大值](https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/) | 中等 | 支持取最大值的队列 | 单调队列维护最大值 |
| 483 | 428 | [序列化和反序列化 N 叉树](https://leetcode.cn/problems/serialize-and-deserialize-n-ary-tree/) | 困难 | N 叉树编码/解码 | 前序 + 子节点数量 |
| 484 | 剑指 Offer 58 - I | [翻转单词顺序](https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/) | 简单 | 反转句子单词顺序 | `trim + split("\\s+") + 倒序拼接` |
| 485 | 1493 | [删掉一个元素以后全为 1 的最长子数组](https://leetcode.cn/problems/longest-subarray-of-1s-after-deleting-one-element/) | 中等 | 删 1 个数后最长连续 1 | 滑窗：窗口内最多 1 个 0 |
| 486 | 404 | [左叶子之和](https://leetcode.cn/problems/sum-of-left-leaves/) | 简单 | 求所有左叶子节点之和 | DFS：判断左叶子累加 |
| 487 | 449 | [序列化和反序列化二叉搜索树](https://leetcode.cn/problems/serialize-and-deserialize-bst/) | 中等 | BST 编码/解码 | 前序 + 上下界重建 |
| 488 | 1353 | [最多可以参加的会议数目](https://leetcode.cn/problems/maximum-number-of-events-that-can-be-attended/) | 中等 | 最大参加会议数量 | 贪心 + 小根堆（最早结束优先） |
| 489 | 剑指 Offer 19 | [正则表达式匹配](https://leetcode.cn/problems/zheng-ze-biao-da-shi-pi-pei-lcof/) | 困难 | `.` 与 `*` 的匹配 | DP：`dp[i][j]` |
| 490 | 剑指 Offer 53 - II | [0～n-1中缺失的数字](https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/) | 简单 | 有序数组缺失 1 个数 | 二分找 `nums[i]!=i` |
| 491 | 414 | [第三大的数](https://leetcode.cn/problems/third-maximum-number/) | 简单 | 第三大（去重） | 一次遍历维护前三大 |
| 492 | 1002 | [查找常用字符](https://leetcode.cn/problems/find-common-characters/) | 简单 | 多个字符串的公共字符 | 26 频次取最小值 |
| 493 | 1539 | [第 k 个缺失的正整数](https://leetcode.cn/problems/kth-missing-positive-number/) | 简单 | 找第 k 个缺失正数 | 二分：`missing=arr[i]-(i+1)` |
| 494 | 65 | [有效数字](https://leetcode.cn/problems/valid-number/) | 困难 | 判断字符串是否为数字 | 扫描 + 状态标记 |
| 495 | 263 | [丑数](https://leetcode.cn/problems/ugly-number/) | 简单 | 判断是否只含 2/3/5 因子 | 除尽 2/3/5 |
| 496 | 951 | [翻转等价二叉树](https://leetcode.cn/problems/flip-equivalent-binary-trees/) | 中等 | 允许任意节点左右翻转 | 递归：同向/交叉匹配 |
| 497 | 886 | [可能的二分法](https://leetcode.cn/problems/possible-bipartition/) | 中等 | 互相讨厌的人分两组 | 二分图染色 |
| 498 | 949 | [给定数字能组成的最大时间](https://leetcode.cn/problems/largest-time-for-given-digits/) | 简单 | 4 个数拼最大合法时间 | 枚举 24 种排列 |
| 499 | 256 | [粉刷房子](https://leetcode.cn/problems/paint-house/) | 简单 | 相邻不同色的最小花费 | DP 三色滚动 |
| 500 | 面试题 02.07 | [链表相交](https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/) | 简单 | 两链表相交节点 | 双指针切换走同路程 |
| 501 | 746 | [使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs/) | 简单 | 到达楼顶的最小花费 | 台阶 DP：`dp[i]=min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2])`（滚动） |
| 502 | 1423 | [可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/) | 中等 | 两端取 k 张最大和 | 转化：总和 - 中间长度 `n-k` 的最小窗口和（滑动窗口） |
| 503 | 398 | [随机数索引](https://leetcode.cn/problems/random-pick-index/) | 中等 | 等概率返回目标下标 | 蓄水池抽样：第 `cnt` 个目标以 `1/cnt` 概率替换答案 |
| 504 | 1195 | [交替打印字符串](https://leetcode.cn/problems/fizz-buzz-multithreaded/) | 中等 | 多线程 FizzBuzz 顺序打印 | Semaphore：number 线程分发，fizz/buzz/fizzbuzz 打印后归还执行权 |
| 505 | 1026 | [节点与其祖先之间的最大差值](https://leetcode.cn/problems/maximum-difference-between-node-and-ancestor/) | 中等 | 节点与祖先差值最大 | DFS 传递路径 `min/max`，每点更新答案 |
| 506 | 1254 | [统计封闭岛屿的数目](https://leetcode.cn/problems/number-of-closed-islands/) | 中等 | 不接触边界的岛屿数量 | 先从边界淹没连通陆地，再对剩余陆地连通块计数 |
| 507 | 292 | [Nim 游戏](https://leetcode.cn/problems/nim-game/) | 简单 | 取石子博弈 | 结论：`n%4!=0` 先手胜 |
| 508 | 58 | [最后一个单词的长度](https://leetcode.cn/problems/length-of-last-word/) | 简单 | 最后一个单词长度 | 从后扫：跳过空格再计数 |
| 509 | 987 | [二叉树的垂序遍历](https://leetcode.cn/problems/vertical-order-traversal-of-a-binary-tree/) | 中等 | 按列/行/值排序分组 | DFS 收集 `(col,row,val)` 后排序并按 col 分组 |
| 510 | 829 | [连续整数求和](https://leetcode.cn/problems/consecutive-numbers-sum/) | 困难 | 连续正整数表示方式数 | 枚举长度 \(k\)：判断 `n-k(k-1)/2` 是否能被 `k` 整除 |
| 511 | 面试题 16.26 | [计算器](https://leetcode.cn/problems/calculator-lcci/) | 中等 | 表达式计算（含括号） | 两栈：数字栈+运算符栈，按优先级与括号规则计算 |
| 512 | 1115 | [交替打印FooBar](https://leetcode.cn/problems/print-foobar-alternately/) | 中等 | 两线程交替打印 | 两个 Semaphore：`fooSem(1)`/`barSem(0)` 交替 acquire/release |
| 513 | 269 | [火星词典](https://leetcode.cn/problems/alien-dictionary/) | 困难 | 推导字母顺序 | 相邻单词建边 + 前缀非法判断 + 拓扑排序判环/输出 |
| 514 | 1249 | [移除无效的括号](https://leetcode.cn/problems/minimum-remove-to-make-valid-parentheses/) | 中等 | 最少移除使括号有效 | 两次扫描：左扫删多余 `)`，右扫删多余 `(` |
| 515 | 1120 | [子树的最大平均值](https://leetcode.cn/problems/maximum-average-subtree/) | 中等 | 任意子树最大平均值 | 后序 DFS 返回 `(sum,cnt)`，每节点更新 `sum/cnt` |
| 516 | 面试题 17.15 | [最长单词](https://leetcode.cn/problems/longest-word-lcci/) | 中等 | 最长可由其它单词拼接的词 | 按长度排序，逐个用 wordBreak DP 判断（字典为更短单词集） |
| 517 | 1227 | [飞机座位分配概率](https://leetcode.cn/problems/airplane-seat-assignment-probability/) | 中等 | 第 n 人坐到自己座位概率 | 结论：`n==1` 为 1，否则为 0.5 |
| 518 | 274 | [H 指数](https://leetcode.cn/problems/h-index/) | 中等 | 论文 H 指数 | 排序后扫描：找最大 `h` 满足至少 `h` 篇 \(\ge h\) |
| 519 | 791 | [自定义字符串排序](https://leetcode.cn/problems/custom-sort-string/) | 中等 | 按 order 重排字符串 | 计数数组：先写 order 里的，再写剩余字符 |
| 520 | 116 | [填充每个节点的下一个右侧节点指针](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/) | 中等 | 完美二叉树 next 指针连接 | O(1) 逐层：`left->right`，`right->next.left` |
| 521 | 697 | [数组的度](https://leetcode.cn/problems/degree-of-an-array/) | 简单 | 最短子数组保持数组度 | 统计 cnt/first/last，取最小区间 |
| 522 | 805 | [数组的均值分割](https://leetcode.cn/problems/split-array-with-same-average/) | 困难 | 是否能分成同均值两组 | 转换为子集和为 0，DP+HashSet |
| 523 | 538 | [把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/) | 简单 | BST 变“更大和树” | 反向中序累加 sum |
| 524 | 剑指 Offer 13 | [机器人的运动范围](https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/) | 中等 | 数位和约束可达格子数 | BFS/DFS + visited |
| 525 | 967 | [连续差相同的数字](https://leetcode.cn/problems/numbers-with-same-consecutive-differences/) | 中等 | 生成满足相邻差为 k 的数 | DFS 从首位扩展 |
| 526 | 326 | [3的幂](https://leetcode.cn/problems/power-of-three/) | 简单 | 判断是否为 3^x | 循环除以 3 |
| 527 | 1024 | [视频拼接](https://leetcode.cn/problems/video-stitching/) | 中等 | 覆盖 [0,time] 最少区间数 | 贪心扫描 far/end（跳跃游戏） |
| 528 | 面试题 08.11 | [硬币](https://leetcode.cn/problems/coin-lcci/) | 中等 | 1/5/10/25 凑 n 的方案数 | 完全背包 1D dp（取模） |
| 529 | 1156 | [单字符重复子串的最大长度](https://leetcode.cn/problems/swap-for-longest-repeated-character-substring/) | 中等 | 最多交换一次的最长同字符段 | 段压缩 + 合并隔 1 段 |
| 530 | 217 | [存在重复元素](https://leetcode.cn/problems/contains-duplicate/) | 简单 | 判断是否有重复 | HashSet 判重 |
| 531 | 1235 | [规划兼职工作](https://leetcode.cn/problems/maximum-profit-in-job-scheduling/) | 困难 | 不重叠工作最大收益 | 按 end 排序 + dp + 二分 |
| 532 | 807 | [保持城市天际线](https://leetcode.cn/problems/max-increase-to-keep-city-skyline/) | 中等 | 天际线不变的最大增量 | 行列最大值取 min  |
| 533 | 687 | [最长同值路径](https://leetcode.cn/problems/longest-univalue-path/) | 中等 | 同值路径最大边数 | 后序 dfs：左右可接长度相加 |
| 534 | 980 | [不同路径 III](https://leetcode.cn/problems/unique-paths-iii/) | 困难 | 走遍所有可走格子的路径数 | 回溯 DFS + remain 计数 |
| 535 | 面试题 16.16 | [部分排序](https://leetcode.cn/problems/sub-sort-lcci/) | 中等 | 最短排序区间 | 两次扫描定 left/right |
| 536 | 968 | [监控二叉树](https://leetcode.cn/problems/binary-tree-cameras/) | 困难 | 最少摄像头覆盖整树 | 后序 3 状态贪心 |
| 537 | 922 | [按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii/) | 简单 | 偶位放偶数奇位放奇数 | 新数组双指针填充 |
| 538 | 582 | [杀死进程](https://leetcode.cn/problems/kill-process/) | 中等 | 杀死进程及所有子孙 | 建图 parent->children DFS/BFS |
| 539 | 补充题19 | [判断一个点是否在三角形内](https://mp.weixin.qq.com/s/UK7ilkFeEDQeVWvLDHbuKA) | 中等 | 点是否在三角形内（含边界） | 叉积同向判断 |
| 540 | 280 | [摆动排序](https://leetcode.cn/problems/wiggle-sort/) | 中等 | 变成 <= >= <= 交替 | 一次遍历，不满足就交换相邻 |
| 541 | 743 | [网络延迟时间](https://leetcode.cn/problems/network-delay-time/) | 中等 | 单源最短路最大值 | Dijkstra 求 k 到各点最短路，取最大；有不可达则 -1 |
| 542 | 700 | [二叉搜索树中的搜索](https://leetcode.cn/problems/search-in-a-binary-search-tree/) | 简单 | BST 查找节点 | 利用 BST 性质迭代向左/向右走，命中返回 |
| 543 | 324 | [摆动排序 II](https://leetcode.cn/problems/wiggle-sort-ii/) | 中等 | 重排成 < > < > | 排序后偶位填小半段倒序、奇位填大半段倒序 |
| 544 | 203 | [移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/) | 简单 | 删除链表所有 val | dummy + 遍历前驱，命中就跳过节点 |
| 545 | 剑指 Offer 18 | [删除链表的节点](https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/) | 简单 | 删除首个 val | dummy 找前驱，删除一次后退出 |
| 546 | 841 | [钥匙和房间](https://leetcode.cn/problems/keys-and-rooms/) | 中等 | 图可达性 | 从 0 BFS/DFS 标记访问，计数是否等于 n |
| 547 | 1162 | [地图分析](https://leetcode.cn/problems/as-far-from-land-as-possible/) | 中等 | 海洋到陆地最远距离 | 多源 BFS：所有陆地入队，最后层数为答案 |
| 548 | 229 | [求众数 II](https://leetcode.cn/problems/majority-element-ii/) | 中等 | 找 > n/3 的元素 | Boyer-Moore 两候选投票 + 二次计数验证 |
| 549 | 629 | [K个逆序对数组](https://leetcode.cn/problems/k-inverse-pairs-array/) | 困难 | 计数 DP（取模） | dp[i][j] 前缀和优化到 O(nk)：dp[i][j]=dp[i][j-1]+prev[j]-prev[j-i] |
| 550 | 1091 | [二进制矩阵中的最短路径](https://leetcode.cn/problems/shortest-path-in-binary-matrix/) | 中等 | 8 方向最短路 | BFS，起点 dist=1，首次到终点即最短 |
| 551 | 1019 | [链表中的下一个更大节点](https://leetcode.cn/problems/next-greater-node-in-linked-list/) | 中等 | 链表版 Next Greater | 转数组 + 下标单调栈，遇到更大值弹栈填答案 |
| 552 | 856 | [括号的分数](https://leetcode.cn/problems/score-of-parentheses/) | 中等 | 计算平衡括号分数 | 统计深度：每个 "()" 贡献 1<<外层深度 |
| 553 | 496 | [下一个更大元素 I](https://leetcode.cn/problems/next-greater-element-i/) | 简单 | 子集的 Next Greater | nums2 用单调栈建 map，再对 nums1 查表 |
| 554 | 1277 | [统计全为 1 的正方形子矩阵](https://leetcode.cn/problems/count-square-submatrices-with-all-ones/) | 中等 | 统计全 1 正方形数量 | dp[i][j]=1+min(上,左,左上)，累加 dp 得答案 |
| 555 | 剑指 Offer 44 | [数字序列中某一位的数字](https://leetcode.cn/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/) | 中等 | 找序列第 n 位数字 | 按位数分段扣 n，定位到具体数字与位下标 |
| 556 | 318 | [最大单词长度乘积](https://leetcode.cn/problems/maximum-product-of-word-lengths/) | 中等 | 无公共字符最大乘积 | 单词转 26 位 mask，两两判断 mask&mask==0 |
| 557 | 1106 | [解析布尔表达式](https://leetcode.cn/problems/parsing-a-boolean-expression/) | 困难 | 解析 ! & | 表达式 | 栈：遇 ')' 弹到 '('，按运算符合并成 t/f 再压回 |
| 558 | 934 | [最短的桥](https://leetcode.cn/problems/shortest-bridge/) | 中等 | 两岛最少翻转 0 | DFS 标记一岛并入队，BFS 扩展首次碰到另一岛返回层数 |
| 559 | 417 | [太平洋大西洋水流问题](https://leetcode.cn/problems/pacific-atlantic-water-flow/) | 中等 | 同时流向两海的格子 | 反向 BFS：从两海边界“爬坡”可达，取交集 |
| 560 | 997 | [找到小镇的法官](https://leetcode.cn/problems/find-the-town-judge/) | 简单 | 入度/出度找法官 | 统计 in/out，找 in=n-1 且 out=0 的人 |
| 561 | 剑指 Offer 49 | [丑数](https://leetcode.cn/problems/chou-shu-lcof/) | 中等 | 第 n 个丑数 | DP 三指针 `p2/p3/p5` 生成递增序列 |
| 562 | 1094 | [拼车](https://leetcode.cn/problems/car-pooling/) | 中等 | 区间上下车容量校验 | 差分数组 + 前缀和，过程检查是否超 capacity |
| 563 | 653 | [两数之和 IV - 输入 BST](https://leetcode.cn/problems/two-sum-iv-input-is-a-bst/) | 简单 | BST 中是否存在两数和 | DFS + HashSet，查 `k-x` |
| 564 | LCP 09 | [最小跳跃次数](https://leetcode.cn/problems/zui-xiao-tiao-yue-ci-shu/) | 困难 | 跳出数组最少步数 | BFS；左跳用 `left` 指针批量入队去重 |
| 565 | 455 | [分发饼干](https://leetcode.cn/problems/assign-cookies/) | 简单 | 最大满足孩子数 | 排序 + 双指针贪心（小饼干喂小胃口） |
| 566 | 773 | [滑动谜题](https://leetcode.cn/problems/sliding-puzzle/) | 困难 | 2x3 最短交换步数 | BFS 状态字符串 + 0 的可交换邻接表 |
| 567 | 216 | [组合总和 III](https://leetcode.cn/problems/combination-sum-iii/) | 中等 | 1..9 选 k 个和为 n | 回溯组合（递增选取） |
| 568 | 813 | [最大平均值和的分组](https://leetcode.cn/problems/largest-sum-of-averages/) | 中等 | 分组最大化平均值和 | DP 切分 + 前缀和，枚举最后一刀位置 |
| 569 | 541 | [反转字符串 II](https://leetcode.cn/problems/reverse-string-ii/) | 简单 | 每 2k 反转前 k | 按块处理：反转区间 `[i, i+k)` |
| 570 | 583 | [两个字符串的删除操作](https://leetcode.cn/problems/delete-operation-for-two-strings/) | 中等 | 最少删除变相同 | LCS：答案 `m+n-2*lcs` |
| 571 | 792 | [匹配子序列的单词数](https://leetcode.cn/problems/number-of-matching-subsequences/) | 中等 | 统计子序列单词数 | 26 桶存“等待字符”的指针，扫一遍 s 推进 |
| 572 | 705 | [设计哈希集合](https://leetcode.cn/problems/design-hashset/) | 简单 | HashSet 设计 | 值域固定直接 boolean 数组 |
| 573 | 904 | [水果成篮](https://leetcode.cn/problems/fruit-into-baskets/) | 中等 | 至多两种值的最长子数组 | 滑动窗口，map 计数，超 2 种就缩窗 |
| 574 | 1669 | [合并两个链表](https://leetcode.cn/problems/merge-in-between-linked-lists/) | 中等 | 替换 list1 的一段 | 定位 `preA/afterB/tail2` 后两次拼接 |
| 575 | 1151 | [最少交换次数来组合所有的 1](https://leetcode.cn/problems/minimum-swaps-to-group-all-1s-together/) | 中等 | 让 1 连续的最少交换 | 窗口长度=ones，找窗口内 1 最大值 |
| 576 | 314 | [二叉树的垂直遍历](https://leetcode.cn/problems/binary-tree-vertical-order-traversal/) | 中等 | 按列输出二叉树 | BFS 带列号，map 收集并用 min/max 列输出 |
| 577 | 391 | [完美矩形](https://leetcode.cn/problems/perfect-rectangle/) | 困难 | 矩形是否完美覆盖 | 面积相等 + 角点奇偶性只剩外接四角 |
| 578 | 490 | [迷宫](https://leetcode.cn/problems/the-maze/) | 中等 | 球滚动能否到达 | BFS/DFS：停点为节点，四方向滚到墙 |
| 579 | 474 | [一和零](https://leetcode.cn/problems/ones-and-zeroes/) | 中等 | 0/1 容量下最多选多少串 | 二维 0/1 背包倒序更新 |
| 580 | 740 | [删除与获得点数](https://leetcode.cn/problems/delete-and-earn/) | 中等 | 删数得分最大化 | 合并同值成 points，转打家劫舍 DP |
| 581 | 1129 | [颜色交替的最短路径](https://leetcode.cn/problems/shortest-path-with-alternating-colors/) | 中等 | 边颜色交替的最短路 | BFS + 上一条边颜色状态 |
| 582 | 505 | [迷宫 II](https://leetcode.cn/problems/the-maze-ii/) | 中等 | 滚动到停点的最短距离 | Dijkstra（停点图带权） |
| 583 | 524 | [通过删除字母匹配到字典里最长单词](https://leetcode.cn/problems/longest-word-in-dictionary-through-deleting/) | 中等 | 找可由删除得到的最长词 | 双指针判断子序列 |
| 584 | 341 | [扁平化嵌套列表迭代器](https://leetcode.cn/problems/flatten-nested-list-iterator/) | 中等 | 嵌套列表迭代输出整数 | 栈展开：`hasNext()` 展开到整数 |
| 585 | 1048 | [最长字符串链](https://leetcode.cn/problems/longest-string-chain/) | 中等 | 单词链最长长度 | DP：删 1 字符找前驱 |
| 586 | 1410 | [HTML 实体解析器](https://leetcode.cn/problems/html-entity-parser/) | 中等 | 实体字符替换 | 扫描 + 匹配固定 6 种实体 |
| 587 | 1358 | [包含所有三种字符的子字符串数目](https://leetcode.cn/problems/number-of-substrings-containing-all-three-characters/) | 中等 | 至少含 a/b/c 的子串数 | 滑窗：满足后收缩，答案加 `left` |
| 588 | 290 | [单词规律](https://leetcode.cn/problems/word-pattern/) | 简单 | 模式与单词一一对应 | 双向 HashMap |
| 589 | 310 | [最小高度树](https://leetcode.cn/problems/minimum-height-trees/) | 中等 | 树的中心节点 | 拓扑剥叶子到剩 1~2 个 |
| 590 | 1490 | [克隆 N 叉树](https://leetcode.cn/problems/clone-n-ary-tree/) | 中等 | 深拷贝 N 叉树 | DFS + Map 记忆化 |
| 591 | 491 | [递增子序列](https://leetcode.cn/problems/non-decreasing-subsequences/) | 中等 | 非递减子序列去重枚举 | 回溯 + 同层去重 |
| 592 | 1035 | [不相交的线](https://leetcode.cn/problems/uncrossed-lines/) | 中等 | 最大不交叉连线数 | LCS DP |
| 593 | 724 | [寻找数组的中心索引](https://leetcode.cn/problems/find-pivot-index/) | 简单 | 左右和相等的下标 | 前缀和：`left == sum-left-nums[i]` |
| 594 | 剑指 Offer 67 | [把字符串转换成整数](https://leetcode.cn/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/) | 中等 | atoi 转换并处理溢出 | 扫描 + 溢出截断 |
| 595 | 剑指 Offer 32 - II | [从上到下打印二叉树 II](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/) | 简单 | 层序遍历分层输出 | BFS 队列按层 size |
| 596 | 345 | [反转字符串中的元音字母](https://leetcode.cn/problems/reverse-vowels-of-a-string/) | 简单 | 仅反转元音位置 | 双指针找元音交换 |
| 597 | 1114 | [按序打印](https://leetcode.cn/problems/print-in-order/) | 简单 | 三线程保证顺序 | CountDownLatch 串行 |
| 598 | 992 | [K 个不同整数的子数组](https://leetcode.cn/problems/subarrays-with-k-different-integers/) | 困难 | 恰好 K 种不同数的子数组 | atMost(K)-atMost(K-1) |
| 599 | 1092 | [最短公共超序列](https://leetcode.cn/problems/shortest-common-supersequence/) | 困难 | 最短同时包含两串的序列 | LCS DP + 回溯构造 |
| 600 | 594 | [最长和谐子序列](https://leetcode.cn/problems/longest-harmonious-subsequence/) | 简单 | 最大值最小值差 1 的子序列 | 计数：`cnt[x]+cnt[x+1]` |
| 601 | 332 | [重新安排行程](https://leetcode.cn/problems/reconstruct-itinerary/) | 困难 | 用完所有机票且字典序最小 | 欧拉路径（Hierholzer）+ 小根堆 |
| 602 | 745 | [前缀和后缀搜索](https://leetcode.cn/problems/prefix-and-suffix-search/) | 困难 | 同时匹配前缀+后缀 | 预处理 `prefix#suffix -> 最大下标` |
| 603 | 剑指 Offer 47 | [礼物的最大价值](https://leetcode.cn/problems/li-wu-de-zui-da-jie-zhi-lcof/) | 中等 | 网格最大路径和 | 一维 DP（来自上/左） |
| 604 | 1190 | [反转每对括号间的子串](https://leetcode.cn/problems/reverse-substrings-between-each-pair-of-parentheses/) | 中等 | 括号内反转 | 先配对括号 + 指针跳转反向 |
| 605 | 1642 | [可以到达的最远建筑](https://leetcode.cn/problems/furthest-building-you-can-reach/) | 中等 | 砖/梯子最远到哪 | 小根堆：大爬升用梯子、小爬升用砖 |
| 606 | 1160 | [拼写单词](https://leetcode.cn/problems/find-words-that-can-be-formed-by-characters/) | 简单 | 可拼写单词长度和 | 字符计数 |
| 607 | 475 | [供暖器](https://leetcode.cn/problems/heaters/) | 简单 | 最小供暖半径 | 对每个房子二分最近供暖器 |
| 608 | 881 | [救生艇](https://leetcode.cn/problems/boats-to-save-people/) | 中等 | 最少船数 | 排序 + 双指针贪心配对 |
| 609 | 713 | [乘积小于K的子数组](https://leetcode.cn/problems/subarray-product-less-than-k/) | 中等 | 统计乘积 < k | 正数滑动窗口 |
| 610 | 1654 | [到家的最少跳跃次数](https://leetcode.cn/problems/minimum-jumps-to-reach-home/) | 中等 | 最少跳跃到 x | BFS（位置 + 是否刚后跳） |
| 611 | 1245 | [树的直径](https://leetcode.cn/problems/tree-diameter/) | 中等 | 树上最长路径 | 两次 BFS/DFS 求直径 |
| 612 | 377 | [组合总和 Ⅳ](https://leetcode.cn/problems/combination-sum-iv/) | 中等 | 方案数（顺序算不同） | dp[i]+=dp[i-num] |
| 613 | 733 | [图像渲染](https://leetcode.cn/problems/flood-fill/) | 简单 | 连通块染色 | BFS/DFS |
| 614 | 797 | [所有可能的路径](https://leetcode.cn/problems/all-paths-from-source-to-target/) | 中等 | DAG 所有路径 | DFS 回溯输出所有路径 |
| 615 | 446 | [等差数列划分 II - 子序列](https://leetcode.cn/problems/arithmetic-slices-ii-subsequence/) | 困难 | 统计等差子序列个数 | DP + Map（差值 -> 计数） |
| 616 | 剑指 Offer 16 | [数值的整数次方](https://leetcode.cn/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/) | 中等 | x 的 n 次幂 | 快速幂（迭代平方） |
| 617 | 406 | [根据身高重建队列](https://leetcode.cn/problems/queue-reconstruction-by-height/) | 中等 | 还原队列 | 身高降序 + 按 k 插入 |
| 618 | 478 | [在圆内随机生成点](https://leetcode.cn/problems/generate-random-point-in-a-circle/) | 中等 | 圆内均匀随机点 | 极坐标：r*sqrt(U) + 随机角度 |
| 619 | 424 | [替换后的最长重复字符](https://leetcode.cn/problems/longest-repeating-character-replacement/) | 中等 | 最长可替换子串 | 滑动窗口 + maxCnt |
| 620 | 654 | [最大二叉树](https://leetcode.cn/problems/maximum-binary-tree/) | 中等 | 构建最大二叉树 | 单调栈线性构建 |
| 621 | 759 | [员工空闲时间](https://leetcode.cn/problems/employee-free-time/) | 困难 | 合并忙碌区间找空档 | 扁平化 + 排序合并区间 |
| 622 | 66 | [加一](https://leetcode.cn/problems/plus-one/) | 简单 | 数组表示大整数加一 | 从后往前进位 |
| 623 | 304 | [二维区域和检索 - 矩阵不可变](https://leetcode.cn/problems/range-sum-query-2d-immutable/) | 中等 | 子矩形求和 | 二维前缀和 + 容斥 |
| 624 | 剑指 Offer 56 - II | [数组中数字出现的次数 II](https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/) | 中等 | 其它数出现 3 次 | 位计数 `count%3` |
| 625 | 1497 | [检查数组对是否可以被 k 整除](https://leetcode.cn/problems/check-if-array-pairs-are-divisible-by-k/) | 中等 | 按余数配对 | 余数计数 `cnt[r]==cnt[k-r]` |
| 626 | 剑指 Offer 66 | [构建乘积数组](https://leetcode.cn/problems/gou-jian-cheng-ji-shu-zu-lcof/) | 中等 | 构造不含自身乘积 | 前后缀乘积 |
| 627 | 848 | [字母移位](https://leetcode.cn/problems/shifting-letters/) | 中等 | 后缀移位累加 | 倒序累加 `sum%26` |
| 628 | 1155 | [掷骰子的N种方法](https://leetcode.cn/problems/number-of-dice-rolls-with-target-sum/) | 中等 | 方案数计数 | DP（滚动数组） |
| 629 | 973 | [最接近原点的 K 个点](https://leetcode.cn/problems/k-closest-points-to-origin/) | 中等 | TopK 最近 | 大根堆维护 k 个 |
| 630 | 1302 | [层数最深叶子节点的和](https://leetcode.cn/problems/deepest-leaves-sum/) | 中等 | 最深层求和 | BFS 层序遍历 |
| 631 | 补充题10 | [36进制减法](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/ub9GpTBjDF55hZld3V2rEA/) | 中等 | base36 字符串相减 | 竖式减法 + 借位 |
| 632 | 1060 | [有序数组中的缺失元素](https://leetcode.cn/problems/missing-element-in-sorted-array/) | 中等 | 第 k 个缺失数 | `missing(i)` + 二分 |
| 633 | 1363 | [形成三的最大倍数](https://leetcode.cn/problems/largest-multiple-of-three/) | 困难 | 最大可被 3 整除 | 计数 + 贪心删最小 |
| 634 | 564 | [寻找最近的回文数](https://leetcode.cn/problems/find-the-closest-palindrome/) | 困难 | 最近回文 | 枚举 5 个候选 |
| 635 | 305 | [岛屿数量 II](https://leetcode.cn/problems/number-of-islands-ii/) | 困难 | 动态加陆地 | 并查集 union 四邻 |
| 636 | 448 | [找到所有数组中消失的数字](https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/) | 简单 | 找缺失元素 | 原地负号标记 |
| 637 | 剑指 Offer 05 | [替换空格](https://leetcode.cn/problems/ti-huan-kong-ge-lcof/) | 简单 | 替换字符 | StringBuilder 拼接 |
| 638 | 190 | [颠倒二进制位](https://leetcode.cn/problems/reverse-bits/) | 简单 | 位反转 | 循环 32 次移位 |
| 639 | 补充题18 | [反转双向链表](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9818) | 中等 | 双向链表反转 | 交换 `next/prev` |
| 640 | 842 | [将数组拆分成斐波那契序列](https://leetcode.cn/problems/split-array-into-fibonacci-sequence/) | 中等 | 切分成斐波那契 | 回溯 + 剪枝 |
| 641 | 1038 | [从二叉搜索树到更大和树](https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/) | 中等 | BST 变成累加树 | 反向中序（右根左）累加 `sum` 并回写 |
| 642 | 821 | [字符的最短距离](https://leetcode.cn/problems/shortest-distance-to-a-character/) | 简单 | 每个位置到目标字符最近距离 | 左到右 + 右到左 两次遍历取最小 |
| 643 | 面试题 02.01 | [移除重复节点](https://leetcode.cn/problems/remove-duplicate-node-lcci/) | 简单 | 链表去重 | HashSet 记录出现过的值，重复就跳过 |
| 644 | 668 | [乘法表中第k小的数](https://leetcode.cn/problems/kth-smallest-number-in-multiplication-table/) | 困难 | 乘法表第 k 小 | 二分答案 `x`，计数 `<=x` 为 `sum(min(n,x/i))` |
| 645 | 剑指 Offer 55 - I | [二叉树的深度](https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/) | 简单 | 求树高度 | 递归 `1+max(left,right)` |
| 646 | 1343 | [大小为 K 且平均值大于等于阈值的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) | 中等 | 固定窗口计数 | 长度 k 滑动窗口，比较 `sum >= threshold*k` |
| 647 | 95 | [不同的二叉搜索树 II](https://leetcode.cn/problems/unique-binary-search-trees-ii/) | 中等 | 生成所有 BST | 区间递归枚举根 + 记忆化 |
| 648 | 1073 | [负二进制数相加](https://leetcode.cn/problems/adding-two-negabinary-numbers/) | 中等 | base -2 加法 | 逐位相加，`digit=sum&1`，`carry=(sum-digit)/-2` |
| 649 | 721 | [账户合并](https://leetcode.cn/problems/accounts-merge/) | 中等 | 邮箱合并账号 | 并查集按邮箱 union，最后按根分组并排序邮箱 |
| 650 | 327 | [区间和的个数](https://leetcode.cn/problems/count-of-range-sum/) | 困难 | 统计区间和落在范围内的数量 | 前缀和 + 归并分治计数（双指针） |
| 651 | 面试题 16.01 | [交换数字](https://leetcode.cn/problems/swap-numbers-lcci/) | 中等 | 交换数组两个数 | 临时变量交换返回 |
| 652 | 719 | [找出第 k 小的距离对](https://leetcode.cn/problems/find-k-th-smallest-pair-distance/) | 困难 | 数对距离第 k 小 | 排序后二分距离，双指针计数 `<=d` 的对数 |
| 653 | LCP 18 | [早餐组合](https://leetcode.cn/problems/2vYnGI/) | 简单 | 组合数不超过 x | drinks 排序，对每个 staple 二分上界累加取模 |
| 654 | 910 | [最小差值 II](https://leetcode.cn/problems/smallest-range-ii/) | 中等 | 加减 K 后最小差 | 排序枚举分界点，算 newHigh/newLow |
| 655 | 1668 | [最大重复子字符串](https://leetcode.cn/problems/maximum-repeating-substring/) | 简单 | word 连续重复最多次 | 逐次追加 word，判断是否仍是子串 |
| 656 | 299 | [猜数字游戏](https://leetcode.cn/problems/bulls-and-cows/) | 简单 | Bulls/Cows 计数 | 先算 bulls，再对非 bulls 做数字频次 min 求 cows |
| 657 | 313 | [超级丑数](https://leetcode.cn/problems/super-ugly-number/) | 中等 | 第 n 个超级丑数 | DP + 每个质数一个指针，多路归并取最小候选 |
| 658 | 1594 | [矩阵的最大非负积](https://leetcode.cn/problems/maximum-non-negative-product-in-a-matrix/) | 中等 | 最大乘积路径且非负 | 网格 DP 同时维护 max/min 乘积（负数翻转） |
| 659 | 397 | [整数替换](https://leetcode.cn/problems/integer-replacement/) | 中等 | 最少替换到 1 | 贪心：偶数除2；奇数根据 `n&3` 选 +1/-1（特判3） |
| 660 | 1290 | [二进制链表转整数](https://leetcode.cn/problems/convert-binary-number-in-a-linked-list-to-integer/) | 简单 | 二进制链表转十进制 | 遍历 `ans=ans*2+val` |
| 661 | 769 | [最多能完成排序的块](https://leetcode.cn/problems/max-chunks-to-make-sorted/) | 中等 | 排列可切块排序 | 扫描前缀最大值 `mx`，当 `mx==i` 可切一块 |
| 662 | 面试题 02.04 | [分割链表](https://leetcode.cn/problems/partition-list-lcci/) | 中等 | 稳定分割链表 | 两条链表（<x 与 >=x）收集后拼接 |
| 663 | 853 | [车队](https://leetcode.cn/problems/car-fleet/) | 中等 | 车队数量 | 按位置降序扫到达时间，时间变大开新队 |
| 664 | 275 | [H指数 II](https://leetcode.cn/problems/h-index-ii/) | 中等 | H 指数（二分） | 二分 h：检查 `citations[n-h] >= h` |
| 665 | 357 | [计算各个位数不同的数字个数](https://leetcode.cn/problems/count-numbers-with-unique-digits/) | 中等 | 计数无重复数字 | 组合计数：`9*9*8*...` 累加到 n（最多 10 位） |
| 666 | 736 | [Lisp 语法解析](https://leetcode.cn/problems/parse-lisp-expression/) | 困难 | 解析/求值表达式 | 递归求值 + 作用域栈；顶层按空格拆 token（忽略嵌套括号） |
| 667 | 477 | [汉明距离总和](https://leetcode.cn/problems/total-hamming-distance/) | 中等 | 所有数对汉明距离和 | 按位统计：贡献 `ones*(n-ones)` |
| 668 | 610 | [判断三角形](https://leetcode.cn/problems/triangle-judgement/) | 简单 | 三角形判定 | 判断三组“两边和 > 第三边” |
| 669 | 940 | [不同的子序列 II](https://leetcode.cn/problems/distinct-subsequences-ii/) | 困难 | 不同非空子序列数 | DP：`new=2*dp-last[c]`，答案 `dp-1` |
| 670 | 784 | [字母大小写全排列](https://leetcode.cn/problems/letter-case-permutation/) | 简单 | 字母大小写枚举 | 回溯：字母两分支、数字不分叉 |
| 671 | 面试题 17.08 | [马戏团人塔](https://leetcode.cn/problems/circus-tower-lcci/) | 中等 | 叠人塔最大人数 | 排序（同高体重降序）+ 体重 LIS |
| 672 | 1360 | [日期之间隔几天](https://leetcode.cn/problems/number-of-days-between-two-dates/) | 简单 | 日期差天数 | 日期转“从 1971-01-01 起的天数”再做差 |
| 673 | 1367 | [二叉树中的列表](https://leetcode.cn/problems/linked-list-in-binary-tree/) | 中等 | 链表是否为树路径 | 遍历树找起点 + 向下匹配 |
| 674 | 1263 | [推箱子](https://leetcode.cn/problems/minimum-moves-to-move-a-box-to-their-target-location/) | 困难 | 最少推箱次数 | BFS 按推箱次数；推前先 BFS 判玩家可达背后格 |
| 675 | 298 | [二叉树最长连续序列](https://leetcode.cn/problems/binary-tree-longest-consecutive-sequence/) | 中等 | 父子连续+1最长链 | DFS 返回单链长度，命中 `child==cur+1` 则接上 |
| 676 | 423 | [从英文中重建数字](https://leetcode.cn/problems/reconstruct-original-digits-from-english/) | 中等 | 英文乱序还原数字 | 计数：先用唯一字母定 0/2/4/6/8，再扣除推其余 |
| 677 | 1135 | [最低成本联通所有城市](https://leetcode.cn/problems/connecting-cities-with-minimum-cost/) | 中等 | 最小联通成本 | Kruskal 最小生成树 + 并查集 |
| 678 | 859 | [亲密字符串](https://leetcode.cn/problems/buddy-strings/) | 简单 | 一次交换能否相等 | 相等看是否有重复字母；不等看是否恰好两处错位可交叉 |
| 679 | 1116 | [打印零与奇偶数](https://leetcode.cn/problems/print-zero-even-odd/) | 中等 | 并发按序打印 | 三信号量：zero 控节奏，奇偶线程打印后唤醒 zero |
| 680 | 1087 | [字母切换](https://leetcode.cn/problems/brace-expansion/) | 中等 | 花括号展开 | 解析分段选项 + 回溯做笛卡尔积（选项排序保证字典序） |
| 681 | 388 | [文件的最长绝对路径](https://leetcode.cn/problems/longest-absolute-file-path/) | 中等 | 解析文件系统字符串求最长文件路径 | 逐行按层级更新路径长度数组 |
| 682 | 1008 | [先序遍历构造二叉树](https://leetcode.cn/problems/construct-binary-search-tree-from-preorder-traversal/) | 中等 | 由先序构造 BST | 递归 + 上界 bound，线性构造 |
| 683 | 812 | [最大三角形面积](https://leetcode.cn/problems/largest-triangle-area/) | 简单 | 三点最大面积 | 暴力枚举三点 + 叉积 |
| 684 | 面试题 02.08 | [环路检测](https://leetcode.cn/problems/linked-list-cycle-lcci/) | 中等 | 找链表入环点 | Floyd 快慢指针 |
| 685 | 1488 | [避免洪水泛滥](https://leetcode.cn/problems/avoid-flood-in-the-city/) | 中等 | 安排抽干避免湖泊重复下雨 | lastRain + TreeSet 选晴天抽指定湖 |
| 686 | 244 | [最短单词距离 II](https://leetcode.cn/problems/shortest-word-distance-ii/) | 中等 | 多次查询两词最短距离 | 预处理下标列表 + 双指针 |
| 687 | 631 | [设计 Excel 求和公式](https://leetcode.cn/problems/design-excel-sum-formula/) | 困难 | 支持 set/get/sum 的表格 | 保存公式依赖，get 递归求值 |
| 688 | 850 | [矩形面积 II](https://leetcode.cn/problems/rectangle-area-ii/) | 困难 | 多矩形并集面积（取模） | 扫描线 + 线段树（y 离散化） |
| 689 | 795 | [区间子数组个数](https://leetcode.cn/problems/number-of-subarrays-with-bounded-maximum/) | 中等 | 最大值落在 [L,R] 的子数组数 | atMost(R) - atMost(L-1) |
| 690 | 1365 | [有多少小于当前数字的数字](https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/) | 简单 | 每个数比它小的个数 | 计数排序 + 前缀和 |
| 691 | 1248 | [统计「优美子数组」](https://leetcode.cn/problems/count-number-of-nice-subarrays/) | 中等 | 恰好 k 个奇数的子数组数 | 前缀奇数计数 + 频次累加 |
| 692 | 1020 | [飞地的数量](https://leetcode.cn/problems/number-of-enclaves/) | 中等 | 不连边界的陆地数量 | 边界 flood fill 后计数 |
| 693 | 901 | [股票价格跨度](https://leetcode.cn/problems/online-stock-span/) | 中等 | 在线求跨度 | 单调栈（price+span） |
| 694 | 589 | [N叉树的前序遍历](https://leetcode.cn/problems/n-ary-tree-preorder-traversal/) | 简单 | N 叉树前序 | 栈迭代（子节点逆序入栈） |
| 695 | 1373 | [二叉搜索子树的最大键值和](https://leetcode.cn/problems/maximum-sum-bst-in-binary-tree/) | 困难 | 子树为 BST 时的最大节点和 | 后序返回 isBST/min/max/sum |
| 696 | 1186 | [删除一次得到子数组最大和](https://leetcode.cn/problems/maximum-subarray-sum-with-one-deletion/) | 中等 | 最多删 1 个元素的最大子数组和 | DP：keep / del |
| 697 | 184 | [部门工资最高的员工](https://leetcode.cn/problems/department-highest-salary/) | 中等 | 每个部门最高薪员工 | 先求部门 maxSalary 再 join |
| 698 | 1400 | [构造 K 个回文字符串](https://leetcode.cn/problems/construct-k-palindrome-strings/) | 中等 | 能否分成 k 个回文串 | oddCount <= k 且 k<=n |
| 699 | 1226 | [哲学家进餐](https://leetcode.cn/problems/the-dining-philosophers/) | 中等 | 并发无死锁进餐 | Semaphore 限流 + 叉子按序加锁 |
| 700 | 1464 | [数组中两元素的最大乘积](https://leetcode.cn/problems/maximum-product-of-two-elements-in-an-array/) | 简单 | 最大 \((a-1)(b-1)\) | 找最大与次大 |
| 701 | 1000 | [合并石头的最低成本](https://leetcode.cn/problems/minimum-cost-to-merge-stones/) | 困难 | K 路合并最小代价 | 区间 DP + 前缀和（按 K-1 步长分割） |
| 702 | 338 | [比特位计数](https://leetcode.cn/problems/counting-bits/) | 中等 | 0..n 每个数的 1 个数 | dp[i]=dp[i>>1]+(i&1) |
| 703 | 面试题 17.18 | [最短超串](https://leetcode.cn/problems/shortest-supersequence-lcci/) | 中等 | 最短覆盖子数组 | 滑动窗口（覆盖 small） |
| 704 | 1041 | [困于环中的机器人](https://leetcode.cn/problems/robot-bounded-in-circle/) | 中等 | 判断是否会回到圈内 | 模拟一轮：回原点或朝向改变 |
| 705 | 751 | [IP 到 CIDR](https://leetcode.cn/problems/ip-to-cidr/) | 简单 | IP 段拆 CIDR | 位运算 lowbit + 贪心取最大块 |
| 706 | 461 | [汉明距离](https://leetcode.cn/problems/hamming-distance/) | 简单 | 两数二进制不同位数 | xor 后 bitCount |
| 707 | 277 | [搜寻名人](https://leetcode.cn/problems/find-the-celebrity/) | 中等 | 找“被所有人认识且不认识任何人” | 候选淘汰 + 验证 |
| 708 | 176 | [第二高的薪水](https://leetcode.cn/problems/second-highest-salary/) | 简单 | 去重后第 2 大 | 一次遍历维护 first/second |
| 709 | 575 | [分糖果](https://leetcode.cn/problems/distribute-candies/) | 简单 | 最多不同种类 | min(去重种类数, n/2) |
| 710 | 945 | [使数组唯一的最小增量](https://leetcode.cn/problems/minimum-increment-to-make-array-unique/) | 中等 | 最少加一使元素全不同 | 排序 + 贪心拉到 prev+1 |
| 711 | 180 | [连续出现的数字](https://leetcode.cn/problems/consecutive-numbers/) | 中等 | 连续 3 次同 num | 扫描 run-length 去重输出 |
| 712 | 1219 | [黄金矿工](https://leetcode.cn/problems/path-with-maximum-gold/) | 中等 | 网格最大路径和（不可重复走） | 回溯 DFS（走过置 0） |
| 713 | 712 | [两个字符串的最小ASCII删除和](https://leetcode.cn/problems/minimum-ascii-delete-sum-for-two-strings/) | 中等 | 两串删到相等最小代价 | 双串 DP（后缀最小删除和） |
| 714 | 430 | [扁平化多级双向链表](https://leetcode.cn/problems/flatten-a-multilevel-doubly-linked-list/) | 中等 | child 链表插入 next 位置 | DFS 返回 tail 便于拼接 |
| 715 | 1267 | [统计参与通信的服务器](https://leetcode.cn/problems/count-servers-that-communicate/) | 中等 | 行/列至少有 2 台才通信 | 统计行列计数后筛 |
| 716 | 面试题 17.19 | [消失的两个数字](https://leetcode.cn/problems/missing-two-lcci/) | 困难 | 1..n 缺 2 个数 | 异或拆分（lowbit 分组） |
| 717 | 1231 | [分享巧克力](https://leetcode.cn/problems/divide-chocolate/) | 困难 | 最大化最小甜度 | 二分答案 + 贪心切段 |
| 718 | 38 | [外观数列](https://leetcode.cn/problems/count-and-say/) | 简单 | RLE 迭代生成 | 计数连续字符构造 |
| 719 | 面试题 01.01 | [判定字符是否唯一](https://leetcode.cn/problems/is-unique-lcci/) | 简单 | 是否有重复字符 | boolean[128] 记录出现 |
| 720 | 186 | [翻转字符串里的单词 II](https://leetcode.cn/problems/reverse-words-in-a-string-ii/) | 中等 | 原地翻转单词顺序 | 先整体反转再逐词反转 |
| 721 | 1090 | [受标签影响的最大值](https://leetcode.cn/problems/largest-values-from-labels/) | 中等 | 选取受标签次数限制的最大和 | 按 value 降序贪心 + label 计数 |
| 722 | 783 | [二叉搜索树节点最小距离](https://leetcode.cn/problems/minimum-distance-between-bst-nodes/) | 简单 | BST 最小相邻差 | 中序遍历记录 prev |
| 723 | 969 | [煎饼排序](https://leetcode.cn/problems/pancake-sorting/) | 中等 | 前缀翻转排序 | 每轮把最大值翻到末尾 |
| 724 | 1099 | [小于 K 的两数之和](https://leetcode.cn/problems/two-sum-less-than-k/) | 简单 | 最大和且 < k | 排序 + 双指针 |
| 725 | 265 | [粉刷房子 II](https://leetcode.cn/problems/paint-house-ii/) | 困难 | 相邻不同色最小代价 | DP 维护上一行最小/次小 |
| 726 | 462 | [最少移动次数使数组元素相等 II](https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-ii/) | 中等 | 最少 +/-1 次数 | 取中位数，累加绝对差 |
| 727 | 960 | [删列造序 III](https://leetcode.cn/problems/delete-columns-to-make-sorted-iii/) | 困难 | 删除最少列使字典序非降 | 列上的 LIS（按所有行可比较） |
| 728 | 面试题 08.13 | [堆箱子](https://leetcode.cn/problems/pile-box-lcci/) | 困难 | 三维严格递增堆叠最高 | 排序 + LIS DP |
| 729 | 1614 | [括号的最大嵌套深度](https://leetcode.cn/problems/maximum-nesting-depth-of-the-parentheses/) | 简单 | 统计最大括号深度 | 扫描计数取 max |
| 730 | 1172 | [餐盘栈](https://leetcode.cn/problems/dinner-plate-stacks/) | 困难 | 多栈 push/pop 规则 | 两个堆 + 懒清理下标 |
| 731 | 707 | [设计链表](https://leetcode.cn/problems/design-linked-list/) | 中等 | 实现链表 API | 单链表 + dummy + size |
| 732 | 1268 | [搜索推荐系统](https://leetcode.cn/problems/search-suggestions-system/) | 中等 | 每个前缀推荐 3 个 | 排序 + lowerBound + 取 3 个 |
| 733 | 353 | [贪吃蛇](https://leetcode.cn/problems/design-snake-game/) | 中等 | 模拟移动/吃食物/碰撞 | 队列蛇身 + HashSet 判重 |
| 734 | 984 | [不含 AAA 或 BBB 的字符串](https://leetcode.cn/problems/string-without-aaa-or-bbb/) | 中等 | 构造无三连字符串 | 贪心：避免末尾两连继续加同字符 |
| 735 | 1124 | [表现良好的最长时间段](https://leetcode.cn/problems/longest-well-performing-interval/) | 中等 | 最长劳累日占优区间 | 前缀和 + 记录最早位置 |
| 736 | 1345 | [跳跃游戏 IV](https://leetcode.cn/problems/jump-game-iv/) | 困难 | 最少跳到末尾 | BFS + 值到下标列表，用后删除 |
| 737 | 1375 | [灯泡开关 III](https://leetcode.cn/problems/bulb-switcher-iii/) | 中等 | 统计全蓝时刻 | 维护 max，max==i+1 计数 |
| 738 | 1483 | [树节点的第 K 个祖先](https://leetcode.cn/problems/kth-ancestor-of-a-tree-node/) | 困难 | 查询 k 级祖先 | 倍增 up 表二进制跳跃 |
| 739 | 754 | [到达终点数字](https://leetcode.cn/problems/reach-a-number/) | 中等 | 最少步到 target | 找最小 k 使 sum>=t 且差为偶数 |
| 740 | 420 | [强密码检验器](https://leetcode.cn/problems/strong-password-checker/) | 困难 | 最少编辑成强密码 | 分类讨论：插入/替换/删除削减三连 |
| 741 | 剑指 Offer 68 - II | [二叉树的最近公共祖先](https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/) | 简单 | 求 LCA | 递归：左右都命中则当前是 LCA，否则返回非空一侧 |
| 742 | 211 | [添加与搜索单词 - 数据结构设计](https://leetcode.cn/problems/design-add-and-search-words-data-structure/) | 中等 | Trie 支持 `.` 通配 | Trie 插入；搜索遇 `.` 就枚举分支递归 |
| 743 | 403 | [青蛙过河](https://leetcode.cn/problems/frog-jump/) | 困难 | 能否到终点 | `pos -> step集合` DP，尝试 `k-1,k,k+1` 扩展 |
| 744 | 1089 | [复写零](https://leetcode.cn/problems/duplicate-zeros/) | 简单 | 原地把 0 复写一次 | 先算虚拟长度，再从右往左写回 |
| 745 | 1240 | [铺瓷砖](https://leetcode.cn/problems/tiling-a-rectangle-with-the-fewest-squares/) | 困难 | 最少正方形铺满矩形 | DFS 状态为每列高度，优先填最低列，放最大正方形剪枝 |
| 746 | 696 | [计数二进制子串](https://leetcode.cn/problems/count-binary-substrings/) | 简单 | 统计 01/10 连续子串 | 统计连续段长度，累加 `min(prev,cur)` |
| 747 | 351 | [安卓系统手势解锁](https://leetcode.cn/problems/android-unlock-patterns/) | 中等 | 统计合法解锁手势数 | 回溯 + `skip` 中间点限制 + 对称性加速 |
| 748 | 432 | [全 O(1) 的数据结构](https://leetcode.cn/problems/all-oone-data-structure/) | 困难 | O(1) 维护计数并取最大最小 key | 双向桶链表（按计数）+ key->桶 哈希映射 |
| 749 | 1208 | [尽可能使字符串相等](https://leetcode.cn/problems/get-equal-substrings-within-budget/) | 中等 | 最长预算内子串 | 滑动窗口维护改动代价和 `<=maxCost` |
| 750 | 1505 | [最多 K 次交换相邻数位后得到的最小整数](https://leetcode.cn/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/) | 困难 | 限制交换次数的最小字典序 | 贪心选最小可前移数字 + 树状数组算需要交换次数 |
| 751 | 991 | [坏了的计算器](https://leetcode.cn/problems/broken-calculator/) | 中等 | 最少操作从 start 到 target | 逆向贪心：target 奇数+1，偶数/2，最后补差 |
| 752 | 面试题 17.07 | [婴儿名字](https://leetcode.cn/problems/baby-names-lcci/) | 中等 | 同义词合并频次 | 并查集合并同义词（字典序小做根）再汇总计数 |
| 753 | 501 | [二叉搜索树中的众数](https://leetcode.cn/problems/find-mode-in-binary-search-tree/) | 简单 | BST 里出现最多的值 | 中序遍历统计连续次数，维护 max 并收集答案 |
| 754 | 剑指 Offer 14- II | [剪绳子 II](https://leetcode.cn/problems/jian-sheng-zi-ii-lcof/) | 中等 | 最大乘积取模 | 贪心尽量切 3（n<=3 返回 n-1），循环乘 3 取模 |
| 755 | 面试题 08.01 | [三步问题](https://leetcode.cn/problems/three-steps-problem-lcci/) | 简单 | 1/2/3 步爬楼梯计数 | DP：`dp[i]=dp[i-1]+dp[i-2]+dp[i-3]` 滚动取模 |
| 756 | 259 | [较小的三数之和](https://leetcode.cn/problems/3sum-smaller/) | 中等 | 统计三元组和 < target | 排序后固定 i，双指针，满足时一次加 `r-l` |
| 757 | 779 | [第K个语法符号](https://leetcode.cn/problems/k-th-symbol-in-grammar/) | 中等 | Kth 符号 | 规律：答案=bitCount(k-1) 的奇偶性 |
| 758 | 413 | [等差数列划分](https://leetcode.cn/problems/arithmetic-slices/) | 中等 | 连续等差子数组个数 | `cur` 记录以 i 结尾的个数，差相同则 `cur++` 并累加 |
| 759 | 827 | [最大人工岛](https://leetcode.cn/problems/making-a-large-island/) | 困难 | 翻转一个 0 的最大岛面积 | 先染色算每岛面积，再对每个 0 合并四邻不同岛 |
| 760 | 1110 | [删点成林](https://leetcode.cn/problems/delete-nodes-and-return-forest/) | 中等 | 删除节点返回森林 | 后序 DFS：删除节点则子节点成新根，否则回接 |
| 761 | 688 | [“马”在棋盘上的概率](https://leetcode.cn/problems/knight-probability-in-chessboard/) | 中等 | K 步后仍在棋盘内的概率 | DP 逐步转移（二维概率） |
| 762 | 1494 | [并行课程 II](https://leetcode.cn/problems/parallel-courses-ii/) | 困难 | 每学期最多选 k 门的最小学期数 | 状压 DP + 枚举可选子集 |
| 763 | 482 | [密钥格式化](https://leetcode.cn/problems/license-key-formatting/) | 简单 | 重排分组并转大写 | 从后往前计数插入 '-' |
| 764 | 剑指 Offer 20 | [表示数值的字符串](https://leetcode.cn/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/) | 中等 | 判断字符串是否为合法数值 | 一次扫描（符号/点/指数） |
| 765 | 396 | [旋转函数](https://leetcode.cn/problems/rotate-function/) | 中等 | 求旋转函数最大值 | 递推：F(k)=F(k-1)+sum-n*moved |
| 766 | 485 | [最大连续1的个数](https://leetcode.cn/problems/max-consecutive-ones/) | 简单 | 最长连续 1 | 一次扫描计数 |
| 767 | 剑指 Offer 68 - I | [二叉搜索树的最近公共祖先](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/) | 简单 | BST 上找 LCA | 利用 BST 性质走一条路 |
| 768 | 542 | [01 矩阵](https://leetcode.cn/problems/01-matrix/) | 中等 | 每个 1 到最近 0 的距离 | 多源 BFS（所有 0 入队） |
| 769 | 383 | [赎金信](https://leetcode.cn/problems/ransom-note/) | 简单 | magazine 是否能拼出 ransomNote | 26 计数消耗 |
| 770 | 面试题 17.05 | [字母与数字](https://leetcode.cn/problems/find-longest-subarray-lcci/) | 中等 | 字母数=数字数的最长子数组 | 前缀差 + 记录最早位置 |
| 771 | 剑指 Offer 32 - I | [从上到下打印二叉树](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/) | 中等 | 层序输出二叉树 | BFS 队列 |
| 772 | 1059 | [从始点到终点的所有路径](https://leetcode.cn/problems/all-paths-from-source-lead-to-destination/) | 中等 | 所有路径都必须到终点且无环 | DFS 三色标记 + 终点出度为 0 |
| 773 | 剑指 Offer 55 - II | [平衡二叉树](https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/) | 简单 | 判断是否高度平衡 | 后序返回高度/ -1 |
| 774 | 799 | [香槟塔](https://leetcode.cn/problems/champagne-tower/) | 中等 | 模拟香槟溢出流动 | DP 溢出向下分流 |
| 775 | 1574 | [删除最短的子数组使剩余数组有序](https://leetcode.cn/problems/shortest-subarray-to-be-removed-to-make-array-sorted/) | 中等 | 删除最短中间段使非递减 | 前后有序段 + 双指针拼接 |
| 776 | 669 | [修剪二叉搜索树](https://leetcode.cn/problems/trim-a-binary-search-tree/) | 简单 | 只保留区间内节点 | 递归利用 BST 性质 |
| 777 | 510 | [二叉搜索树中的中序后继 II](https://leetcode.cn/problems/inorder-successor-in-bst-ii/) | 中等 | 给 parent 指针求中序后继 | 右子树最左 / 向上找转折 |
| 778 | 剑指 Offer 06 | [从尾到头打印链表](https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/) | 简单 | 逆序输出链表值 | 先存入数组再倒序 |
| 779 | 880 | [索引处的解码字符串](https://leetcode.cn/problems/decoded-string-at-index/) | 中等 | 求解码后第 K 个字符 | 先算长度再反推 K |
| 780 | 727 | [最小窗口子序列](https://leetcode.cn/problems/minimum-window-subsequence/) | 困难 | 最短子串包含 t 作为子序列 | DP 记录窗口起点（O(nm)) |
| 781 | 342 | [4的幂](https://leetcode.cn/problems/power-of-four/) | 简单 | 判断是否为 4 的幂 | 位运算：2 的幂且落在奇数位 |
| 782 | 989 | [数组形式的整数加法](https://leetcode.cn/problems/add-to-array-form-of-integer/) | 简单 | 数组表示大整数 + k | 从末位模拟加法 + 进位 |
| 783 | 201 | [数字范围按位与](https://leetcode.cn/problems/bitwise-and-of-numbers-range/) | 中等 | 区间按位与 | 找公共前缀：同时右移直到相等 |
| 784 | 1081 | [不同字符的最小子序列](https://leetcode.cn/problems/smallest-subsequence-of-distinct-characters/) | 中等 | 去重且字典序最小 | 单调栈 + 计数/是否在栈 |
| 785 | 319 | [灯泡开关](https://leetcode.cn/problems/bulb-switcher/) | 中等 | 最终亮灯数量 | 完全平方数个数 \(\lfloor\sqrt{n}\rfloor\) |
| 786 | 1100 | [长度为 K 的无重复字符子串](https://leetcode.cn/problems/find-k-length-substrings-with-no-repeated-characters/) | 中等 | 统计固定长度无重复子串 | 固定窗口 + 频次/dup 计数 |
| 787 | 1154 | [一年中的第几天](https://leetcode.cn/problems/day-of-the-year/) | 简单 | 日期转年内第几天 | 解析 + 月份累加（闰年） |
| 788 | 剑指 Offer 57 | [和为s的两个数字](https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/) | 简单 | 有序数组两数之和 | 双指针 |
| 789 | 847 | [访问所有节点的最短路径](https://leetcode.cn/problems/shortest-path-visiting-all-nodes/) | 困难 | 访问全节点最短步数 | 状态压缩 BFS（node,mask）多源 |
| 790 | 834 | [树中距离之和](https://leetcode.cn/problems/sum-of-distances-in-tree/) | 困难 | 每个点到所有点距离和 | 换根 DP：两次 DFS |
| 791 | 剑指 Offer 64 | [求1+2+…+n](https://leetcode.cn/problems/qiu-12n-lcof/) | 中等 | 不能用循环/条件求和 | 递归 + `&&` 短路 |
| 792 | 1139 | [最大的以 1 为边界的正方形](https://leetcode.cn/problems/largest-1-bordered-square/) | 中等 | 边界全为 1 的最大正方形面积 | 预处理 right/down 连续 1 + 枚举边长 |
| 793 | 面试题 17.22 | [单词转换](https://leetcode.cn/problems/word-transformer-lcci/) | 中等 | 单词最短转换路径 | BFS + 父指针回溯（通配符索引） |
| 794 | 529 | [扫雷游戏](https://leetcode.cn/problems/minesweeper/) | 中等 | 点击后展开棋盘 | DFS/BFS 模拟展开 |
| 795 | 770 | [基本计算器 IV](https://leetcode.cn/problems/basic-calculator-iv/) | 困难 | 代入后输出化简多项式 | 递归下降解析 + 多项式加减乘 |
| 796 | 333 | [最大 BST 子树](https://leetcode.cn/problems/largest-bst-subtree/) | 中等 | 最大 BST 子树节点数 | 后序返回 isBST/min/max/size |
| 797 | 990 | [等式方程的可满足性](https://leetcode.cn/problems/satisfiability-of-equality-equations/) | 中等 | 判断等式/不等式是否矛盾 | 并查集 |
| 798 | 879 | [盈利计划](https://leetcode.cn/problems/profitable-schemes/) | 困难 | 计数满足人数与利润方案 | 0/1 背包 DP（人数×利润） |
| 799 | 931 | [下降路径最小和](https://leetcode.cn/problems/minimum-falling-path-sum/) | 中等 | 下降路径最小和 | DP 一维滚动 |
| 800 | 665 | [非递减数列](https://leetcode.cn/problems/non-decreasing-array/) | 简单 | 至多改 1 次变非递减 | 贪心修复降序点 |
| 801 | 867 | [转置矩阵](https://leetcode.cn/problems/transpose-matrix/) | 简单 | 行列互换 | 直接构造 res[j][i]=a[i][j] |
| 802 | 剑指 Offer 28 | [对称的二叉树](https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/) | 简单 | 判断是否镜像 | 递归比较左右子树镜像 |
| 803 | 81 | [搜索旋转排序数组 II](https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/) | 中等 | 旋转数组查找（有重复） | 二分；遇到 l==m==r 收缩 |
| 804 | 457 | [环形数组循环](https://leetcode.cn/problems/circular-array-loop/) | 中等 | 同方向环检测 | 快慢指针 + 路径置 0 |
| 805 | 637 | [二叉树的层平均值](https://leetcode.cn/problems/average-of-levels-in-binary-tree/) | 简单 | 每层平均值 | BFS 按层求和/计数 |
| 806 | 1356 | [根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/) | 简单 | 按 bitcount 排序 | bitCount 升序，值升序 |
| 807 | 871 | [最低加油次数](https://leetcode.cn/problems/minimum-number-of-refueling-stops/) | 困难 | 最少加油到终点 | 贪心 + 大根堆 |
| 808 | 1299 | [将每个元素替换为右侧最大元素](https://leetcode.cn/problems/replace-elements-with-greatest-element-on-right-side/) | 简单 | 右侧最大值替换 | 从右往左维护最大值 |
| 809 | 剑指 Offer 56 - I | [数组中数字出现的次数](https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/) | 中等 | 找两个只出现一次的数 | 异或 + lowbit 分组 |
| 810 | 278 | [第一个错误的版本](https://leetcode.cn/problems/first-bad-version/) | 简单 | 找第一个 true | 二分边界 |
| 811 | 815 | [公交路线](https://leetcode.cn/problems/bus-routes/) | 困难 | 最少换乘次数 | BFS（站点扩线路）+ visitedRoute |
| 812 | 1411 | [给 N x 3 网格图涂色的方案数](https://leetcode.cn/problems/number-of-ways-to-paint-n-3-grid/) | 困难 | 计数 DP | 两状态 DP（aba/abc） |
| 813 | 362 | [敲击计数器](https://leetcode.cn/problems/design-hit-counter/) | 中等 | 近 5 分钟 hit 次数 | 300 桶循环数组 |
| 814 | 面试题 16.03 | [交点](https://leetcode.cn/problems/intersection-lcci/) | 困难 | 线段交点 | 向量求交点；共线取最小点 |
| 815 | 220 | [存在重复元素 III](https://leetcode.cn/problems/contains-duplicate-iii/) | 中等 | 同时限制差值/距离 | 桶 HashMap（宽度 t+1） |
| 816 | 剑指 Offer 58 - II | [左旋转字符串](https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/) | 简单 | 字符串左旋 n 位 | substring 拼接 |
| 817 | 1201 | [丑数 III](https://leetcode.cn/problems/ugly-number-iii/) | 中等 | 第 n 个可整除数 | 二分 + lcm 容斥计数 |
| 818 | 1526 | [形成目标数组的子数组最少增加次数](https://leetcode.cn/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/) | 困难 | 最少区间加 1 次数 | sum(max(0, diff)) 贪心 |
| 819 | 624 | [数组列表中的最大距离](https://leetcode.cn/problems/maximum-distance-in-arrays/) | 简单 | 选两个数组最大差 | 维护全局 min/max 扫描 |
| 820 | 925 | [长按键入](https://leetcode.cn/problems/long-pressed-name/) | 简单 | 是否为长按结果 | 双指针匹配/跳重复 |
| 821 | 面试题 16.22 | [兰顿蚂蚁](https://leetcode.cn/problems/langtons-ant-lcci/) | 中等 | 模拟 K 步后的棋盘打印 | HashSet 存黑格 + 模拟，最后按边界输出 |
| 822 | 1512 | [好数对的数目](https://leetcode.cn/problems/number-of-good-pairs/) | 简单 | 统计相等元素对数 | 频次计数：累加历史出现次数 |
| 823 | 1401 | [圆和矩形是否有重叠](https://leetcode.cn/problems/circle-and-rectangle-overlapping/) | 中等 | 圆与轴对齐矩形相交判断 | 圆心到矩形最近点距离 <= r |
| 824 | 568 | [最大休假天数](https://leetcode.cn/problems/maximum-vacation-days/) | 困难 | 飞行+每周休假最大值 | 按周 DP：from->to 转移取 max |
| 825 | 1298 | [你能从盒子里获得的最大糖果数](https://leetcode.cn/problems/maximum-candies-you-can-get-from-boxes/) | 困难 | 盒子/钥匙/包含关系收集糖果 | BFS：可开盒入队，开盒拿钥匙和新盒 |
| 826 | 1561 | [你可以获得的最大硬币数目](https://leetcode.cn/problems/maximum-number-of-coins-you-can-get/) | 中等 | 三人轮流取堆的最大收益 | 排序 + 双指针，每轮取次大 |
| 827 | 1062 | [最长重复子串](https://leetcode.cn/problems/longest-repeating-substring/) | 中等 | 最长出现 ≥2 次的子串长度 | DP 求 s 与自身最长公共子串（位置不同） |
| 828 | 1382 | [将二叉搜索树变平衡](https://leetcode.cn/problems/balance-a-binary-search-tree/) | 中等 | 让 BST 高度平衡 | 中序转有序数组 + 二分建树 |
| 829 | 1034 | [边框着色](https://leetcode.cn/problems/coloring-a-border/) | 中等 | 连通块边界染色 | BFS 找连通块，判边界后统一改色 |
| 830 | 606 | [根据二叉树创建字符串](https://leetcode.cn/problems/construct-string-from-binary-tree/) | 简单 | 前序 + 括号规则构造字符串 | 递归：右存在时左空要补 "()" |
| 831 | 471 | [编码最短长度的字符串](https://leetcode.cn/problems/encode-string-with-shortest-length/) | 困难 | 最短 k[pattern] 编码 | 区间 DP：切分 + 检测重复模式 |
| 832 | 87 | [扰乱字符串](https://leetcode.cn/problems/scramble-string/) | 困难 | 递归切分交换判断等价 | 记忆化 DFS + 字符计数剪枝 |
| 833 | 920 | [播放列表的数量](https://leetcode.cn/problems/number-of-music-playlists/) | 困难 | 满足间隔 k 的播放列表计数 | DP：加新歌/加旧歌（受 k 限制） |
| 834 | 464 | [我能赢吗](https://leetcode.cn/problems/can-i-win/) | 中等 | 轮流取数达标博弈 | 状压 DFS + 记忆化 |
| 835 | 1093 | [大样本统计](https://leetcode.cn/problems/statistics-from-a-large-sample/) | 中等 | 从计数数组求五数统计 | 一次扫 min/max/mean/mode + 累计找中位数 |
| 836 | LCP 12 | [小张刷题计划](https://leetcode.cn/problems/xiao-zhang-shua-ti-ji-hua/) | 中等 | 连续分段，日内可“免做最长题”一次 | 二分最大日耗时 + 贪心 check |
| 837 | 371 | [两整数之和](https://leetcode.cn/problems/sum-of-two-integers/) | 简单 | 不用 + - 求和 | 异或求和 + 与运算求进位循环 |
| 838 | 953 | [验证外星语词典](https://leetcode.cn/problems/verifying-an-alien-dictionary/) | 简单 | 自定义字母序比较单词序列 | rank 映射 + 逐对比较 |
| 839 | 面试题 16.02 | [单词频率](https://leetcode.cn/problems/words-frequency-lcci/) | 中等 | 设计词频查询类 | HashMap 预统计，get O(1) |
| 840 | 1191 | [K 次串联后最大子数组之和](https://leetcode.cn/problems/k-concatenation-maximum-sum/) | 中等 | k 次拼接后的最大子数组和 | Kadane + 前后缀 + 总和分类讨论 |
| 841 | 185 | [部门工资前三高的所有员工](https://leetcode.cn/problems/department-top-three-salaries/) | 困难 | 每部门 Top3 工资 | DENSE_RANK 分组排序后取 rk<=3 |
| 842 | 1644 | [二叉树的最近公共祖先 II](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-ii/) | 中等 | LCA（节点可能不存在） | 递归求 LCA 同时统计命中 p/q，命中不足返回 null |
| 843 | 1650 | [二叉树的最近公共祖先 III](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-iii/) | 中等 | 带 parent 的 LCA | 双指针走父链，类似相交链表 |
| 844 | 1676 | [Lowest Common Ancestor of a Binary Tree IV](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-iv/) | 中等 | 多节点 LCA | HashSet 存目标节点，递归：左右都命中则当前为 LCA |
| 845 | 1372 | [二叉树中的最长交错路径](https://leetcode.cn/problems/longest-zigzag-path-in-a-binary-tree/) | 中等 | 最长 ZigZag 路径 | DFS 传入上一步方向与长度，转向+1，同向重置 |
| 846 | 787 | [K 站中转内最便宜的航班](https://leetcode.cn/problems/cheapest-flights-within-k-stops/) | 中等 | 限制中转次数的最短路 | Bellman-Ford 思想：迭代 k+1 轮松弛 |
| 847 | 1236 | [网络爬虫](https://leetcode.cn/problems/web-crawler/) | 中等 | 同域名爬取所有页面 | BFS/DFS + visited 去重 + host 过滤 |
| 848 | 1417 | [重新格式化字符串](https://leetcode.cn/problems/reformat-the-string/) | 简单 | 字母数字交替排列 | 分离两类后从数量多的一类开始交替拼接 |
| 849 | 1386 | [安排电影院座位](https://leetcode.cn/problems/cinema-seat-allocation/) | 中等 | 每排最多坐几组 4 人 | 位掩码表示占用，只判断 2-9 三个可放区间 |
| 850 | 335 | [路径交叉](https://leetcode.cn/problems/self-crossing/) | 困难 | 判断路径是否自交 | O(1) 规则检查与 i-3/i-4/i-5 边相交 |
| 851 | 535 | [TinyURL 的加密与解密](https://leetcode.cn/problems/encode-and-decode-tinyurl/) | 中等 | URL 映射短码 | 自增 id 转 base62 + 双向哈希表 |
| 852 | 1553 | [吃掉 N 个橘子的最少天数](https://leetcode.cn/problems/minimum-number-of-days-to-eat-n-oranges/) | 困难 | 最少天数吃完 | 记忆化：`1+min(n%2+f(n/2), n%3+f(n/3))` |
| 853 | 1118 | [一月有多少天](https://leetcode.cn/problems/number-of-days-in-a-month/) | 简单 | 返回某月天数 | 闰年判断 + 月份分类 |
| 854 | 1671 | [得到山形数组的最少删除次数](https://leetcode.cn/problems/minimum-number-of-removals-to-make-mountain-array/) | 困难 | 最少删除成山形 | LIS 左 + LIS(反转) 得到右，取最大山形长度 |
| 855 | 1408 | [数组中的字符串匹配](https://leetcode.cn/problems/string-matching-in-an-array/) | 简单 | 找出是别的字符串子串的词 | 双重循环 contains 判断 |
| 856 | 1492 | [n 的第 k 个因子](https://leetcode.cn/problems/the-kth-factor-of-n/) | 中等 | 第 k 个因子 | 枚举到 sqrt，先消耗小因子，再从大因子表取 |
| 857 | 157 | [用 Read4 读取 N 个字符](https://leetcode.cn/problems/read-n-characters-given-read4/) | 简单 | 读取 n 个字符 | 循环 read4 到满/到 0 |
| 858 | 833 | [字符串中的查找与替换](https://leetcode.cn/problems/find-and-replace-in-string/) | 中等 | 同时替换多个位置 | 预处理可替换起点，扫描构造结果 |
| 859 | 823 | [带因子的二叉树](https://leetcode.cn/problems/binary-trees-with-factors/) | 中等 | 因子组成的树数量 | 排序 + DP：`dp[x]+=dp[a]*dp[b]` 取模 |
| 860 | 1242 | [多线程网页爬虫](https://leetcode.cn/problems/web-crawler-multithreaded/) | 中等 | 多线程爬同域 URL | 线程池 + 并发 visited + active 计数等任务结束 |
| 861 | 246 | [中心对称数](https://leetcode.cn/problems/strobogrammatic-number/) | 简单 | 判断旋转 180° 是否不变 | 双指针 + 映射校验 |
| 862 | 447 | [回旋镖的数量](https://leetcode.cn/problems/number-of-boomerangs/) | 简单 | 统计等距有序点对数量 | 固定点按距离分组计数 |
| 863 | 630 | [课程表 III](https://leetcode.cn/problems/course-schedule-iii/) | 困难 | 最多能上多少门课 | 按截止时间排序 + 大根堆贪心 |
| 864 | 874 | [模拟行走机器人](https://leetcode.cn/problems/walking-robot-simulation/) | 简单 | 按指令走格子并避障 | 方向模拟 + 障碍哈希 |
| 865 | 1126 | [查询活跃业务](https://leetcode.cn/problems/active-businesses/) | 中等 | 找出“至少两类事件高于均值”的业务 | 先算均值再分组 HAVING |
| 866 | 1485 | [按日期分组销售产品](https://leetcode.cn/problems/group-sold-products-by-the-date/) | 简单 | 按日期统计并拼接产品 | GROUP BY + COUNT DISTINCT + GROUP_CONCAT |
| 867 | 497 | [非重叠矩形中的随机点](https://leetcode.cn/problems/random-point-in-non-overlapping-rectangles/) | 中等 | 按面积均匀随机整点 | 前缀和加权随机 + 二分 |
| 868 | 1482 | [制作 m 束花所需的最少天数](https://leetcode.cn/problems/minimum-number-of-days-to-make-m-bouquets/) | 中等 | 最小天数满足制作条件 | 二分答案 + 贪心校验 |
| 869 | 1071 | [字符串的最大公因子](https://leetcode.cn/problems/greatest-common-divisor-of-strings/) | 简单 | 最大公共基串 | 拼接一致性 + 长度 gcd |
| 870 | 1431 | [拥有最多糖果的孩子](https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/) | 简单 | 每个孩子加额外糖果是否能到最大 | 先求 max 再判断 |
| 871 | 732 | [我的日程安排表 III](https://leetcode.cn/problems/my-calendar-iii/) | 困难 | 返回最大重叠预订数 | 扫描线差分 TreeMap |
| 872 | 1636 | [按照频率将数组升序排序](https://leetcode.cn/problems/sort-array-by-increasing-frequency/) | 简单 | 频率升序、数值降序排序 | 计数 + 自定义比较器 |
| 873 | 1250 | [检查「好数组」](https://leetcode.cn/problems/check-if-it-is-a-good-array/) | 困难 | 是否能线性组合得到 1 | gcd(nums)==1（裴蜀定理） |
| 874 | 286 | [墙与门](https://leetcode.cn/problems/walls-and-gates/) | 中等 | 房间到最近门的最短距离 | 多源 BFS（所有门入队） |
| 875 | 1590 | [使数组和能被 P 整除](https://leetcode.cn/problems/make-sum-divisible-by-p/) | 中等 | 删除最短子数组使总和可整除 | 前缀模 + 哈希表 |
| 876 | 1200 | [最小绝对差](https://leetcode.cn/problems/minimum-absolute-difference/) | 简单 | 找所有最小差的相邻对 | 排序后扫描 |
| 877 | 1640 | [能否连接形成数组](https://leetcode.cn/problems/check-array-formation-through-concatenation/) | 简单 | pieces 能否拼成 arr | 首元素映射 + 顺序匹配 |
| 878 | 面试题 16.18 | [模式匹配](https://leetcode.cn/problems/pattern-matching-lcci/) | 中等 | a/b 映射子串是否能匹配 | 枚举 lenA 推 lenB + 比对 |
| 879 | 1234 | [替换子串得到平衡字符串](https://leetcode.cn/problems/replace-the-substring-for-balanced-string/) | 中等 | 最短替换窗口使 QWER 平衡 | 滑动窗口让窗口外满足 |
| 880 | 1177 | [构建回文串检测](https://leetcode.cn/problems/can-make-palindrome-from-substring/) | 中等 | 区间能否在 k 次替换内成回文 | 前缀奇偶 mask + odd/2 <= k |
| 881 | 1064 | [不动点](https://leetcode.cn/problems/fixed-point/) | 简单 | 找最小 i 使 arr[i]=i | 二分查找边界 |
| 882 | 982 | [按位与为零的三元组](https://leetcode.cn/problems/triples-with-bitwise-and-equal-to-zero/) | 困难 | 统计 a&b&c==0 的三元组 | 预处理两两 AND 计数 + 枚举第三个数 |
| 883 | 1163 | [按字典序排在最后的子串](https://leetcode.cn/problems/last-substring-in-lexicographical-order/) | 困难 | 找字典序最大的子串 | 双指针找最大后缀（线性） |
| 884 | 1472 | [设计浏览器历史记录](https://leetcode.cn/problems/design-browser-history/) | 中等 | visit/back/forward | 数组 + `cur/end` 指针截断前进历史 |
| 885 | 1170 | [比较字符串最小字母出现频次](https://leetcode.cn/problems/compare-strings-by-frequency-of-the-smallest-character/) | 简单 | 比较 f(query) 与 f(words) | words 频次排序 + 二分 upperBound |
| 886 | 1239 | [串联字符串的最大长度](https://leetcode.cn/problems/maximum-length-of-a-concatenated-string-with-unique-characters/) | 中等 | 拼接后字符全唯一的最大长度 | 回溯 + bitmask 剪枝 |
| 887 | 1006 | [笨阶乘](https://leetcode.cn/problems/clumsy-factorial/) | 中等 | 特殊运算阶乘 | 找规律：n<=4 特判，其余看 n%4 |
| 888 | 1396 | [设计地铁系统](https://leetcode.cn/problems/design-underground-system/) | 中等 | 统计线路平均耗时 | inMap + route 聚合（total/count） |
| 889 | 1624 | [两个相同字符之间的最长子字符串](https://leetcode.cn/problems/largest-substring-between-two-equal-characters/) | 简单 | 两端相同的最大夹心长度 | 记录首次出现位置 |
| 890 | 1648 | [销售价值减少的颜色球](https://leetcode.cn/problems/sell-diminishing-valued-colored-balls/) | 中等 | 最大收益卖球 | 贪心按层卖 + 等差求和 |
| 891 | 1010 | [总持续时间可被 60 整除的歌曲](https://leetcode.cn/problems/pairs-of-songs-with-total-durations-divisible-by-60/) | 简单 | 统计和为 60 倍数的对数 | 余数计数：`need=(60-r)%60` |
| 892 | 1105 | [填充书架](https://leetcode.cn/problems/filling-bookcase-shelves/) | 中等 | 书架最小总高度 | DP：枚举最后一层起点 |
| 893 | 1103 | [分糖果 II](https://leetcode.cn/problems/distribute-candies-to-people/) | 简单 | 依次发 1,2,3... 糖果 | 直接模拟 |
| 894 | 978 | [最长湍流子数组](https://leetcode.cn/problems/longest-turbulent-subarray/) | 中等 | 相邻大小交替的最长子数组 | up/down 动态维护 |
| 895 | 1473 | [给房子涂色 III](https://leetcode.cn/problems/paint-house-iii/) | 困难 | 最小成本且街区数为 target | DP：位置/颜色/街区数（滚动数组） |
| 896 | 655 | [输出二叉树](https://leetcode.cn/problems/print-binary-tree/) | 中等 | 把树打印成矩阵 | 先求高度定宽度，再区间中点递归填值 |
| 897 | 368 | [最大整除子集](https://leetcode.cn/problems/largest-divisible-subset/) | 中等 | 最大整除集合 | 排序 + DP + 前驱回溯 |
| 898 | 370 | [区间加法](https://leetcode.cn/problems/range-addition/) | 中等 | 多次区间加值 | 差分数组 + 前缀和 |
| 899 | 1551 | [使数组中所有元素相等的最小操作数](https://leetcode.cn/problems/minimum-operations-to-make-array-equal/) | 中等 | 奇数数组变相等最少操作 | 数学：floor(n^2/4) |
| 900 | 453 | [最小移动次数使数组元素相等](https://leetcode.cn/problems/minimum-moves-to-equal-array-elements/) | 简单 | n-1 个+1 的最少次数 | 转化：对齐到最小值，sum-min*n |
| 901 | 944 | [删列造序](https://leetcode.cn/problems/delete-columns-to-make-sorted/) | 简单 | 删掉破坏排序的列 | 逐列检查相邻行是否非降 |
| 902 | 803 | [打砖块](https://leetcode.cn/problems/bricks-falling-when-hit/) | 困难 | 打砖后掉落数量 | 反向处理 + 并查集 + 虚拟 top |
| 903 | 1202 | [交换字符串中的元素](https://leetcode.cn/problems/smallest-string-with-swaps/) | 中等 | 最小字典序重排 | 并查集分组，组内下标/字符排序回填 |
| 904 | 1489 | [找到最小生成树里的关键边和伪关键边](https://leetcode.cn/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/) | 困难 | MST 边分类 | Kruskal 求 base；对每边做 skip/pick 对比 |
| 905 | 1319 | [连通网络的操作次数](https://leetcode.cn/problems/number-of-operations-to-make-network-connected/) | 中等 | 最少操作连通 | 边数不足直接 -1；并查集分量-1 |
| 906 | 778 | [水位上升的泳池中游泳](https://leetcode.cn/problems/swim-in-rising-water/) | 困难 | 最小时间到终点 | Dijkstra：路径代价=max(经过高度) 最小 |
| 907 | 995 | [K 连续位的最小翻转次数](https://leetcode.cn/problems/minimum-number-of-k-consecutive-bit-flips/) | 困难 | 最少区间翻转 | 贪心 + 翻转奇偶滑窗 |
| 908 | 1588 | [所有奇数长度子数组的和](https://leetcode.cn/problems/sum-of-all-odd-length-subarrays/) | 简单 | 统计奇数长度子数组和 | 贡献法：每个元素出现的奇数次数 |
| 909 | 170 | [两数之和 III - 数据结构设计](https://leetcode.cn/problems/two-sum-iii-data-structure-design/) | 简单 | 数据结构 add/find | HashMap 计数；find 遍历 key |
| 910 | 1310 | [子数组异或查询](https://leetcode.cn/problems/xor-queries-of-a-subarray/) | 中等 | 多次区间 xor | 前缀异或 |
| 911 | 1442 | [形成两个异或相等数组的三元组数目](https://leetcode.cn/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/) | 中等 | 统计三元组 | 前缀异或 + 频次/下标和哈希 |
| 912 | 1012 | [至少有 1 位重复的数字](https://leetcode.cn/problems/numbers-with-repeated-digits/) | 困难 | 统计有重复数字的数 | 反向数不重复数量（排列计数） |
| 913 | 1043 | [分隔数组以得到最大和](https://leetcode.cn/problems/partition-array-for-maximum-sum/) | 中等 | 分段最大化 | dp[i]=max(dp[i-l]+max*l) |
| 914 | 1610 | [可见点的最大数目](https://leetcode.cn/problems/maximum-number-of-visible-points/) | 困难 | 角度内最多点 | atan2 排序 + 复制 + 滑窗 |
| 915 | 1052 | [爱生气的书店老板](https://leetcode.cn/problems/grumpy-bookstore-owner/) | 中等 | 最大满意人数 | base + 固定窗口增益最大化 |
| 916 | 644 | [最大平均子段和 II](https://leetcode.cn/problems/maximum-average-subarray-ii/) | 困难 | 长度≥k 最大平均 | 二分平均 + 前缀最小值判定 |
| 917 | 1178 | [猜字谜](https://leetcode.cn/problems/number-of-valid-words-for-each-puzzle/) | 困难 | 每个谜面有效单词数 | bitmask 计数 + 子集枚举（含首字母） |
| 918 | 363 | [矩形区域不超过 K 的最大数值和](https://leetcode.cn/problems/max-sum-of-rectangle-no-larger-than-k/) | 困难 | 二维最大子矩形≤k | 压缩成一维 + TreeSet 前缀 |
| 919 | 1046 | [最后一块石头的重量](https://leetcode.cn/problems/last-stone-weight/) | 简单 | 碰撞模拟 | 大根堆反复取两块 |
| 920 | 1575 | [统计所有可行路径](https://leetcode.cn/problems/count-all-possible-routes/) | 困难 | 路径数计数 | 记忆化 DFS(pos,fuel) |
| 921 | 576 | [出界的路径数](https://leetcode.cn/problems/out-of-boundary-paths/) | 中等 | 网格内走步出界计数 | DP 按步数滚动，出界累加 |
| 922 | 1289 | [下降路径最小和  II](https://leetcode.cn/problems/minimum-falling-path-sum-ii/) | 困难 | 不能选同列的最小下降路径和 | DP：上一行最小/次小优化 |
| 923 | 1301 | [最大得分的路径数目](https://leetcode.cn/problems/number-of-paths-with-max-score/) | 困难 | 最大得分与方案数 | DP 同时维护 best + ways |
| 924 | 1449 | [数位成本和为目标值的最大数字](https://leetcode.cn/problems/form-largest-integer-with-digits-that-add-up-to-target/) | 困难 | 成本和为 target 的最大数字 | 完全背包 dp[t] 最大位数 + 贪心回溯 |
| 925 | 1631 | [最小体力消耗路径](https://leetcode.cn/problems/path-with-minimum-effort/) | 中等 | 最小化路径上的最大高度差 | Dijkstra：dist=最小可能最大边权 |
| 926 | 1334 | [阈值距离内邻居最少的城市](https://leetcode.cn/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/) | 中等 | 阈值内可达邻居最少（并列取大） | Floyd 全源最短路后计数 |
| 927 | 634 | [寻找数组的错位排列](https://leetcode.cn/problems/find-the-derangement-of-an-array/) | 中等 | 错位排列数 | DP：`dp[n]=(n-1)(dp[n-1]+dp[n-2])` |
| 928 | 828 | [统计子串中的唯一字符](https://leetcode.cn/problems/count-unique-characters-of-all-substrings-of-a-given-string/) | 困难 | 所有子串的唯一字符贡献和 | 按字符贡献 `(i-prev)*(next-i)` |
| 929 | 面试题 01.09 | [字符串轮转](https://leetcode.cn/problems/string-rotation-lcci/) | 简单 | 判断旋转字符串 | `s1+s1` 包含 `s2` |
| 930 | 645 | [错误的集合](https://leetcode.cn/problems/set-mismatch/) | 简单 | 找重复数和缺失数 | 计数/标记一次扫描 |
| 931 | 502 | [IPO](https://leetcode.cn/problems/ipo/) | 困难 | 做最多 k 个项目最大资金 | capital 排序 + 利润大根堆 |
| 932 | 面试题 04.05 | [合法二叉搜索树](https://leetcode.cn/problems/legal-binary-search-tree-lcci/) | 中等 | 判断 BST | 中序遍历严格递增 |
| 933 | 937 | [重新排列日志文件](https://leetcode.cn/problems/reorder-data-in-log-files/) | 简单 | 字母日志排序 + 数字日志保序 | 自定义比较器排序 |
| 934 | 1381 | [设计一个支持增量操作的栈](https://leetcode.cn/problems/design-a-stack-with-increment-operation/) | 中等 | 栈底 k 个元素增量 | 差分 inc 延迟下传 |
| 935 | 1204 | [最后一个能进入电梯的人](https://leetcode.cn/problems/last-person-to-fit-in-the-elevator/) | 中等 | 最后一个累计重量不超 1000 | SQL：窗口函数前缀和 |
| 936 | 面试题 10.01 | [合并排序的数组](https://leetcode.cn/problems/sorted-merge-lcci/) | 简单 | 合并两个有序数组到 A | 从后往前双指针 |
| 937 | 1292 | [元素和小于等于阈值的正方形的最大边长](https://leetcode.cn/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/) | 中等 | 最大边长满足正方形和 <= threshold | 二维前缀和 + 二分边长 |
| 938 | 163 | [缺失的区间](https://leetcode.cn/problems/missing-ranges/) | 中等 | 补出缺失区间 | 扫描相邻间隙（long 防溢出） |
| 939 | 690 | [员工的重要性](https://leetcode.cn/problems/employee-importance/) | 简单 | 递归/迭代累加下属重要性 | Map 建索引 + BFS/DFS |
| 940 | 372 | [超级次方](https://leetcode.cn/problems/super-pow/) | 中等 | 大指数取模幂 | 快速幂 + 按十进制位迭代 |
| 941 | 1029 | [两地调度](https://leetcode.cn/problems/two-city-scheduling/) | 简单 | 各去一半的最小成本 | 按 `A-B` 差值排序，前半去 A 后半去 B |
| 942 | 720 | [词典中最长的单词](https://leetcode.cn/problems/longest-word-in-dictionary/) | 简单 | 前缀都存在的最长词 | 长度+字典序排序，用 set 判断 `prefix` 是否可构建 |
| 943 | 590 | [N叉树的后序遍历](https://leetcode.cn/problems/n-ary-tree-postorder-traversal/) | 简单 | N 叉后序 | 递归：先孩子后自己 |
| 944 | 444 | [序列重建](https://leetcode.cn/problems/sequence-reconstruction/) | 中等 | 是否能唯一重建 org | 建图拓扑排序，队列必须始终只有 1 个可选且顺序匹配 org |
| 945 | 684 | [冗余连接](https://leetcode.cn/problems/redundant-connection/) | 中等 | 找成环的那条边 | 并查集，遇到已连通的边即答案 |
| 946 | 839 | [相似字符串组](https://leetcode.cn/problems/similar-string-groups/) | 困难 | 相似字符串分组数 | 两两判断相似（0/2 处不同），并查集合并后数根 |
| 947 | 926 | [将字符串翻转到单调递增](https://leetcode.cn/problems/flip-string-to-monotone-increasing/) | 中等 | 最少翻转成 000..111 | 扫描维护 ones 和 flip：`flip=min(flip+1, ones)` |
| 948 | 536 | [从字符串生成二叉树](https://leetcode.cn/problems/construct-binary-tree-from-string/) | 中等 | 解析括号树 | 指针递归解析整数与括号子树 |
| 949 | 1005 | [K 次取反后最大化的数组和](https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/) | 简单 | 翻转最多 k 次最大和 | 排序先翻负数，剩余奇数则翻绝对值最小值 |
| 950 | 1123 | [最深叶节点的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-deepest-leaves/) | 中等 | 最深叶的 LCA | 后序返回（深度，节点），左右深度相等则当前为 LCA |
| 951 | 676 | [实现一个魔法字典](https://leetcode.cn/problems/implement-magic-dictionary/) | 中等 | 改 1 个字符匹配 | 按长度分桶，同长度逐个比对差异是否为 1 |
| 952 | 419 | [甲板上的战舰](https://leetcode.cn/problems/battleships-in-a-board/) | 中等 | 统计战舰数量 | 只数“起点格”：是 X 且上/左不是 X |
| 953 | 729 | [我的日程安排表 I](https://leetcode.cn/problems/my-calendar-i/) | 中等 | 区间不重叠预定 | TreeMap 存 start->end，仅检查前驱/后继冲突 |
| 954 | 1228 | [等差数列中缺失的数字](https://leetcode.cn/problems/missing-number-in-arithmetic-progression/) | 简单 | 找缺失项 | `d=(last-first)/n`，找首个不满足期望的位置 |
| 955 | 1681 | [最小不兼容性](https://leetcode.cn/problems/minimum-incompatibility/) | 困难 | 分组最小化 max-min 之和 | 子集预处理 cost + bitmask DP 选组 |
| 956 | 757 | [设置交集大小至少为2](https://leetcode.cn/problems/set-intersection-size-at-least-two/) | 困难 | 最小集合覆盖所有区间（至少 2 点） | 按右端点排序贪心，维护两个最大已选点并补点 |
| 957 | 1390 | [四因数](https://leetcode.cn/problems/four-divisors/) | 中等 | 找恰好 4 因数的和 | 只可能是 \(p^3\) 或 \(p*q\)，判断后累加 |
| 958 | 1230 | [抛掷硬币](https://leetcode.cn/problems/toss-strange-coins/) | 中等 | 恰好 target 个正面概率 | 一维 DP：`dp[j]=dp[j]*(1-p)+dp[j-1]*p` |
| 959 | 1212 | [查询球队积分](https://leetcode.cn/problems/team-scores-in-football-tournament/) | 中等 | 按胜平负积分 | UNION ALL 拆主客两条记录，GROUP BY 汇总排序 |
| 960 | 289 | [生命游戏](https://leetcode.cn/problems/game-of-life/) | 中等 | 原地更新细胞状态 | 用第 2 位存下一状态，最后统一右移 |
| 961 | 741 | [摘樱桃](https://leetcode.cn/problems/cherry-pickup/) | 困难 | 去一趟再回来的最大樱桃数 | 两人同步走的三维 DP（压成二维） |
| 962 | 276 | [栅栏涂色](https://leetcode.cn/problems/paint-fence/) | 简单 | 相邻最多两根同色的涂法数 | DP（same/diff） |
| 963 | 267 | [回文排列 II](https://leetcode.cn/problems/palindrome-permutation-ii/) | 中等 | 生成所有回文排列 | 统计 + 生成半边去重回溯 |
| 964 | 1344 | [时钟指针的夹角](https://leetcode.cn/problems/angle-between-hands-of-a-clock/) | 中等 | 求时针分针最小夹角 | 直接算角度取 min(d,360-d) |
| 965 | 174 | [地下城游戏](https://leetcode.cn/problems/dungeon-game/) | 困难 | 求进入起点的最小初始血量 | 从终点反推 DP（至少为 1） |
| 966 | 1673 | [找出最具竞争力的子序列](https://leetcode.cn/problems/find-the-most-competitive-subsequence/) | 中等 | 字典序最小的长度 k 子序列 | 单调栈（可删除 n-k 个） |
| 967 | 1122 | [数组的相对排序](https://leetcode.cn/problems/relative-sort-array/) | 简单 | 按 arr2 顺序优先排序 | 计数/哈希 + 剩余升序 |
| 968 | 466 | [统计重复个数](https://leetcode.cn/problems/count-the-repetitions/) | 困难 | S1^n1 中最多包含多少个 S2^n2 | 模拟匹配 + 循环节加速 |
| 969 | 1462 | [课程安排 IV](https://leetcode.cn/problems/course-schedule-iv/) | 中等 | 查询先修关系是否成立 | 拓扑序 + 可达性传递闭包 |
| 970 | LCP 07 | [传递信息](https://leetcode.cn/problems/chuan-di-xin-xi/) | 简单 | 恰好 k 轮到终点的方案数 | 按轮次 DP |
| 971 | 面试题 04.01 | [节点间通路](https://leetcode.cn/problems/route-between-nodes-lcci/) | 中等 | 有向图可达性 | BFS/DFS |
| 972 | 1061 | [按字典序排列最小的等效字符串](https://leetcode.cn/problems/lexicographically-smallest-equivalent-string/) | 中等 | 等价类替换成最小字母 | 并查集（代表元取最小） |
| 973 | 860 | [柠檬水找零](https://leetcode.cn/problems/lemonade-change/) | 简单 | 是否能正确找零 | 贪心：优先用 10+5 |
| 974 | 962 | [最大宽度坡](https://leetcode.cn/problems/maximum-width-ramp/) | 中等 | 求最大 j-i 且 A[i]<=A[j] | 单调递减栈 + 反向扫描 |
| 975 | 1022 | [从根到叶的二进制数之和](https://leetcode.cn/problems/sum-of-root-to-leaf-binary-numbers/) | 简单 | 所有根到叶的二进制值求和 | DFS 累积 (cur<<1)+val |
| 976 | 988 | [从叶结点开始的最小字符串](https://leetcode.cn/problems/smallest-string-starting-from-leaf/) | 中等 | 叶到根字典序最小字符串 | DFS 路径，叶子反转比较 |
| 977 | 1523 | [在区间范围内统计奇数数目](https://leetcode.cn/problems/count-odd-numbers-in-an-interval-range/) | 简单 | 统计 [low,high] 奇数个数 | odd(x)=(x+1)/2 前缀差 |
| 978 | 1566 | [重复至少 K 次且长度为 M 的模式](https://leetcode.cn/problems/detect-pattern-of-length-m-repeated-k-or-more-times/) | 简单 | 是否存在长度 m 重复 k 次的模式 | 相邻块逐位对比 |
| 979 | 1188 | [设计有限阻塞队列](https://leetcode.cn/problems/design-bounded-blocking-queue/) | 中等 | 有界阻塞队列 | Lock + Condition（notFull/notEmpty） |
| 980 | 659 | [分割数组为连续子序列](https://leetcode.cn/problems/split-array-into-consecutive-subsequences/) | 中等 | 能否拆成若干长度≥3连续序列 | 贪心：优先接到已有序列 |
| 981 | 957 | [N 天后的牢房](https://leetcode.cn/problems/prison-cells-after-n-days/) | 中等 | 8 格状态演化 N 天 | 状态压缩 + 找循环 |
| 982 | 750 | [角矩形的数量](https://leetcode.cn/problems/number-of-corner-rectangles/) | 中等 | 统计四角都是 1 的矩形 | 行对统计公共 1 列数 \(C(c,2)\) |
| 983 | 面试题 03.02 | [栈的最小值](https://leetcode.cn/problems/min-stack-lcci/) | 简单 | 支持 getMin 的栈 | 双栈同步维护最小值 |
| 984 | 面试题 01.03 | [URL化](https://leetcode.cn/problems/string-to-url-lcci/) | 简单 | 空格替换为 %20 | 扫描前 length 构造 |
| 985 | 385 | [迷你语法分析器](https://leetcode.cn/problems/mini-parser/) | 中等 | 解析嵌套整数列表 | 栈解析：`[` 入栈 `]` 出栈 |
| 986 | 801 | [使序列递增的最小交换次数](https://leetcode.cn/problems/minimum-swaps-to-make-sequences-increasing/) | 中等 | 两数组严格递增的最少交换 | DP：keep/swap 两状态 |
| 987 | 1368 | [使网格图至少有一条有效路径的最小代价](https://leetcode.cn/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/) | 困难 | 修改箭头最小代价 | 0-1 BFS 最短路 |
| 988 | 650 | [只有两个键的键盘](https://leetcode.cn/problems/2-keys-keyboard/) | 中等 | 复制粘贴最少步数 | 质因数分解：因子和 |
| 989 | 1080 | [根到叶路径上的不足节点](https://leetcode.cn/problems/insufficient-nodes-in-root-to-leaf-paths/) | 中等 | 剪掉不达标路径节点 | DFS 剪枝返回子树 |
| 990 | 1259 | [不相交的握手](https://leetcode.cn/problems/handshakes-that-dont-cross/) | 困难 | 不交叉配对数量 | Catalan DP |
| 991 | 1145 | [二叉树着色游戏](https://leetcode.cn/problems/binary-tree-coloring-game/) | 中等 | 二号玩家是否必胜 | 计算 x 的 L/R/父区域大小 |
| 992 | 436 | [寻找右区间](https://leetcode.cn/problems/find-right-interval/) | 中等 | 为每个区间找右侧最小起点 | start 排序 + lower_bound |
| 993 | 667 | [优美的排列 II](https://leetcode.cn/problems/beautiful-arrangement-ii/) | 中等 | 构造差值种类为 k 的排列 | 前 k+1 左右夹逼构造 |
| 994 | 656 | [金币路径](https://leetcode.cn/problems/coin-path/) | 困难 | 最小花费且字典序最小路径 | 反向 DP + next 恢复路径 |
| 995 | 1584 | [连接所有点的最小费用](https://leetcode.cn/problems/min-cost-to-connect-all-points/) | 中等 | MST 最小总曼哈顿距离 | Prim \(O(n^2)\) |
| 996 | 730 | [统计不同回文子序列](https://leetcode.cn/problems/count-different-palindromic-subsequences/) | 困难 | 不同非空回文子序列数 | 区间 DP + next/prev |
| 997 | 725 | [分隔链表](https://leetcode.cn/problems/split-linked-list-in-parts/) | 中等 | 均分链表成 k 段 | 先算长度再按 base/extra 切 |
| 998 | 878 | [第 N 个神奇数字](https://leetcode.cn/problems/nth-magical-number/) | 困难 | 第 n 个可被 a 或 b 整除的数 | 二分答案 + 容斥计数 |
| 999 | 1261 | [在受污染的二叉树中查找元素](https://leetcode.cn/problems/find-elements-in-a-contaminated-binary-tree/) | 中等 | 还原树并查询 | DFS 还原 + HashSet |
| 1000 | 374 | [猜数字大小](https://leetcode.cn/problems/guess-number-higher-or-lower/) | 简单 | 猜数字二分 | 标准二分 |
| 1001 | 面试题 04.02 | [最小高度树](https://leetcode.cn/problems/minimum-height-tree-lcci/) | 简单 | 升序数组构造最矮 BST | 递归取中点建平衡 BST |
| 1002 | 917 | [仅仅反转字母](https://leetcode.cn/problems/reverse-only-letters/) | 简单 | 只反转字母，符号不动 | 双指针跳过非字母并交换 |
| 1003 | 1376 | [通知所有员工所需的时间](https://leetcode.cn/problems/time-needed-to-inform-all-employees/) | 中等 | 树上最长通知路径 | 建下属表 DFS 取最大深度耗时 |
| 1004 | 441 | [排列硬币](https://leetcode.cn/problems/arranging-coins/) | 简单 | 满足 k(k+1)/2<=n 的最大 k | 二分 k |
| 1005 | 1458 | [两个子序列的最大点积](https://leetcode.cn/problems/max-dot-product-of-two-subsequences/) | 困难 | 两数组非空子序列最大点积 | 二维 DP：配对/延伸/跳过 |
| 1006 | 843 | [猜猜这个单词](https://leetcode.cn/problems/guess-the-word/) | 困难 | 交互：10 次内逼近秘密词 | minimax 选点 + 按匹配数过滤候选 |
| 1007 | 1487 | [保证文件名唯一](https://leetcode.cn/problems/making-file-names-unique/) | 中等 | 文件名去重加 (k) | HashMap 记录下次可用 k |
| 1008 | 1685 | [有序数组中差绝对值之和](https://leetcode.cn/problems/sum-of-absolute-differences-in-a-sorted-array/) | 中等 | 每点到全体的绝对差和 | 前缀和拆左右贡献 |
| 1009 | 775 | [全局倒置与局部倒置](https://leetcode.cn/problems/global-and-local-inversions/) | 中等 | 判断是否存在非局部倒置 | 前缀最大值对比 nums[i+2] |
| 1010 | 979 | [在二叉树中分配硬币](https://leetcode.cn/problems/distribute-coins-in-binary-tree/) | 中等 | 最少搬运使每点 1 枚 | 后序返回 balance，累加 |balance| |
| 1011 | 774 | [最小化去加油站的最大距离](https://leetcode.cn/problems/minimize-max-distance-to-gas-station/) | 困难 | 加 k 个站使最大间隔最小 | 二分 D + 计算需要新增站数 |
| 1012 | 360 | [有序转化数组](https://leetcode.cn/problems/sort-transformed-array/) | 中等 | f(x)=ax^2+bx+c 后仍排序 | 双指针按 a 正负从两端填充 |
| 1013 | 507 | [完美数](https://leetcode.cn/problems/perfect-number/) | 简单 | 判断是否等于真因子和 | 枚举到 sqrt 成对累加 |
| 1014 | 1330 | [翻转子数组得到最大的数组值](https://leetcode.cn/problems/reverse-subarray-to-maximize-array-value/) | 困难 | 翻转一次最大化相邻差和 | base + 端点增益 + 内部 2*(high-low) |
| 1015 | 1058 | [最小化舍入误差以满足目标](https://leetcode.cn/problems/minimize-rounding-error-to-meet-target/) | 中等 | floor/ceil 选法使总和=target | 计算 need 个 ceil，选最小 delta |
| 1016 | 281 | [锯齿迭代器](https://leetcode.cn/problems/zigzag-iterator/) | 中等 | 交替输出两个列表 | 队列保存 (list,idx) 轮转 |
| 1017 | 954 | [二倍数对数组](https://leetcode.cn/problems/array-of-doubled-pairs/) | 中等 | 能否配成 (x,2x) | 按绝对值排序 + 计数扣减 |
| 1018 | 955 | [删列造序 II](https://leetcode.cn/problems/delete-columns-to-make-sorted-ii/) | 中等 | 删最少列使整体字典序有序 | 贪心列扫描 + sorted 邻接对 |
| 1019 | 1218 | [最长定差子序列](https://leetcode.cn/problems/longest-arithmetic-subsequence-of-given-difference/) | 中等 | 固定差的最长子序列 | dp[x]=dp[x-diff]+1（HashMap） |
| 1020 | 993 | [二叉树的堂兄弟节点](https://leetcode.cn/problems/cousins-in-binary-tree/) | 简单 | 同深不同父 | BFS 分层记录父节点 |
| 1021 | 1287 | [有序数组中出现次数超过25%的元素](https://leetcode.cn/problems/element-appearing-more-than-25-in-sorted-array/) | 简单 | 找出现次数 >25% 的数 | 抽样候选 + 二分边界计数 |
| 1022 | 196 | [删除重复的电子邮箱](https://leetcode.cn/problems/delete-duplicate-emails/) | 简单 | 邮箱去重保留最小 id | HashMap 统计 minId 再过滤 |
| 1023 | 390 | [消除游戏](https://leetcode.cn/problems/elimination-game/) | 中等 | 消除后剩余最后元素 | 迭代维护 head/step/remain/方向 |
| 1024 | 434 | [字符串中的单词数](https://leetcode.cn/problems/number-of-segments-in-a-string/) | 简单 | 统计单词段数 | 统计空格->非空格转折 |
| 1025 | 1074 | [元素和为目标值的子矩阵数量](https://leetcode.cn/problems/number-of-submatrices-that-sum-to-target/) | 困难 | 子矩阵和=target 计数 | 固定上下边界压缩 + 前缀和计数 |
| 1026 | 197 | [上升的温度](https://leetcode.cn/problems/rising-temperature/) | 简单 | 今日温度 > 昨日 | date-1 查映射比较 |
| 1027 | 1542 | [找出最长的超赞子字符串](https://leetcode.cn/problems/find-longest-awesome-substring/) | 困难 | 最长“至多一个奇数次数”子串 | 奇偶 mask + earliest[mask] |
| 1028 | 178 | [分数排名](https://leetcode.cn/problems/rank-scores/) | 中等 | 稠密排名 | 分数去重降序 -> rank 映射 |
| 1029 | 177 | [第N高的薪水](https://leetcode.cn/problems/nth-highest-salary/) | 中等 | 去重后第 N 大 | TreeSet 去重降序取第 N |
| 1030 | 181 | [超过经理收入的员工](https://leetcode.cn/problems/employees-earning-more-than-their-managers/) | 简单 | 员工薪水 > 经理 | id->salary 映射后筛选 |
| 1031 | 1096 | [花括号展开 II](https://leetcode.cn/problems/brace-expansion-ii/) | 困难 | 花括号表达式展开 | 递归下降：并集/连接 + Set 去重 |
| 1032 | 面试题 17.12 | [BiNode](https://leetcode.cn/problems/binode-lcci/) | 简单 | BST 转单链表 | 中序遍历原地串 right，left 置空 |
| 1033 | 605 | [种花问题](https://leetcode.cn/problems/can-place-flowers/) | 简单 | 能否再种 n 朵花 | 贪心检查左右为空位 |
| 1034 | 1480 | [一维数组的动态和](https://leetcode.cn/problems/running-sum-of-1d-array/) | 简单 | running sum | 前缀和累加 |
| 1035 | 938 | [二叉搜索树的范围和](https://leetcode.cn/problems/range-sum-of-bst/) | 简单 | 区间和 | BST 剪枝 DFS |
| 1036 | 308 | [二维区域和检索 - 可变](https://leetcode.cn/problems/range-sum-query-2d-mutable/) | 困难 | 2D 可修改区域和 | 二维 BIT（Fenwick） |
| 1037 | 面试题 03.05 | [栈排序](https://leetcode.cn/problems/sort-of-stacks-lcci/) | 中等 | 栈顶最小的有序栈 | 辅助栈插入排序 |
| 1038 | 1690 | [石子游戏 VII](https://leetcode.cn/problems/stone-game-vii/) | 中等 | 最大分差 | 区间 DP（分差）+ 前缀和 |
| 1039 | 472 | [连接词](https://leetcode.cn/problems/concatenated-words/) | 困难 | 找由其它词拼出的词 | 长度排序 + 单词拆分 DP |
| 1040 | 389 | [找不同](https://leetcode.cn/problems/find-the-difference/) | 简单 | 找多出来的字符 | 全量异或 |
| 1041 | 228 | [汇总区间](https://leetcode.cn/problems/summary-ranges/) | 中等 | 把连续数字合并成区间字符串 | 扫描连续段输出 |
| 1042 | 666 | [路径和 IV](https://leetcode.cn/problems/path-sum-iv/) | 中等 | 编码二叉树的根到叶路径和 | map 建树 + DFS |
| 1043 | 930 | [和相同的二元子数组](https://leetcode.cn/problems/binary-subarrays-with-sum/) | 中等 | 统计和为 goal 的子数组数 | 前缀和 + 哈希表计数 |
| 1044 | 1214 | [查找两棵二叉搜索树之和](https://leetcode.cn/problems/two-sum-bsts/) | 中等 | 两棵 BST 是否存在两数之和为 target | 一棵入 set，另一棵查补数 |
| 1045 | 面试题 16.20 | [T9键盘](https://leetcode.cn/problems/t9-lcci/) | 中等 | 过滤出能匹配数字串的单词 | 字符到数字映射逐词校验 |
| 1046 | 1665 | [完成所有任务的最少初始能量](https://leetcode.cn/problems/minimum-initial-energy-to-finish-tasks/) | 困难 | 最小初始能量完成所有任务 | 按 (min-actual) 降序贪心 |
| 1047 | 1451 | [重新排列句子中的单词](https://leetcode.cn/problems/rearrange-words-in-a-sentence/) | 中等 | 按单词长度重排句子 | 稳定排序 + 首字母大写 |
| 1048 | 1524 | [和为奇数的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-with-odd-sum/) | 中等 | 统计奇数和子数组数量 | 前缀奇偶计数（even/odd） |
| 1049 | 849 | [到最近的人的最大距离](https://leetcode.cn/problems/maximize-distance-to-closest-person/) | 简单 | 找最佳空位最大化到最近人的距离 | 扫描 0 段（首尾/中间） |
| 1050 | 677 | [键值映射](https://leetcode.cn/problems/map-sum-pairs/) | 中等 | 前缀求和字典 | Trie + 增量更新 delta |
| 1051 | 1361 | [验证二叉树](https://leetcode.cn/problems/validate-binary-tree-nodes/) | 中等 | 判断给定左右孩子数组是否为一棵树 | 入度判根 + BFS 连通无环 |
| 1052 | 剑指 Offer 30 | [包含min函数的栈](https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/) | 简单 | O(1) 获取最小值的栈 | 数据栈 + 最小栈同步 |
| 1053 | 768 | [最多能完成排序的块 II](https://leetcode.cn/problems/max-chunks-to-make-sorted-ii/) | 困难 | 最大可分块数使分别排序后整体有序 | 单调栈合并块最大值 |
| 1054 | 835 | [图像重叠](https://leetcode.cn/problems/image-overlap/) | 中等 | 平移两张图最大重叠 1 的数量 | 记录 1 坐标，平移向量计数 |
| 1055 | 555 | [分割连接字符串](https://leetcode.cn/problems/split-concatenated-strings/) | 中等 | 选方向并切分得到最大字典序字符串 | 其他固定取较大方向 + 枚举切点 |
| 1056 | 1282 | [用户分组](https://leetcode.cn/problems/group-the-people-given-the-group-size-they-belong-to/) | 中等 | 按组大小把用户分组输出 | map 收集，凑满输出 |
| 1057 | 1104 | [二叉树寻路](https://leetcode.cn/problems/path-in-zigzag-labelled-binary-tree/) | 中等 | 之字形标号二叉树求根到节点路径 | 逐层镜像反推父节点 |
| 1058 | 面试题 16.10 | [生存人数](https://leetcode.cn/problems/living-people-lcci/) | 中等 | 1900-2000 存活人数最多的年份 | 差分数组前缀和 |
| 1059 | 1552 | [两球之间的磁力](https://leetcode.cn/problems/magnetic-force-between-two-balls/) | 中等 | 放 m 个球最大化最小距离 | 二分答案 + 贪心校验 |
| 1060 | 612 | [平面上的最近距离](https://leetcode.cn/problems/shortest-distance-in-a-plane/) | 中等 | 平面点集中两点最短距离 | SQL 自连接取最小距离 |
| 1061 | 1504 | [统计全 1 子矩形](https://leetcode.cn/problems/count-submatrices-with-all-ones/) | 中等 | 全 1 子矩形数量 | 行转柱状图 + 单调栈计数 |
| 1062 | 1222 | [可以攻击国王的皇后](https://leetcode.cn/problems/queens-that-can-attack-the-king/) | 中等 | 找 8 方向最近皇后 | 八方向扩散 |
| 1063 | 1647 | [字符频次唯一的最小删除次数](https://leetcode.cn/problems/minimum-deletions-to-make-character-frequencies-unique/) | 中等 | 频次去重最少删除 | 频次统计 + 集合占用 |
| 1064 | 710 | [黑名单中的随机数](https://leetcode.cn/problems/random-pick-with-blacklist/) | 困难 | 在黑名单外等概率随机 | 小区间随机 + 黑到白映射 |
| 1065 | 218 | [天际线问题](https://leetcode.cn/problems/the-skyline-problem/) | 困难 | 建筑轮廓关键点 | 扫描线 + TreeMap 多重集 |
| 1066 | 1232 | [缀点成线](https://leetcode.cn/problems/check-if-it-is-a-straight-line/) | 简单 | 判断共线 | 叉积/交叉相乘 |
| 1067 | 566 | [重塑矩阵](https://leetcode.cn/problems/reshape-the-matrix/) | 简单 | 矩阵 reshape | 一维下标映射 |
| 1068 | 补充题15 | [自然数数组的排序](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9815) | 中等 | 0..n-1 下标归位排序 | 原地交换归位（循环排序） |
| 1069 | 面试题 02.03 | [删除中间节点](https://leetcode.cn/problems/delete-middle-node-lcci/) | 简单 | 给定节点删除 | 复制后继值并跳过 |
| 1070 | 面试题 04.06 | [后继者](https://leetcode.cn/problems/successor-lcci/) | 中等 | BST 中序后继 | 右子树最左 / 从根找候选 |
| 1071 | 1003 | [检查替换后的词是否有效](https://leetcode.cn/problems/check-if-word-is-valid-after-substitutions/) | 中等 | 消除 abc 后是否为空 | 栈模拟消除 |
| 1072 | 1166 | [设计文件系统](https://leetcode.cn/problems/design-file-system/) | 中等 | create/get 路径值 | HashMap 存路径，校验父路径 |
| 1073 | 648 | [单词替换](https://leetcode.cn/problems/replace-words/) | 中等 | 用词根替换单词 | Trie 找最短词根 |
| 1074 | 323 | [无向图中连通分量的数目](https://leetcode.cn/problems/number-of-connected-components-in-an-undirected-graph/) | 中等 | 无向图连通分量数 | 并查集合并边 |
| 1075 | 932 | [漂亮数组](https://leetcode.cn/problems/beautiful-array/) | 中等 | 构造满足条件的排列 | 分治构造（奇偶扩展） |
| 1076 | 689 | [三个无重叠子数组的最大和](https://leetcode.cn/problems/maximum-sum-of-3-non-overlapping-subarrays/) | 困难 | 选 3 段长度 k 最大和 | 窗口和 + 左右最优预处理 |
| 1077 | 126 | [单词接龙 II](https://leetcode.cn/problems/word-ladder-ii/) | 困难 | 输出所有最短转换序列 | BFS 建最短路图 + DFS 回溯 |
| 1078 | 1456 | [定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | 中等 | 固定长度元音最大数 | 固定窗口 |
| 1079 | 777 | [在LR字符串中交换相邻字符](https://leetcode.cn/problems/swap-adjacent-in-lr-string/) | 中等 | 是否可变换 | 忽略 X 双指针 + 位置约束 |
| 1080 | 458 | [可怜的小猪](https://leetcode.cn/problems/poor-pigs/) | 困难 | 最少猪数区分桶 | 状态数 \(t^p\) 覆盖 buckets |
| 1081 | 1247 | [交换字符使得字符串相同](https://leetcode.cn/problems/minimum-swaps-to-make-strings-equal/) | 中等 | 最少交换次数 | 统计 xy/yx 数量：`xy/2 + yx/2 + (xy%2)*2` |
| 1082 | 296 | [最佳的碰头地点](https://leetcode.cn/problems/best-meeting-point/) | 困难 | 最小曼哈顿距离和 | 行/列分别取中位数，距离可分解相加 |
| 1083 | 646 | [最长数对链](https://leetcode.cn/problems/maximum-length-of-pair-chain/) | 中等 | 最长可连接数对 | 按右端点排序贪心选取 |
| 1084 | 888 | [公平的糖果交换](https://leetcode.cn/problems/fair-candy-swap/) | 简单 | 交换一颗使总和相等 | 解方程得到 `b=a+(sumB-sumA)/2`，用集合查找 |
| 1085 | 854 | [相似度为 K 的字符串](https://leetcode.cn/problems/k-similar-strings/) | 困难 | 最少交换使字符串相等 | BFS 状态搜索：固定首个不匹配位，只尝试能匹配目标位的交换剪枝 |
| 1086 | 219 | [存在重复元素 II](https://leetcode.cn/problems/contains-duplicate-ii/) | 简单 | 距离不超过 k 的重复 | HashMap 记录最近下标判断差值 |
| 1087 | 1328 | [破坏回文串](https://leetcode.cn/problems/break-a-palindrome/) | 中等 | 改 1 个字符使字典序最小且非回文 | 前半段首个非 a 改 a，否则末位改 b |
| 1088 | 897 | [递增顺序查找树](https://leetcode.cn/problems/increasing-order-search-tree/) | 简单 | BST 重排成右链 | 中序遍历依次串接，左指针置空 |
| 1089 | 861 | [翻转矩阵后的得分](https://leetcode.cn/problems/score-after-flipping-matrix/) | 中等 | 最大二进制行和 | 先让首列全为 1（行翻转），再逐列取 1 多的一侧贡献 |
| 1090 | 1446 | [连续字符](https://leetcode.cn/problems/consecutive-characters/) | 简单 | 最大连续段长度 | 扫描统计连续段 |
| 1091 | 941 | [有效的山脉数组](https://leetcode.cn/problems/valid-mountain-array/) | 简单 | 先升后降 | 双指针先爬升到峰顶再爬降到末尾 |
| 1092 | 844 | [比较含退格的字符串](https://leetcode.cn/problems/backspace-string-compare/) | 简单 | 退格后是否相等 | 双指针从后往前跳过退格字符比较 |
| 1093 | 1675 | [数组的最小偏移量](https://leetcode.cn/problems/minimize-deviation-in-array/) | 困难 | 最小化 max-min | 奇数先 *2，最大堆不断把最大偶数除 2 更新答案 |
| 1094 | 999 | [可以被一步捕获的棋子数](https://leetcode.cn/problems/available-captures-for-rook/) | 简单 | 车四方向可吃几兵 | 找 R 后四方向扫到 B/p/边界 |
| 1095 | 950 | [按递增顺序显示卡牌](https://leetcode.cn/problems/reveal-cards-in-increasing-order/) | 中等 | 找初始牌序 | 反向模拟：队尾移到队首，再把当前最大牌放队首 |
| 1096 | 1567 | [乘积为正数的最长子数组长度](https://leetcode.cn/problems/maximum-length-of-subarray-with-positive-product/) | 中等 | 最长正乘积子数组 | DP 维护 pos/neg 长度，遇负数交换更新 |
| 1097 | 570 | [至少有5名直接下属的经理](https://leetcode.cn/problems/managers-with-at-least-5-direct-reports/) | 中等 | 找下属>=5 的经理 | SQL：按 managerId 分组 count>=5 再取名字 |
| 1098 | 355 | [设计推特](https://leetcode.cn/problems/design-twitter/) | 中等 | 关注/发推/拉取动态 | 推文列表 + 关注集合，feed 用堆做 K 路归并取 10 条 |
| 1099 | 1475 | [商品折扣后的最终价格](https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop/) | 简单 | 右侧第一个 <= 的折扣 | 单调栈维护下标，遇到更小就回填折扣 |
| 1100 | 493 | [翻转对](https://leetcode.cn/problems/reverse-pairs/) | 困难 | 统计 i<j 且 nums[i]>2*nums[j] | 归并排序分治，跨段用双指针计数 |
| 1101 | LCP 17 | [速算机器人](https://leetcode.cn/problems/nGK0Fy/) | 简单 | 操作序列的最终数值 | 观察 \(x+y\) 每步翻倍，答案 \(2^n\) |
| 1102 | 927 | [三等分](https://leetcode.cn/problems/three-equal-parts/) | 困难 | 二进制数组切成三段等值 | 统计 1，定位三段起点，对齐尾部逐位比对 |
| 1103 | 1405 | [最长快乐字符串](https://leetcode.cn/problems/longest-happy-string/) | 中等 | 不出现三连字符的最长串 | 贪心 + 大根堆，必要时用第二多字符 |
| 1104 | 1306 | [跳跃游戏 III](https://leetcode.cn/problems/jump-game-iii/) | 中等 | 从 start 能否跳到 0 | BFS/DFS + visited 防重复 |
| 1105 | 367 | [有效的完全平方数](https://leetcode.cn/problems/valid-perfect-square/) | 简单 | 判断是否为完全平方数 | 二分查找整数平方 |
| 1106 | 面试题 03.03 | [堆盘子](https://leetcode.cn/problems/stack-of-plates-lcci/) | 中等 | 多组定容量栈的设计 | ArrayList 存多栈，push/pop/popAt |
| 1107 | LCP 04 | [覆盖](https://leetcode.cn/problems/broken-board-dominoes/) | 困难 | 破损棋盘多米诺最大覆盖 | 二分图最大匹配（增广路） |
| 1108 | 1168 | [水资源分配优化](https://leetcode.cn/problems/optimize-water-distribution-in-a-village/) | 困难 | 供水最小成本 | 虚拟点连井边 + 最小生成树 Kruskal |
| 1109 | 1341 | [电影评分](https://leetcode.cn/problems/movie-rating/) | 中等 | SQL：最多评分用户/二月最高均分电影 | 映射 + 计数；按月聚合 sum/count 比较 |
| 1110 | 514 | [自由之路](https://leetcode.cn/problems/freedom-trail/) | 困难 | 旋转 ring 拼出 key 最少步数 | 位置表 + DP 转移（旋转距离） |
| 1111 | 1570 | [两个稀疏向量的点积](https://leetcode.cn/problems/dot-product-of-two-sparse-vectors/) | 中等 | 稀疏向量点积 | 存非零项，下标双指针归并 |
| 1112 | 1615 | [最大网络秩](https://leetcode.cn/problems/maximal-network-rank/) | 中等 | 两点度数之和（去重边）最大 | 度数统计 + 邻接矩阵枚举两点 |
| 1113 | 643 | [子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i/) | 简单 | 固定长度子数组最大平均 | 滑动窗口维护最大和 |
| 1114 | 258 | [各位相加](https://leetcode.cn/problems/add-digits/) | 简单 | 反复求各位和至一位数 | 数字根公式 \(1+(n-1)\%9\) |
| 1115 | 598 | [范围求和 II](https://leetcode.cn/problems/range-addition-ii/) | 简单 | 多次左上子矩阵 +1 的最大值个数 | 取所有操作的最小行/列交集面积 |
| 1116 | 765 | [情侣牵手](https://leetcode.cn/problems/couples-holding-hands/) | 困难 | 最少交换使情侣相邻 | 并查集连通块：答案=情侣数-连通块数 |
| 1117 | 728 | [自除数](https://leetcode.cn/problems/self-dividing-numbers/) | 简单 | 能被每位数字整除的数 | 枚举 + 按位检查 |
| 1118 | 1107 | [每日新用户统计](https://leetcode.cn/problems/new-users-daily-count/) | 中等 | SQL：90 天内每日首登用户数 | 取每用户最早 login 日期，再按天计数 |
| 1119 | 1420 | [生成数组](https://leetcode.cn/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/) | 困难 | 计数：长度 n，最大值 m，代价 k | DP + 前缀和优化到 \(O(nmk)\) |
| 1120 | 717 | [1比特与2比特字符](https://leetcode.cn/problems/1-bit-and-2-bit-characters/) | 简单 | 判断最后字符是否 1 比特 0 | 贪心解析到倒数第二位 |
| 1121 | 1563 | [石子游戏 V](https://leetcode.cn/problems/stone-game-v/) | 困难 | 区间 DP | 前缀和 + 双指针分界 + bestL/bestR |
| 1122 | 588 | [设计内存文件系统](https://leetcode.cn/problems/design-in-memory-file-system/) | 困难 | 设计题 | Trie（目录树）+ TreeMap 保序 |
| 1123 | 361 | [轰炸敌人](https://leetcode.cn/problems/bomb-enemy/) | 中等 | 网格题 | 行段/列段击杀数复用扫描 |
| 1124 | 1518 | [换酒问题](https://leetcode.cn/problems/water-bottles/) | 简单 | 模拟 | 空瓶累加换酒直到不足 |
| 1125 | 549 | [二叉树中最长的连续序列](https://leetcode.cn/problems/binary-tree-longest-consecutive-sequence-ii/) | 中等 | 树 DP | DFS 返回 inc/dec，拐点合并 |
| 1126 | 609 | [在系统中查找重复文件](https://leetcode.cn/problems/find-duplicate-file-in-system/) | 中等 | 字符串解析 | content -> paths 分组 |
| 1127 | 面试题 17.21 | [直方图的水量](https://leetcode.cn/problems/volume-of-histogram-lcci/) | 困难 | 双指针 | leftMax/rightMax 一次遍历 |
| 1128 | 569 | [员工薪水中位数](https://leetcode.cn/problems/median-employee-salary/) | 困难 | SQL | row_number + cnt 取中位行 |
| 1129 | 307 | [区域和检索 - 数组可修改](https://leetcode.cn/problems/range-sum-query-mutable/) | 中等 | 数据结构 | 树状数组（BIT） |
| 1130 | 1498 | [满足条件的子序列数目](https://leetcode.cn/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/) | 中等 | 双指针 | 排序 + \(2^{(r-l)}\) 计数 |
| 1131 | 929 | [独特的电子邮件地址](https://leetcode.cn/problems/unique-email-addresses/) | 简单 | 字符串 | 规范化后 HashSet 去重 |
| 1132 | 1314 | [矩阵区域和](https://leetcode.cn/problems/matrix-block-sum/) | 中等 | 前缀和 | 二维前缀和 4 次相减 |
| 1133 | 919 | [完全二叉树插入器](https://leetcode.cn/problems/complete-binary-tree-inserter/) | 中等 | 设计题 | 队列维护第一个不满节点 |
| 1134 | 865 | [具有所有最深结点的最小子树](https://leetcode.cn/problems/smallest-subtree-with-all-the-deepest-nodes/) | 中等 | 树 | 后序返回(深度,节点) |
| 1135 | 956 | [最高的广告牌](https://leetcode.cn/problems/tallest-billboard/) | 困难 | DP | dp[差值]=较高高度（差值背包） |
| 1136 | 255 | [验证前序遍历序列二叉搜索树](https://leetcode.cn/problems/verify-preorder-sequence-in-binary-search-tree/) | 中等 | 栈 | 单调栈 + lower 下界 |
| 1137 | 562 | [矩阵中最长的连续1线段](https://leetcode.cn/problems/longest-line-of-consecutive-one-in-matrix/) | 中等 | DP | 4 方向滚动数组统计 |
| 1138 | 1147 | [段式回文](https://leetcode.cn/problems/longest-chunked-palindrome-decomposition/) | 困难 | 贪心 | 双指针拼块，匹配就切分 |
| 1139 | 515 | [在每个树行中找最大值](https://leetcode.cn/problems/find-largest-value-in-each-tree-row/) | 中等 | BFS | 层序遍历逐层取 max |
| 1140 | 636 | [函数的独占时间](https://leetcode.cn/problems/exclusive-time-of-functions/) | 中等 | 栈 | 调用栈 + prev 切片计时 |
| 1141 | 431 | [将 N 叉树编码为二叉树](https://leetcode.cn/problems/encode-n-ary-tree-to-binary-tree/) | 困难 | N 叉树 <-> 二叉树互转 | 左孩子-右兄弟：`left`=第一个孩子，`right`=下一个兄弟 |
