package universitycourse;


//main class
public class UniversityEnrollmentSystem {

  public static void main(String[] args) {
  	
  	//Creating object of student class
      Student s1 = new Undergraduate(101, "Arif");
      Student s2 = new Postgraduate(201, "Rahul", 3.2);
      
      //Creating object of Course and Faculty class
      Course course = new Course("CS101", "Object Oriented Programming");
      Faculty faculty = new Faculty(1, "Dr. Mehta");
      
      //Displaying faculty and course info
      faculty.displayInfo();
      course.displayCourse();

      // Letter grading
      Graded enrollment1 = new Enrollment(s1, course, 85);
      enrollment1.assignGrade();

      // Pass/Fail grading
      Graded enrollment2 = new PassFailEnrollment(s2, true);
      enrollment2.assignGrade();

      s1.displayInfo();
      System.out.println(s1.getTranscript());

      s2.displayInfo();
      System.out.println(s2.getTranscript());
  }
}