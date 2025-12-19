import java.util.Scanner;
public class YoungestFriend{
	
	public static void main(String argr[]){
		Scanner input = new Scanner(System.in);
		//Taking the three input 
		System.out.print("Enter the Amar age : ");
		double amar = input.nextDouble();
		System.out.print("Enter the Akbar age : ");
		double akbar = input.nextDouble();
		System.out.print("Enter the Anthony age : ");
		double anthony = input.nextDouble();
		//Compair all the ages by using if else conditions
		if(amar < akbar && amar < anthony){
			System.out.println("Amar is the youngest in all the three : " +amar);
		}
			else if(akbar < anthony && akbar < amar){
			System.out.println("Akbar is the youngest in all the three : " +akbar);
			}
			else if(anthony < akbar && anthony < amar){
				System.out.println("Anthony is the youngest in all the three : " +anthony);
			}
				else
					// Print same if all the ages are same
					System.out.println("All the age are same so, the smallest is : "+amar);
	}
}
			
			
			

		
		