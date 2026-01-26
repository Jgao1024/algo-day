# 题目汇总（621-640）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 759 | [员工空闲时间](https://leetcode.cn/problems/employee-free-time/) | 困难 | 合并忙碌区间找空档 | 扁平化 + 排序合并区间 |
| 66 | [加一](https://leetcode.cn/problems/plus-one/) | 简单 | 数组表示大整数加一 | 从后往前进位 |
| 304 | [二维区域和检索 - 矩阵不可变](https://leetcode.cn/problems/range-sum-query-2d-immutable/) | 中等 | 子矩形求和 | 二维前缀和 + 容斥 |
| 剑指 Offer 56 - II | [数组中数字出现的次数 II](https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/) | 中等 | 其它数出现 3 次 | 位计数 `count%3` |
| 1497 | [检查数组对是否可以被 k 整除](https://leetcode.cn/problems/check-if-array-pairs-are-divisible-by-k/) | 中等 | 按余数配对 | 余数计数 `cnt[r]==cnt[k-r]` |
| 剑指 Offer 66 | [构建乘积数组](https://leetcode.cn/problems/gou-jian-cheng-ji-shu-zu-lcof/) | 中等 | 构造不含自身乘积 | 前后缀乘积 |
| 848 | [字母移位](https://leetcode.cn/problems/shifting-letters/) | 中等 | 后缀移位累加 | 倒序累加 `sum%26` |
| 1155 | [掷骰子的N种方法](https://leetcode.cn/problems/number-of-dice-rolls-with-target-sum/) | 中等 | 方案数计数 | DP（滚动数组） |
| 973 | [最接近原点的 K 个点](https://leetcode.cn/problems/k-closest-points-to-origin/) | 中等 | TopK 最近 | 大根堆维护 k 个 |
| 1302 | [层数最深叶子节点的和](https://leetcode.cn/problems/deepest-leaves-sum/) | 中等 | 最深层求和 | BFS 层序遍历 |
| 补充题10 | [36进制减法](https://leetcode.cn/problems/https://mp.weixin.qq.com/s/ub9GpTBjDF55hZld3V2rEA/) | 中等 | base36 字符串相减 | 竖式减法 + 借位 |
| 1060 | [有序数组中的缺失元素](https://leetcode.cn/problems/missing-element-in-sorted-array/) | 中等 | 第 k 个缺失数 | `missing(i)` + 二分 |
| 1363 | [形成三的最大倍数](https://leetcode.cn/problems/largest-multiple-of-three/) | 困难 | 最大可被 3 整除 | 计数 + 贪心删最小 |
| 564 | [寻找最近的回文数](https://leetcode.cn/problems/find-the-closest-palindrome/) | 困难 | 最近回文 | 枚举 5 个候选 |
| 305 | [岛屿数量 II](https://leetcode.cn/problems/number-of-islands-ii/) | 困难 | 动态加陆地 | 并查集 union 四邻 |
| 448 | [找到所有数组中消失的数字](https://leetcode.cn/problems/find-all-numbers-disappeared-in-an-array/) | 简单 | 找缺失元素 | 原地负号标记 |
| 剑指 Offer 05 | [替换空格](https://leetcode.cn/problems/ti-huan-kong-ge-lcof/) | 简单 | 替换字符 | StringBuilder 拼接 |
| 190 | [颠倒二进制位](https://leetcode.cn/problems/reverse-bits/) | 简单 | 位反转 | 循环 32 次移位 |
| 补充题18 | [反转双向链表](https://leetcode.cn/problemset/all/?search=%E8%A1%A5%E5%85%85%E9%A2%9818) | 中等 | 双向链表反转 | 交换 `next/prev` |
| 842 | [将数组拆分成斐波那契序列](https://leetcode.cn/problems/split-array-into-fibonacci-sequence/) | 中等 | 切分成斐波那契 | 回溯 + 剪枝 |
