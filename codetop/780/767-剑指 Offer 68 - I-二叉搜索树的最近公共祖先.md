# 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先

- 题号：剑指 Offer 68 - I
- 难度：简单
- LeetCode：[二叉搜索树的最近公共祖先](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- **利用 BST 性质走一条路**  
若 `p`、`q` 都在当前节点左边，就往左走；都在右边就往右走。  
第一次出现“分叉”（一个在左一个在右，或当前等于其中一个）的位置，就是最近公共祖先。

## Java 最佳实现

```java
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = p.val;
        int b = q.val;
        TreeNode cur = root;
        while (cur != null) {
            if (a < cur.val && b < cur.val) {
                cur = cur.left;
            } else if (a > cur.val && b > cur.val) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }
}
```

## 复杂度分析
- 时间：\(O(h)\)
- 空间：\(O(1)\)

## 相关题目
- 236 二叉树的最近公共祖先：普通二叉树版
