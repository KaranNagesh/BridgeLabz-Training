package linkedlist.doublylinkedlist.librarymanagement;
class LibraryManagementSystem {
    BookNode head = null;
    BookNode tail = null;

    // Add at beginning
    void addAtBeginning(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    void addAtEnd(int id, String title, String author, String genre, boolean status) {
        BookNode newNode = new BookNode(id, title, author, genre, status);

        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, title, author, genre, status);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            addAtEnd(id, title, author, genre, status);
        } else {
            BookNode newNode = new BookNode(id, title, author, genre, status);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Remove by Book ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    // Search by title
    void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("Book not found.");
    }

    // Search by author
    void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No books found for this author.");
    }

    // Update availability status
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                temp.isAvailable = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        System.out.println("Books (Forward Order):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        System.out.println("Books (Reverse Order):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total number of books = " + count);
    }

    void displayBook(BookNode b) {
        System.out.println(
            "ID: " + b.bookId +
            ", Title: " + b.title +
            ", Author: " + b.author +
            ", Genre: " + b.genre +
            ", Status: " + (b.isAvailable ? "Available" : "Issued")
        );
    }
}
