/**
 * @ClassName Student
 * @Description Studentʵ����
 * @author Yin Guiqing
 * @date 2019��5��26�� ����12:43:32
 */
public class Student {

	//����
	private String name;
	//����
	private int score;
	
	/**
	 * @Description main����
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����12:43:32
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
	 * @Description Student���캯��
	 * @author Yin Guiqing
	 * @date 2019��5��26�� ����12:48:13
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
