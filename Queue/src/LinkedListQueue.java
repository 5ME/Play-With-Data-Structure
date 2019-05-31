/**
 * 
 */

/**
 * @ClassName LinkedListQueue
 * @Description 带有尾节点的链表实现队列
 * @author Yin Guiqing
 * @date 2019年5月31日 下午10:06:12
 */
public class LinkedListQueue<E> implements Queue<E> {

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
	
	//头结点，尾结点
	private Node head, tail;
	//元素个数
	private int size;
	
	/**
	 * @Description LinkedListQueue构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月31日 下午10:11:31
	 */
	public LinkedListQueue() {
		head = null;
		tail = null;
		size = 0;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(E e) {
		
		if (tail == null) {
			tail = new Node(e);
			head = tail;
		}
		else {
			tail.next = new Node(e);
			tail = tail.next;
		}
		size ++;
	}

	@Override
	public E dequeue() {
		
		if (isEmpty()) {
			throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
		}
		
		Node deleteNode = head;
		head = head.next;
		deleteNode.next = null;
		if (head == null) {
			tail = null;
		}
		
		size --;
		
		return deleteNode.e;
	}

	@Override
	public E getFront() {
		
		if (isEmpty()) {
			throw new IllegalArgumentException("The dequeue is empty.");
		}
		
		return head.e;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		StringBuilder result = new StringBuilder();
		result.append("Queue: front ");
		
		Node currentNode = head;
		while (currentNode != null) {
			result.append(currentNode + " -> ");
			currentNode = currentNode.next;
		}
		result.append("NULL tail");
		
		return result.toString();
	}

}
