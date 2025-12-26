import java.util.Scanner;
public class RemoveDuplicate{
	
	// Method for Checking the duplicates 
	public static boolean check(String str , int index ,  char c){
		for(int i = index ; i < str.length(); i++){
			if(str.charAt(i) == c){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String newStr = "";
		for(int i = 0 ; i < str.length() ; i++){
			if(check(str,i+1,str.charAt(i))){
				newStr += str.charAt(i);
			}
		}
		System.out.println(newStr);
	}
}