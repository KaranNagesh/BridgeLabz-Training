import java.util.*;
public class OnlineQuiz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Variables for score , correct answers , and wrond answers
		int score = 0 ;
		int correct = 0;
		int wrong = 0;
		
		//Array of questions
		String[] ques = {"What is the capital of india ?",
						"How many side a triangle have?",
						"Which device inputs data?",
						"What's the largest mammal?",
						"Who is father of computer?"
						};
						
		//Array of options
		String[] options = {"(a). Mumbai  (b). New Delhi  (c). Chennai  (d). kolkata",
						"(a). 3  (b). 5  (c). 2  (d). 4",
						"(a). Printer  (b). Monitor 4  (c). Keyboard  (d). Speaker",
						"(a). Elephant  (b). Blue Whale  (c). Giraffe  (d). Rhino",
						"(a). Bill gates  (b). Steve jobs  (c). Charles babbage  (d). Alan turing"
						};
						
						
		//Array of answers
		char[] answers = { 'b' , 'a' ,'c','b','c'};
						
					

		//Iterating through the questions
		for(int i = 0 ; i < ques.length;i++){
			
			//printing the questions and the options
			System.out.println(ques[i]);
			System.out.println(options[i]);
			System.out.println();
			
			//taking input as a char
			char ans = sc.nextLine().charAt(0);
			int check = 0;
			
			//checking the input answer is correct or not 
			if(ans == answers[i]){
				check = 1;
			} 
			
			//if answer is correct score increase by 5 
			switch(check){
				case 1:
				score += 5;
				correct++;
				break;
				
				case 0:
				wrong++;
			}
		}
		
		
		//Displaying results
		System.out.println("Your score is " + score);
		System.out.println("You choose " + correct + " correct answers and " + wrong + " wrong answers");
		
	}
}