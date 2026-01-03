package com.encapsulationandpolymorphism.librarymanagement;


//Interface defining reservation-related behavior
interface Reservable {

// Reserve the library item
void reserveItem(String borrowerName);

// Check if the item is available
boolean checkAvailability();
}