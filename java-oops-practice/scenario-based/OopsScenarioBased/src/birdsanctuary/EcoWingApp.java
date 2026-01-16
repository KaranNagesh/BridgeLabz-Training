package birdsanctuary;

//Main application class
public class EcoWingApp {

 // Program entry point
 public static void main(String[] args) {

     // Create sanctuary object
     BirdSanctuary sanctuary = new BirdSanctuary();

     // Add birds
     sanctuary.addBird(new Eagle("B101", "Aquila"));
     sanctuary.addBird(new Duck("B102", "Donald"));
     sanctuary.addBird(new Penguin("B103", "Pingo"));
     sanctuary.addBird(new Kiwi("B104", "Kiko"));

     System.out.println("\nAll Birds:");
     sanctuary.displayAllBirds();

     System.out.println("\nFlying Birds:");
     sanctuary.displayFlyingBirds();

     System.out.println("\nSwimming Birds:");
     sanctuary.displaySwimmingBirds();

     System.out.println("\nBoth Flying & Swimming Birds:");
     sanctuary.displayBothFlyAndSwim();

     System.out.println();
     sanctuary.sanctuaryReport();
 }
}