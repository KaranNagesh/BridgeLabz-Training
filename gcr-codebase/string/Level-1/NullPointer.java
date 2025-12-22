public class NullPointer{
	
	//funtion for handling the exception
	public static void handleException(){
		String text = null;
		try{
			text.length();
		} catch(NullPointerException e){
			System.out.println("NullPointerException occurs " + e.getMessage());
		}
	}
	
	//function for generating exception
	public static void generateException(){
		String text = null;
		text.length();
	}
	public static void main(String[] args){
		
		//This function is for generating exception
		generateException();
		
		//This function is for handling exception
		handleException();
	}
}