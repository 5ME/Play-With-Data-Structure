/**
 * 
 */

/**
 * @ClassName Main
 * @Description ������
 * @author Yin Guiqing
 * @date 2019��5��31�� ����10:47:15
 */
public class Main {

	/**
	 * @Description main����
	 * @author Yin Guiqing
	 * @date 2019��5��31�� ����10:47:15
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			linkedList.addFirst(i);
			System.out.println(linkedList);
		}
		
		linkedList.add(2, 666);
		System.out.println(linkedList);
		
		linkedList.remove(2);
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
	}

}
