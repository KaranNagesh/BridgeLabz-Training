import java.util.Scanner;
public class MultiplySixToNine{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int table[] = new int[6];
		int index = 0;
		for(int i = 6 ; i <= 9 ; i++){
			table[index] = i * num;
			index++;
		}
		
		index = 0;
		for(int i = 6 ; i <= 9 ; i++){
			System.out.println( num + " * " + i + " = " + table[index]);
			index++;
		}
	}
}