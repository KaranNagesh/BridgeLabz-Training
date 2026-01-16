
package birdsanctuary;

//Base class for all birds
abstract class Bird {

 // Encapsulated bird details
 private String id;        // Unique bird ID
 private String name;      // Bird name
 private String species;   // Bird species

 // Constructor to initialize bird details
 public Bird(String id, String name, String species) {
     this.id = id;
     this.name = name;
     this.species = species;
 }

 // Common behavior for all birds
 public void eat() {
     System.out.println(name + " is eating.");
 }

 // Getter for bird ID
 public String getId() {
     return id;
 }

 // Getter for bird name
 public String getName() {
     return name;
 }

 // Getter for bird species
 public String getSpecies() {
     return species;
 }

 // Display complete bird information
 public void displayInfo() {
     System.out.println("ID: " + id + ", Name: " + name + ", Species: " + species);
 }
}
