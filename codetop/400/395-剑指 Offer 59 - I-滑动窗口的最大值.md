# 剑指 Offer 59 - I. 滑动窗口的最大值

- 题号：剑指 Offer 59 - I
- 难度：困难
- LeetCode：[滑动窗口的最大值](https://leetcode.cn/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 思路（推荐）：单调队列（存下标）  
队列保持从队首到队尾对应值单调递减：  
- 新元素进来前，把队尾所有比它小的下标弹出  
- 队首如果已滑出窗口（`<= i-k`）则弹出  
每步窗口形成后，队首就是最大值。

## Java 最佳实现

```java
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.addLast(i);

            if (dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(k)\)

## 相关题目
- 239 滑动窗口最大值：同题
