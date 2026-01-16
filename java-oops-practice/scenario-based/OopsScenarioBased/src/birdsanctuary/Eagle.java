
package birdsanctuary;

//Eagle can fly
class Eagle extends Bird implements Flyable {

 // Constructor
 public Eagle(String id, String name) {
     super(id, name, "Eagle");
 }

 // Flying behavior
 @Override
 public void fly() {
     System.out.println(getName() + " soars high in the sky.");
 }
}
