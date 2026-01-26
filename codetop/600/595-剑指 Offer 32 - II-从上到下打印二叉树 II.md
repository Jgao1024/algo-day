# 剑指 Offer 32 - II. 从上到下打印二叉树 II

- 题号：剑指 Offer 32 - II
- 难度：简单
- LeetCode：[从上到下打印二叉树 II](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 层序遍历（推荐）  
用队列 BFS，每一层先记录当前队列大小 `size`，弹出 `size` 个节点组成一层列表，并把左右子节点入队。

## Java 最佳实现

```java
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = q.pollFirst();
                level.add(node.val);
                if (node.left != null) q.addLast(node.left);
                if (node.right != null) q.addLast(node.right);
            }
            ans.add(level);
        }
        return ans;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(n)\)

## 相关题目
- 102 二叉树的层序遍历
- 剑指 Offer 32 - I 从上到下打印二叉树

## 总结（速记）
- **按层：每轮用 `size` 固定弹出当前层**。
