package Student;

import java.util.ArrayList;
import java.util.Collections;

public class StudentRunner {
	public static void main(String[] args){
		ArrayList<Student> students = new ArrayList<>();

		students.add(new Student("Dillon", "Zimmerman"));
		students.add(new Student("Megan", "Nameth"));
		students.add(new Student("John", "Doe"));
		students.add(new Student("Tom", "Anderson"));
		students.add(new Student("Jane", "Doe"));

		// Show that the Student objects appear in the unsorted order we added them
		for(Student student : students){
			System.out.println(student);
		}

		// By default, we sort by name, so this prints based on sorted last name, first name
		Collections.sort(students);
		System.out.println("============================");


		for(Student student : students){
			System.out.println(student);
		}

		// We change the criterion for sorting to be on ID and sort again
		Student.setIDSort(true);
		Collections.sort(students);
		System.out.println("============================");


		for(Student student : students){
			System.out.println(student);
		}
	}
}
