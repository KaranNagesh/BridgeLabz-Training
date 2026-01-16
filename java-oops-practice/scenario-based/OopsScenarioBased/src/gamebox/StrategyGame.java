
package gamebox;

//Strategy game implementation
class StrategyGame extends Game {

	StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	StrategyGame(String title) {
		super(title, "Strategy");
	}

	// Demo behavior for strategy games
	public void playDemo() {
		System.out.println("Playing tactical strategy demo of " + title);
	}
}
