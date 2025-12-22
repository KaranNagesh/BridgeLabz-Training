import java.util.Scanner;
class StringIndexException{
	
	// funtion for generating exception 
	public static void generateException(String str){
		System.out.println(str.charAt(str.length()));
	}
	
	// Function for handling exception
	public static void handleException(String str){
		try{
		System.out.println(str.charAt(str.length()));

		} catch(StringIndexOutOfBoundsException e){
			System.out.println("Index out of bounds exception " + e.getMessage());
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