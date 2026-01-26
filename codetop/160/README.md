# 题目汇总（141-160）

| 题号 | 题目 | 难度 | 概述 | 最佳解法思路 |
| --- | --- | --- | --- | --- |
| 440 | [字典序的第K小数字](https://leetcode.cn/problems/k-th-smallest-in-lexicographical-order/) | 困难 | 字典序第 k 小 | 数字前缀树计数，按 steps 跳过子树或下探 |
| 135 | [分发糖果](https://leetcode.cn/problems/candy/) | 困难 | 最少糖果分配 | 左右两次扫描，合并两侧约束取最大 |
| 442 | [数组中重复的数据](https://leetcode.cn/problems/find-all-duplicates-in-an-array/) | 中等 | 找所有出现两次的数 | 值域 1..n 原地符号标记，二次访问即重复 |
| 剑指 Offer 40 | [最小的k个数](https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/) | 简单 | 取最小 k 个 | QuickSelect 平均 \(O(n)\)；或大根堆 \(O(n\log k)\) |
| 剑指 Offer 54 | [二叉搜索树的第k大节点](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/) | 简单 | BST 第 k 大 | 反向中序（右-根-左）数到第 k 个 |
| 208 | [实现 Trie (前缀树)](https://leetcode.cn/problems/implement-trie-prefix-tree/) | 中等 | 前缀树实现 | children[26] + isEnd，插入/查询沿字符走 |
| 445 | [两数相加 II](https://leetcode.cn/problems/add-two-numbers-ii/) | 中等 | 高位在前相加 | 两栈从低位相加 + carry，结果头插 |
| 10 | [正则表达式匹配](https://leetcode.cn/problems/regular-expression-matching/) | 困难 | . 与 * 正则匹配 | DP：* 分 0 次（j-2）或多次（i-1,j）两种 |
| 剑指 Offer 42 | [连续子数组的最大和](https://leetcode.cn/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/) | 简单 | 最大子数组和 | Kadane：`cur=max(x,cur+x)` 更新全局最大 |
| 450 | [删除二叉搜索树中的节点](https://leetcode.cn/problems/delete-node-in-a-bst/) | 中等 | BST 删除节点 | 递归定位 + 分类；双子树用后继替换再删除 |
| 剑指 Offer 10- II | [青蛙跳台阶问题](https://leetcode.cn/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/) | 简单 | 1/2 步走法数 | 滚动 DP（斐波那契同型）取模 |
| 补充题2 | [圆环回原点问题](https://mp.weixin.qq.com/s/NZPaFsFrTybO3K3s7p7EVg) | 中等 | 圆环走 m 步回到 0 | DP：`dp[step][j]=dp[step-1][j-1]+dp[step-1][j+1]` 滚动 |
| 347 | [前 K 个高频元素](https://leetcode.cn/problems/top-k-frequent-elements/) | 中等 | TopK 高频 | 频次统计 + 大小为 k 的小根堆 |
| 剑指 Offer 10- I | [斐波那契数列](https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/) | 简单 | 斐波那契取模 | 两变量滚动迭代 |
| 45 | [跳跃游戏 II](https://leetcode.cn/problems/jump-game-ii/) | 中等 | 最少跳跃次数 | 贪心分层：到边界 `end` 就步数+1，边界=下一步最远 |
| 剑指 Offer 04 | [二维数组中的查找](https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/) | 简单 | 行列有序查找 | 右上角出发：大了左移，小了下移 |
| 225 | [用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/) | 简单 | 队列模拟栈 | 单队列：push 后旋转 `size-1` 次把新元素转到队头 |
| 678 | [有效的括号字符串](https://leetcode.cn/problems/valid-parenthesis-string/) | 中等 | 带 * 的括号匹配 | 贪心区间 `[low,high]` 维护可行未匹配左括号数 |
| 295 | [数据流的中位数](https://leetcode.cn/problems/find-median-from-data-stream/) | 困难 | 动态中位数 | 双堆：左大根堆、右小根堆，保持平衡 |
| 213 | [打家劫舍 II](https://leetcode.cn/problems/house-robber-ii/) | 中等 | 圆环打家劫舍 | 拆两次线性：`max(rob(0..n-2), rob(1..n-1))` |
