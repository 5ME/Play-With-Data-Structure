# 队列 Queue

+ 队列也是一种数据结构
+ 相比数组，队列对应的操作是数组的子集
+ 只能从一端（队尾）添加元素，只能从另一端（队首）取出元素
+ 队列是一种**先进先出**（First In First Out, FIFO）的数据结构

## 队列的实现
Queue\<T>
```Java
void enqueue(T)     //入队
T dequeue()         //出队
T getFront()        //查看队首元素
int getSize()       //队列的大小
boolean isEmpty()   //是否为空
```
+ 用户不关心底层实现，实际底层有多种实现方式

## 数组队列的复杂度分析
ArrayQueue\<T>
```Java
void enqueue(T)     --> O(1) 均摊
T dequeue()         --> O(n)
T getFront()        --> O(1)
int getSize()       --> O(1)
boolean isEmpty()   --> O(1)
```


