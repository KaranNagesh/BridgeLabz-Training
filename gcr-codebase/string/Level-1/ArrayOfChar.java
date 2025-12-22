import java.util.Scanner;
public class ArrayOfChar{
	
	//Method for converting string into array
	public static char[] toArray(String str){
		char[] result = new char[str.length()];
		for(int i = 0 ; i < str.length(); i++){
			result[i] = str.charAt(i);
		}
		return result;
	}
	
	// method for comparing two char array
	public static boolean compare(char[] arr1 , char[] arr2){
		if(arr1.length != arr1.length){
			return false;
		}
		for(int i = 0; i < arr1.length; i++){
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// Creating two array one is for builtin method of converting into char array another is using user-defined method
		char[] arr1 = str.toCharArray();
		char[] arr2 = toArray(str);
		
		// comparing both the arrays and display result accordingly
		if(compare(arr1,arr2)){
			System.out.println("Both the arrays are equal");
		} else{
			System.out.println("Both the arrays are different");
		}
	}
}