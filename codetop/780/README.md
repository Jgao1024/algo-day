# 题目汇总（761-780）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 688 | [“马”在棋盘上的概率](https://leetcode.cn/problems/knight-probability-in-chessboard/) | 中等 | K 步后仍在棋盘内的概率 | DP 逐步转移（二维概率） |
| 1494 | [并行课程 II](https://leetcode.cn/problems/parallel-courses-ii/) | 困难 | 每学期最多选 k 门的最小学期数 | 状压 DP + 枚举可选子集 |
| 482 | [密钥格式化](https://leetcode.cn/problems/license-key-formatting/) | 简单 | 重排分组并转大写 | 从后往前计数插入 '-' |
| 剑指 Offer 20 | [表示数值的字符串](https://leetcode.cn/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/) | 中等 | 判断字符串是否为合法数值 | 一次扫描（符号/点/指数） |
| 396 | [旋转函数](https://leetcode.cn/problems/rotate-function/) | 中等 | 求旋转函数最大值 | 递推：F(k)=F(k-1)+sum-n*moved |
| 485 | [最大连续1的个数](https://leetcode.cn/problems/max-consecutive-ones/) | 简单 | 最长连续 1 | 一次扫描计数 |
| 剑指 Offer 68 - I | [二叉搜索树的最近公共祖先](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/) | 简单 | BST 上找 LCA | 利用 BST 性质走一条路 |
| 542 | [01 矩阵](https://leetcode.cn/problems/01-matrix/) | 中等 | 每个 1 到最近 0 的距离 | 多源 BFS（所有 0 入队） |
| 383 | [赎金信](https://leetcode.cn/problems/ransom-note/) | 简单 | magazine 是否能拼出 ransomNote | 26 计数消耗 |
| 面试题 17.05 | [字母与数字](https://leetcode.cn/problems/find-longest-subarray-lcci/) | 中等 | 字母数=数字数的最长子数组 | 前缀差 + 记录最早位置 |
| 剑指 Offer 32 - I | [从上到下打印二叉树](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/) | 中等 | 层序输出二叉树 | BFS 队列 |
| 1059 | [从始点到终点的所有路径](https://leetcode.cn/problems/all-paths-from-source-lead-to-destination/) | 中等 | 所有路径都必须到终点且无环 | DFS 三色标记 + 终点出度为 0 |
| 剑指 Offer 55 - II | [平衡二叉树](https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/) | 简单 | 判断是否高度平衡 | 后序返回高度/ -1 |
| 799 | [香槟塔](https://leetcode.cn/problems/champagne-tower/) | 中等 | 模拟香槟溢出流动 | DP 溢出向下分流 |
| 1574 | [删除最短的子数组使剩余数组有序](https://leetcode.cn/problems/shortest-subarray-to-be-removed-to-make-array-sorted/) | 中等 | 删除最短中间段使非递减 | 前后有序段 + 双指针拼接 |
| 669 | [修剪二叉搜索树](https://leetcode.cn/problems/trim-a-binary-search-tree/) | 简单 | 只保留区间内节点 | 递归利用 BST 性质 |
| 510 | [二叉搜索树中的中序后继 II](https://leetcode.cn/problems/inorder-successor-in-bst-ii/) | 中等 | 给 parent 指针求中序后继 | 右子树最左 / 向上找转折 |
| 剑指 Offer 06 | [从尾到头打印链表](https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/) | 简单 | 逆序输出链表值 | 先存入数组再倒序 |
| 880 | [索引处的解码字符串](https://leetcode.cn/problems/decoded-string-at-index/) | 中等 | 求解码后第 K 个字符 | 先算长度再反推 K |
| 727 | [最小窗口子序列](https://leetcode.cn/problems/minimum-window-subsequence/) | 困难 | 最短子串包含 t 作为子序列 | DP 记录窗口起点（O(nm)) |
