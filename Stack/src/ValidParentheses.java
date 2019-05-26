import java.util.Stack;
/**
 * @ClassName ValidParentheses
 * @Description LeetCode��20�� ��Ч������
 * @author Yin Guiqing
 * @date 2019��5��26�� ����10:19:24
 */
public class ValidParentheses {

	/**
	 * @Description �ж����źϷ���
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����10:21:06
	 * @param s ���ж��ַ���
	 * @return boolean
	 * @throws
	 */
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
        	if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if (c == ')' && topChar != '(') {
					return false;
				}
				if (c == ']' && topChar != '[') {
					return false;
				}
				if (c == '}' && topChar != '{') {
					return false;
				}
			}
		}
        return stack.isEmpty();
    }
	
	/**
	 * @Description main����
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����10:19:24
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		
		String s = "()";	//true
		System.out.println(isValid(s));
		
		s = "()[]{}";		//true
		System.out.println(isValid(s));
		
		s = "(]";			//false
		System.out.println(isValid(s));
		
		s = "([)]";			//false
		System.out.println(isValid(s));
		
		s = "{[]}";			//true
		System.out.println(isValid(s));

	}

}
