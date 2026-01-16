
package gamebox;

//Main class to test GameBox platform
public class GameBoxApp {

	public static void main(String[] args) {

		// Create games (polymorphism)
		Game arcade = new ArcadeGame("Speed Runner", 299, 4.5);
		Game strategy = new StrategyGame("War Tactix", 499, 4.7);
		Game freeArcade = new ArcadeGame("Brick Blaster");

		// Play demos
		arcade.playDemo();
		strategy.playDemo();

		// Apply seasonal offer
		strategy.applySeasonalOffer(20); // 20% discount

		// Download games
		arcade.download();
		strategy.download();

		// Create user
		User user = new User("Karan");

		// Purchase games
		user.purchaseGame(arcade);
		user.purchaseGame(strategy);
		user.purchaseGame(freeArcade);

		// Show user library
		user.showLibrary();
	}
}
