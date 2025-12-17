import java.util.*;

class PowerCalculator{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double base = sc.nextInt();
	double exponent = sc.nextInt();
	double result = Math.pow(base,exponent);
	System.out.println(result);
}
}