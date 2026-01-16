
package skillforge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


 // Course class with encapsulated rating logic
 
class Course {

    private String title;
    private Instructor instructor;

    // Protected rating logic (encapsulation)
    protected double rating;

    private List<String> modules;

    // Internal reviews (read-only)
    private List<String> internalReviews = new ArrayList<>();

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        modules.add("Introduction");
        modules.add("Basics");
    }

    // Constructor with custom module list
    public Course(String title, Instructor instructor, List<String> modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    // Rating logic (protected)
    protected void updateRating(double newRating) {
        if (newRating >= 1 && newRating <= 5) {
            rating = newRating;
        }
    }

    // Read-only internal reviews
    public List<String> getInternalReviews() {
        return Collections.unmodifiableList(internalReviews);
    }

    public void addReview(String review) {
        internalReviews.add(review);
    }

    public String getTitle() {
        return title;
    }

    public int getTotalModules() {
        return modules.size();
    }
}
