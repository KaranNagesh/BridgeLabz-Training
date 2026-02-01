package FuntionalInterface.digitalpaymentinterface;

public class Wallet implements Payment{

	public Wallet() {};
	
	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Paying through the wallet");
	}

}
