# 剑指 Offer 53 - I. 在排序数组中查找数字 I

- 题号：剑指 Offer 53 - I
- 难度：简单
- LeetCode：[在排序数组中查找数字 I](https://leetcode.cn/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 思路1（推荐）：二分找边界  
有序数组里统计 `target` 出现次数：  
`count = lowerBound(target+1) - lowerBound(target)`，其中 `lowerBound(x)` 是第一个 `>= x` 的下标。

## Java 最佳实现

```java
class Solution {
    public int search(int[] nums, int target) {
        return lowerBound(nums, target + 1) - lowerBound(nums, target);
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
```

## 复杂度分析
- 时间：\(O(\log n)\)
- 空间：\(O(1)\)

## 相关题目
- 34 在排序数组中查找元素的第一个和最后一个位置
- 704 二分查找

## 总结（速记）
- 计数题：**找左右边界**，用 `lowerBound` 最省事。  
