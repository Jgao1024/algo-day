# 题目汇总（1041-1060）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 228 | [汇总区间](https://leetcode.cn/problems/summary-ranges/) | 中等 | 把连续数字合并成区间字符串 | 扫描连续段输出 |
| 666 | [路径和 IV](https://leetcode.cn/problems/path-sum-iv/) | 中等 | 编码二叉树的根到叶路径和 | map 建树 + DFS |
| 930 | [和相同的二元子数组](https://leetcode.cn/problems/binary-subarrays-with-sum/) | 中等 | 统计和为 goal 的子数组数 | 前缀和 + 哈希表计数 |
| 1214 | [查找两棵二叉搜索树之和](https://leetcode.cn/problems/two-sum-bsts/) | 中等 | 两棵 BST 是否存在两数之和为 target | 一棵入 set，另一棵查补数 |
| 面试题 16.20 | [T9键盘](https://leetcode.cn/problems/t9-lcci/) | 中等 | 过滤出能匹配数字串的单词 | 字符到数字映射逐词校验 |
| 1665 | [完成所有任务的最少初始能量](https://leetcode.cn/problems/minimum-initial-energy-to-finish-tasks/) | 困难 | 最小初始能量完成所有任务 | 按 (min-actual) 降序贪心 |
| 1451 | [重新排列句子中的单词](https://leetcode.cn/problems/rearrange-words-in-a-sentence/) | 中等 | 按单词长度重排句子 | 稳定排序 + 首字母大写 |
| 1524 | [和为奇数的子数组数目](https://leetcode.cn/problems/number-of-sub-arrays-with-odd-sum/) | 中等 | 统计奇数和子数组数量 | 前缀奇偶计数（even/odd） |
| 849 | [到最近的人的最大距离](https://leetcode.cn/problems/maximize-distance-to-closest-person/) | 简单 | 找最佳空位最大化到最近人的距离 | 扫描 0 段（首尾/中间） |
| 677 | [键值映射](https://leetcode.cn/problems/map-sum-pairs/) | 中等 | 前缀求和字典 | Trie + 增量更新 delta |
| 1361 | [验证二叉树](https://leetcode.cn/problems/validate-binary-tree-nodes/) | 中等 | 判断给定左右孩子数组是否为一棵树 | 入度判根 + BFS 连通无环 |
| 剑指 Offer 30 | [包含min函数的栈](https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/) | 简单 | O(1) 获取最小值的栈 | 数据栈 + 最小栈同步 |
| 768 | [最多能完成排序的块 II](https://leetcode.cn/problems/max-chunks-to-make-sorted-ii/) | 困难 | 最大可分块数使分别排序后整体有序 | 单调栈合并块最大值 |
| 835 | [图像重叠](https://leetcode.cn/problems/image-overlap/) | 中等 | 平移两张图最大重叠 1 的数量 | 记录 1 坐标，平移向量计数 |
| 555 | [分割连接字符串](https://leetcode.cn/problems/split-concatenated-strings/) | 中等 | 选方向并切分得到最大字典序字符串 | 其他固定取较大方向 + 枚举切点 |
| 1282 | [用户分组](https://leetcode.cn/problems/group-the-people-given-the-group-size-they-belong-to/) | 中等 | 按组大小把用户分组输出 | map 收集，凑满输出 |
| 1104 | [二叉树寻路](https://leetcode.cn/problems/path-in-zigzag-labelled-binary-tree/) | 中等 | 之字形标号二叉树求根到节点路径 | 逐层镜像反推父节点 |
| 面试题 16.10 | [生存人数](https://leetcode.cn/problems/living-people-lcci/) | 中等 | 1900-2000 存活人数最多的年份 | 差分数组前缀和 |
| 1552 | [两球之间的磁力](https://leetcode.cn/problems/magnetic-force-between-two-balls/) | 中等 | 放 m 个球最大化最小距离 | 二分答案 + 贪心校验 |
| 612 | [平面上的最近距离](https://leetcode.cn/problems/shortest-distance-in-a-plane/) | 中等 | 平面点集中两点最短距离 | SQL 自连接取最小距离 |
