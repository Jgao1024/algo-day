# 470. 用 Rand7() 实现 Rand10()

## 题目描述
已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。

不要使用系统的 Math.random() 方法。

示例 1:
```
输入: 1
输出: [7]
```

示例 2:
```
输入: 2
输出: [8,4]
```

示例 3:
```
输入: 3
输出: [8,1,10]
```

## 解题思路
1. 拒绝采样法：
   - 使用rand7()生成1-7的随机数
   - 将1-7映射到1-10，需要生成多个随机数
   - 使用(rand7()-1)*7 + rand7()生成1-49的随机数
   - 如果生成的数在1-40范围内，则映射到1-10
   - 如果生成的数在41-49范围内，则重新生成
   - 时间复杂度：O(1)，空间复杂度：O(1)

2. 优化拒绝采样法：
   - 使用(rand7()-1)*7 + rand7()生成1-49的随机数
   - 如果生成的数在1-40范围内，则映射到1-10
   - 如果生成的数在41-49范围内，则使用这些数生成新的随机数
   - 时间复杂度：O(1)，空间复杂度：O(1)

## Java实现
```java
/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    // 拒绝采样法
    public int rand10() {
        int num;
        do {
            num = (rand7() - 1) * 7 + rand7();
        } while (num > 40);
        return num % 10 + 1;
    }
    
    // 优化拒绝采样法
    public int rand10Optimized() {
        int num;
        do {
            num = (rand7() - 1) * 7 + rand7();
        } while (num > 40);
        
        if (num <= 40) {
            return num % 10 + 1;
        }
        
        // 使用41-49生成新的随机数
        num = (num - 41) * 7 + rand7();
        if (num <= 60) {
            return num % 10 + 1;
        }
        
        // 使用61-63生成新的随机数
        num = (num - 61) * 7 + rand7();
        if (num <= 20) {
            return num % 10 + 1;
        }
        
        // 如果还是失败，重新开始
        return rand10Optimized();
    }
}
```

## Python实现
```python
# The rand7() API is already defined for you.
# def rand7():
# @return a random integer in the range 1 to 7

class Solution:
    # 拒绝采样法
    def rand10(self) -> int:
        while True:
            num = (rand7() - 1) * 7 + rand7()
            if num <= 40:
                return num % 10 + 1
    
    # 优化拒绝采样法
    def rand10Optimized(self) -> int:
        while True:
            num = (rand7() - 1) * 7 + rand7()
            if num <= 40:
                return num % 10 + 1
            
            # 使用41-49生成新的随机数
            num = (num - 41) * 7 + rand7()
            if num <= 60:
                return num % 10 + 1
            
            # 使用61-63生成新的随机数
            num = (num - 61) * 7 + rand7()
            if num <= 20:
                return num % 10 + 1
```

## 复杂度分析
- 时间复杂度：O(1)，期望时间复杂度为常数
- 空间复杂度：O(1)

## 相关题目总结
1. 随机数生成类题目：
   - 用Rand7()实现Rand10()
   - 用Rand5()实现Rand7()
   - 用Rand3()实现Rand5()
   - 用Rand2()实现Rand3()

2. 解题技巧：
   - 拒绝采样
   - 概率论
   - 数学映射
   - 位运算 