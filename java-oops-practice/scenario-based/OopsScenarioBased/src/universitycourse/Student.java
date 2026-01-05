package universitycourse;


//Abstract class representing a Student
abstract class Student {

protected int studentId;
protected String name;

private double gpa;   // Sensitive data (Encapsulation)

// Constructor without elective preference
public Student(int studentId, String name) {
   this.studentId = studentId;
   this.name = name;
   this.gpa = 0.0;
}

// Overloaded constructor with elective preference
public Student(int studentId, String name, double initialGpa) {
   this.studentId = studentId;
   this.name = name;
   this.gpa = initialGpa;
}

// Public method to access transcript (controlled access)
public String getTranscript() {
   return "Student ID: " + studentId +
          ", Name: " + name +
          ", GPA: " + gpa;
}

// Protected GPA update (only subclasses can modify)
protected void updateGpa(double newGpa) {
   this.gpa = newGpa;
}

// Polymorphic method
abstract void displayInfo();
}