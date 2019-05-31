import java.util.Random;

/**
 * @ClassName Main
 * @Description ������
 * @author Yin Guiqing
 * @date 2019��5��26�� ����9:52:20
 */
public class Main {

	/**
	 * @Description main����
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����9:52:20
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		
		/*
		 * ����ջ����
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
		 * ����ջ����
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
		 * ArrayStack��LinkedListStack�ԱȲ���
		 * ���ʱ��ԱȱȽϸ��ӣ���ΪLinkedListStack��ʵ���а��������new����
		 * ArrayStack��LinkedListStack��ʱ�临�Ӷ���һ����
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
	 * @Description ջ�Ĳ��Է�������Ҫ���Ч��
	 * @Description ����ʹ��stackִ��oprateCount��push��pop��������ʱ�䣬��λ��
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����9:28:16
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
