package linkedlist.doublylinkedlist.librarymanagement;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem lib = new LibraryManagementSystem();

        lib.addAtEnd(101, "Java Programming", "James Gosling", "Education", true);
        lib.addAtBeginning(102, "Clean Code", "Robert Martin", "Programming", true);
        lib.addAtPosition(2, 103, "DSA Made Easy", "Narasimha Karumanchi", "Data Structures", false);

        lib.displayForward();
        lib.displayReverse();

        lib.searchByAuthor("Robert Martin");
        lib.updateAvailability(103, true);

        lib.removeById(101);
        lib.countBooks();

        lib.displayForward();
    }
}
