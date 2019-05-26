/**
 * @ClassName Stack
 * @Description Stack�ӿ�
 * @author Yin Guiqing
 * @date 2019��5��26�� ����6:14:42
 */
public interface Stack<T> {
	
	/**
	 * @Description ��ȡջ�Ĵ�С
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:16:41
	 * @return int
	 * @throws
	 */
	int getSize();
	
	/**
	 * 
	 * @Description �ж�ջ�Ƿ�Ϊ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:18:59
	 * @return boolean
	 * @throws
	 */
	boolean isEmpty();
	
	/**
	 * @Description ��ջ
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:19:08
	 * @param e ��ջԪ��
	 * @return void
	 * @throws
	 */
	void push(T e);
	
	/**
	 * @Description ��ջ
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:20:04
	 * @return T ��ջԪ��
	 * @throws
	 */
	T pop();
	
	/**
	 * @Description �鿴ջ��Ԫ��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����6:20:28
	 * @return T ջ��Ԫ��
	 * @throws
	 */
	T peek();
	
}
