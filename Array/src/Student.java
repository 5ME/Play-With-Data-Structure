/**
 * @ClassName Student
 * @Description Student实体类
 * @author Yin Guiqing
 * @date 2019年5月26日 下午12:43:32
 */
public class Student {

	//姓名
	private String name;
	//分数
	private int score;
	
	/**
	 * @Description main方法
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午12:43:32
	 * @param args 
	 * @return void
	 * @throws
	 */
	public static void main(String[] args) {
		Array<Student> arrStudent = new Array<>();
		arrStudent.addLast(new Student("Alice", 100));
		arrStudent.addLast(new Student("Bob", 66));
		arrStudent.addLast(new Student("Cindy", 88));
		System.out.println(arrStudent);
		
	}
	
	/**
	 * @Description Student构造函数
	 * @author Yin Guiqing
	 * @date 2019年5月26日 下午12:48:13
	 */
	public Student(String studentName, int studentScore) {
		name = studentName;
		score = studentScore;
	}
	
	@Override
	public String toString() {
		return String.format("Student(name: %s, score: %d)", name, score);
	}

}
