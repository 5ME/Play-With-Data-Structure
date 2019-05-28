/**
 * 
 */

/**
 * @ClassName ArrayQueue
 * @Description TODO
 * @author Yin Guiqing
 * @date 2019年5月28日 下午8:31:56
 */
public class ArrayQueue<T> implements Queue<T> {

	private Array<T> array;
	
	/**
	 * @Description ArrayQueue有参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:33:31
	 */
	public ArrayQueue(int capacity) {
		array = new Array<>(capacity);
	}
	
	/**
	 * @Description ArrayQueue无参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:34:43
	 */
	public ArrayQueue() {
		array = new Array<>();
	}
	
	/**
	 * @Description 获取队列容量
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:39:34
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
	public void enqueue(T e) {
		array.addLast(e);
	}

	@Override
	public T dequeue() {
		return array.removeFirst();
	}

	@Override
	public T getFront() {
		return array.getFirst();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Queue: front [");
		for (int i = 0; i < array.getSize(); i++) {
			result.append(array.get(i));
			if (i != array.getSize() - 1) {
				result.append(", ");
			}
		}
		result.append("] tail");
		
		return result.toString();
	}

}
