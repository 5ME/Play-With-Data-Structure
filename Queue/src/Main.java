import java.util.Random;

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
		
		//ArrayQueue测试
//		ArrayQueue<Integer> queue = new ArrayQueue<>();
//		for (int i = 0; i < 10; i++) {
//			queue.enqueue(i);
//			System.out.println(queue);
//			if (i % 3 == 2) {
//				queue.dequeue();
//				System.out.println(queue);
//			}
//		}
		
		
		//LoopQueue测试
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
		 * ArrayQueue、LoopQueue、LinkedListQueue对比测试
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
		 * LinkedListQueue测试
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
	 * @Description 测试使用queue运行oprateCount个enqueue和dequeue操作所需要的时间，单位秒
	 * @author Yin Guiqing
	 * @date 2019年5月30日 下午6:16:43
	 * @param queue 队列
	 * @param oprateCount 操作数
	 * @return double 运行时间，秒
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
