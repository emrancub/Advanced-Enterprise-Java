import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		Student s1 = new Student("abc",1);
		Student s2 = new Student("abcd",2);
		Student s3 = new Student("abcde",3);
		
		List<Student> students = new LinkedList<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);

	}

}
