# 题目汇总（1081-1100）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 1247 | [交换字符使得字符串相同](https://leetcode.cn/problems/minimum-swaps-to-make-strings-equal/) | 中等 | 最少交换次数 | 统计 xy/yx 数量：`xy/2 + yx/2 + (xy%2)*2` |
| 296 | [最佳的碰头地点](https://leetcode.cn/problems/best-meeting-point/) | 困难 | 最小曼哈顿距离和 | 行/列分别取中位数，距离可分解相加 |
| 646 | [最长数对链](https://leetcode.cn/problems/maximum-length-of-pair-chain/) | 中等 | 最长可连接数对 | 按右端点排序贪心选取 |
| 888 | [公平的糖果交换](https://leetcode.cn/problems/fair-candy-swap/) | 简单 | 交换一颗使总和相等 | 解方程得到 `b=a+(sumB-sumA)/2`，用集合查找 |
| 854 | [相似度为 K 的字符串](https://leetcode.cn/problems/k-similar-strings/) | 困难 | 最少交换使字符串相等 | BFS 状态搜索：固定首个不匹配位，只尝试能匹配目标位的交换剪枝 |
| 219 | [存在重复元素 II](https://leetcode.cn/problems/contains-duplicate-ii/) | 简单 | 距离不超过 k 的重复 | HashMap 记录最近下标判断差值 |
| 1328 | [破坏回文串](https://leetcode.cn/problems/break-a-palindrome/) | 中等 | 改 1 个字符使字典序最小且非回文 | 前半段首个非 a 改 a，否则末位改 b |
| 897 | [递增顺序查找树](https://leetcode.cn/problems/increasing-order-search-tree/) | 简单 | BST 重排成右链 | 中序遍历依次串接，左指针置空 |
| 861 | [翻转矩阵后的得分](https://leetcode.cn/problems/score-after-flipping-matrix/) | 中等 | 最大二进制行和 | 先让首列全为 1（行翻转），再逐列取 1 多的一侧贡献 |
| 1446 | [连续字符](https://leetcode.cn/problems/consecutive-characters/) | 简单 | 最大连续段长度 | 扫描统计连续段 |
| 941 | [有效的山脉数组](https://leetcode.cn/problems/valid-mountain-array/) | 简单 | 先升后降 | 双指针先爬升到峰顶再爬降到末尾 |
| 844 | [比较含退格的字符串](https://leetcode.cn/problems/backspace-string-compare/) | 简单 | 退格后是否相等 | 双指针从后往前跳过退格字符比较 |
| 1675 | [数组的最小偏移量](https://leetcode.cn/problems/minimize-deviation-in-array/) | 困难 | 最小化 max-min | 奇数先 *2，最大堆不断把最大偶数除 2 更新答案 |
| 999 | [可以被一步捕获的棋子数](https://leetcode.cn/problems/available-captures-for-rook/) | 简单 | 车四方向可吃几兵 | 找 R 后四方向扫到 B/p/边界 |
| 950 | [按递增顺序显示卡牌](https://leetcode.cn/problems/reveal-cards-in-increasing-order/) | 中等 | 找初始牌序 | 反向模拟：队尾移到队首，再把当前最大牌放队首 |
| 1567 | [乘积为正数的最长子数组长度](https://leetcode.cn/problems/maximum-length-of-subarray-with-positive-product/) | 中等 | 最长正乘积子数组 | DP 维护 pos/neg 长度，遇负数交换更新 |
| 570 | [至少有5名直接下属的经理](https://leetcode.cn/problems/managers-with-at-least-5-direct-reports/) | 中等 | 找下属>=5 的经理 | SQL：按 managerId 分组 count>=5 再取名字 |
| 355 | [设计推特](https://leetcode.cn/problems/design-twitter/) | 中等 | 关注/发推/拉取动态 | 推文列表 + 关注集合，feed 用堆做 K 路归并取 10 条 |
| 1475 | [商品折扣后的最终价格](https://leetcode.cn/problems/final-prices-with-a-special-discount-in-a-shop/) | 简单 | 右侧第一个 <= 的折扣 | 单调栈维护下标，遇到更小就回填折扣 |
| 493 | [翻转对](https://leetcode.cn/problems/reverse-pairs/) | 困难 | 统计 i<j 且 nums[i]>2*nums[j] | 归并排序分治，跨段用双指针计数 |
