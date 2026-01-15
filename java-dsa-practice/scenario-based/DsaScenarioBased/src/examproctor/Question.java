
package examproctor;

//Class Question to store question details
public class Question {
	int questionId;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;

	// Parameterized Constructor
	public Question(int questionId, String question, String option1, String option2, String option3, String option4,
			int answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;

		addAnswer(questionId, answer);
	}
	// Method to add answer to hash map
	void addAnswer(int questionId, int ans) {
		ExamProctor.answer.put(questionId, ans);
	}

}
