/**
 * @ClassName ArrayStack
 * @Description Stack实现类
 * @author Yin Guiqing
 * @date 2019年5月26日 下午6:22:11
 */
public class ArrayStack<T> implements Stack<T> {

	Array<T> array;
	
	/**
	 * @Description ArrayStack有参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:23:42
	 * @param capacity 栈的大小
	 */
	public ArrayStack(int capacity) {
		array = new Array<>(capacity);
	}
	
	/**
	 * @Description ArrayStack无参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:26:04
	 */
	public ArrayStack() {
		array = new Array<>();
	}

	/**
	 * @Description 获取ArrayStack的容量
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午9:51:14
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
