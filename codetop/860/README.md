# 题目汇总（841-860）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 185 | [部门工资前三高的所有员工](https://leetcode.cn/problems/department-top-three-salaries/) | 困难 | 每部门 Top3 工资 | DENSE_RANK 分组排序后取 rk<=3 |
| 1644 | [二叉树的最近公共祖先 II](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-ii/) | 中等 | LCA（节点可能不存在） | 递归求 LCA 同时统计命中 p/q，命中不足返回 null |
| 1650 | [二叉树的最近公共祖先 III](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-iii/) | 中等 | 带 parent 的 LCA | 双指针走父链，类似相交链表 |
| 1676 | [Lowest Common Ancestor of a Binary Tree IV](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-iv/) | 中等 | 多节点 LCA | HashSet 存目标节点，递归：左右都命中则当前为 LCA |
| 1372 | [二叉树中的最长交错路径](https://leetcode.cn/problems/longest-zigzag-path-in-a-binary-tree/) | 中等 | 最长 ZigZag 路径 | DFS 传入上一步方向与长度，转向+1，同向重置 |
| 787 | [K 站中转内最便宜的航班](https://leetcode.cn/problems/cheapest-flights-within-k-stops/) | 中等 | 限制中转次数的最短路 | Bellman-Ford 思想：迭代 k+1 轮松弛 |
| 1236 | [网络爬虫](https://leetcode.cn/problems/web-crawler/) | 中等 | 同域名爬取所有页面 | BFS/DFS + visited 去重 + host 过滤 |
| 1417 | [重新格式化字符串](https://leetcode.cn/problems/reformat-the-string/) | 简单 | 字母数字交替排列 | 分离两类后从数量多的一类开始交替拼接 |
| 1386 | [安排电影院座位](https://leetcode.cn/problems/cinema-seat-allocation/) | 中等 | 每排最多坐几组 4 人 | 位掩码表示占用，只判断 2-9 三个可放区间 |
| 335 | [路径交叉](https://leetcode.cn/problems/self-crossing/) | 困难 | 判断路径是否自交 | O(1) 规则检查与 i-3/i-4/i-5 边相交 |
| 535 | [TinyURL 的加密与解密](https://leetcode.cn/problems/encode-and-decode-tinyurl/) | 中等 | URL 映射短码 | 自增 id 转 base62 + 双向哈希表 |
| 1553 | [吃掉 N 个橘子的最少天数](https://leetcode.cn/problems/minimum-number-of-days-to-eat-n-oranges/) | 困难 | 最少天数吃完 | 记忆化：`1+min(n%2+f(n/2), n%3+f(n/3))` |
| 1118 | [一月有多少天](https://leetcode.cn/problems/number-of-days-in-a-month/) | 简单 | 返回某月天数 | 闰年判断 + 月份分类 |
| 1671 | [得到山形数组的最少删除次数](https://leetcode.cn/problems/minimum-number-of-removals-to-make-mountain-array/) | 困难 | 最少删除成山形 | LIS 左 + LIS(反转) 得到右，取最大山形长度 |
| 1408 | [数组中的字符串匹配](https://leetcode.cn/problems/string-matching-in-an-array/) | 简单 | 找出是别的字符串子串的词 | 双重循环 contains 判断 |
| 1492 | [n 的第 k 个因子](https://leetcode.cn/problems/the-kth-factor-of-n/) | 中等 | 第 k 个因子 | 枚举到 sqrt，先消耗小因子，再从大因子表取 |
| 157 | [用 Read4 读取 N 个字符](https://leetcode.cn/problems/read-n-characters-given-read4/) | 简单 | 读取 n 个字符 | 循环 read4 到满/到 0 |
| 833 | [字符串中的查找与替换](https://leetcode.cn/problems/find-and-replace-in-string/) | 中等 | 同时替换多个位置 | 预处理可替换起点，扫描构造结果 |
| 823 | [带因子的二叉树](https://leetcode.cn/problems/binary-trees-with-factors/) | 中等 | 因子组成的树数量 | 排序 + DP：`dp[x]+=dp[a]*dp[b]` 取模 |
| 1242 | [多线程网页爬虫](https://leetcode.cn/problems/web-crawler-multithreaded/) | 中等 | 多线程爬同域 URL | 线程池 + 并发 visited + active 计数等任务结束 |
