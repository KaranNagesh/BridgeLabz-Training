import java.util.Scanner;
public class SubString{
	public static String subString(String str, int start , int end){
		String newString = "";
		for(int i = start ; i < end; i++){
			newString += str.charAt(i);
		}
		return newString;
	}
	
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
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		String strNew = subString(str,start,end);
		String newStr = str.substring(start,end);
		if(compare(strNew,newStr)) {
			System.out.println("Both are exactly same");
		} else{
			System.out.println("Both are different");
		}
	}
}