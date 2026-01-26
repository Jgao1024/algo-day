# 剑指 Offer 22. 链表中倒数第k个节点

- 题号：剑指 Offer 22
- 难度：简单
- LeetCode：[链表中倒数第k个节点](https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/)

## 题目描述
输入一个链表，输出该链表中倒数第 `k` 个节点。

## 示例
- 示例  
输入：`head = [1,2,3,4,5], k = 2`  
输出：`[4,5]`

## 最佳解法思路
- 快慢指针（推荐）  
先让 `fast` 走 `k` 步，然后 `fast/slow` 同时走；当 `fast` 到尾时，`slow` 就是倒数第 `k` 个节点。

## Java 最佳实现

```java
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++) fast = fast.next;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(1)\)

## 相关题目
- 19 删除链表的倒数第 N 个节点
- 141 环形链表（快慢指针）

## 总结（速记）
- **先让快指针走 k 步，再一起走到尾**。
