
package gamebox;

import java.util.ArrayList;
import java.util.List;

// User class with protected owned games
class User {

	private String username;
	private List<Game> ownedGames;

	// Constructor
	User(String username) {
		this.username = username;
		this.ownedGames = new ArrayList<>();
	}

	// Add game to user's library (controlled access)
	public void purchaseGame(Game game) {
		ownedGames.add(game);
		System.out.println(username + " owns game: " + game.title);
	}

	// Display owned games
	public void showLibrary() {
		System.out.println("Games owned by " + username + ":");
		for (Game g : ownedGames) {
			System.out.println("- " + g.title + " (" + g.genre + ")");
		}
	}
}
