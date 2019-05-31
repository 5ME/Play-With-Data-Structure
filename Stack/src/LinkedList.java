/**
 * 
 */

/**
 * @ClassName LinkedList
 * @Description ������
 * @author Yin Guiqing
 * @date 2019��5��30�� ����9:29:48
 */
public class LinkedList<E> {

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
	
	//����ͷ���
	private Node dummyHead;
	//����Ԫ�ظ���
	private int size;
	
	/**
	 * @Description LinkedList���캯��
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����9:39:31
	 */
	public LinkedList() {
		dummyHead = new Node(null, null);
		size = 0;
	}
	
	/**
	 * 
	 * @Description ��ȡ����Ԫ�ظ���
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����9:41:22
	 * @return int
	 * @throws
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * @Description �����Ƿ�Ϊ��
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����9:42:42
	 * @return boolean
	 * @throws
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * @Description �������м�indexλ�����Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����10:04:26
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
		//�ҵ���ӽڵ��ǰһ���ڵ�
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		
		//�����Ӳ���
//			Node node = new Node(e);
//			node.next = prev.next;
//			prev.next = node;
		//�����������ϲ���һ�����
		prev.next = new Node(e, prev.next);
		
		size ++;
	}
	
	/**
	 * @Description ������ͷ���Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����9:47:00
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void addFirst(E e) {
		add(0, e);
	}
	
	/**
	 * @Description ������β���Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����10:14:05
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void addLast(E e) {
		add(size, e);
	}
	
	/**
	 * @Description ��ȡ�����indexλ�õ�Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:12:30
	 * @param index
	 * @return E
	 * @throws
	 */
	public E get(int index) {
		
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Get failed. Illegal index.");
		}
		
		//ע������add�����д˴�
		Node currentNode = dummyHead.next;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		
		return currentNode.e;
	}
	
	/**
	 * @Description ��ȡ�����һ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:16:47
	 * @return E
	 * @throws
	 */
	public E getFirst() {
		return get(0);
	}
	
	/**
	 * @Description ��ȡ�������һ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:17:46
	 * @return E
	 * @throws
	 */
	public E getLast() {
		return get(size - 1);
	}
	
	/**
	 * @Description �޸������indexλ�õ�Ԫ��Ϊe
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:22:19
	 * @param index
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void set(int index, E e) {
		
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Set failed. Illegal index.");
		}
		
		//�ҵ���indexλ��Ԫ�ؽڵ�
		Node currentNode = dummyHead.next;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		//�޸Ľڵ�
		currentNode.e = e;
	}
	
	/**
	 * @Description ɾ�������indexλ�õ�Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����11:03:38
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
	 * @Description ɾ�������һ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����11:08:34
	 * @return E
	 * @throws
	 */
	public E removeFirst() {
		return remove(0);
	}
	
	/**
	 * @Description ɾ���������һ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����11:09:13
	 * @return E
	 * @throws
	 */
	public E removeLast() {
		return remove(size - 1);
	}
	
	/**
	 * @Description �����������Ƿ����Ԫ��e
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:26:22
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
//		//forѭ��д��
//		for (Node currentNode = dummyHead.next; currentNode != null; currentNode = currentNode.next) {
//			result.append(currentNode + " -> ");
//		}
		result.append("NULL");
		
		return result.toString();
	}
	
}
