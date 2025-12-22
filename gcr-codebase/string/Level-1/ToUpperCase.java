import java.util.Scanner;

public class ToUpperCase{
	
	//Method for converting the lower case letters into uppercase with char at method
	public static String convert(String str){
		String result = "";
		for(int i = 0 ; i < str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z'){
			result += (char) (ch - 32);
			} else{
			result += str.charAt(i);
			}
			
		}
		return result;
	}
	
	//Method for comparing two strings
	public static boolean compare(String str1 , String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		for(int i = 0 ; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Taking input string
		String str = sc.nextLine();
		
		//Convert into upeercase using builtin method
		String str1 = str.toUpperCase();
		
		//Converting into uppercase using charAt method
		String str2 = convert(str);
		boolean result = compare(str1,str2);
		
		//Displaying the results
		if(result){
			System.out.println("same with both methods");
		} else{
			System.out.println("not same with both methods");
		}
	}
}