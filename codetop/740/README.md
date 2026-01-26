# 题目汇总（721-740）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1090 | [受标签影响的最大值](https://leetcode.cn/problems/largest-values-from-labels/) | 中等 | 选取受标签次数限制的最大和 | 按 value 降序贪心 + label 计数 |
| 783 | [二叉搜索树节点最小距离](https://leetcode.cn/problems/minimum-distance-between-bst-nodes/) | 简单 | BST 最小相邻差 | 中序遍历记录 prev |
| 969 | [煎饼排序](https://leetcode.cn/problems/pancake-sorting/) | 中等 | 前缀翻转排序 | 每轮把最大值翻到末尾 |
| 1099 | [小于 K 的两数之和](https://leetcode.cn/problems/two-sum-less-than-k/) | 简单 | 最大和且 < k | 排序 + 双指针 |
| 265 | [粉刷房子 II](https://leetcode.cn/problems/paint-house-ii/) | 困难 | 相邻不同色最小代价 | DP 维护上一行最小/次小 |
| 462 | [最少移动次数使数组元素相等 II](https://leetcode.cn/problems/minimum-moves-to-equal-array-elements-ii/) | 中等 | 最少 +/-1 次数 | 取中位数，累加绝对差 |
| 960 | [删列造序 III](https://leetcode.cn/problems/delete-columns-to-make-sorted-iii/) | 困难 | 删除最少列使字典序非降 | 列上的 LIS（按所有行可比较） |
| 面试题 08.13 | [堆箱子](https://leetcode.cn/problems/pile-box-lcci/) | 困难 | 三维严格递增堆叠最高 | 排序 + LIS DP |
| 1614 | [括号的最大嵌套深度](https://leetcode.cn/problems/maximum-nesting-depth-of-the-parentheses/) | 简单 | 统计最大括号深度 | 扫描计数取 max |
| 1172 | [餐盘栈](https://leetcode.cn/problems/dinner-plate-stacks/) | 困难 | 多栈 push/pop 规则 | 两个堆 + 懒清理下标 |
| 707 | [设计链表](https://leetcode.cn/problems/design-linked-list/) | 中等 | 实现链表 API | 单链表 + dummy + size |
| 1268 | [搜索推荐系统](https://leetcode.cn/problems/search-suggestions-system/) | 中等 | 每个前缀推荐 3 个 | 排序 + lowerBound + 取 3 个 |
| 353 | [贪吃蛇](https://leetcode.cn/problems/design-snake-game/) | 中等 | 模拟移动/吃食物/碰撞 | 队列蛇身 + HashSet 判重 |
| 984 | [不含 AAA 或 BBB 的字符串](https://leetcode.cn/problems/string-without-aaa-or-bbb/) | 中等 | 构造无三连字符串 | 贪心：避免末尾两连继续加同字符 |
| 1124 | [表现良好的最长时间段](https://leetcode.cn/problems/longest-well-performing-interval/) | 中等 | 最长劳累日占优区间 | 前缀和 + 记录最早位置 |
| 1345 | [跳跃游戏 IV](https://leetcode.cn/problems/jump-game-iv/) | 困难 | 最少跳到末尾 | BFS + 值到下标列表，用后删除 |
| 1375 | [灯泡开关 III](https://leetcode.cn/problems/bulb-switcher-iii/) | 中等 | 统计全蓝时刻 | 维护 max，max==i+1 计数 |
| 1483 | [树节点的第 K 个祖先](https://leetcode.cn/problems/kth-ancestor-of-a-tree-node/) | 困难 | 查询 k 级祖先 | 倍增 up 表二进制跳跃 |
| 754 | [到达终点数字](https://leetcode.cn/problems/reach-a-number/) | 中等 | 最少步到 target | 找最小 k 使 sum>=t 且差为偶数 |
| 420 | [强密码检验器](https://leetcode.cn/problems/strong-password-checker/) | 困难 | 最少编辑成强密码 | 分类讨论：插入/替换/删除削减三连 |
