# 剑指 Offer 57 - II. 和为s的连续正数序列

- 题号：剑指 Offer 57 - II
- 难度：简单
- LeetCode：[和为s的连续正数序列](https://leetcode.cn/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/)

## 题目描述
输入一个正整数 `target`，输出所有和为 `target` 的连续正整数序列（至少 2 个数）。

## 示例
- 示例  
输入：`target = 9`  
输出：`[[2,3,4],[4,5]]`

## 最佳解法思路
- 滑动窗口（推荐）  
用双指针表示连续区间 `[l, r]`（初始 1,2），维护区间和 `sum`。  
`sum < target` 扩大右边；`sum > target` 缩小左边；相等时记录答案后继续移动左边。

## Java 最佳实现

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int l = 1, r = 2;
        int sum = l + r;
        while (l < r) {
            if (sum == target) {
                int[] seq = new int[r - l + 1];
                for (int i = 0; i < seq.length; i++) seq[i] = l + i;
                res.add(seq);
                sum -= l;
                l++;
            } else if (sum < target) {
                r++;
                sum += r;
            } else {
                sum -= l;
                l++;
            }
        }

        int[][] ans = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
}
```

## 复杂度分析
- 时间：\(O(target)\)
- 空间：\(O(1)\)（不含输出）

## 相关题目
- 560 和为 K 的子数组（前缀和）
- 209 长度最小的子数组（滑动窗口）

## 总结（速记）
- **连续正数序列用滑窗：小了右扩，大了左缩**。
