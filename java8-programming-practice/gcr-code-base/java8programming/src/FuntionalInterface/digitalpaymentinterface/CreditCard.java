package FuntionalInterface.digitalpaymentinterface;

public class CreditCard implements Payment {
	public CreditCard() {}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying through the credit card");
	};
	
}
