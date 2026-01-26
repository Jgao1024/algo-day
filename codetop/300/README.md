# 题目汇总（281-300）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 706 | [设计哈希映射](https://leetcode.cn/problems/design-hashmap/) | 简单 | 手写 `put/get/remove` | 桶数组 + 拉链法 |
| 1095 | [山脉数组中查找目标值](https://leetcode.cn/problems/find-in-mountain-array/) | 困难 | 接口访问的山脉数组查找 | 先二分找峰值，再分别二分两侧 |
| 剑指 Offer 35 | [复杂链表的复制](https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/) | 中等 | 复制带 random 指针链表 | 原地穿插复制节点，设置 random，再拆分 |
| 340 | [至多包含 K 个不同字符的最长子串](https://leetcode.cn/problems/longest-substring-with-at-most-k-distinct-characters/) | 困难 | 最长子串不同字符数 ≤ K | 滑动窗口 + 计数表，超限收缩 |
| 994 | [腐烂的橘子](https://leetcode.cn/problems/rotting-oranges/) | 中等 | 网格扩散最短时间 | 多源 BFS 分层计时 |
| 312 | [戳气球](https://leetcode.cn/problems/burst-balloons/) | 困难 | 最大化区间戳破收益 | 区间 DP：枚举最后戳的气球 |
| 233 | [数字 1 的个数](https://leetcode.cn/problems/number-of-digit-one/) | 困难 | 统计 1..n 中 '1' 出现次数 | 按位拆 high/cur/low 逐位累计 |
| 49 | [字母异位词分组](https://leetcode.cn/problems/group-anagrams/) | 中等 | 把异位词归类 | 26 频次编码做 key 哈希分组 |
| 334 | [递增的三元子序列](https://leetcode.cn/problems/increasing-triplet-subsequence/) | 中等 | 是否存在长度 3 的递增子序列 | 贪心维护 first/second |
| 1556 | [千位分隔数](https://leetcode.cn/problems/thousand-separator/) | 简单 | 整数格式化每 3 位加点 | 从右往左拼接，计数到 3 加 '.' |
| 172 | [阶乘后的零](https://leetcode.cn/problems/factorial-trailing-zeroes/) | 简单 | 统计 n! 末尾 0 | 统计 5 的因子数：n/5+n/25+... |
| 面试题 01.06 | [字符串压缩](https://leetcode.cn/problems/compress-string-lcci/) | 简单 | 连续字符压缩 | 统计每段长度拼接，比较长度返回 |
| 540 | [有序数组中的单一元素](https://leetcode.cn/problems/single-element-in-a-sorted-array/) | 中等 | 有序数组找唯一元素 | 二分看偶数位配对是否正常 |
| 107 | [二叉树的层次遍历 II](https://leetcode.cn/problems/binary-tree-level-order-traversal-ii/) | 中等 | 自底向上层序遍历 | BFS 分层，结果 `addFirst` |
| 150 | [逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation/) | 中等 | 栈计算后缀表达式 | 遇数入栈，遇符弹两数计算 |
| 752 | [打开转盘锁](https://leetcode.cn/problems/open-the-lock/) | 中等 | 从 "0000" 到 target 的最短步数 | BFS 状态图，visited + deadends |
| 547 | [省份数量（原朋友圈）](https://leetcode.cn/problems/number-of-provinces/) | 中等 | 统计连通分量个数 | 并查集合并相连城市 |
| 354 | [俄罗斯套娃信封问题](https://leetcode.cn/problems/russian-doll-envelopes/) | 困难 | 最多嵌套信封数 | 排序（同宽高降）+ 高度 LIS |
| 28 | [实现 strStr()](https://leetcode.cn/problems/implement-strstr/) | 简单 | 子串首次出现位置 | KMP 前缀函数 + 线性匹配 |
| 680 | [验证回文字符串 Ⅱ](https://leetcode.cn/problems/valid-palindrome-ii/) | 简单 | 最多删 1 字符能否成回文 | 双指针，首次失配尝试跳过一侧 |
