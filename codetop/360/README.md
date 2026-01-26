# 题目汇总（341-360）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 429 | [N叉树的层序遍历](https://leetcode.cn/problems/n-ary-tree-level-order-traversal/) | 中等 | N 叉树按层输出 | BFS 队列按层遍历，每层固定弹 size 个 |
| 409 | [最长回文串](https://leetcode.cn/problems/longest-palindrome/) | 简单 | 最长可组成回文长度 | 统计次数取偶数部分；有奇数则中心 +1 |
| 451 | [根据字符出现频率排序](https://leetcode.cn/problems/sort-characters-by-frequency/) | 中等 | 按频率排序字符串 | 计数后按频率分桶，从高到低拼接 |
| 772 | [基本计算器 III](https://leetcode.cn/problems/basic-calculator-iii/) | 困难 | 带括号 + - * / 求值 | 递归下降解析：expr(+/-) term(* /) factor(数字/括号) |
| 1206 | [设计跳表](https://leetcode.cn/problems/design-skiplist/) | 困难 | 跳表支持查/增/删 | 从高层向下找 update；随机层数插入/删除 |
| 剑指 Offer 57 - II | [和为s的连续正数序列](https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/) | 简单 | 连续正数和为 target | 滑动窗口：小了右扩，大了左缩，等于就记录 |
| 剑指 Offer 43 | [1～n整数中1出现的次数](https://leetcode.cn/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof/) | 困难 | 统计数字 1 出现次数 | 数位统计 high/cur/low，cur=0/1/大于1 分情况 |
| 905 | [按奇偶排序数组](https://leetcode.cn/problems/sort-array-by-parity/) | 简单 | 偶数在前奇数在后 | 双指针两端夹逼，左找奇右找偶交换 |
| 29 | [两数相除](https://leetcode.cn/problems/divide-two-integers/) | 中等 | 不用乘除模做除法 | 位运算从高位试探，能减就置位并扣倍数 |
| 164 | [最大间距](https://leetcode.cn/problems/maximum-gap/) | 困难 | 排序后相邻最大差 | 桶：记录每桶 min/max，最大差只在相邻桶之间 |
| 223 | [矩形面积](https://leetcode.cn/problems/rectangle-area/) | 中等 | 两矩形总覆盖面积 | areaA+areaB-overlap（重叠宽高取交集） |
| 67 | [二进制求和](https://leetcode.cn/problems/add-binary/) | 简单 | 二进制字符串加法 | 从后往前逐位相加 + carry，最后反转 |
| 面试题 01.07 | [旋转矩阵](https://leetcode.cn/problems/rotate-matrix-lcci/) | 中等 | 原地顺时针旋转 90° | 先转置，再每行反转 |
| 698 | [划分为k个相等的子集](https://leetcode.cn/problems/partition-to-k-equal-sum-subsets/) | 中等 | 是否能分成 k 个等和子集 | 总和整除 + 降序回溯装桶，桶起点剪枝 |
| 133 | [克隆图](https://leetcode.cn/problems/clone-graph/) | 中等 | 图的深拷贝 | DFS/BFS + map(旧->新) 防重复与环 |
| 986 | [区间列表的交集](https://leetcode.cn/problems/interval-list-intersections/) | 中等 | 两个区间列表求交 | 双指针：交集取 max(start)/min(end)，移动 end 更小者 |
| 剑指 Offer 12 | [矩阵中的路径](https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/) | 中等 | 网格中找字符串路径 | DFS 回溯：匹配则占位标记，四方向搜索，回溯恢复 |
| 剑指 Offer 14- I | [剪绳子](https://leetcode.cn/problems/jian-sheng-zi-lcof/) | 中等 | 最大乘积 | 数学：尽量拆 3，剩 4 拆 2+2；n<=3 返回 n-1 |
| 137 | [只出现一次的数字 II](https://leetcode.cn/problems/single-number-ii/) | 中等 | 其余出现三次找唯一 | 位状态机 ones/twos 做按位计数 mod 3 |
| 99 | [恢复二叉搜索树](https://leetcode.cn/problems/recover-binary-search-tree/) | 困难 | BST 两节点交换恢复 | 中序找逆序对，记录 first/second，交换值恢复 |
