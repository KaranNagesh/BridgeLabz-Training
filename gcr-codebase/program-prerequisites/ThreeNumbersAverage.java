import java.util.Scanner;
class ThreeNumbersAverage{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double num1 = sc.nextInt();
	double num2 = sc.nextInt();
	double num3 = sc.nextInt();
	System.out.println(Average(num1,num2,num3));
}
    public static double Average(double num1, double num2, double num3){
	return (num1 + num2 + num3) / 3;
}

}
	