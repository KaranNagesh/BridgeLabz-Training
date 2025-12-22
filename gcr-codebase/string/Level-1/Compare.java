import java.util.*;
public class Compare{
	
	// Method of comparing two string using .charAt method
	public static boolean comparTwo(String str1 , String str2){
		
		boolean check = true;
		
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i = 0 ; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				check = false;
			}
		}
		return check;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String : " );
		String str2 = sc.nextLine();
		
		
		// Calling function and storing boolean in variables
		boolean check = comparTwo(str1, str2);
		boolean checkUsingIsEqual = str1.equals(str2);
		
		//Checking both string are same accoring to charAt method or not
		if(check){
			System.out.println("Both the strings are same accoring to charAt method");
		} else{
			System.out.println("Both the strings are not same accoring to charAt method");

		}
		
		//Checking both strings are same of not accoring to .equals
		if(checkUsingIsEqual){
			System.out.println("Both the strings are same accoring to .equals method");
		} else{
			System.out.println("Both the strings are not same accoring to .equals method");

		}
		
		//Checking that both methods are giving same of different output
		if(check != checkUsingIsEqual){
			System.out.println("not same with both methods");
		} else{
			System.out.println("same with both methods");
		}
		
	}
}