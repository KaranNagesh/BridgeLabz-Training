package CampusConnect;
import java.util.ArrayList;

public class Course {
	private String courseName;
	private Faculty faculty;
	private ArrayList<Student> students;
	
	public Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
		this.students = new ArrayList<>();
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	void addStudent(Student student) {
		students.add(student);
	}
	
	void removeStudent(Student student) {
		students.remove(student);
	}
	
	void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        faculty.printDetails();
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            s.printDetails();
        }
    }

}