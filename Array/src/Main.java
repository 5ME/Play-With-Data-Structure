/**
 * @ClassName Main
 * @Description main������
 * @author Yin Guiqing
 * @date 2019��5��26�� ����11:07:16
 */
public class Main {

	/**
	 * @Description main����
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����11:07:16
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		
		Array<Integer> array = new Array<Integer>();
		for (int i = 0; i < 10; i++) {
			array.addLast(i);
		}
		System.out.println(array);
		
		array.add(1, 100);
		System.out.println(array);
		
		array.addFirst(-1);
		System.out.println(array);
		
		array.remove(2);
		System.out.println(array);
		
		array.removeElement(4);
		System.out.println(array);
		
		array.removeFirst();
		System.out.println(array);
		
		array.removeLast();
		System.out.println(array);

	}

}
