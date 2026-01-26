# 剑指 Offer 32 - III. 从上到下打印二叉树 III

- 题号：剑指 Offer 32 - III
- 难度：中等
- LeetCode：[从上到下打印二叉树 III](https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 层序遍历，每一层用 `LinkedList` 存放结果：
  - 从左到右：`addLast`
  - 从右到左：`addFirst`
- 每层结束切换方向。

## Java 最佳实现

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (leftToRight) {
                    level.addLast(node.val);
                } else {
                    level.addFirst(node.val);
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            ans.add(level);
            leftToRight = !leftToRight;
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
- 103 二叉树的锯齿形层序遍历
