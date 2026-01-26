# 剑指 Offer 68 - II. 二叉树的最近公共祖先

- 题号：剑指 Offer 68 - II
- 难度：简单
- LeetCode：[二叉树的最近公共祖先](https://leetcode.cn/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 递归：
  - 若 `root` 为 `null` 或等于 `p/q`，直接返回 `root`
  - 分别在左右子树找 `p/q`，若左右都不为空，说明 `root` 是 LCA；否则返回不为空的那一边

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(h)\)

## 相关题目
- 236 二叉树的最近公共祖先：同题
- 235 二叉搜索树的最近公共祖先：利用 BST 性质
