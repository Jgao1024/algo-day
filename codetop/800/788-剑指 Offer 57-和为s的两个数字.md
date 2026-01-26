# 剑指 Offer 57. 和为s的两个数字

- 题号：剑指 Offer 57
- 难度：简单
- LeetCode：[和为s的两个数字](https://leetcode.cn/problems/he-wei-sde-liang-ge-shu-zi-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 思路：双指针  
数组有序，左指针 `l`、右指针 `r`：  
`sum < target` 左移 `l++`，`sum > target` 右移 `r--`，相等就返回。

## Java 最佳实现

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{nums[l], nums[r]};
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }
}
```

## 复杂度分析
- 时间：\(O(n)\)
- 空间：\(O(1)\)

## 相关题目
- 167 两数之和 II：输入有序数组
