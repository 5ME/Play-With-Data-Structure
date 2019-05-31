import java.util.Random;

/**
 * @ClassName Main
 * @Description 测试类
 * @author Yin Guiqing
 * @date 2019年5月26日 下午9:52:20
 */
public class Main {

	/**
	 * @Description main方法
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午9:52:20
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		
		/*
		 * 数组栈测试
		 */
//		ArrayStack<Integer> stack = new ArrayStack<>();
//		
//		for (int i = 0; i < 5; i++) {
//			stack.push(i);
//			System.out.println(stack);
//		}
//		
//		stack.pop();
//		System.out.println(stack);
		
		
		/*
		 * 链表栈测试
		 */
//		LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
//		for (int i = 0; i < 5; i++) {
//			linkedListStack.push(i);
//			System.out.println(linkedListStack);
//		}
//		
//		linkedListStack.pop();
//		System.out.println(linkedListStack);
		
		
		/*
		 * ArrayStack与LinkedListStack对比测试
		 * 这个时间对比比较复杂，因为LinkedListStack的实现中包含更多的new操作
		 * ArrayStack和LinkedListStack的时间复杂度是一样的
		 */
		int oprateCount = 100000;
		
		ArrayStack<Integer> arrayStack = new ArrayStack<>();
		double arrayStackTime = testStack(arrayStack, oprateCount);
		System.out.println("ArrayStack time: " + arrayStackTime + " s.");
		
		LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
		double linkedListStackTime = testStack(linkedListStack, oprateCount);
		System.out.println("LinkedListStack time: " + linkedListStackTime + " s.");
	}
	
	/**
	 * @Description 栈的测试方法，主要检测效率
	 * @Description 测试使用stack执行oprateCount次push和pop操作所需时间，单位秒
	 * @author Yin Guiqing
	 * @date 2019年5月31日 下午9:28:16
	 * @param stack
	 * @param oprateCount
	 * @return double
	 * @throws
	 */
	public static double testStack(Stack<Integer> stack, int oprateCount) {
		long startTime = System.nanoTime();
		
		Random random = new Random();
		for (int i = 0; i < oprateCount; i++) {
			stack.push(random.nextInt(Integer.MAX_VALUE));
		}
		for (int i = 0; i < oprateCount; i++) {
			stack.pop();
		}
		
		long endTime = System.nanoTime();
		
		return (endTime - startTime) / 1000000000.0;
	}

}
