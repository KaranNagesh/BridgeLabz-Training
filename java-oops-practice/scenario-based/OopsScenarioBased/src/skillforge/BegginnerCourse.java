package skillforge;


//Beginner course certificate
 
class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    protected void printCertificateFormat() {
        System.out.println("Beginner Level Certificate");
    }
}


//  Advanced course certificate
 
class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    protected void printCertificateFormat() {
        System.out.println("Advanced Level Certificate with Honors");
    }
}