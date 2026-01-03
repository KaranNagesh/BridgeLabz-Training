package com.encapsulationandpolymorphism.librarymanagement;

//Abstract base class for all library items
abstract class LibraryItem implements Reservable {

// Encapsulated fields
private int itemId;
private String title;
private String author;

// Sensitive borrower information (encapsulated)
private String borrowerName;
private boolean isAvailable = true;

// Constructor to initialize library item
public LibraryItem(int itemId, String title, String author) {
   this.itemId = itemId;
   this.title = title;
   this.author = author;
}

// Abstract method to define loan duration
public abstract int getLoanDuration();

// Concrete method to display item details
public void getItemDetails() {
   System.out.println("Item ID      : " + itemId);
   System.out.println("Title        : " + title);
   System.out.println("Author       : " + author);
   System.out.println("Loan Period  : " + getLoanDuration() + " days");
   System.out.println("Availability : " + (isAvailable ? "Available" : "Reserved"));
}

// Interface method implementation
@Override
public void reserveItem(String borrowerName) {
   if (isAvailable) {
       this.borrowerName = borrowerName;
       this.isAvailable = false;
       System.out.println("Item reserved by " + borrowerName);
   } else {
       System.out.println("Item is already reserved.");
   }
}

@Override
public boolean checkAvailability() {
   return isAvailable;
}

// Protected method (borrower data not exposed publicly)
protected String getMaskedBorrower() {
   return borrowerName == null ? "None" : "Borrower Assigned";
}
}