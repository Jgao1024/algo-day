# 题目汇总（501-520）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 746 | [使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs/) | 简单 | 到达楼顶的最小花费 | 台阶 DP：`dp[i]=min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2])`（滚动） |
| 1423 | [可获得的最大点数](https://leetcode.cn/problems/maximum-points-you-can-obtain-from-cards/) | 中等 | 两端取 k 张最大和 | 转化：总和 - 中间长度 `n-k` 的最小窗口和（滑动窗口） |
| 398 | [随机数索引](https://leetcode.cn/problems/random-pick-index/) | 中等 | 等概率返回目标下标 | 蓄水池抽样：第 `cnt` 个目标以 `1/cnt` 概率替换答案 |
| 1195 | [交替打印字符串](https://leetcode.cn/problems/fizz-buzz-multithreaded/) | 中等 | 多线程 FizzBuzz 顺序打印 | Semaphore：number 线程分发，fizz/buzz/fizzbuzz 打印后归还执行权 |
| 1026 | [节点与其祖先之间的最大差值](https://leetcode.cn/problems/maximum-difference-between-node-and-ancestor/) | 中等 | 节点与祖先差值最大 | DFS 传递路径 `min/max`，每点更新答案 |
| 1254 | [统计封闭岛屿的数目](https://leetcode.cn/problems/number-of-closed-islands/) | 中等 | 不接触边界的岛屿数量 | 先从边界淹没连通陆地，再对剩余陆地连通块计数 |
| 292 | [Nim 游戏](https://leetcode.cn/problems/nim-game/) | 简单 | 取石子博弈 | 结论：`n%4!=0` 先手胜 |
| 58 | [最后一个单词的长度](https://leetcode.cn/problems/length-of-last-word/) | 简单 | 最后一个单词长度 | 从后扫：跳过空格再计数 |
| 987 | [二叉树的垂序遍历](https://leetcode.cn/problems/vertical-order-traversal-of-a-binary-tree/) | 中等 | 按列/行/值排序分组 | DFS 收集 `(col,row,val)` 后排序并按 col 分组 |
| 829 | [连续整数求和](https://leetcode.cn/problems/consecutive-numbers-sum/) | 困难 | 连续正整数表示方式数 | 枚举长度 \(k\)：判断 `n-k(k-1)/2` 是否能被 `k` 整除 |
| 面试题 16.26 | [计算器](https://leetcode.cn/problems/calculator-lcci/) | 中等 | 表达式计算（含括号） | 两栈：数字栈+运算符栈，按优先级与括号规则计算 |
| 1115 | [交替打印FooBar](https://leetcode.cn/problems/print-foobar-alternately/) | 中等 | 两线程交替打印 | 两个 Semaphore：`fooSem(1)`/`barSem(0)` 交替 acquire/release |
| 269 | [火星词典](https://leetcode.cn/problems/alien-dictionary/) | 困难 | 推导字母顺序 | 相邻单词建边 + 前缀非法判断 + 拓扑排序判环/输出 |
| 1249 | [移除无效的括号](https://leetcode.cn/problems/minimum-remove-to-make-valid-parentheses/) | 中等 | 最少移除使括号有效 | 两次扫描：左扫删多余 `)`，右扫删多余 `(` |
| 1120 | [子树的最大平均值](https://leetcode.cn/problems/maximum-average-subtree/) | 中等 | 任意子树最大平均值 | 后序 DFS 返回 `(sum,cnt)`，每节点更新 `sum/cnt` |
| 面试题 17.15 | [最长单词](https://leetcode.cn/problems/longest-word-lcci/) | 中等 | 最长可由其它单词拼接的词 | 按长度排序，逐个用 wordBreak DP 判断（字典为更短单词集） |
| 1227 | [飞机座位分配概率](https://leetcode.cn/problems/airplane-seat-assignment-probability/) | 中等 | 第 n 人坐到自己座位概率 | 结论：`n==1` 为 1，否则为 0.5 |
| 274 | [H 指数](https://leetcode.cn/problems/h-index/) | 中等 | 论文 H 指数 | 排序后扫描：找最大 `h` 满足至少 `h` 篇 \(\ge h\) |
| 791 | [自定义字符串排序](https://leetcode.cn/problems/custom-sort-string/) | 中等 | 按 order 重排字符串 | 计数数组：先写 order 里的，再写剩余字符 |
| 116 | [填充每个节点的下一个右侧节点指针](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/) | 中等 | 完美二叉树 next 指针连接 | O(1) 逐层：`left->right`，`right->next.left` |
