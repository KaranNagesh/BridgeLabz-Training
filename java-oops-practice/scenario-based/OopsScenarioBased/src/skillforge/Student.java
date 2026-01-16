
package skillforge;


 // Student class extends User and implements ICertifiable
 
class Student extends User implements ICertifiable {

    private int progress;   // Course completion percentage
    private int score;      // Score obtained

    public Student(String name, String email) {
        super(name, email);
    }

    // Operators used for progress & grading
    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    public void assignScore(int marks) {
        score = marks;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100 && score >= 60) {
            System.out.println("Certificate Generated for Student: " + name);
        } else {
            System.out.println("Course not completed. Certificate unavailable.");
        }
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}
