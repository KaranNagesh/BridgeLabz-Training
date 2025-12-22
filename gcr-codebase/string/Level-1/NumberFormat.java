import java.util.Scanner;
class NumberFormat{
	
	// funtion for generating exception 
	public static void generateException(String str){
		System.out.println(Integer.parseInt(str));
	}
	
	// Function for handling exception
	public static void handleException(String str){
		try{
		System.out.println(Integer.parseInt(str));

		} catch(NumberFormatException e){
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
		//generateException(str);
		
		//Calling the funtion to handle the exception
		handleException(str);
	}
}