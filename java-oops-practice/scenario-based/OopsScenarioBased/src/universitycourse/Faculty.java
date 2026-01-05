package universitycourse;


class Faculty {
	
	//Private instance of class
    private int facultyId;
    private String facultyName;

    //Parameterized constructor
    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }
    
    //Public method to display faculty info
    public void displayInfo() {
        System.out.println("Faculty: " + facultyName);
    }
}