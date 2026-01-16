
package birdsanctuary;

//Duck can both fly and swim
class Duck extends Bird implements Flyable, Swimmable {

 // Constructor
 public Duck(String id, String name) {
     super(id, name, "Duck");
 }

 // Flying behavior
 @Override
 public void fly() {
     System.out.println(getName() + " flies short distances.");
 }

 // Swimming behavior
 @Override
 public void swim() {
     System.out.println(getName() + " swims in the pond.");
 }
}
