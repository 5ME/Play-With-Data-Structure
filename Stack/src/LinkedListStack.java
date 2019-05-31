/**
 * 
 */

/**
 * @ClassName LinkedListStack
 * @Description ����ʵ��ջ
 * @author Yin Guiqing
 * @date 2019��5��31�� ����9:13:20
 */
public class LinkedListStack<E> implements Stack<E> {

	private LinkedList<E> list;
	
	/**
	 * @Description LinkedListStack���캯��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����9:16:19
	 */
	public LinkedListStack() {
		list = new LinkedList<>();
	}
	
	@Override
	public int getSize() {
		return list.getSize();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(E e) {
		list.addFirst(e);
	}

	@Override
	public E pop() {
		return list.removeFirst();
	}

	@Override
	public E peek() {
		return list.getFirst();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		result.append("Stack: top ");
		result.append(list);
		
		return result.toString();
	}

}
