import java.util.Scanner;
class IllegalArguments{
	
	// funtion for generating exception 
	public static void generateException(String str){
		System.out.println(str.substring(15,20));
	}
	
	// Function for handling exception
	public static void handleException(String str){
		try{
		System.out.println(str.substring(15,5));

		} catch(IllegalArgumentException e){
			System.out.println("exception : " + e.getMessage());
		} catch(RuntimeException e){
			System.out.println("RuntimeException : " + e.getMessage());
		} 
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Taking string as input from user
		String str = sc.nextLine();
		
		//Calling the function of generating exception
		generateException(str);
		
		//Calling the funtion to handle the exception
		handleException(str);
	}
}