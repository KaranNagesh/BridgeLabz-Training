package petpal;


//Dog class extending Pet
public class Dog extends Pet {

 public Dog(String name, int age) {
     super(name, "Dog", age);
 }

 @Override
 public void feed() {
     decreaseHunger(25);
     increaseEnergy(10);
     updateMood(15);
     System.out.println(name + " enjoyed the food.");
 }

 @Override
 public void play() {
     increaseHunger(20);
     decreaseEnergy(25);
     updateMood(25);
     System.out.println(name + " is happily playing.");
 }

 @Override
 public void sleep() {
     increaseEnergy(30);
     increaseHunger(10);
     updateMood(10);
     System.out.println(name + " had a good sleep.");
 }

 @Override
 public void makeSound() {
     System.out.println(name + " says: Woof Woof");
 }
}