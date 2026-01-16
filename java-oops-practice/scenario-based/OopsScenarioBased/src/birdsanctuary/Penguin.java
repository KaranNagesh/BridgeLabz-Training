package birdsanctuary;

//Penguin can swim but cannot fly
class Penguin extends Bird implements Swimmable {

// Constructor
public Penguin(String id, String name) {
   super(id, name, "Penguin");
}

// Swimming behavior
@Override
public void swim() {
   System.out.println(getName() + " swims swiftly underwater.");
}
}