package linkedlist.doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        mms.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.6);
        mms.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.9);

        mms.displayForward();
        mms.displayReverse();

        mms.searchByDirector("Christopher Nolan");
        mms.updateRating("Avatar", 8.1);
        mms.removeByTitle("Inception");

        mms.displayForward();
    }
}
