# 题目汇总（701-720）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1000 | [合并石头的最低成本](https://leetcode.cn/problems/minimum-cost-to-merge-stones/) | 困难 | K 路合并最小代价 | 区间 DP + 前缀和（按 K-1 步长分割） |
| 338 | [比特位计数](https://leetcode.cn/problems/counting-bits/) | 中等 | 0..n 每个数的 1 个数 | dp[i]=dp[i>>1]+(i&1) |
| 面试题 17.18 | [最短超串](https://leetcode.cn/problems/shortest-supersequence-lcci/) | 中等 | 最短覆盖子数组 | 滑动窗口（覆盖 small） |
| 1041 | [困于环中的机器人](https://leetcode.cn/problems/robot-bounded-in-circle/) | 中等 | 判断是否会回到圈内 | 模拟一轮：回原点或朝向改变 |
| 751 | [IP 到 CIDR](https://leetcode.cn/problems/ip-to-cidr/) | 简单 | IP 段拆 CIDR | 位运算 lowbit + 贪心取最大块 |
| 461 | [汉明距离](https://leetcode.cn/problems/hamming-distance/) | 简单 | 两数二进制不同位数 | xor 后 bitCount |
| 277 | [搜寻名人](https://leetcode.cn/problems/find-the-celebrity/) | 中等 | 找“被所有人认识且不认识任何人” | 候选淘汰 + 验证 |
| 176 | [第二高的薪水](https://leetcode.cn/problems/second-highest-salary/) | 简单 | 去重后第 2 大 | 一次遍历维护 first/second |
| 575 | [分糖果](https://leetcode.cn/problems/distribute-candies/) | 简单 | 最多不同种类 | min(去重种类数, n/2) |
| 945 | [使数组唯一的最小增量](https://leetcode.cn/problems/minimum-increment-to-make-array-unique/) | 中等 | 最少加一使元素全不同 | 排序 + 贪心拉到 prev+1 |
| 180 | [连续出现的数字](https://leetcode.cn/problems/consecutive-numbers/) | 中等 | 连续 3 次同 num | 扫描 run-length 去重输出 |
| 1219 | [黄金矿工](https://leetcode.cn/problems/path-with-maximum-gold/) | 中等 | 网格最大路径和（不可重复走） | 回溯 DFS（走过置 0） |
| 712 | [两个字符串的最小ASCII删除和](https://leetcode.cn/problems/minimum-ascii-delete-sum-for-two-strings/) | 中等 | 两串删到相等最小代价 | 双串 DP（后缀最小删除和） |
| 430 | [扁平化多级双向链表](https://leetcode.cn/problems/flatten-a-multilevel-doubly-linked-list/) | 中等 | child 链表插入 next 位置 | DFS 返回 tail 便于拼接 |
| 1267 | [统计参与通信的服务器](https://leetcode.cn/problems/count-servers-that-communicate/) | 中等 | 行/列至少有 2 台才通信 | 统计行列计数后筛 |
| 面试题 17.19 | [消失的两个数字](https://leetcode.cn/problems/missing-two-lcci/) | 困难 | 1..n 缺 2 个数 | 异或拆分（lowbit 分组） |
| 1231 | [分享巧克力](https://leetcode.cn/problems/divide-chocolate/) | 困难 | 最大化最小甜度 | 二分答案 + 贪心切段 |
| 38 | [外观数列](https://leetcode.cn/problems/count-and-say/) | 简单 | RLE 迭代生成 | 计数连续字符构造 |
| 面试题 01.01 | [判定字符是否唯一](https://leetcode.cn/problems/is-unique-lcci/) | 简单 | 是否有重复字符 | boolean[128] 记录出现 |
| 186 | [翻转字符串里的单词 II](https://leetcode.cn/problems/reverse-words-in-a-string-ii/) | 中等 | 原地翻转单词顺序 | 先整体反转再逐词反转 |
