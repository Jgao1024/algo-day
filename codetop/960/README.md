# 题目汇总（941-960）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1029 | [两地调度](https://leetcode.cn/problems/two-city-scheduling/) | 简单 | 各去一半的最小成本 | 按 `A-B` 差值排序，前半去 A 后半去 B |
| 720 | [词典中最长的单词](https://leetcode.cn/problems/longest-word-in-dictionary/) | 简单 | 前缀都存在的最长词 | 长度+字典序排序，用 set 判断 `prefix` 是否可构建 |
| 590 | [N叉树的后序遍历](https://leetcode.cn/problems/n-ary-tree-postorder-traversal/) | 简单 | N 叉后序 | 递归：先孩子后自己 |
| 444 | [序列重建](https://leetcode.cn/problems/sequence-reconstruction/) | 中等 | 是否能唯一重建 org | 建图拓扑排序，队列必须始终只有 1 个可选且顺序匹配 org |
| 684 | [冗余连接](https://leetcode.cn/problems/redundant-connection/) | 中等 | 找成环的那条边 | 并查集，遇到已连通的边即答案 |
| 839 | [相似字符串组](https://leetcode.cn/problems/similar-string-groups/) | 困难 | 相似字符串分组数 | 两两判断相似（0/2 处不同），并查集合并后数根 |
| 926 | [将字符串翻转到单调递增](https://leetcode.cn/problems/flip-string-to-monotone-increasing/) | 中等 | 最少翻转成 000..111 | 扫描维护 ones 和 flip：`flip=min(flip+1, ones)` |
| 536 | [从字符串生成二叉树](https://leetcode.cn/problems/construct-binary-tree-from-string/) | 中等 | 解析括号树 | 指针递归解析整数与括号子树 |
| 1005 | [K 次取反后最大化的数组和](https://leetcode.cn/problems/maximize-sum-of-array-after-k-negations/) | 简单 | 翻转最多 k 次最大和 | 排序先翻负数，剩余奇数则翻绝对值最小值 |
| 1123 | [最深叶节点的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-deepest-leaves/) | 中等 | 最深叶的 LCA | 后序返回（深度，节点），左右深度相等则当前为 LCA |
| 676 | [实现一个魔法字典](https://leetcode.cn/problems/implement-magic-dictionary/) | 中等 | 改 1 个字符匹配 | 按长度分桶，同长度逐个比对差异是否为 1 |
| 419 | [甲板上的战舰](https://leetcode.cn/problems/battleships-in-a-board/) | 中等 | 统计战舰数量 | 只数“起点格”：是 X 且上/左不是 X |
| 729 | [我的日程安排表 I](https://leetcode.cn/problems/my-calendar-i/) | 中等 | 区间不重叠预定 | TreeMap 存 start->end，仅检查前驱/后继冲突 |
| 1228 | [等差数列中缺失的数字](https://leetcode.cn/problems/missing-number-in-arithmetic-progression/) | 简单 | 找缺失项 | `d=(last-first)/n`，找首个不满足期望的位置 |
| 1681 | [最小不兼容性](https://leetcode.cn/problems/minimum-incompatibility/) | 困难 | 分组最小化 max-min 之和 | 子集预处理 cost + bitmask DP 选组 |
| 757 | [设置交集大小至少为2](https://leetcode.cn/problems/set-intersection-size-at-least-two/) | 困难 | 最小集合覆盖所有区间（至少 2 点） | 按右端点排序贪心，维护两个最大已选点并补点 |
| 1390 | [四因数](https://leetcode.cn/problems/four-divisors/) | 中等 | 找恰好 4 因数的和 | 只可能是 \(p^3\) 或 \(p*q\)，判断后累加 |
| 1230 | [抛掷硬币](https://leetcode.cn/problems/toss-strange-coins/) | 中等 | 恰好 target 个正面概率 | 一维 DP：`dp[j]=dp[j]*(1-p)+dp[j-1]*p` |
| 1212 | [查询球队积分](https://leetcode.cn/problems/team-scores-in-football-tournament/) | 中等 | 按胜平负积分 | UNION ALL 拆主客两条记录，GROUP BY 汇总排序 |
| 289 | [生命游戏](https://leetcode.cn/problems/game-of-life/) | 中等 | 原地更新细胞状态 | 用第 2 位存下一状态，最后统一右移 |
