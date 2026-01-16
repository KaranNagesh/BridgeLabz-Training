
package gamebox;

//Base class for all games
abstract class Game implements IDownloadable {

	protected String title;
	protected String genre;
	protected double price;
	protected double rating;

	// Constructor for paid games
	Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	// Constructor for free games
	Game(String title, String genre) {
		this(title, genre, 0.0, 0.0);
	}

	// Apply seasonal discount using operators
	public void applySeasonalOffer(double discountPercent) {
		price = price - (price * discountPercent / 100); // operator usage
	}

	// Common download behavior
	public void download() {
		System.out.println(title + " downloaded successfully");
	}

	// Abstract demo behavior
	public abstract void playDemo();
}
