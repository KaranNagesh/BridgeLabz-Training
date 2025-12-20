import java.util.Scanner;
public class FiveNumber{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Created a array
		int arr[] = new int[5];
		
		// Using for loop to take input in array
        for(int i=0; i<5; i++){
		// Take input 5 number 
        System.out.print("Enter the number : " );
		arr[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++){
		// using conditions check wheather a number is positive , even and so on
		if(arr[i] > 0){
			if(arr[i] % 2 == 0){
				System.out.println("Number is postive as well as even");
			}
			else {
				System.out.println("Number is postive but odd");
			}
			
		}
		else if(arr[i] < 0){
			if(arr[i] % 2 == 0){
				System.out.println("Number is negative but even");
			}
			else {
				System.out.println("Number is negative but odd");
			}
		}
		else{
			System.out.println("Number is zero");
		}
		}
        if(arr[0] == arr[4]){
				System.out.println("Number are equal");
		}
		else if(arr[0] < arr[4]){
			System.out.println("first Number is small");
		}
		else{
			System.out.println("first Number is greater");
		}
		
			
	}
}