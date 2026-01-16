
package eventease;

//Class representing an event organizer
class User {

 // Sensitive data should be private
 private String name;
 private String email;

 // Constructor
 public User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 // Getter methods only (no setters for safety)
 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }
}
