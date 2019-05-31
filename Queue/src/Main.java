import java.util.Random;

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
		
		//ArrayQueue����
//		ArrayQueue<Integer> queue = new ArrayQueue<>();
//		for (int i = 0; i < 10; i++) {
//			queue.enqueue(i);
//			System.out.println(queue);
//			if (i % 3 == 2) {
//				queue.dequeue();
//				System.out.println(queue);
//			}
//		}
		
		
		//LoopQueue����
//		LoopQueue<Integer> queue = new LoopQueue<>();
//		for (int i = 0; i < 10; i++) {
//			queue.enqueue(i);
//			System.out.println(queue);
//			if (i % 3 == 2) {
//				queue.dequeue();
//				System.out.println(queue);
//			}
//		}
		
		
		/*
		 * ArrayQueue��LoopQueue��LinkedListQueue�ԱȲ���
		 */
		int oprateCount = 100000;
		
		ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
		double arrayQueueTime = testQueue(arrayQueue, oprateCount);
		System.out.println("ArrayQueue time: " + arrayQueueTime + " s.");
		
		LoopQueue<Integer> loopQueue = new LoopQueue<>();
		double loopQueueTime = testQueue(loopQueue, oprateCount);
		System.out.println("LoopQueue time: " + loopQueueTime + " s.");
		
		LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
		double linkedListQueueTime = testQueue(linkedListQueue, oprateCount);
		System.out.println("LinkedListQueue time: " + linkedListQueueTime + " s.");
		
		
		/*
		 * LinkedListQueue����
		 */
//		LinkedListQueue<Integer> linkedListQueue = new LinkedListQueue<>();
//		for (int i = 0; i < 10; i++) {
//			linkedListQueue.enqueue(i);
//			System.out.println(linkedListQueue);
//			if (i % 3 == 2) {
//				linkedListQueue.dequeue();
//				System.out.println(linkedListQueue);
//			}
//		}

	}
	
	/**
	 * @Description ����ʹ��queue����oprateCount��enqueue��dequeue��������Ҫ��ʱ�䣬��λ��
	 * @author Yin Guiqing
	 * @date 2019��5��30�� ����6:16:43
	 * @param queue ����
	 * @param oprateCount ������
	 * @return double ����ʱ�䣬��
	 * @throws
	 */
	private static double testQueue(Queue<Integer> queue, int oprateCount) {
		
		long startTime = System.nanoTime();
		
		Random random = new Random();
		for (int i = 0; i < oprateCount; i++) {
			queue.enqueue(random.nextInt(Integer.MAX_VALUE));
		}
		for (int i = 0; i < oprateCount; i++) {
			queue.dequeue();
		}
		
		long endTime = System.nanoTime();
		
		return (endTime - startTime) / 1000000000.0;
	}

}
