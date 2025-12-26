import java.util.Scanner;
public class ReverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : " );
		String str = sc.nextLine();
		
		//Created a new string to store the characters from ending
		String str2 = "";
		
		//iterating from backward
		for(int i = str.length() - 1; i >= 0 ; i--){
			str2 += str.charAt(i);
		}
		
		//Displaying output
		System.out.println( "Reversed String : " + str2);
	}
}