import java.util.Scanner;
public class SimpleInterest{

	// method of finding simple interest
	public double findingSI(double principle, double rate,double time){
		return (principle * rate * time) / 100;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//creating an instance 
		SimpleInterest simpleInterest = new SimpleInterest();
		
		//Taking principle from user
		System.out.println("Enter principle : ");
		double principle = sc.nextInt();
		
		//Taking rate of interest
		System.out.println("Enter Rate of interest :");
		double rate = sc.nextInt();
		
		System.out.println("Enter time : ");
		double time = sc.nextInt();
		
		// calling method passing all the values and storing the result in si variable
		double si = simpleInterest.findingSI(principle,rate,time);
		
		// displaying the simple interest
		System.out.println("The Simple Interest is " + si + " for priciple " + principle +  ", Rate of Interest " + rate + " and Time " + time);
		
		
	}
}