/**
 * 
 */

/**
 * @ClassName LinkedList
 * @Description 链表类
 * @author Yin Guiqing
 * @date 2019年5月30日 下午9:29:48
 */
public class LinkedList<E> {

	/**
	 * @ClassName Node
	 * @Description Node节点类
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午9:34:42
	 */
	private class Node {
		//节点数据
		public E e;
		//下一节点
		public Node next;
		
		/**
		 * @Description Node有参构造函数
		 * @author Yin Guiqing
		 * @date 2019年5月30日 下午9:31:23
		 */
		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}
		
		/**
		 * @Description 单参构造函数
		 * @author Yin Guiqing
		 * @date 2019年5月30日 下午9:32:45
		 */
		public Node(E e) {
			this(e, null);
		}
		
		/**
		 * @Description 无参构造函数
		 * @author Yin Guiqing
		 * @date 2019年5月30日 下午9:33:32
		 */
		public Node() {
			this(null, null);
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return e.toString();
		}
	}
	
	//虚拟头结点
	private Node dummyHead;
	//链表元素个数
	private int size;
	
	/**
	 * @Description LinkedList构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午9:39:31
	 */
	public LinkedList() {
		dummyHead = new Node(null, null);
		size = 0;
	}
	
	/**
	 * 
	 * @Description 获取链表元素个数
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午9:41:22
	 * @return int
	 * @throws
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * @Description 链表是否为空
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午9:42:42
	 * @return boolean
	 * @throws
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * @Description 在链表中间index位置添加元素
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午10:04:26
	 * @param index
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void add(int index, E e) {
		
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed. Illegal index.");
		}
		
		Node prev = dummyHead;
		//找到添加节点的前一个节点
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		
		//完成添加操作
//			Node node = new Node(e);
//			node.next = prev.next;
//			prev.next = node;
		//上面三条语句合并成一条语句
		prev.next = new Node(e, prev.next);
		
		size ++;
	}
	
	/**
	 * @Description 在链表头添加元素
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午9:47:00
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void addFirst(E e) {
		add(0, e);
	}
	
	/**
	 * @Description 在链表尾添加元素
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午10:14:05
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void addLast(E e) {
		add(size, e);
	}
	
	/**
	 * @Description 获取链表第index位置的元素
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午10:12:30
	 * @param index
	 * @return E
	 * @throws
	 */
	public E get(int index) {
		
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Get failed. Illegal index.");
		}
		
		//注意区别add方法中此处
		Node currentNode = dummyHead.next;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		
		return currentNode.e;
	}
	
	/**
	 * @Description 获取链表第一个元素
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午10:16:47
	 * @return E
	 * @throws
	 */
	public E getFirst() {
		return get(0);
	}
	
	/**
	 * @Description 获取链表最后一个元素
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午10:17:46
	 * @return E
	 * @throws
	 */
	public E getLast() {
		return get(size - 1);
	}
	
	/**
	 * @Description 修改链表第index位置的元素为e
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午10:22:19
	 * @param index
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void set(int index, E e) {
		
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Set failed. Illegal index.");
		}
		
		//找到第index位置元素节点
		Node currentNode = dummyHead.next;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		//修改节点
		currentNode.e = e;
	}
	
	/**
	 * @Description 删除链表第index位置的元素
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午11:03:38
	 * @param index
	 * @return E
	 * @throws
	 */
	public E remove(int index) {
		
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Remove failed. Illegal index.");
		}
		
		Node prev = dummyHead;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		
		Node deleteNode = prev.next;
		prev.next = deleteNode.next;
		deleteNode.next = null;
		size --;
		
		return deleteNode.e;
	}
	
	/**
	 * @Description 删除链表第一个元素
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午11:08:34
	 * @return E
	 * @throws
	 */
	public E removeFirst() {
		return remove(0);
	}
	
	/**
	 * @Description 删除链表最后一个元素
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午11:09:13
	 * @return E
	 * @throws
	 */
	public E removeLast() {
		return remove(size - 1);
	}
	
	/**
	 * @Description 查找链表中是否存在元素e
	 * @author Yin Guiqing
	 * @date 2019年5月31日 上午10:26:22
	 * @param e
	 * @return boolean
	 * @throws
	 */
	public boolean contains(E e) {
		
		Node currentNode = dummyHead.next;
		while (currentNode != null) {
			if (currentNode.e.equals(e)) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		Node currentNode = dummyHead.next;
		
		StringBuilder result = new StringBuilder();
		result.append("LinkedList: ");
		while (currentNode != null) {
			result.append(currentNode + " -> ");
			currentNode = currentNode.next;
		}
//		//for循环写法
//		for (Node currentNode = dummyHead.next; currentNode != null; currentNode = currentNode.next) {
//			result.append(currentNode + " -> ");
//		}
		result.append("NULL");
		
		return result.toString();
	}
	
}
