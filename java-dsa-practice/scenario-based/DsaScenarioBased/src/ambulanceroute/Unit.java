package ambulanceroute;


//Represents a hospital unit in the circular linked list
class Unit {

	// Name of the hospital unit
	String name;

	// Availability status of the unit
	boolean available;

	// Pointer to the next unit (circular link)
	Unit next;

	// Constructor to initialize unit details
	Unit(String name, boolean available) {
		this.name = name;
		this.available = available;
	}
}