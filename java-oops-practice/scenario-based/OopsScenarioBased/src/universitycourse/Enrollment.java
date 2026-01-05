package universitycourse;


//Enrollemts class implements Graded interface
class Enrollment implements Graded {

//Private instance of class
private Student student;
private Course course;
private int marks;

//Parameterized constructor
public Enrollment(Student student, Course course, int marks) {
   this.student = student;
   this.course = course;
   this.marks = marks;
}

@Override
//Assigning grade based on marks
public void assignGrade() {
   double gpa;

   if (marks >= 90)
       gpa = 4.0;
   else if (marks >= 75)
       gpa = 3.0;
   else if (marks >= 60)
       gpa = 2.0;
   else
       gpa = 1.0;

   student.updateGpa(gpa);
}
}