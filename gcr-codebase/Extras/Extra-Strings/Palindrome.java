import java.util.Scanner;
public class Palindrome{
	public static void main(String args[]){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the string to check palindrome : ");
		String str = sc.nextLine();
		
		//starting index
		int i = 0;
		
		//end index
		int j = str.length() - 1;
		
		//Boolean for check
		boolean check = true;
		
		//iterating and checking
		while(i<j){
			if(str.charAt(i) != str.charAt(j)){
				check = false;
			}
			
			i++;
			j--;
		}
		
		//checking the check boolean
		if(check){
			System.out.println("String is a valid palindrome");
		} else {
			System.out.println("String is not a valid palindrom");
		}
	}
}