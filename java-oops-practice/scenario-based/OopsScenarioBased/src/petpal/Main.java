package petpal;


//Main class to test PetPal application
public class Main {

    public static void main(String[] args) {

        // Polymorphism in action
        Pet dog = new Dog("Bruno", 3);
        Pet cat = new Cat("Swimi", 2);
        Pet bird = new Bird("Kiwi", 1);

        // Interacting with pets
        dog.makeSound();
        dog.feed();
        dog.play();
        dog.sleep();
        dog.displayStatus();

        cat.makeSound();
        cat.play();
        cat.sleep();
        cat.displayStatus();

        bird.makeSound();
        bird.feed();
        bird.displayStatus();
    }
}