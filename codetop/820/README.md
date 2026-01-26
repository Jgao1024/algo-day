# 题目汇总（801-820）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 867 | [转置矩阵](https://leetcode.cn/problems/transpose-matrix/) | 简单 | 行列互换 | 直接构造 res[j][i]=a[i][j] |
| 剑指 Offer 28 | [对称的二叉树](https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/) | 简单 | 判断是否镜像 | 递归比较左右子树镜像 |
| 81 | [搜索旋转排序数组 II](https://leetcode.cn/problems/search-in-rotated-sorted-array-ii/) | 中等 | 旋转数组查找（有重复） | 二分；遇到 l==m==r 收缩 |
| 457 | [环形数组循环](https://leetcode.cn/problems/circular-array-loop/) | 中等 | 同方向环检测 | 快慢指针 + 路径置 0 |
| 637 | [二叉树的层平均值](https://leetcode.cn/problems/average-of-levels-in-binary-tree/) | 简单 | 每层平均值 | BFS 按层求和/计数 |
| 1356 | [根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/) | 简单 | 按 bitcount 排序 | bitCount 升序，值升序 |
| 871 | [最低加油次数](https://leetcode.cn/problems/minimum-number-of-refueling-stops/) | 困难 | 最少加油到终点 | 贪心 + 大根堆 |
| 1299 | [将每个元素替换为右侧最大元素](https://leetcode.cn/problems/replace-elements-with-greatest-element-on-right-side/) | 简单 | 右侧最大值替换 | 从右往左维护最大值 |
| 剑指 Offer 56 - I | [数组中数字出现的次数](https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/) | 中等 | 找两个只出现一次的数 | 异或 + lowbit 分组 |
| 278 | [第一个错误的版本](https://leetcode.cn/problems/first-bad-version/) | 简单 | 找第一个 true | 二分边界 |
| 815 | [公交路线](https://leetcode.cn/problems/bus-routes/) | 困难 | 最少换乘次数 | BFS（站点扩线路）+ visitedRoute |
| 1411 | [给 N x 3 网格图涂色的方案数](https://leetcode.cn/problems/number-of-ways-to-paint-n-3-grid/) | 困难 | 计数 DP | 两状态 DP（aba/abc） |
| 362 | [敲击计数器](https://leetcode.cn/problems/design-hit-counter/) | 中等 | 近 5 分钟 hit 次数 | 300 桶循环数组 |
| 面试题 16.03 | [交点](https://leetcode.cn/problems/intersection-lcci/) | 困难 | 线段交点 | 向量求交点；共线取最小点 |
| 220 | [存在重复元素 III](https://leetcode.cn/problems/contains-duplicate-iii/) | 中等 | 同时限制差值/距离 | 桶 HashMap（宽度 t+1） |
| 剑指 Offer 58 - II | [左旋转字符串](https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/) | 简单 | 字符串左旋 n 位 | substring 拼接 |
| 1201 | [丑数 III](https://leetcode.cn/problems/ugly-number-iii/) | 中等 | 第 n 个可整除数 | 二分 + lcm 容斥计数 |
| 1526 | [形成目标数组的子数组最少增加次数](https://leetcode.cn/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/) | 困难 | 最少区间加 1 次数 | sum(max(0, diff)) 贪心 |
| 624 | [数组列表中的最大距离](https://leetcode.cn/problems/maximum-distance-in-arrays/) | 简单 | 选两个数组最大差 | 维护全局 min/max 扫描 |
| 925 | [长按键入](https://leetcode.cn/problems/long-pressed-name/) | 简单 | 是否为长按结果 | 双指针匹配/跳重复 |
