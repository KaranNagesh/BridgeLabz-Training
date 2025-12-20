import java.util.Scanner;
public class TwoDArraytoOneD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		for(int i = 0 ;i < row ;i++){
			for(int j = 0 ; j < col ;j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int singlyArray[] = new int[row*col];
		
		
		int singlyIndex = 0 ;
		
		for(int i = 0 ; i < row ; i++){
			for(int j = 0 ; j < col ; j++){
				singlyArray[singlyIndex] = matrix[i][j];
				singlyIndex++;
			}
		}
		
		for( int i = 0 ; i < singlyArray.length; i++){
			System.out.print(singlyArray[i] +  " ");
		}
	}
}