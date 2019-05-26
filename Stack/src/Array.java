/**
 * @ClassName Array
 * @Description ��װ�Զ���������
 * @author Yin Guiqing
 * @date 2019��5��25�� ����10:32:53
 */
public class Array<T> {

	/**
	 * @Field T[] data
	 * @Description ������
	 */
	private T[] data;
	
	/**
	 * @Field int size
	 * @Description ������Ԫ�ظ���
	 */
	private int size;
	
	/**
	 * @Description �вι��캯��
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����10:36:19
	 * @param capacity �����������
	 */
	public Array(int capacity) {
		data = (T[]) new Object[capacity];
		size = 0;
	}
	
	/**
	 * @Description �޲ι��캯����Ĭ����������capacity=10
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����10:38:21
	 */
	public Array() {
		this(10);
	}
	
	/**
	 * @Description ��ȡ����Ԫ�ظ���
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����10:46:50
	 * @return int
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * @Description ��ȡ��������
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����10:48:30
	 * @return int
	 */
	public int getCapacity() {
		return data.length;
	}
	
	/**
	 * 
	 * @Description �����Ƿ�Ϊ��
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����10:53:22
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * @Description ������Ԫ�غ����һ����Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����12:54:39
	 * @param e �����Ԫ��
	 * @return void
	 * @throws
	 */
	public void addLast(T e) {
		add(size, e);
	}
	
	/**
	 * @Description ������Ԫ��ǰ���һ����Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����11:26:07
	 * @param e �����Ԫ��
	 * @return void
	 * @throws
	 */
	public void addFirst(T e) {
		add(0, e);
	}
	
	/**
	 * @Description ������ָ��λ�ò���Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��25�� ����11:20:03
	 * @param index ָ��λ��
	 * @param e �������Ԫ��
	 * @return void
	 * @throws
	 */
	public void add(int index, T e) {
		if (index < 0 || index > size) {
			throw new IllegalArgumentException("Add failed. The index is illegal. Require index >= 0 and index <= size.");
		}
		if (size == data.length) {
			resize(2 * data.length);	//��������
		}
		for (int i = size-1; i >= index; i--) {
			data[i+1] = data[i];
		}
		
		data[index] = e;
		size ++;
	}

	/**
	 * @Description ��ȡindex����λ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����12:56:09
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
	 * @Description ��ȡ�����һ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����9:42:14
	 * @return T
	 * @throws
	 */
	public T getFirst() {
		return get(0);
	}
	
	/**
	 * @Description ��ȡ�������һ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����9:42:51
	 * @return T
	 * @throws
	 */
	public T getLast() {
		return get(size-1);
	}
	
	/**
	 * 
	 * @Description �޸�index����λ��Ԫ��Ϊe
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����12:56:25
	 * @param index ����λ��
	 * @param e Ԫ��
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
	 * @Description �������Ƿ����Ԫ��e
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����11:28:22
	 * @param e �����ҵ�Ԫ��
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
	 * @Description ����Ԫ��e���������粻���ڣ�����-1
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����11:30:10
	 * @param e ������Ԫ��
	 * @return int Ԫ��e������
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
	 * @Description ɾ��������indexλ�õ�Ԫ�أ������䷵��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����12:57:10
	 * @param index ��ɾ��Ԫ������
	 * @return T ɾ����Ԫ��
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
		data[size] = null;	//�˾䲻�Ǳ��룬loitering object != memory leak
		
		//������Ԫ�ظ������ٵ�������һ��ʱ����С��������
//		if (size == data.length / 2 && data.length/2 != 0) {
		//�޸�Ϊ���ٵ�������1/4ʱ���ݣ������˸��Ӷ���
		if (size == data.length / 4 && data.length/2 != 0) {
			resize(data.length / 2);
		}
		
		return ret;
	}
	
	/**
	 * @Description ɾ�������е�һ��Ԫ�أ������䷵��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����11:41:26
	 * @return T ɾ����Ԫ��
	 * @throws
	 */
	public T removeFirst() {
		return remove(0);
	}
	
	/**
	 * @Description ɾ�����������һ��Ԫ�أ������䷵��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����11:42:13
	 * @return T ɾ����Ԫ��
	 * @throws
	 */
	public T removeLast() {
		return remove(size-1);
	}
	
	/**
	 * @Description ��������ɾ��Ԫ��e��������ڶ��Ԫ��e��ֻ��ɾ����һ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����11:47:13
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
	 * @Description ��������
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����4:16:02
	 * @param newCapacity �µ�����
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
