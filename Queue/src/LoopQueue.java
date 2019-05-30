/**
 * 
 */

/**
 * @ClassName LoopQueue
 * @Description ѭ������
 * @author Yin Guiqing
 * @date 2019��5��28�� ����9:02:23
 */
public class LoopQueue<T> implements Queue<T> {

	private T[] data;
	//���׶�β����
	private int front, tail;
	//������Ԫ�ظ���
	private int size;
	
	/**
	 * @Description LoopQueue�вι��캯��
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����9:05:51
	 */
	public LoopQueue(int capacity) {
		data = (T[]) new Object[capacity + 1];
		front = 0;
		tail = 0;
		size = 0;
	}
	
	/**
	 * @Description LoopQueue�޲ι��캯��
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����9:07:29
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
		if (front == tail) {
			throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
		}
		
		return null;
	}

	@Override
	public T getFront() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @Description ��������
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����9:17:47
	 * @param newCapacity �µ�����
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

}