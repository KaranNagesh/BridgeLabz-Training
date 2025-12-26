import java.util.Scanner;

public class LongestWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		int length = 0;
		int longest = 0;
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				length = 0;
			} else {
				length++;
				if(length > longest){
					longest = length;
				}
			}
		}
		System.out.println("The longest word is of length " + longest);
	}
}