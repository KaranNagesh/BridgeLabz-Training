import java.util.*;
public class ArrayIndexException{
	
	
	//Method of generating exception
	public static void generateException(String arr[]){
		try{
			System.out.println(arr[arr.length]);
	}
	
	
	//Method for handling exception
	public static void handleException(String arr[]){
		try{
			System.out.println(arr[arr.length]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception : " + e.getMessage());
		} catch(RuntimeException e){
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Array of names 
		String arr[] = new String[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = sc.nextLine();
		}
		
		
		generateException(arr);
		
		handleException(arr);
	}
}