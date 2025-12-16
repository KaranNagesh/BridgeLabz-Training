import java.util.Scanner;
class KilometerToMilesConverter{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double kilometer = sc.nextDouble();
	System.out.println(converter(kilometer));
}
    public static double converter(double kilometer){
	return kilometer * 0.621371;
}
}