package universitycourse;


class Course {
	
	//Private instance of class
    private String courseCode;
    private String courseName;
    
    //Parameterizes constructor
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    
    //Method to display course details
    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
    }
}