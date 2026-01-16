package artify;


//Inheriting properties of ArtWork class
public class DigitalArt extends ArtWork {

	//Parameterized constructor
	public DigitalArt(String title, String artist, double price) {
		super(title, artist, price);
		
	}
	
	//Overriding parent method and performing purchase operation
	@Override
	public void purchase(User user) {
		if(this.getPrice()>user.getWalletBalance()) {
			System.out.println("Wallet Balance Insufficient");
			return;
		}
		this.license();
		user.setWalletBalance(user.getWalletBalance()-this.getPrice());
		
		System.out.println(user.getName() +" Successfully purchased ->" + this.title );
		this.displayInfo();
		 
		
	}
	
	//Overriding parent method and initializing license 
	@Override
	public void license() {
		System.out.println("You purchased -> Exclusive Digital License");
		this.setLicenseType("Exclusive Digital License");
		
	}

}