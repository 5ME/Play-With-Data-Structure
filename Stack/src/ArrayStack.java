/**
 * @ClassName ArrayStack
 * @Description Stackʵ����
 * @author Yin Guiqing
 * @date 2019��5��26�� ����6:22:11
 */
public class ArrayStack<T> implements Stack<T> {

	Array<T> array;
	
	/**
	 * @Description ArrayStack�вι��캯��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:23:42
	 * @param capacity ջ�Ĵ�С
	 */
	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}
	
	/**
	 * @Description ArrayStack�޲ι��캯��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:26:04
	 */
	public ArrayStack() {
		array = new Array<>();
	}

	/**
	 * @Description ��ȡArrayStack������
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����9:51:14
	 * @return int
	 * @throws
	 */
	public int getCapacity() {
		return array.getCapacity();
	}
	
	@Override
	public int getSize() {
		return array.getSize();
	}

	
	@Override
	public boolean isEmpty() {
		return array.isEmpty();
	}

	
	@Override
	public void push(T e) {
		array.addLast(e);
	}

	
	@Override
	public T pop() {
		return array.removeLast();
	}

	
	@Override
	public T peek() {
		return array.getLast();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Stack: [");
		for (int i = 0; i < array.getSize(); i++) {
			result.append(array.get(i));
			if (i != array.getSize() - 1) {
				result.append(", ");
			}
		}
		result.append("] top");
		
		return result.toString();
	}
	
}
