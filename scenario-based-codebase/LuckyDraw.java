import java.util.Scanner;
public class LuckyDraw{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to lucky draw");
		
	//using infinite loop iterate untill someone win
	while(true){
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		//Checking for the conditions divisible by 5 and 3 both
		if(num % 3 == 0 && num % 5 == 0){
			System.out.println("Hurray you won the lucky draw");
			break;
		}
		System.out.println("ohh You loss , better luck next time");
	}
	}
}