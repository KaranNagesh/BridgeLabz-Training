package CampusConnect;

public class Main {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma", "sharma@uni.edu", 101, "Computer Science");

        Course javaCourse = new Course("Java Programming", f1);
        Course pythonCourse = new Course("Python Programming", f1);


        Student s1 = new Student("Karan", "Karan@uni.edu",101);
        Student s2 = new Student("Ansh", "ansht@uni.edu",102);

        s1.addGrade(85);
        s1.addGrade(90);
        s1.enrollCourse(javaCourse);
        s1.enrollCourse(pythonCourse);
        
       
        
        System.out.println("-------------------------------------------------");

        s2.addGrade(70);
        s2.addGrade(80);
        s2.enrollCourse(javaCourse);
        

        System.out.println("----------------Java Course Details----------------");
        javaCourse.showCourseDetails();
       
        
        System.out.println("---------------Python Course Details------------------");
        pythonCourse.showCourseDetails();


    }
}
