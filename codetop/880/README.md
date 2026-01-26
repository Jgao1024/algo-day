# 题目汇总（861-880）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 246 | [中心对称数](https://leetcode.cn/problems/strobogrammatic-number/) | 简单 | 判断旋转 180° 是否不变 | 双指针 + 映射校验 |
| 447 | [回旋镖的数量](https://leetcode.cn/problems/number-of-boomerangs/) | 简单 | 统计等距有序点对数量 | 固定点按距离分组计数 |
| 630 | [课程表 III](https://leetcode.cn/problems/course-schedule-iii/) | 困难 | 最多能上多少门课 | 按截止时间排序 + 大根堆贪心 |
| 874 | [模拟行走机器人](https://leetcode.cn/problems/walking-robot-simulation/) | 简单 | 按指令走格子并避障 | 方向模拟 + 障碍哈希 |
| 1126 | [查询活跃业务](https://leetcode.cn/problems/active-businesses/) | 中等 | 找出“至少两类事件高于均值”的业务 | 先算均值再分组 HAVING |
| 1485 | [按日期分组销售产品](https://leetcode.cn/problems/group-sold-products-by-the-date/) | 简单 | 按日期统计并拼接产品 | GROUP BY + COUNT DISTINCT + GROUP_CONCAT |
| 497 | [非重叠矩形中的随机点](https://leetcode.cn/problems/random-point-in-non-overlapping-rectangles/) | 中等 | 按面积均匀随机整点 | 前缀和加权随机 + 二分 |
| 1482 | [制作 m 束花所需的最少天数](https://leetcode.cn/problems/minimum-number-of-days-to-make-m-bouquets/) | 中等 | 最小天数满足制作条件 | 二分答案 + 贪心校验 |
| 1071 | [字符串的最大公因子](https://leetcode.cn/problems/greatest-common-divisor-of-strings/) | 简单 | 最大公共基串 | 拼接一致性 + 长度 gcd |
| 1431 | [拥有最多糖果的孩子](https://leetcode.cn/problems/kids-with-the-greatest-number-of-candies/) | 简单 | 每个孩子加额外糖果是否能到最大 | 先求 max 再判断 |
| 732 | [我的日程安排表 III](https://leetcode.cn/problems/my-calendar-iii/) | 困难 | 返回最大重叠预订数 | 扫描线差分 TreeMap |
| 1636 | [按照频率将数组升序排序](https://leetcode.cn/problems/sort-array-by-increasing-frequency/) | 简单 | 频率升序、数值降序排序 | 计数 + 自定义比较器 |
| 1250 | [检查「好数组」](https://leetcode.cn/problems/check-if-it-is-a-good-array/) | 困难 | 是否能线性组合得到 1 | gcd(nums)==1（裴蜀定理） |
| 286 | [墙与门](https://leetcode.cn/problems/walls-and-gates/) | 中等 | 房间到最近门的最短距离 | 多源 BFS（所有门入队） |
| 1590 | [使数组和能被 P 整除](https://leetcode.cn/problems/make-sum-divisible-by-p/) | 中等 | 删除最短子数组使总和可整除 | 前缀模 + 哈希表 |
| 1200 | [最小绝对差](https://leetcode.cn/problems/minimum-absolute-difference/) | 简单 | 找所有最小差的相邻对 | 排序后扫描 |
| 1640 | [能否连接形成数组](https://leetcode.cn/problems/check-array-formation-through-concatenation/) | 简单 | pieces 能否拼成 arr | 首元素映射 + 顺序匹配 |
| 面试题 16.18 | [模式匹配](https://leetcode.cn/problems/pattern-matching-lcci/) | 中等 | a/b 映射子串是否能匹配 | 枚举 lenA 推 lenB + 比对 |
| 1234 | [替换子串得到平衡字符串](https://leetcode.cn/problems/replace-the-substring-for-balanced-string/) | 中等 | 最短替换窗口使 QWER 平衡 | 滑动窗口让窗口外满足 |
| 1177 | [构建回文串检测](https://leetcode.cn/problems/can-make-palindrome-from-substring/) | 中等 | 区间能否在 k 次替换内成回文 | 前缀奇偶 mask + odd/2 <= k |
