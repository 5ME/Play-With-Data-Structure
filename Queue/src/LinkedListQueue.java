/**
 * 
 */

/**
 * @ClassName LinkedListQueue
 * @Description ����β�ڵ������ʵ�ֶ���
 * @author Yin Guiqing
 * @date 2019��5��31�� ����10:06:12
 */
public class LinkedListQueue<E> implements Queue<E> {

	/**
	 * @ClassName Node
	 * @Description Node�ڵ���
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����9:34:42
	 */
	private class Node {
		//�ڵ�����
		public E e;
		//��һ�ڵ�
		public Node next;
		
		/**
		 * @Description Node�вι��캯��
		 * @author Yin Guiqing
		 * @date 2019��5��30�� ����9:31:23
		 */
		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}
		
		/**
		 * @Description ���ι��캯��
		 * @author Yin Guiqing
		 * @date 2019��5��30�� ����9:32:45
		 */
		public Node(E e) {
			this(e, null);
		}
		
		/**
		 * @Description �޲ι��캯��
		 * @author Yin Guiqing
		 * @date 2019��5��30�� ����9:33:32
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
	
	//ͷ��㣬β���
	private Node head, tail;
	//Ԫ�ظ���
	private int size;
	
	/**
	 * @Description LinkedListQueue���캯��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:11:31
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
