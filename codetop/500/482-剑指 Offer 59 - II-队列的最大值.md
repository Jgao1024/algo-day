# 剑指 Offer 59 - II. 队列的最大值

- 题号：剑指 Offer 59 - II
- 难度：中等
- LeetCode：[队列的最大值](https://leetcode.cn/problems/dui-lie-de-zui-da-zhi-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 单调队列（推荐）  
用两个队列：  
- `q` 存真实数据；  
- `max` 维护从队头到队尾递减的候选最大值。  
入队时把 `max` 队尾所有小于新值的都弹掉；出队时如果弹出的值等于 `max` 队头，则 `max` 同步出队。

## Java 最佳实现

```java
import java.util.ArrayDeque;
import java.util.Deque;

class MaxQueue {
    private final Deque<Integer> q = new ArrayDeque<>();
    private final Deque<Integer> max = new ArrayDeque<>();

    public MaxQueue() {
    }

    public int max_value() {
        return max.isEmpty() ? -1 : max.peekFirst();
    }

    public void push_back(int value) {
        q.addLast(value);
        while (!max.isEmpty() && max.peekLast() < value) {
            max.pollLast();
        }
        max.addLast(value);
    }

    public int pop_front() {
        if (q.isEmpty()) return -1;
        int v = q.pollFirst();
        if (!max.isEmpty() && max.peekFirst() == v) {
            max.pollFirst();
        }
        return v;
    }
}
```

## 复杂度分析
- 时间：每个操作均摊 \(O(1)\)
- 空间：\(O(n)\)

## 相关题目
- 239 滑动窗口最大值（单调队列）

## 总结（速记）
- **最大值用单调递减队列维护；入队弹小，出队同步弹头**。
