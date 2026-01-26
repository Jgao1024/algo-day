# 题目汇总（541-560）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 743 | [网络延迟时间](https://leetcode.cn/problems/network-delay-time/) | 中等 | 单源最短路最大值 | Dijkstra 求 k 到各点最短路，取最大；有不可达则 -1 |
| 700 | [二叉搜索树中的搜索](https://leetcode.cn/problems/search-in-a-binary-search-tree/) | 简单 | BST 查找节点 | 利用 BST 性质迭代向左/向右走，命中返回 |
| 324 | [摆动排序 II](https://leetcode.cn/problems/wiggle-sort-ii/) | 中等 | 重排成 < > < > | 排序后偶位填小半段倒序、奇位填大半段倒序 |
| 203 | [移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/) | 简单 | 删除链表所有 val | dummy + 遍历前驱，命中就跳过节点 |
| 剑指 Offer 18 | [删除链表的节点](https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/) | 简单 | 删除首个 val | dummy 找前驱，删除一次后退出 |
| 841 | [钥匙和房间](https://leetcode.cn/problems/keys-and-rooms/) | 中等 | 图可达性 | 从 0 BFS/DFS 标记访问，计数是否等于 n |
| 1162 | [地图分析](https://leetcode.cn/problems/as-far-from-land-as-possible/) | 中等 | 海洋到陆地最远距离 | 多源 BFS：所有陆地入队，最后层数为答案 |
| 229 | [求众数 II](https://leetcode.cn/problems/majority-element-ii/) | 中等 | 找 > n/3 的元素 | Boyer-Moore 两候选投票 + 二次计数验证 |
| 629 | [K个逆序对数组](https://leetcode.cn/problems/k-inverse-pairs-array/) | 困难 | 计数 DP（取模） | dp[i][j] 前缀和优化到 O(nk)：dp[i][j]=dp[i][j-1]+prev[j]-prev[j-i] |
| 1091 | [二进制矩阵中的最短路径](https://leetcode.cn/problems/shortest-path-in-binary-matrix/) | 中等 | 8 方向最短路 | BFS，起点 dist=1，首次到终点即最短 |
| 1019 | [链表中的下一个更大节点](https://leetcode.cn/problems/next-greater-node-in-linked-list/) | 中等 | 链表版 Next Greater | 转数组 + 下标单调栈，遇到更大值弹栈填答案 |
| 856 | [括号的分数](https://leetcode.cn/problems/score-of-parentheses/) | 中等 | 计算平衡括号分数 | 统计深度：每个 "()" 贡献 1<<外层深度 |
| 496 | [下一个更大元素 I](https://leetcode.cn/problems/next-greater-element-i/) | 简单 | 子集的 Next Greater | nums2 用单调栈建 map，再对 nums1 查表 |
| 1277 | [统计全为 1 的正方形子矩阵](https://leetcode.cn/problems/count-square-submatrices-with-all-ones/) | 中等 | 统计全 1 正方形数量 | dp[i][j]=1+min(上,左,左上)，累加 dp 得答案 |
| 剑指 Offer 44 | [数字序列中某一位的数字](https://leetcode.cn/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/) | 中等 | 找序列第 n 位数字 | 按位数分段扣 n，定位到具体数字与位下标 |
| 318 | [最大单词长度乘积](https://leetcode.cn/problems/maximum-product-of-word-lengths/) | 中等 | 无公共字符最大乘积 | 单词转 26 位 mask，两两判断 mask&mask==0 |
| 1106 | [解析布尔表达式](https://leetcode.cn/problems/parsing-a-boolean-expression/) | 困难 | 解析 ! & | 表达式 | 栈：遇 ')' 弹到 '('，按运算符合并成 t/f 再压回 |
| 934 | [最短的桥](https://leetcode.cn/problems/shortest-bridge/) | 中等 | 两岛最少翻转 0 | DFS 标记一岛并入队，BFS 扩展首次碰到另一岛返回层数 |
| 417 | [太平洋大西洋水流问题](https://leetcode.cn/problems/pacific-atlantic-water-flow/) | 中等 | 同时流向两海的格子 | 反向 BFS：从两海边界“爬坡”可达，取交集 |
| 997 | [找到小镇的法官](https://leetcode.cn/problems/find-the-town-judge/) | 简单 | 入度/出度找法官 | 统计 in/out，找 in=n-1 且 out=0 的人 |
