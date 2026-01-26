# 剑指 Offer 53 - II. 0～n-1中缺失的数字

- 题号：剑指 Offer 53 - II
- 难度：简单
- LeetCode：[0～n-1中缺失的数字](https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 二分查找（推荐）  
有序数组满足：正常情况下 `nums[i] == i`；一旦缺了某个数后，右侧会变成 `nums[i] > i`。  
二分找第一个满足 `nums[mid] != mid` 的位置，答案就是该位置下标。

## Java 最佳实现

```java
class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
```

## 复杂度分析
- 时间：\(O(\log n)\)
- 空间：\(O(1)\)

## 相关题目
- 278 第一个错误的版本（同类二分边界）

## 总结（速记）
- **找“第一个不满足 `nums[i]==i` 的下标”**。
