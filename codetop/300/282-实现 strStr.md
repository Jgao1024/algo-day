# 28. 实现strStr

## 题目描述
实现 strStr() 函数。给你两个字符串 haystack 和 needle，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回 -1。

示例 1:
```
输入：haystack = "hello", needle = "ll"
输出：2
```

示例 2:
```
输入：haystack = "aaaaa", needle = "bba"
输出：-1
```

## 解题思路
1. 暴力匹配法：
   - 遍历haystack字符串
   - 对每个位置，尝试匹配needle字符串
   - 如果匹配成功，返回当前位置
   - 如果遍历完都没有匹配成功，返回-1

2. KMP算法：
   - 构建next数组，记录needle字符串的最长公共前后缀
   - 使用next数组进行匹配
   - 当匹配失败时，利用next数组快速移动

## Java实现
```java
// 暴力匹配法
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int n = haystack.length();
        int m = needle.length();
        
        for (int i = 0; i <= n - m; i++) {
            boolean found = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        
        return -1;
    }
}

// KMP算法
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        
        int n = haystack.length();
        int m = needle.length();
        
        // 构建next数组
        int[] next = new int[m];
        next[0] = -1;
        int i = 0;
        int j = -1;
        
        while (i < m - 1) {
            if (j == -1 || needle.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        
        // 使用next数组进行匹配
        i = 0;
        j = 0;
        
        while (i < n && j < m) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        
        if (j == m) {
            return i - j;
        }
        
        return -1;
    }
}
```

## Python实现
```python
# 暴力匹配法
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
            
        n = len(haystack)
        m = len(needle)
        
        for i in range(n - m + 1):
            if haystack[i:i + m] == needle:
                return i
                
        return -1

# KMP算法
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
            
        n = len(haystack)
        m = len(needle)
        
        # 构建next数组
        next = [0] * m
        next[0] = -1
        i = 0
        j = -1
        
        while i < m - 1:
            if j == -1 or needle[i] == needle[j]:
                i += 1
                j += 1
                next[i] = j
            else:
                j = next[j]
        
        # 使用next数组进行匹配
        i = 0
        j = 0
        
        while i < n and j < m:
            if j == -1 or haystack[i] == needle[j]:
                i += 1
                j += 1
            else:
                j = next[j]
        
        if j == m:
            return i - j
            
        return -1
```

## 复杂度分析
- 暴力匹配法：
  - 时间复杂度：O(mn)，其中m是needle长度，n是haystack长度
  - 空间复杂度：O(1)

- KMP算法：
  - 时间复杂度：O(m + n)，其中m是needle长度，n是haystack长度
  - 空间复杂度：O(m)

## 相关题目总结
1. 字符串匹配类题目：
   - 实现strStr
   - 重复的子字符串
   - 最长回文子串
   - 最长公共前缀

2. 解题技巧：
   - 暴力匹配
   - KMP算法
   - 字符串遍历
   - 模式匹配 