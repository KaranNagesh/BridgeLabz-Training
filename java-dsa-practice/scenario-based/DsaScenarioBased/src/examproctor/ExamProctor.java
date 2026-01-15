package examproctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Scanner;

//Main Class
public class ExamProctor {

	// Static instance of class
	static Stack<Question> question = new Stack<>();
	static Stack<Question> backward = new Stack<>();
	static Map<Integer, Integer> answer = new HashMap<>();
	static Map<Integer, Integer> studentAnswer = new HashMap<>();
	static int totalScore;

	// Method to set totalScore
	static void setTotalScore(int score) {
		totalScore = score;
	}

	// Method to add question in stack
	static void addQuestion(Question quest) {
		question.push(quest);
	}

	// Navigating Forward
	static void next() {
		Scanner input = new Scanner(System.in);
		if (question.empty()) {
			System.out.println("All questions done");
			System.out.println("Enter\n1 -> Submit\n2 -> Previous");
			int action = input.nextInt();
			if (action == 1) {
				computeScore();
			} else {
				prev();
			}

		} else {
			backward.push(question.pop());
			displayQuestion();
		}
		input.close();
	}

	// Navigating Forward
	static void prev() {
		if (backward.empty()) {
			System.out.println("There is no previous state");
			displayQuestion();
		} else {
			question.push(backward.pop());
			displayQuestion();
		}
	}

	// Method to display questions
	static void displayQuestion() {
		Scanner input = new Scanner(System.in);
		if (question.empty()) {
			next();
		} else {
			Question quest = question.peek();
			System.out.println("Question No :- " + quest.questionId);
			System.out.println(quest.question);
			System.out.println("Enter the correct option");
			System.out.println(" 1 -> " + quest.option1);
			System.out.println(" 2 -> " + quest.option2);
			System.out.println(" 3 -> " + quest.option3);
			System.out.println(" 4 -> " + quest.option4);
			int ans = input.nextInt();
			studentAnswer.put(quest.questionId, ans);

			System.out.println("Enter\n1 -> Previous\n2 -> Next");
			int move = input.nextInt();
			if (move == 1) {
				prev();
			} else {
				next();
			}

		}

		input.close();

	}

	// Method to compute score
	static void computeScore() {
		int score = 0;
		for (int i : answer.keySet()) {
			if (answer.get(i) == studentAnswer.get(i)) {
				score++;
			}
		}

		System.out.println("Exam ended Successfully");
		System.out.println("Total Score " + totalScore);
		System.out.println("Your Scored " + score);

	}

	public static void main(String[] args) {

		// Creating objects of questions
		Question question1 = new Question(10, "What is the time complexity of binary search?", "O(n)", "O(log n)",
				"O(n log n)", "O(1)", 2);

		Question question2 = new Question(9, "Which data structure follows FIFO principle?", "Stack", "Queue", "Tree",
				"Graph", 2);

		Question question3 = new Question(8, "Which keyword is used to inherit a class in Java?", "this", "super",
				"extends", "implements", 3);

		Question question4 = new Question(7, "Which data structure uses LIFO order?", "Queue", "Array", "Stack",
				"Linked List", 3);

		Question question5 = new Question(6, "Which method is the entry point of Java program?", "start()", "main()",
				"run()", "init()", 2);

		Question question6 = new Question(5, "Which collection does not allow duplicate elements?", "List", "Set",
				"Map", "ArrayList", 2);

		Question question7 = new Question(4, "Which sorting algorithm has best case O(n)?", "Bubble Sort",
				"Selection Sort", "Merge Sort", "Quick Sort", 1);

		Question question8 = new Question(3, "Which keyword is used to create an object in Java?", "class", "object",
				"new", "create", 3);

		Question question9 = new Question(2, "Which data structure is used for BFS traversal?", "Stack", "Queue",
				"Array", "Tree", 2);

		Question question10 = new Question(1, "Which access modifier has the highest visibility?", "private", "default",
				"protected", "public", 4);

		// Adding questions to question stack
		addQuestion(question1);
		addQuestion(question2);
		addQuestion(question3);
		addQuestion(question4);
		addQuestion(question5);
		addQuestion(question6);
		addQuestion(question7);
		addQuestion(question8);
		addQuestion(question9);
		addQuestion(question10);

		// Method to set total score
		setTotalScore(10);

		// Method to display questions
		displayQuestion();

	}
}