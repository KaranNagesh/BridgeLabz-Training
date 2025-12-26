import java.util.Scanner;
public class ToggleCase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String newStr = "";
		for(int i = 0 ; i < str.length(); i++){
			int c =  str.charAt(i);
			if( c <= 'z' && c >= 'a'){
				newStr +=  (char) (c  - 32);
			} else if(c >= 'A' && c <= 'Z'){
				newStr += (char) (c + 32);
			}
		}
		System.out.println(newStr);
	}
}