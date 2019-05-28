/**
 * 
 */

/**
 * @ClassName Queue
 * @Description TODO
 * @author Yin Guiqing
 * @date 2019��5��28�� ����8:26:45
 */
public interface Queue<T> {

	/**
	 * @Description ���еĴ�С
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����8:29:20
	 * @return int
	 * @throws
	 */
	int getSize();
	
	/**
	 * @Description �Ƿ�Ϊ��
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����8:29:42
	 * @return boolean
	 * @throws
	 */
	boolean isEmpty();
	
	/**
	 * @Description ���
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����8:30:10
	 * @param e 
	 * @return void
	 * @throws
	 */
	void enqueue(T e);
	
	/**
	 * @Description ����
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����8:30:22
	 * @return T
	 * @throws
	 */
	T dequeue();
	
	/**
	 * @Description �鿴����Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����8:30:53
	 * @return T
	 * @throws
	 */
	T getFront();
	
}
