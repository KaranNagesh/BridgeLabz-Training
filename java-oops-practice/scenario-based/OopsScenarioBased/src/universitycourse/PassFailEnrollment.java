package universitycourse;
//Class implementing Graded interface
class PassFailEnrollment implements Graded {
	
	//Private instance of class
  private Student student;
  private boolean isPassed;
  
  //Parameterized constructor
  public PassFailEnrollment(Student student, boolean isPassed) {
      this.student = student;
      this.isPassed = isPassed;
  }

  @Override
  public void assignGrade() {
      if (isPassed)
          student.updateGpa(3.5);
      else
          student.updateGpa(0.0);
  }
}