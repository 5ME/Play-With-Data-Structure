/**
 * @ClassName Stack
 * @Description Stack接口
 * @author Yin Guiqing
 * @date 2019年5月26日 下午6:14:42
 */
public interface Stack<T> {
	
	/**
	 * @Description 获取栈的大小
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:16:41
	 * @return int
	 * @throws
	 */
	int getSize();
	
	/**
	 * 
	 * @Description 判断栈是否为空
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:18:59
	 * @return boolean
	 * @throws
	 */
	boolean isEmpty();
	
	/**
	 * @Description 入栈
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:19:08
	 * @param e 入栈元素
	 * @return void
	 * @throws
	 */
	void push(T e);
	
	/**
	 * @Description 出栈
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:20:04
	 * @return T 出栈元素
	 * @throws
	 */
	T pop();
	
	/**
	 * @Description 查看栈顶元素
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午6:20:28
	 * @return T 栈顶元素
	 * @throws
	 */
	T peek();
	
}
