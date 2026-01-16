package artify;


//Creating class of User
public class User {
	
	//Instance of class
	String name;
	double walletBalance;
	
	//Parameterized Constructor
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}

	//Getter method to get userName
	public String getName() {
		return name;
	}
	
	//Setter Method to set UserName
	public void setName(String name) {
		this.name = name;
	}

	//Getter Method to get user wallet balance
	public double getWalletBalance() {
		return walletBalance;
	}

	//Setter Method to set user wallet balance
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
}