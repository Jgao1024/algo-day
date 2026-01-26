# 剑指 Offer 55 - I. 二叉树的深度

- 题号：剑指 Offer 55 - I
- 难度：简单
- LeetCode：[二叉树的深度](https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 递归：树的深度 = `1 + max(depth(left), depth(right))`，空节点深度为 0。

## Java 最佳实现

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(h)\)（递归栈）

## 相关题目
- 104 二叉树的最大深度：同题
- 111 二叉树的最小深度：相似
