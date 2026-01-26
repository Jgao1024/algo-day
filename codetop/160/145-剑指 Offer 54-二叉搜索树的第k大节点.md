# 剑指 Offer 54. 二叉搜索树的第k大节点

- 题号：剑指 Offer 54
- 难度：简单
- LeetCode：[二叉搜索树的第k大节点](https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/)

## 题目描述
给定一棵二叉搜索树（BST），请找出其中第 `k` 大的节点的值。

## 示例
- 示例  
输入：BST = `[3,1,4,null,2]`, k = 1  
输出：`4`

## 最佳解法思路
- 思路1（推荐）：反向中序遍历（右-根-左）  
BST 的中序遍历是升序；反向中序就是降序。遍历过程中计数，访问到第 `k` 个节点时返回即可。

- 思路2：迭代栈  
用栈模拟反向中序，避免递归。

## Java 最佳实现

```java
class Solution {
    private int k;
    private int ans;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null || k == 0) return;
        dfs(node.right);
        if (k == 0) return;
        k--;
        if (k == 0) {
            ans = node.val;
            return;
        }
        dfs(node.left);
    }
}
```

## 复杂度分析
- 时间：最坏 \(O(n)\)，通常访问到第 k 个就结束
- 空间：\(O(h)\)

## 相关题目
- 230 二叉搜索树中第K小的元素：正向中序
- 173 二叉搜索树迭代器：中序迭代
- 98 验证二叉搜索树：BST 性质题

## 总结（速记）
- BST 的第 k 大/小：直接用（反向）中序，最省代码。