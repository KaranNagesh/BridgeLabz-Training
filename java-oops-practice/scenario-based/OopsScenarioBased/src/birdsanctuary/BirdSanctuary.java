
package birdsanctuary;

import java.util.ArrayList;

//Manages all birds in the sanctuary
class BirdSanctuary {

 // List to store all birds
 private ArrayList<Bird> birds = new ArrayList<>();

 // Add a bird to sanctuary
 public void addBird(Bird bird) {
     birds.add(bird);
     System.out.println("Bird added successfully.");
 }

 // Display all birds
 public void displayAllBirds() {
     for (Bird bird : birds) {
         bird.displayInfo(); // Display info
         bird.eat();         // Polymorphic call
     }
 }

 // Display only flying birds
 public void displayFlyingBirds() {
     for (Bird bird : birds) {
         if (bird instanceof Flyable) {
             ((Flyable) bird).fly(); // Polymorphism
         }
     }
 }

 // Display only swimming birds
 public void displaySwimmingBirds() {
     for (Bird bird : birds) {
         if (bird instanceof Swimmable) {
             ((Swimmable) bird).swim(); // Polymorphism
         }
     }
 }

 // Display birds that can both fly and swim
 public void displayBothFlyAndSwim() {
     for (Bird bird : birds) {
         if (bird instanceof Flyable && bird instanceof Swimmable) {
             bird.displayInfo();
         }
     }
 }

 // Remove bird by ID
 public void removeBirdById(String id) {
     birds.removeIf(bird -> bird.getId().equals(id));
     System.out.println("Bird removed if ID matched.");
 }

 // Generate sanctuary report
 public void sanctuaryReport() {
     int fly = 0, swim = 0, both = 0, neither = 0;

     for (Bird bird : birds) {
         boolean canFly = bird instanceof Flyable;
         boolean canSwim = bird instanceof Swimmable;

         if (canFly && canSwim) both++;
         else if (canFly) fly++;
         else if (canSwim) swim++;
         else neither++;
     }

     System.out.println("----- Sanctuary Report -----");
     System.out.println("Flyable Birds: " + fly);
     System.out.println("Swimmable Birds: " + swim);
     System.out.println("Both Fly & Swim: " + both);
     System.out.println("Neither: " + neither);
 }
}
