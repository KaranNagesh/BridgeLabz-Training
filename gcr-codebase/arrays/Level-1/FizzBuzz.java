import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
		//Creating a string array
		String arr[] = new String[(number+1)];
		
		//Checking the number is interger or not
		if(number > 0){
		for(int i=1; i<=number; i++){
			if(i%3 ==0 && i%5 ==0){
				arr[i] = "FizzBuzz";
			}
			else if(i % 5 == 0){
				arr[i] = "Buzz";
			}
			else if(i%3 ==0 ){
				arr[i] = "Fizz";
			}
			else{
				arr[i] = String.valueOf(i);
			}
		}
		}
		
		else{
			System.out.println("please Enter the postive integer ");
		}
		//Priting the array with position
		for(int i=1; i<=number; i++){
			System.out.println("position of " +i+ " is : "  +arr[i]);
		}    

    }
}
