/**
 * 
 */

/**
 * @ClassName Main
 * @Description ������
 * @author Yin Guiqing
 * @date 2019��5��28�� ����8:46:45
 */
public class Main {

	/**
	 * @Description main����
	 * @author Yin Guiqing
	 * @date 2019��5��28�� ����8:46:45
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
