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
		
		ArrayStack<Integer> stack = new ArrayStack<>();
		
		for (int i = 0; i < 5; i++) {
			stack.push(i);
			System.out.println(stack);
		}
		
		stack.pop();
		System.out.println(stack);
	}

}
