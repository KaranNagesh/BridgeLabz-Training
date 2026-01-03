package com.encapsulationandpolymorphism.librarymanagement;


//DVD class
class DVD extends LibraryItem {

public DVD(int itemId, String title, String author) {
   super(itemId, title, author);
}

// DVDs can be borrowed for 3 days
@Override
public int getLoanDuration() {
   return 3;
}
}