import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		//taking an boolean to check the leap year
		boolean leap = false;
		
		//checking the year enter is valid according to gregorian calender or not
		if(year >= 1582){
			//checking that the year is divisible by 4 , 100 , and 400 logic of checking leap year
			if(year % 4 == 0 ){
				if(year % 100 == 0) {
					if(year % 400 == 0 ){
						leap = true;
					}
			}
			leap = true;
		}
		
		// printing the output according to the boolean leap 
        if(leap){
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}		
		} else{
			System.out.println("enter a valid year");
		}
		
		
		
}
}