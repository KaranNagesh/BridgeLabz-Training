
package gamebox;

//Arcade game implementation
class ArcadeGame extends Game {

	ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	ArcadeGame(String title) {
		super(title, "Arcade");
	}

	// Demo behavior for arcade games
	public void playDemo() {
		System.out.println("Playing fast-paced arcade demo of " + title);
	}
}
