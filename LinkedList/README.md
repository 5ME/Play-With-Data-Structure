# 链表 LinkedList

## 线性数据结构

+ 前面实现的动态数组、栈、队列都是底层依靠静态数组实现的，靠`resize`操作解决固定的容量问题。

+ 链表是真正的动态数据结构。

+ 链表是最简单的动态数据结构。

+ 更深入地理解引用（或指针），更深入理解递归，辅助组成其他数据结构。

## 链表 Linked List

+ 数据存储在节点`Node`中，每个节点又指向它下一个节点。`1 -> 2 -> 3 -> null`

``` Java
class Node {
    E e;
    Node next;
}
```

+ 链表优点：真正的动态，不需要处理固定容量问题；
+ 链表缺点：只支持顺序访问，不能像数组那样随机访问。
+ 因为数组在内存中是连续的，而链表不是。

## 链表操作

**链表操作顺序很重要**

1. 在链表头插入元素
    ``` Java
    node.next = head;
    head = node;
    ```

2. 在链表中间插入元素

    关键：要找到添加节点的前一个节点
    ``` Java
    node.next = prev.next;
    prev.next = node;
    ```

## 虚拟头结点

+ 头结点没有前一个节点，设立虚拟头结点可以简化在头结点处的操作，使之与其他操作统一起来。

+ 虚拟头结点没有存放具体值，但是存放了第一个节点的地址。

1. 添加操作
    ``` Java
    node.next = prev.next;
    prev.next = node;
    ```
2. 删除操作
    ``` Java
    prev.next = node.next;
    node.next = null;
    ```

## 链表时间复杂度

+ 添加操作  O(n)
    ``` Java
    addLast(e)          --> O(n)
    addFirst(e)         --> O(1)
    add(index, e)       --> O(n/2) = O(n)
    ```
+ 删除操作  O(n)
    ``` Java
    removeLast()        --> O(n)
    removeFirst()       --> O(1)
    remove(index)       --> O(n/2) = O(n)
    ```
+ 修改操作  O(n)
    ``` Java
    set(index, e)       --> O(n)
    ```
+ 查找操作  O(n)
    ``` Java
    get(index)          --> O(n)
    contains(e)         --> O(n)
    find(e)             find操作在链表是无意义的，因为链表不支持随机访问，拿到索引也没用
    ```
+ 在链表头操作的复杂度为O(1)

## 带有尾指针的链表

+ 使用`tail`标记链表最后一个元素，使得链表在尾部添加元素变得容易，复杂度为O(1)。
+ 前面已经实现了在链表头的插入和删除操作，复杂度均为O(1)。
+ 基于此，可以用带有尾指针的链表来实现队列。
+ 队首为链表头，队尾为链表尾。
+ 从`head`端删除元素，从`tail`端添加元素。
