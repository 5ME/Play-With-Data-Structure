# 栈 Stack

+ 栈也是一种数据结构
+ 相比数组，栈对应的操作是数组的子集
+ 只能从一端添加元素，也只能从一端取出元素
+ 这一端称为栈顶
+ 栈是一种**后进先出**（Last In First Out, LIFO）的数据结构

## 栈的应用
+ undo操作 - 编辑器
+ 系统调用栈 - 操作系统
+ 括号匹配 - 编译器
+ ......

## 栈的实现
Stack\<T>
```Java
void push(T)        //入栈
T pop()             //出栈
T peek()            //查看栈顶元素
int getSize()       //栈的大小
boolean isEmpty()   //是否为空
```
+ 用户不关心底层实现，实际底层有多种实现方式

## 栈的复杂度分析
ArrayStack\<T>
```Java
void push(T)        --> O(1) 均摊
T pop()             --> O(1) 均摊
T peek()            --> O(1)
int getSize()       --> O(1)
boolean isEmpty()   --> O(1)
```

## 栈的应用例题
LeetCode [20.有效的括号](https://leetcode-cn.com/problems/valid-parentheses/)

给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

1. 左括号必须用相同类型的右括号闭合。
2. 左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。

示例一：
```
输入: "()"
输出: true
```

示例二：
```
输入: "()[]{}"
输出: true
```

示例三：
```
输入: "(]"
输出: false
```

示例四：
```
输入: "([)]"
输出: false
```

示例五：
```
输入: "{[]}"
输出: true
```

```Java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
        	if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if (c == ')' && topChar != '(') {
					return false;
				}
				if (c == ']' && topChar != '[') {
					return false;
				}
				if (c == '}' && topChar != '{') {
					return false;
				}
			}
		}
        return stack.isEmpty();
    }
}
```
