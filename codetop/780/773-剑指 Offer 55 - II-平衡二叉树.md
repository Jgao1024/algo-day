# 剑指 Offer 55 - II. 平衡二叉树

- 题号：剑指 Offer 55 - II
- 难度：简单
- LeetCode：[平衡二叉树](https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- **后序递归：返回高度或 -1**  
递归拿到左右子树高度：  
  - 任一子树返回 -1，说明已不平衡，直接向上返回 -1  
  - 若 `|lh-rh|>1` 返回 -1  
  - 否则返回 `max(lh,rh)+1`  
最终判断根节点返回值是否为 -1。

## Java 最佳实现

```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;
        int lh = height(node.left);
        if (lh == -1) return -1;
        int rh = height(node.right);
        if (rh == -1) return -1;
        if (Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(h)\)

## 相关题目
- 110 平衡二叉树：同题
