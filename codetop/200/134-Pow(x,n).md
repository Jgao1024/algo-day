# 50. Pow(x, n)

## 题目描述
实现 pow(x, n)，即计算 x 的 n 次幂函数（即，x^n）。

示例 1：
```
输入：x = 2.00000, n = 10
输出：1024.00000
```

示例 2：
```
输入：x = 2.10000, n = 3
输出：9.26100
```

示例 3：
```
输入：x = 2.00000, n = -2
输出：0.25000
解释：2^-2 = 1/2^2 = 1/4 = 0.25
```

## 解题思路
1. 快速幂：
   - 将指数n分解为二进制形式
   - 利用位运算加速计算
   - 时间复杂度：O(logn)，空间复杂度：O(1)

2. 关键点：
   - 处理负数指数
   - 处理边界情况
   - 位运算优化
   - 精度处理

## Java实现
```java
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;
        
        double half = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        
        return half * half * mod;
    }
}
```

## Python实现
```python
class Solution:
    def myPow(self, x: float, n: int) -> float:
        if n == 0:
            return 1
        if n == 1:
            return x
        if n == -1:
            return 1 / x
            
        half = self.myPow(x, n // 2)
        mod = self.myPow(x, n % 2)
        
        return half * half * mod
```

## 复杂度分析
- 时间复杂度：O(logn)，其中n为指数
- 空间复杂度：O(logn)，递归调用栈的深度

## 相关题目总结
1. 数学运算类题目：
   - Pow(x, n)
   - 平方根
   - 整数除法
   - 两数相除

2. 解题技巧：
   - 快速幂
   - 位运算
   - 递归优化
   - 边界条件处理 