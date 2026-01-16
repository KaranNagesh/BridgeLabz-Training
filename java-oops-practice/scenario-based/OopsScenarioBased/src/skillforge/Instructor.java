
package skillforge;


//  Instructor class extends User
 
class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Instructor");
    }
}
