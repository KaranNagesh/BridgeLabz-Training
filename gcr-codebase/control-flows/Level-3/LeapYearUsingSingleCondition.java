import java.util.Scanner;
public class LeapYearUsingSingleCondition{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		// Taking input 
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		
		//taking an boolean to check the leap year
		boolean leap = false;
		
		//checking the year enter is valid according to gregorian calender or not
		//checking that the year is divisible by 4 , 100 , and 400 logic of checking leap year
		if(year >= 1582 && (year % 4 == 0 || year % 100 == 0 || year % 400 == 0  )){	
						leap = true;
			}
		
		// printing the output according to the boolean leap 
        if(leap){
			System.out.println(year + " is a leap year");
		} else{
			System.out.println(year + " is not a leap year");
		}	
	}
}	
		

