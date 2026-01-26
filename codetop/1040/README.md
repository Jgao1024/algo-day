# 题目汇总（1021-1040）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1287 | [有序数组中出现次数超过25%的元素](https://leetcode.cn/problems/element-appearing-more-than-25-in-sorted-array/) | 简单 | 找出现次数 >25% 的数 | 抽样候选 + 二分边界计数 |
| 196 | [删除重复的电子邮箱](https://leetcode.cn/problems/delete-duplicate-emails/) | 简单 | 邮箱去重保留最小 id | HashMap 统计 minId 再过滤 |
| 390 | [消除游戏](https://leetcode.cn/problems/elimination-game/) | 中等 | 消除后剩余最后元素 | 迭代维护 head/step/remain/方向 |
| 434 | [字符串中的单词数](https://leetcode.cn/problems/number-of-segments-in-a-string/) | 简单 | 统计单词段数 | 统计空格->非空格转折 |
| 1074 | [元素和为目标值的子矩阵数量](https://leetcode.cn/problems/number-of-submatrices-that-sum-to-target/) | 困难 | 子矩阵和=target 计数 | 固定上下边界压缩 + 前缀和计数 |
| 197 | [上升的温度](https://leetcode.cn/problems/rising-temperature/) | 简单 | 今日温度 > 昨日 | date-1 查映射比较 |
| 1542 | [找出最长的超赞子字符串](https://leetcode.cn/problems/find-longest-awesome-substring/) | 困难 | 最长“至多一个奇数次数”子串 | 奇偶 mask + earliest[mask] |
| 178 | [分数排名](https://leetcode.cn/problems/rank-scores/) | 中等 | 稠密排名 | 分数去重降序 -> rank 映射 |
| 177 | [第N高的薪水](https://leetcode.cn/problems/nth-highest-salary/) | 中等 | 去重后第 N 大 | TreeSet 去重降序取第 N |
| 181 | [超过经理收入的员工](https://leetcode.cn/problems/employees-earning-more-than-their-managers/) | 简单 | 员工薪水 > 经理 | id->salary 映射后筛选 |
| 1096 | [花括号展开 II](https://leetcode.cn/problems/brace-expansion-ii/) | 困难 | 花括号表达式展开 | 递归下降：并集/连接 + Set 去重 |
| 面试题 17.12 | [BiNode](https://leetcode.cn/problems/binode-lcci/) | 简单 | BST 转单链表 | 中序遍历原地串 right，left 置空 |
| 605 | [种花问题](https://leetcode.cn/problems/can-place-flowers/) | 简单 | 能否再种 n 朵花 | 贪心检查左右为空位 |
| 1480 | [一维数组的动态和](https://leetcode.cn/problems/running-sum-of-1d-array/) | 简单 | running sum | 前缀和累加 |
| 938 | [二叉搜索树的范围和](https://leetcode.cn/problems/range-sum-of-bst/) | 简单 | 区间和 | BST 剪枝 DFS |
| 308 | [二维区域和检索 - 可变](https://leetcode.cn/problems/range-sum-query-2d-mutable/) | 困难 | 2D 可修改区域和 | 二维 BIT（Fenwick） |
| 面试题 03.05 | [栈排序](https://leetcode.cn/problems/sort-of-stacks-lcci/) | 中等 | 栈顶最小的有序栈 | 辅助栈插入排序 |
| 1690 | [石子游戏 VII](https://leetcode.cn/problems/stone-game-vii/) | 中等 | 最大分差 | 区间 DP（分差）+ 前缀和 |
| 472 | [连接词](https://leetcode.cn/problems/concatenated-words/) | 困难 | 找由其它词拼出的词 | 长度排序 + 单词拆分 DP |
| 389 | [找不同](https://leetcode.cn/problems/find-the-difference/) | 简单 | 找多出来的字符 | 全量异或 |
