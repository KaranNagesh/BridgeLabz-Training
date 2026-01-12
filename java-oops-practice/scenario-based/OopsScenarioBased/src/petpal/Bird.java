package petpal;



//Bird class extending Pet
public class Bird extends Pet {

 public Bird(String name, int age) {
     super(name, "Bird", age);
 }

 @Override
 public void feed() {
     decreaseHunger(15);
     updateMood(10);
     System.out.println(name + " pecked at the food.");
 }

 @Override
 public void play() {
     increaseHunger(10);
     decreaseEnergy(10);
     updateMood(15);
     System.out.println(name + " is flying around.");
 }

 @Override
 public void sleep() {
     increaseEnergy(25);
     updateMood(10);
     System.out.println(name + " is resting.");
 }

 @Override
 public void makeSound() {
     System.out.println(name + " says: Chirp!");
 }
}