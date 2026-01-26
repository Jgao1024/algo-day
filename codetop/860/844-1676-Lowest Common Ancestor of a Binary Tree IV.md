# 1676. Lowest Common Ancestor of a Binary Tree IV

- 题号：1676
- 难度：中等
- LeetCode：[Lowest Common Ancestor of a Binary Tree IV](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree-iv/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 多节点版 LCA：
  - 先把 `nodes` 放进 HashSet 便于 \(O(1)\) 判断
  - 递归：若当前节点在集合内，直接返回它
  - 若左右递归结果都非空，当前节点就是 LCA；否则返回不为空的那边

## Java 最佳实现

```java
import java.util.HashSet;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private final Set<TreeNode> set = new HashSet<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        for (TreeNode n : nodes) set.add(n);
        return dfs(root);
    }

    private TreeNode dfs(TreeNode node) {
        if (node == null) return null;
        if (set.contains(node)) return node;
        TreeNode left = dfs(node.left);
        TreeNode right = dfs(node.right);
        if (left != null && right != null) return node;
        return left != null ? left : right;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(h + k)\)

## 相关题目
- 236 二叉树的最近公共祖先：两节点版
- 1644 二叉树的最近公共祖先 II：节点可能不存在
