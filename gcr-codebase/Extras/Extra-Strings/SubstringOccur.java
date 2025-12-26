import java.util.Scanner;
public class SubstringOccur{
	
	public static boolean check(String str , String subStr , int index){
		int i = 0 ;
		while(index < subStr.length()){
			if(str.charAt(index) != subStr.charAt(i)){
				return false;
			
			}
			index++;
			i++;
		}
		return true;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		System.out.println("Enter a substtring");
	    String subStr = sc.nextLine();
		
		int count = 0;
		
		for(int i = 0 ; i < str.length(); i++){
			if(str.charAt(i) == subStr.charAt(1)){
				if(check(str , subStr, i )){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}