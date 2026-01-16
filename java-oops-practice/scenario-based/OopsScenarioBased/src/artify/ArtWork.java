package artify;


//Super class implements interface IPurchasable
public class ArtWork implements IPurchasable{
	
	//Protected instance of class
	protected String title;
	protected String artist;
	protected double price;
	private String licenseType =  "";
	
	//Parameterized Constructor
	public ArtWork(String title, String artist, double price) {
		this.title = title;
		this.artist = artist;
		this.price = price;
	}
	
	
	//Getter Method to get license type
	public String getLicenseType() {
		return licenseType;
	}

	//setter Method to set license type
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	//Getter Method to get price
	public double getPrice() {
		return price;
	}

	//Setter Method to set price
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	//Implementing interface methods
	@Override
	public void purchase(User user) {
		if(this.getPrice()>user.getWalletBalance()) {
			System.out.println("Wallet Balance Insufficient");
			return;
		}
		
		
		 
		
	}
	@Override
	public void license() {
		System.out.println("Computing license");
		
	}
	
	//Displaying Art work details
	void displayInfo() {
		System.out.println("---------------------------------");
		System.out.println("Art Details");
		System.out.println("Title -> " + title);
		System.out.println("Artist -> " + artist);
		System.out.println("Price ->" + price);
		System.out.println("License -> " + getLicenseType());
		System.out.println("---------------------------------");
	}

	
	
	
}