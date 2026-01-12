package EduMentor;
import java.util.*;

public class Quiz {
	private List<String> questions;
	private List<String> answers;
	private String difficulty;
	
	public Quiz(String difficulty) {
		this.difficulty = difficulty;
		initializeQuiz(difficulty);
	}
	
	private void initializeQuiz(String difficulty2) {
		if("Easy".equals(difficulty)) {
			this.questions = Arrays.asList("What is 1+1","What is the capital of india");
			this.answers = Arrays.asList("2", "delhi");
		} else {
			this.questions = Arrays.asList("Advance java question?", "Complex Data structure questions?");
			this.answers = Arrays.asList("Answer A" , "Answer B");
		}
	}
	 public List<String> getQuestions() {
	        return questions;
	    }
	    public double scoreQuiz(List<String> learnerAnswers) {
	        int correctCount = 0;
	        for (int i = 0; i < answers.size(); i++) {
	            if (i < learnerAnswers.size() && answers.get(i).equalsIgnoreCase(learnerAnswers.get(i))) {
	                correctCount++;
	            }
	        }
	        return (double) correctCount / answers.size() * 100; // Returns percentage
	    }
}
