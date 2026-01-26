# 剑指 Offer 32 - I. 从上到下打印二叉树

- 题号：剑指 Offer 32 - I
- 难度：中等
- LeetCode：[从上到下打印二叉树](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- **BFS 层序遍历**  
用队列从根开始逐层弹出节点，把值依次加入数组/列表，左右子节点入队。

## Java 最佳实现

```java
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            list.add(cur.val);
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(n)\)

## 相关题目
- 102 二叉树的层序遍历
