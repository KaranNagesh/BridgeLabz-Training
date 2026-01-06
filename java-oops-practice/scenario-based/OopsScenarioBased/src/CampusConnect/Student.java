package CampusConnect;
import java.util.ArrayList;

class Student extends Person implements ICourseActions {
	
	private ArrayList<Integer> grades = new ArrayList<>();
	
	public Student(String name, String email, int id) {
		super(name, email, id);
	}
	
	
	// Encapsulation
	public void addGrade(int grade) {
		grades.add(grade);
	}
	
	// Calculate GPA
	public double calculateGPA() {
		int sum = 0;
		for(int g : grades) {
			sum += g;
		}
		
		return grades.size() == 0 ? 0 : (double) sum / grades.size();
	}
	
	public void enrollCourse(Course course) {
		course.addStudent(this);
		 System.out.println(name + " enrolled in " + course.getCourseName());
	}
	
	public void dropCourse(Course course) {
		course.removeStudent(this);
		 System.out.println(name + " dropped " + course.getCourseName());
	}
	
	void printDetails() {
		 System.out.println("Student: " + name + "\nGPA: " + calculateGPA());
	}

}