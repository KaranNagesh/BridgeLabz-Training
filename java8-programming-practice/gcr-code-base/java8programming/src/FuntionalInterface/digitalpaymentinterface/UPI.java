package FuntionalInterface.digitalpaymentinterface;

public class UPI implements Payment {

	public UPI() {};
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying through UPI");
	}

}
