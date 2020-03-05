
### 实现strStr() 

实现``` strStr() ```函数.<br/>

给定一个haystack字符串和一个needle字符串,<br/>
在haystack字符串中找出needle字符串出现的第一个位置(从0开始).<br/>
如果不存在, 则返回-1.<br/>

```
示例1:
输入: haystack = "hello", needle = "ll"
输出: 2

示例2:
输入: haystack = "aaaaa", needle = "bba"
输出: -1
```

说明:<br/>
当needle是空字符串时, 我们应当返回什么值呢?<br/>
这是一个在面试中很好的问题.<br/>

对于本题而言, 当needle是空字符串时我们应当返回0.<br/>
这与C语言的strStr()以及Java的indexOf()定义相符.<br/>