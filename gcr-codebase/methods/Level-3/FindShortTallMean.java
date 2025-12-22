import java.util.*;
public class FindShortTallMean{
	
	//Method for calculating mean
	public static double mean(int arr[]){
		int length = arr.length;
		int sum = 0;
		for(int i =0 ; i < length;i++){
			sum += arr[i];
		}
		double meanFormula = sum/length;
		return meanFormula;
	}
	
	// method for calculating sum
	public static int sum(int arr[]){
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	// method for finding shortest one
	public static int shortest(int arr[]){
		int shoort = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] < shoort){
				shoort = arr[i];
			}
		}
		return shoort;
	}
	
	public static int tallest(int arr[]){
		int tall = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] > tall){
				tall = arr[i];
			}
		}
		return tall;
	}
	
	// method of finding the tallest one
	public static void main(String arg[]){
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		
		// Storing random numbers between 150 to 250 in array
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = (int)(Math.random() * (250 - 150 + 1)) + 150;
		}
		
		// Calling functions of finding sum , tall , short , meanOfThree;
		int sumOfHeight = sum(arr);
		int tall = tallest(arr);
		int shoort = shortest(arr);
		double meanOfThree = mean(arr);

		// Displaying results
		System.out.println("The sum of the heigts " + arr[0] + " , " + arr[1] + " , " + arr[2] + " is " + sum(arr));
		System.out.println("The mean of the heigts " + arr[0] + " , " + arr[1] + " , " + arr[2] + " is " + mean(arr));
		System.out.println("The shortest among " + arr[0] + " , " + arr[1] + " , " + arr[2] + " is " + shortest(arr));
		System.out.println("The tallest among " + arr[0] + " , " + arr[1] + " , " + arr[2] + " is " + tallest(arr));
		
	}
}