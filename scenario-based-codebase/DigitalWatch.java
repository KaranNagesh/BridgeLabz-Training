import java.util.Scanner;

public class DigitalWatch{
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	// hour variable 
	int hour = 0 ;
	boolean check = true;
	
	//infinite loop
	while(true){
		
		//taking a minute variable which will run till 60 in every hour
		for(int minute = 0; minute < 60 ; minute++){
			System.out.println(hour + " : " + minute);
		}
		
		//incrementing hour after every hour
		hour++;
		
		// if reaches 13 loop will break-	
		if(hour == 13){
			break;
		}
	}
		
	}
}