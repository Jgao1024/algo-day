# 题目汇总（101-120）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 739 | [每日温度](https://leetcode.cn/problems/daily-temperatures/) | 中等 | 下一个更高温度距离 | 单调递减栈存下标，遇到更高温度弹栈并写距离 |
| 468 | [验证IP地址](https://leetcode.cn/problems/validate-ip-address/) | 中等 | 判断 IPv4/IPv6 合法性 | 按 `.`/`:` 拆分（保留空段）+ 逐段规则校验 |
| 207 | [课程表](https://leetcode.cn/problems/course-schedule/) | 中等 | 判断有向图是否有环 | 拓扑排序：入度 0 入队，能处理完所有点则无环 |
| 79 | [单词搜索](https://leetcode.cn/problems/word-search/) | 中等 | 网格路径匹配字符串 | DFS 回溯：匹配则占位标记，四方向搜索，回溯恢复 |
| 138 | [复制带随机指针的链表](https://leetcode.cn/problems/copy-list-with-random-pointer/) | 中等 | 深拷贝带 random 的链表 | HashMap 记录旧->新；二次遍历连接 next/random |
| 224 | [基本计算器](https://leetcode.cn/problems/basic-calculator/) | 困难 | 括号表达式求值（+/-） | 栈存外层 `res/sign`；括号内累加，遇 `)` 合并回外层 |
| 297 | [二叉树的序列化与反序列化](https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/) | 困难 | 树与字符串互转 | 前序 DFS + `#` 标记空节点；按相同顺序递归反序列化 |
| 47 | [全排列 II](https://leetcode.cn/problems/permutations-ii/) | 中等 | 全排列去重 | 排序 + used[] 回溯；同层去重 `nums[i]==nums[i-1] && !used[i-1]` |
| 153 | [寻找旋转排序数组中的最小值](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/) | 中等 | 旋转数组最小值 | 二分：比较 `nums[mid]` 与 `nums[r]` 决定向哪半边收缩 |
| 460 | [LFU缓存](https://leetcode.cn/problems/lfu-cache/) | 困难 | LFU + 同频次 LRU 淘汰 | key->node + freq->双向链表 + minFreq；淘汰 minFreq 链表尾 |
| 55 | [跳跃游戏](https://leetcode.cn/problems/jump-game/) | 中等 | 能否到达末尾 | 贪心维护最远可达 `maxReach`，出现断点则失败 |
| 40 | [组合总和 II](https://leetcode.cn/problems/combination-sum-ii/) | 中等 | 组合求和（每数最多一次，去重） | 排序回溯：同层跳重 `i>start && a[i]==a[i-1]`，递归用 `i+1` |
| 11 | [盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | 中等 | 最大容器面积 | 双指针从两端逼近，永远移动短板 |
| 402 | [移掉K位数字](https://leetcode.cn/problems/remove-k-digits/) | 中等 | 删 k 位使结果最小 | 单调递增栈：遇更小数字就弹更大的高位；最后去前导 0 |
| 136 | [只出现一次的数字](https://leetcode.cn/problems/single-number/) | 简单 | 找唯一元素 | 全部异或，成对抵消 |
| 123 | [买卖股票的最佳时机 III](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/) | 困难 | 最多两笔交易最大利润 | 四状态 DP：buy1/sell1/buy2/sell2 逐日更新 |
| 补充题5 | [手撕归并排序](https://leetcode.cn/problems/sort-an-array/) | 中等 | 分治排序 | 归并排序：分两半递归排，再合并两段有序区间 |
| 61 | [旋转链表](https://leetcode.cn/problems/rotate-list/) | 中等 | 右旋链表 k 次 | 先求长度成环，再走 `n-(k%n)` 找新尾断开 |
| 16 | [最接近的三数之和](https://leetcode.cn/problems/3sum-closest/) | 中等 | 三数和最接近 target | 排序 + 固定 i + 双指针夹逼，更新最小差 |
| 518 | [零钱兑换 II](https://leetcode.cn/problems/coin-change-ii/) | 中等 | 组合数（硬币无限） | 完全背包组合：外层 coin，内层金额递增，dp[0]=1 |
