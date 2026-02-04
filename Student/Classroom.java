package Student;

import java.util.ArrayList;
import java.util.Collections;

// Classroom is to track a class's roster
public class Classroom {
	// instance variable
	private ArrayList<Student> students;

	public Classroom(){
		students = new ArrayList<>();
	}

	// enrolls a student in the class
	public void enroll(Student s){
		students.add(s);
		// Why shouldn't we sort the roster after every time we enroll a student?
		// Collections.sort(students);
	}

	// sorts the students based on the current sorting method
	// then prints the current roster
	public void printRoster(){
		// we put the sort here so we call it sparringly
		Collections.sort(students);

		for(Student s : students){
			System.out.println(s);
		}
	}

}
