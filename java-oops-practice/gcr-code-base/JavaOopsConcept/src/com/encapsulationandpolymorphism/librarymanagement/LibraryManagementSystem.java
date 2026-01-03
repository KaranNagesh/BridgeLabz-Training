package com.encapsulationandpolymorphism.librarymanagement;

import java.util.ArrayList;
import java.util.List;

// Main application class
public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Creating list of library items (Polymorphism)
        List<LibraryItem> items = new ArrayList<>();

        // Adding different library items
        items.add(new Book(1, "Java Programming", "James Gosling"));
        items.add(new Magazine(2, "Tech Monthly", "Editorial Team"));
        items.add(new DVD(3, "Inception", "Christopher Nolan"));

        // Iterating using LibraryItem reference
        for (LibraryItem item : items) {

            item.getItemDetails();

            // Check availability and reserve if available
            if (item.checkAvailability()) {
                item.reserveItem("Arif");
            }

            System.out.println("----------------------------------");
        }
    }
}