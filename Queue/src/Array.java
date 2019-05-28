/**
 * @ClassName Array
 * @Description 封装自定义数组类
 * @author Yin Guiqing
 * @date 2019年5月25日 下午10:32:53
 */
public class Array<T> {

	/**
	 * @Field T[] data
	 * @Description 数组名
	 */
	private T[] data;
	
	/**
	 * @Field int size
	 * @Description 数组中元素个数
	 */
	private int size;
	
	/**
	 * @Description 有参构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午10:36:19
	 * @param capacity 数组最大容量
	 */
	public Array(int capacity) {
		data = (T[]) new Object[capacity];
		size = 0;
	}
	
	/**
	 * @Description 无参构造函数，默认数组容量capacity=10
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午10:38:21
	 */
	public Array() {
		this(10);
	}
	
	/**
	 * @Description 获取数组元素个数
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午10:46:50
	 * @return int
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * @Description 获取数组容量
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午10:48:30
	 * @return int
	 */
	public int getCapacity() {
		return data.length;
	}
	
	/**
	 * 
	 * @Description 数组是否为空
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午10:53:22
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * @Description 在所有元素后添加一个新元素
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午12:54:39
	 * @param e 待添加元素
	 * @return void
	 * @throws
	 */
	public void addLast(T e) {
		add(size, e);
	}
	
	/**
	 * @Description 在所有元素前添加一个新元素
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午11:26:07
	 * @param e 待添加元素
	 * @return void
	 * @throws
	 */
	public void addFirst(T e) {
		add(0, e);
	}
	
	/**
	 * @Description 在数组指定位置插入元素
	 * @author Yin Guiqing
	 * @date 2019年5月25日 下午11:20:03
	 * @param index 指定位置
	 * @param e 待插入的元素
	 * @return void
	 * @throws
	 */
	public void add(int index, T e) {
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed. The index is illegal. Require index >= 0 and index <= size.");
		}
		if (size == data.length) {
			resize(2 * data.length);	//数组扩容
		}
		for (int i = size-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		
		data[index] = e;
		size ++;
	}

	/**
	 * @Description 获取index索引位置元素
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午12:56:09
	 * @param index
	 * @return 
	 * @return T
	 * @throws
	 */
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Get failed. The index is illegal.");
		}
		return data[index];
	}
	
	/**
	 * @Description 获取数组第一个元素
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午9:42:14
	 * @return T
	 * @throws
	 */
	public T getFirst() {
		return get(0);
	}
	
	/**
	 * @Description 获取数组最后一个元素
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午9:42:51
	 * @return T
	 * @throws
	 */
	public T getLast() {
		return get(size-1);
	}
	
	/**
	 * 
	 * @Description 修改index索引位置元素为e
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午12:56:25
	 * @param index 索引位置
	 * @param e 元素
	 * @return void
	 * @throws
	 */
	public void set(int index, T e) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Set failed. The index is illegal.");
		}
		data[index] = e;
	}
	
	/**
	 * @Description 数组中是否包含元素e
	 * @author Yin Guiqing
	 * @date 2019年5月26日 上午11:28:22
	 * @param e 待查找的元素
	 * @return boolean
	 * @throws
	 */
	public boolean isContains(T e) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @Description 查找元素e的索引，如不存在，返回-1
	 * @author Yin Guiqing
	 * @date 2019年5月26日 上午11:30:10
	 * @param e 待查找元素
	 * @return int 元素e的索引
	 * @throws
	 */
	public int find(T e) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals(e)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @Description 删除数组中index位置的元素，并将其返回
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午12:57:10
	 * @param index 待删除元素索引
	 * @return T 删除的元素
	 * @throws
	 */
	public T remove(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Get failed. The index is illegal.");
		}
		T ret = data[index];
		for (int i = index+1; i < size; i++) {
			data[i-1] = data[i];
		}
		size --;
		data[size] = null;	//此句不是必须，loitering object != memory leak
		
		//当数组元素个数减少到容量的一半时，减小数组容量
//		if (size == data.length / 2 && data.length/2 != 0) {
		//修改为减少到容量的1/4时缩容，减少了复杂度震荡
		if (size == data.length / 4 && data.length/2 != 0) {
			resize(data.length / 2);
		}
		
		return ret;
	}
	
	/**
	 * @Description 删除数组中第一个元素，并将其返回
	 * @author Yin Guiqing
	 * @date 2019年5月26日 上午11:41:26
	 * @return T 删除的元素
	 * @throws
	 */
	public T removeFirst() {
		return remove(0);
	}
	
	/**
	 * @Description 删除数组中最后一个元素，并将其返回
	 * @author Yin Guiqing
	 * @date 2019年5月26日 上午11:42:13
	 * @return T 删除的元素
	 * @throws
	 */
	public T removeLast() {
		return remove(size-1);
	}
	
	/**
	 * @Description 从数组中删除元素e，如果存在多个元素e，只是删除第一个
	 * @author Yin Guiqing
	 * @date 2019年5月26日 上午11:47:13
	 * @param e 
	 * @return void
	 * @throws
	 */
	public void removeElement(T e) {
		int index = find(e);
		if (index != -1) {
			remove(index);
		}
	}
	
	/**
	 * @Description 数组扩容
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午4:16:02
	 * @param newCapacity 新的容量
	 * @return void
	 * @throws
	 */
	private void resize(int newCapacity) {
		
		T[] newData = (T[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		result.append(String.format("Array: size = %d, capacity = %d. \n", size, data.length));
		result.append('[');
		for (int i = 0; i < size; i++) {
			result.append(data[i]);
			if (i != size-1) {
				result.append(", ");
			}
		}
		result.append(']');
		
		return result.toString();
	}
	
}
