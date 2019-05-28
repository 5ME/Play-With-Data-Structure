/**
 * 
 */

/**
 * @ClassName Queue
 * @Description TODO
 * @author Yin Guiqing
 * @date 2019年5月28日 下午8:26:45
 */
public interface Queue<T> {

	/**
	 * @Description 队列的大小
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:29:20
	 * @return int
	 * @throws
	 */
	int getSize();
	
	/**
	 * @Description 是否为空
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:29:42
	 * @return boolean
	 * @throws
	 */
	boolean isEmpty();
	
	/**
	 * @Description 入队
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:30:10
	 * @param e 
	 * @return void
	 * @throws
	 */
	void enqueue(T e);
	
	/**
	 * @Description 出队
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:30:22
	 * @return T
	 * @throws
	 */
	T dequeue();
	
	/**
	 * @Description 查看队首元素
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:30:53
	 * @return T
	 * @throws
	 */
	T getFront();
	
}
