package petpal;


//Cat class extending Pet
public class Cat extends Pet {

 public Cat(String name, int age) {
     super(name, "Cat", age);
 }

 @Override
 public void feed() {
     decreaseHunger(20);
     updateMood(10);
     System.out.println(name + " ate quietly.");
 }

 @Override
 public void play() {
     increaseHunger(15);
     decreaseEnergy(15);
     updateMood(20);
     System.out.println(name + " played for a while.");
 }

 @Override
 public void sleep() {
     increaseEnergy(35);
     updateMood(15);
     System.out.println(name + " is sleeping peacefully.");
 }

 @Override
 public void makeSound() {
     System.out.println(name + " says: Meow!");
 }
}