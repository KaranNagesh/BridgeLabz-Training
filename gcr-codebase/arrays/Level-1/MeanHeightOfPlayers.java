import java.util.Scanner;
public class MeanHeightOfPlayers{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[11];
		double sum = 0.0;
		for(int i=0; i<11; i++){
			System.out.print("Enter the height of the " +(i+1)+ " players is : ");
			arr[i] = sc.nextDouble();
			sum = sum + arr[i];
		}
		double mean = sum / 11;
		System.out.println("The mean of all the players is : "+mean);
	}
}
		