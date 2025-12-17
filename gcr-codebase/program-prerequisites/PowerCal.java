import java.util.*;

class PowerCal{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double base = sc.nextInt();
	double exponent = sc.nextInt();
	double result = Math.pow(base,exponent);
	System.out.println(result);
}
}