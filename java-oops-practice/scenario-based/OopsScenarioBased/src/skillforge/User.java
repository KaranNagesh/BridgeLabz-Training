
package skillforge;


// Abstract base class for all users

abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void displayRole();
}
