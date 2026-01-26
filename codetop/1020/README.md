# 题目汇总（1001-1020）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 面试题 04.02 | [最小高度树](https://leetcode.cn/problems/minimum-height-tree-lcci/) | 简单 | 升序数组构造最矮 BST | 递归取中点建平衡 BST |
| 917 | [仅仅反转字母](https://leetcode.cn/problems/reverse-only-letters/) | 简单 | 只反转字母，符号不动 | 双指针跳过非字母并交换 |
| 1376 | [通知所有员工所需的时间](https://leetcode.cn/problems/time-needed-to-inform-all-employees/) | 中等 | 树上最长通知路径 | 建下属表 DFS 取最大深度耗时 |
| 441 | [排列硬币](https://leetcode.cn/problems/arranging-coins/) | 简单 | 满足 k(k+1)/2<=n 的最大 k | 二分 k |
| 1458 | [两个子序列的最大点积](https://leetcode.cn/problems/max-dot-product-of-two-subsequences/) | 困难 | 两数组非空子序列最大点积 | 二维 DP：配对/延伸/跳过 |
| 843 | [猜猜这个单词](https://leetcode.cn/problems/guess-the-word/) | 困难 | 交互：10 次内逼近秘密词 | minimax 选点 + 按匹配数过滤候选 |
| 1487 | [保证文件名唯一](https://leetcode.cn/problems/making-file-names-unique/) | 中等 | 文件名去重加 (k) | HashMap 记录下次可用 k |
| 1685 | [有序数组中差绝对值之和](https://leetcode.cn/problems/sum-of-absolute-differences-in-a-sorted-array/) | 中等 | 每点到全体的绝对差和 | 前缀和拆左右贡献 |
| 775 | [全局倒置与局部倒置](https://leetcode.cn/problems/global-and-local-inversions/) | 中等 | 判断是否存在非局部倒置 | 前缀最大值对比 nums[i+2] |
| 979 | [在二叉树中分配硬币](https://leetcode.cn/problems/distribute-coins-in-binary-tree/) | 中等 | 最少搬运使每点 1 枚 | 后序返回 balance，累加 |balance| |
| 774 | [最小化去加油站的最大距离](https://leetcode.cn/problems/minimize-max-distance-to-gas-station/) | 困难 | 加 k 个站使最大间隔最小 | 二分 D + 计算需要新增站数 |
| 360 | [有序转化数组](https://leetcode.cn/problems/sort-transformed-array/) | 中等 | f(x)=ax^2+bx+c 后仍排序 | 双指针按 a 正负从两端填充 |
| 507 | [完美数](https://leetcode.cn/problems/perfect-number/) | 简单 | 判断是否等于真因子和 | 枚举到 sqrt 成对累加 |
| 1330 | [翻转子数组得到最大的数组值](https://leetcode.cn/problems/reverse-subarray-to-maximize-array-value/) | 困难 | 翻转一次最大化相邻差和 | base + 端点增益 + 内部 2*(high-low) |
| 1058 | [最小化舍入误差以满足目标](https://leetcode.cn/problems/minimize-rounding-error-to-meet-target/) | 中等 | floor/ceil 选法使总和=target | 计算 need 个 ceil，选最小 delta |
| 281 | [锯齿迭代器](https://leetcode.cn/problems/zigzag-iterator/) | 中等 | 交替输出两个列表 | 队列保存 (list,idx) 轮转 |
| 954 | [二倍数对数组](https://leetcode.cn/problems/array-of-doubled-pairs/) | 中等 | 能否配成 (x,2x) | 按绝对值排序 + 计数扣减 |
| 955 | [删列造序 II](https://leetcode.cn/problems/delete-columns-to-make-sorted-ii/) | 中等 | 删最少列使整体字典序有序 | 贪心列扫描 + sorted 邻接对 |
| 1218 | [最长定差子序列](https://leetcode.cn/problems/longest-arithmetic-subsequence-of-given-difference/) | 中等 | 固定差的最长子序列 | dp[x]=dp[x-diff]+1（HashMap） |
| 993 | [二叉树的堂兄弟节点](https://leetcode.cn/problems/cousins-in-binary-tree/) | 简单 | 同深不同父 | BFS 分层记录父节点 |
