import java.util.*;
class SimpleInterest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	double principle = sc.nextDouble();
	double rate = sc.nextDouble();
	double year = sc.nextDouble();
	System.out.println(calculate(principle,rate,year));
}
    public static double calculate(double principle , double rate , double time){
	return (principle * rate * time) / 100;
}
}