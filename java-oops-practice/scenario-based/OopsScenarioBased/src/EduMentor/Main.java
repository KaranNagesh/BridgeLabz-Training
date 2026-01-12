package EduMentor;
import java.util.*;

public class Main {
	    public static void main(String[] args) {
	        // --- Quiz Demonstration ---
	        Quiz easyQuiz = new Quiz("Easy");
	        System.out.println("Easy Quiz Questions: " + easyQuiz.getQuestions());
	        
	        // Learner takes the quiz
	        List<String> learnerAnswers = Arrays.asList("2", "paris");
	        double score = easyQuiz.scoreQuiz(learnerAnswers);
	        System.out.println("Learner Score: " + score + "%");

	        // --- Polymorphism Demonstration ---
	        Learner alice = new Learner("Alice", "alice@example.com", 101);

	        ICertifieable shortCourseCert = new ShortCourse(alice);
	        ICertifieable fullTimeCert = new FullTimeCourse(alice, 24);

	        // The generateCertificate() method behaves differently based on the object type
	        System.out.println("Short Course Certificate: " + shortCourseCert.generateCertificate());
	        System.out.println("Full Time Diploma: " + fullTimeCert.generateCertificate());
	}
}
