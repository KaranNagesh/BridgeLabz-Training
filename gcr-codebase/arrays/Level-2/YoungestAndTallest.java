import java.util.Scanner;
public class YoungestAndTallest{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		// Creating two array to store the age and height of 3 friend
		int age[] = new int[3];
		int height[] = new int[3];
		
		int youngest = Integer.MAX_VALUE;
		int tallest = Integer.MIN_VALUE;
		int index = -1;
		
		//Taking age as a input from the user
		System.out.print("Enter the age of 3 friends : ");
		for(int i=0;i<3; i++){
			age[i] = sc.nextInt();
			if(age[i] < youngest){
				youngest = age[i];
				index = i;
			}
		}
		//Printing the youngest friend
		if(index == 0){
		System.out.print("Youngest is Amar with age: " +youngest);
		}
		else if(index == 1){
		System.out.print("Youngest is Akbar with age : " +youngest);
		}
		else{
		System.out.println("Youngest is Anthony with age: " + youngest);
		}
		
		System.out.println();
		
		//Taking height as a input from the user
		System.out.print("Enter the height of 3 friends : ");
		int newIndex = -1;
		for(int j=0;j<3; j++){
			height[j] = sc.nextInt();
				if(height[j] > tallest){
				tallest = height[j];
				newIndex = j;
			}
		}
		//Printing the tellest friend
		if(newIndex == 0){
		System.out.print("Tallest is Amar with height : " +tallest);
		}
		else if(newIndex == 1){
		System.out.print("Tallest is Akbar with height : " +tallest);
		}
		else{
		System.out.print("Tallest is Anthony with height : " +tallest);
		}
		sc.close();
	}
}
		
		
		
		
		
		
		
		