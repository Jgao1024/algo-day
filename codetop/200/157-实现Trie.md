# 208. 实现 Trie (前缀树)

## 题目描述
Trie（发音类似 "try"）或者说前缀树是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。

请你实现 Trie 类：
- Trie() 初始化前缀树对象
- void insert(String word) 向前缀树中插入字符串 word
- boolean search(String word) 如果字符串 word 在前缀树中，返回 true；否则，返回 false
- boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix，返回 true；否则，返回 false

示例：
```
输入
["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
[[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
输出
[null, null, true, false, true, null, true]

解释
Trie trie = new Trie();
trie.insert("apple");
trie.search("apple");   // 返回 True
trie.search("app");     // 返回 False
trie.startsWith("app"); // 返回 True
trie.insert("app");
trie.search("app");     // 返回 True
```

## 解题思路
1. 字典树实现：
   - 每个节点包含一个字符和子节点数组
   - 使用布尔值标记单词结束
   - 支持插入、搜索和前缀匹配操作
   - 时间复杂度：O(m)，空间复杂度：O(ALPHABET_SIZE * N * M)

2. 关键点：
   - 节点结构设计
   - 字符映射
   - 单词结束标记
   - 边界条件

## Java实现
```java
class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (!node.containsKey(c)) {
                node.put(c, new TrieNode());
            }
            node = node.get(c);
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
    
    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.containsKey(c)) {
                node = node.get(c);
            } else {
                return null;
            }
        }
        return node;
    }
}

class TrieNode {
    private TrieNode[] links;
    private final int R = 26;
    private boolean isEnd;
    
    public TrieNode() {
        links = new TrieNode[R];
    }
    
    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }
    
    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }
    
    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }
    
    public void setEnd() {
        isEnd = true;
    }
    
    public boolean isEnd() {
        return isEnd;
    }
}
```

## Python实现
```python
class Trie:
    def __init__(self):
        self.root = {}
    
    def insert(self, word: str) -> None:
        node = self.root
        for char in word:
            if char not in node:
                node[char] = {}
            node = node[char]
        node['#'] = True
    
    def search(self, word: str) -> bool:
        node = self.root
        for char in word:
            if char not in node:
                return False
            node = node[char]
        return '#' in node
    
    def startsWith(self, prefix: str) -> bool:
        node = self.root
        for char in prefix:
            if char not in node:
                return False
            node = node[char]
        return True
```

## 复杂度分析
- 时间复杂度：
  - 插入：O(m)，其中m为单词长度
  - 搜索：O(m)，其中m为单词长度
  - 前缀匹配：O(m)，其中m为前缀长度
- 空间复杂度：O(ALPHABET_SIZE * N * M)，其中N为单词数，M为单词平均长度

## 相关题目总结
1. 字典树类题目：
   - 实现 Trie
   - 添加与搜索单词
   - 单词搜索 II
   - 最长单词

2. 解题技巧：
   - 节点结构设计
   - 字符映射
   - 单词结束标记
   - 边界条件 