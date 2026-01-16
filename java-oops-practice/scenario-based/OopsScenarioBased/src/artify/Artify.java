package artify;

//Main class to purchase art works by users
public class Artify {

	public static void main(String[] args) {
		
		//Creating object of art works
		ArtWork art1 = new DigitalArt("Salvator Mundi","Leonardo da Vinci",100);
		ArtWork art2 = new PrintArt("Interchange","Willem de Kooning",150);
		
		//Creating object of User
		User user1 = new User("Arif", 500);
		
		//User purchasing art works
		art1.purchase(user1);
		art2.purchase(user1);

	}

}