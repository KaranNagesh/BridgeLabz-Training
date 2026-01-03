package com.encapsulationandpolymorphism.librarymanagement;

//Book class
class Book extends LibraryItem {

public Book(int itemId, String title, String author) {
   super(itemId, title, author);
}

// Books can be borrowed for 14 days
@Override
public int getLoanDuration() {
   return 14;
}
}