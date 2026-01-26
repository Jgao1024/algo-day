# 题目汇总（121-140）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 958 | [二叉树的完全性检验](https://leetcode.cn/problems/check-completeness-of-a-binary-tree/) | 中等 | 完全二叉树判断 | 层序遍历：遇到 null 后不能再出现非空 |
| 剑指 Offer 51 | [数组中的逆序对](https://leetcode.cn/problems/shu-zu-zhong-de-ni-xu-dui-lcof/) | 困难 | 统计逆序对 | 归并排序：合并时累计 `mid - i + 1` |
| 498 | [对角线遍历](https://leetcode.cn/problems/diagonal-traverse/) | 中等 | 对角线遍历矩阵 | 按 `d=row+col` 模拟，偶数向上右、奇数向下左 |
| 剑指 Offer 09 | [用两个栈实现队列](https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/) | 简单 | 两栈实现队列 | `in/out` 两栈：`out` 空才把 `in` 倒过去（均摊 \(O(1)\)） |
| 26 | [删除排序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) | 简单 | 有序数组去重 | 快慢指针原地覆盖，返回 `slow+1` |
| 剑指 Offer 36 | [二叉搜索树与双向链表](https://leetcode.cn/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/) | 中等 | BST 转循环双向链表 | 中序遍历用 `pre` 串联，最后头尾相连成环 |
| 补充题1 | [排序奇升偶降链表](https://mp.weixin.qq.com/s/0WVa2wIAeG0nYnVndZiEXQ) | 中等 | 奇位升序/偶位降序链表排序 | 拆奇偶两链表，反转偶链表后归并 |
| 剑指 Offer 26 | [树的子结构](https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/) | 中等 | 判断 B 是否为 A 的子结构 | 遍历 A 选起点 + `match(a,b)` 递归匹配 |
| 114 | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) | 中等 | 前序展开为右链表 | 原地迭代：左子树搬到右边，右子树接到左子树最右端 |
| 74 | [搜索二维矩阵](https://leetcode.cn/problems/search-a-2d-matrix/) | 中等 | 矩阵整体有序查找 | 一维二分：`mid -> (mid/n, mid%n)` |
| 7 | [整数反转](https://leetcode.cn/problems/reverse-integer/) | 简单 | 反转整数并处理溢出 | 逐位弹出 + 更新前做越界判定 |
| 补充题23 | [检测循环依赖](https://mp.weixin.qq.com/s/pCRscwKqQdYYN7M1Sia7xA) | 中等 | 判断有向图是否有环 | Kahn 拓扑：`cnt!=n` 判有环 |
| 50 | [Pow(x, n)](https://leetcode.cn/problems/powx-n/) | 中等 | 快速幂 | 指数二进制拆分，`base*=base`、遇 1 位 `ans*=base` |
| 75 | [颜色分类](https://leetcode.cn/problems/sort-colors/) | 中等 | 0/1/2 原地排序 | 荷兰国旗：`low/i/high` 三指针分区 |
| 91 | [解码方法](https://leetcode.cn/problems/decode-ways/) | 中等 | 数字字符串解码数 | DP：看 1 位/2 位，滚动变量 |
| 125 | [验证回文串](https://leetcode.cn/problems/valid-palindrome/) | 简单 | 忽略非字母数字的回文判断 | 双指针跳过无效字符，统一小写比较 |
| 572 | [另一个树的子树](https://leetcode.cn/problems/subtree-of-another-tree/) | 简单 | 判断子树是否完全相同 | 遍历 root 选起点 + same(两树相同) |
| 145 | [二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/) | 中等 | 后序遍历 | 栈 + `prev` 判断孩子是否处理完 |
| 59 | [螺旋矩阵 II](https://leetcode.cn/problems/spiral-matrix-ii/) | 中等 | 生成螺旋矩阵 | 四边界收缩，按圈填充 |
| 329 | [矩阵中的最长递增路径](https://leetcode.cn/problems/longest-increasing-path-in-a-matrix/) | 困难 | 网格 DAG 最长路 | 计算出度 + 拓扑分层（从峰顶剥离） |
