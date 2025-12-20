import java.util.Scanner;
public class Factors{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input from the user for finding the factor
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		int maxFactor = 10;
		int factor[] = new int[maxFactor]; // Creating factor array
		int index =0;
		
		
		for(int i=1; i<=number; i++){
			if(number % i == 0) {
				
				// if index equal to maxfactor then twice the maxfactor
				if(index == maxFactor){
					maxFactor = maxFactor * 2;
					
				// Make a temp array to store the previous values
				int temp[] = new int[maxFactor];
				
				for(int j=0; j<index; j++){
					temp[j] =factor[j];
				}
				factor = temp;
			}
			factor[index] = i;
			index++;
		}
	 }
	 //printing the factor
	 System.out.print("Fcator of " +number+ " is : ");
	for(int i=0; i<index; i++){
		System.out.print(factor[i] + " ");
	}
	sc.close();
	}
  
}

	

			