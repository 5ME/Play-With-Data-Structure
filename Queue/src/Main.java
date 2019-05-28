/**
 * 
 */

/**
 * @ClassName Main
 * @Description 测试类
 * @author Yin Guiqing
 * @date 2019年5月28日 下午8:46:45
 */
public class Main {

	/**
	 * @Description main方法
	 * @author Yin Guiqing
	 * @date 2019年5月28日 下午8:46:45
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		ArrayQueue<Integer> queue = new ArrayQueue<>();
		for (int i = 0; i < 10; i++) {
			queue.enqueue(i);
			System.out.println(queue);
			if (i % 3 == 2) {
				queue.dequeue();
				System.out.println(queue);
			}
		}

	}

}
