# 剑指 Offer 40. 最小的k个数

- 题号：剑指 Offer 40
- 难度：简单
- LeetCode：[最小的k个数](https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/)

## 题目描述
输入整数数组 `arr` 和整数 `k`，返回最小的 `k` 个数。

返回顺序不限。

## 示例
- 示例  
输入：`arr = [3,2,1], k = 2`  
输出：`[1,2]`

## 最佳解法思路
- 思路1（推荐）：快速选择（QuickSelect）  
通过 partition 把数组分成两部分，使得前 `k` 个元素都 <= 后面的元素（不要求有序）。平均 \(O(n)\)。

- 思路2：大根堆大小为 k  
维护一个大根堆，遍历元素：堆未满直接放；堆满且当前更小则替换堆顶。复杂度 \(O(n\log k)\)。

## Java 最佳实现

```java
import java.util.Random;

class Solution {
    private final Random rnd = new Random();

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k <= 0) return new int[0];
        if (k >= arr.length) return arr;
        quickSelect(arr, 0, arr.length - 1, k - 1);
        int[] ans = new int[k];
        System.arraycopy(arr, 0, ans, 0, k);
        return ans;
    }

    private void quickSelect(int[] a, int l, int r, int target) {
        while (l <= r) {
            int p = partition(a, l, r);
            if (p == target) return;
            if (p < target) l = p + 1;
            else r = p - 1;
        }
    }

    private int partition(int[] a, int l, int r) {
        int pivotIdx = l + rnd.nextInt(r - l + 1);
        swap(a, pivotIdx, r);
        int pivot = a[r];
        int i = l;
        for (int j = l; j < r; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, r);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
```

## 复杂度分析
- 快速选择：平均 \(O(n)\)，最坏 \(O(n^2)\)（随机化后极少）
- 空间：\(O(1)\)

## 相关题目
- 215 第K大元素：同 QuickSelect
- 347 前 K 个高频元素：TopK 模型（堆/桶/选择）
- 973 最接近原点的 K 个点：选择/堆

## 总结（速记）
- TopK：追求平均线性用 QuickSelect；追求稳定/在线用堆。
