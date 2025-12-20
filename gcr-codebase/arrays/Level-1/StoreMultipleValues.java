import java.util.Scanner;
public class StoreMultipleValues{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		// Create an array
		double arr[] = new double[10];
		double total = 0.0;
		int i = 0;
		// Using while loop
		while(i<10){
			// Take input from the user
			System.out.print("Enter the number : ");
		arr[i] = sc.nextDouble();
		if(arr[i] == 0 || arr[i] < 0){
				break;
			}	
		i++;
		}
        	
		for(int j=0; j<10; j++){
			total = total + arr[j];
		}
		System.out.println("The final result is : " +total);
	}
}