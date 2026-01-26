# 剑指 Offer 30. 包含min函数的栈

- 题号：剑指 Offer 30
- 难度：简单
- LeetCode：[包含min函数的栈](https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- **辅助栈同步维护最小值**  
用两个栈：数据栈 `st` 和最小栈 `minSt`。  
每次 `push(x)`：`minSt` 同步压入 `min(x, minSt.top)`；  
`pop()` 两个栈一起弹；`min()` 直接返回 `minSt.top`。

## Java 最佳实现

```java
import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {
    private final Deque<Integer> st = new ArrayDeque<>();
    private final Deque<Integer> minSt = new ArrayDeque<>();

    public MinStack() {
    }

    public void push(int x) {
        st.push(x);
        if (minSt.isEmpty()) minSt.push(x);
        else minSt.push(Math.min(x, minSt.peek()));
    }

    public void pop() {
        st.pop();
        minSt.pop();
    }

    public int top() {
        return st.peek();
    }

    public int min() {
        return minSt.peek();
    }
}
```

## 复杂度分析
- 时间：所有操作 \(O(1)\)
- 空间：\(O(n)\)

## 相关题目
- 155 最小栈：同题
