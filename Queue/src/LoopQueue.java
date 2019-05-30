/**
 * 
 */

/**
 * @ClassName LoopQueue
 * @Description 循环队列
 * @author Yin Guiqing
 * @date 2019年5月28日 下午9:02:23
 */
public class LoopQueue<T> implements Queue<T> {

	private T[] data;
	//队首队尾索引
	private int front, tail;
	//队列中元素个数
	private int size;
	
	/**
	 * @Description LoopQueue有参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午9:05:51
	 */
	public LoopQueue(int capacity) {
		data = (T[]) new Object[capacity + 1];
		front = 0;		//队首
		tail = 0;		//队尾
		size = 0;		//元素个数
	}
	
	/**
	 * @Description LoopQueue无参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午9:07:29
	 * @param int 容积
	 */
	public LoopQueue() {
		this(10);
	}
	
	public int getCapacity() {
		return data.length - 1;
	}
	
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return front == tail;
	}

	@Override
	public void enqueue(T e) {
		
		if ((tail + 1) % data.length == front) {
			resize(getCapacity() * 2);
		}
		data[tail] = e;
		tail = (tail + 1) % data.length;
		size ++;
	}

	@Override
	public T dequeue() {
		
		if (isEmpty()) {
			throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
		}
		
		T result = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		size --;
		
		if (size == getCapacity() / 4 && getCapacity() / 2 != 0) {
			resize(getCapacity() / 2);
		}
		
		return result;
	}

	@Override
	public T getFront() {
		
		if (isEmpty()) {
			throw new IllegalArgumentException("The queue is empty.");
		}
		
		return data[front];
	}
	
	/**
	 * @Description 队列扩容
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午9:17:47
	 * @param newCapacity 新的容量
	 * @return void
	 * @throws
	 */
	private void resize(int newCapacity) {
		
		T[] newData = (T[]) new Object[newCapacity + 1];
		for (int i = 0; i < size; i++) {
			newData[i] = data[(i + front) % data.length];
		}
		data = newData;
		front = 0;
		tail = size;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		result.append(String.format("Queue: size = %d, capacity = %d. \n", size, getCapacity()));
		result.append("front [");
		for (int i = front; i != tail; i = (i+1) % data.length) {
			result.append(data[i]);
			if ((i+1) % data.length != tail) {
				result.append(", ");
			}
		}
		result.append("] tail");
		
		return result.toString();
	}

}
