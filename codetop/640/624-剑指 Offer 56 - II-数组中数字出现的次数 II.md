# 剑指 Offer 56 - II. 数组中数字出现的次数 II

- 题号：剑指 Offer 56 - II
- 难度：中等
- LeetCode：[数组中数字出现的次数 II](https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/)

## 题目描述
见题面链接。

## 示例
见题面链接。

## 最佳解法思路
- 位统计（推荐）
- 所有数字除了一个出现 1 次，其它都出现 3 次。对每一位统计 1 的个数，`count % 3` 就是答案该位。

## Java 最佳实现

```java
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int b = 0; b < 32; b++) {
            int cnt = 0;
            for (int x : nums) {
                cnt += (x >>> b) & 1;
            }
            if (cnt % 3 != 0) {
                ans |= (1 << b);
            }
        }
        return ans;
    }
}
```

## 复杂度分析
- 时间：\(O(32n)\)
- 空间：\(O(1)\)

## 相关题目
- 136 只出现一次的数字
- 137 只出现一次的数字 II
