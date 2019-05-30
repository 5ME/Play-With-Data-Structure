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

## 循环队列
+ 数组队列的问题：出队（删除队首元素）后，所有元素都需要向前挪动。这在一定程度上提高了算法的复杂度。但是注意到，出队后剩余元素的相对位置是不变的。
+ 解决：记录队首（`front`）和队尾（`tail`）。出队操作只需维护`front`即可，而不需要移动全部元素，即循环队列。
+ `front`指向队列第一个元素，`tail`指向队列最后一个元素的后一个位置。
+ 队列为空的判断条件：`front == tail`。
+ 队列满的判断条件：`(tail+1) % capacity == front`。有意识地浪费了一个空间，避免与队列为空的判断条件相撞。

## 循环队列的复杂度分析
LoopQueue\<T>
```Java
void enqueue(T)     --> O(1) 均摊
T dequeue()         --> O(1) 均摊
T getFront()        --> O(1)
int getSize()       --> O(1)
boolean isEmpty()   --> O(1)
```

## 数组队列与循环队列对比
100000次出队入队操作运行时间：
```
ArrayQueue time: 3.921846537 s.
LoopQueue time: 0.015411404 s.
```
差距主要在出队操作。

