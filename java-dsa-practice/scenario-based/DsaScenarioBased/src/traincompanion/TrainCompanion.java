package traincompanion;

public class TrainCompanion {

	Compartment head;
	Compartment current;
	Compartment tail;

	// Parameterized constructor
	public TrainCompanion(String compartmentNumber, boolean pantry, boolean wifi) {
		addCompartment(compartmentNumber, pantry, wifi);

	}

	// Class compartment that stores each nodes details
	class Compartment {
		String compartmentNumber;
		boolean pantry;
		boolean wifi;
		Compartment prev;
		Compartment next;

		// Parameterized constructor
		public Compartment(String compartmentNumber, boolean pantry, boolean wifi) {

			this.compartmentNumber = compartmentNumber;
			this.pantry = pantry;
			this.wifi = wifi;
			this.prev = null;
			this.next = null;
		}

	}

	// Add a compartment
	void addCompartment(String compartmentNumber, boolean pantry, boolean wifi) {
		Compartment node = new Compartment(compartmentNumber, pantry, wifi);
		if (head == null) {
			head = tail = current = node;
		}
		node.next = head;
		head.prev = node;
		head = node;
		current = node;

	}

	// Remove a compartment by compartment number
	void removeCompartment(String compartmentNumber) {

	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    Compartment temp = head;

	    // Traverse the list
	    while (temp != null) {

	        if (compartmentNumber.equals(temp.compartmentNumber)) {

	            // Case 1: Only one node
	            if (temp == head && temp == tail) {
	                head = tail = current = null;
	            }

	            // Case 2: Deleting head
	            else if (temp == head) {
	                head = head.next;
	                head.prev = null;
	            }

	            // Case 3: Deleting tail
	            else if (temp == tail) {
	                tail = tail.prev;
	                tail.next = null;
	            }

	            // Case 4: Deleting middle node
	            else {
	                temp.prev.next = temp.next;
	                temp.next.prev = temp.prev;
	            }

	            System.out.println("Compartment removed successfully");
	            return; // ❗ stop after deletion
	        }

	        temp = temp.next;
	    }

	    // If not found after traversal
	    System.out.println("Compartment not found");
	}


	// Displaying All Compartment details
	void displayCompartment(Compartment temp) {

		System.out.println("Compartment No -> " + temp.compartmentNumber);
		System.out.println("Is pantry available -> " + temp.pantry);
		System.out.println("Is Wifi available -> " + temp.wifi);

	}

	// Displaying Compartment details to go forward or backward
	void displayAdjecentCompartment() {

		if (current.prev == null && current.next == null) {
			System.out.println("-----------------------------");
			System.out.println("Its is the only compartment");
			System.out.println("-----------------------------");
			displayCompartment(current);
			System.out.println("-----------------------------");
		} else if (current.prev == null) {
			System.out.println(
					"No prev compartment <-> " + current.compartmentNumber + " <-> " + current.next.compartmentNumber);
			System.out.println("-----------------------------");
			System.out.println("Current Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current);
			System.out.println("-----------------------------");
			System.out.println("Next Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current.next);
			System.out.println("-----------------------------");
		} else if (current.next == null) {
			System.out.println(
					current.prev.compartmentNumber + " <-> " + current.compartmentNumber + "<-> No next compartment");
			System.out.println("-----------------------------");
			System.out.println("Current Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current);
			System.out.println("-----------------------------");
			System.out.println("Previous Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current.prev);
			System.out.println("-----------------------------");

		} else {
			System.out.println(current.prev.compartmentNumber + " <-> " + current.compartmentNumber + " <-> "
					+ current.next.compartmentNumber);
			System.out.println("-----------------------------");
			System.out.println("Current Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current);
			System.out.println("-----------------------------");
			System.out.println("Previous Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current.prev);
			System.out.println("-----------------------------");
			System.out.println("Next Compartment");
			System.out.println("-----------------------------");
			displayCompartment(current.next);
			System.out.println("-----------------------------");
		}
	}

	// Method to move forward
	void moveForward() {

		if (current == null) {
			System.out.println("No Compartment exist");
			return;
		}

		if (current.next == null) {
			System.out.println("There is no next compartment");
		} else {
			System.out.println("Moving from " + current.compartmentNumber + " to " + current.next.compartmentNumber);
			current = current.next;
		}

	}

	// Method to move backward
	void moveBackward() {

		if (current.prev == null) {
			System.out.println("There is no prev compartment");
		} else {
			System.out.println("Moving from " + current.compartmentNumber + " to " + current.prev.compartmentNumber);
			current = current.prev;
		}

		if (current == null) {
			System.out.println("No Compartment exist");
		}

	}

	public static void main(String[] args) {

		// Creating object of compartment
		TrainCompanion train = new TrainCompanion("A1", true, true);
		train.addCompartment("A2", true, false);
		train.addCompartment("A3", true, false);
		train.addCompartment("A4", false, false);
		train.addCompartment("A5", false, true);
		train.addCompartment("B1", true, false);
		train.addCompartment("B2", false, true);
		train.addCompartment("S1", true, false);
		train.addCompartment("S2", false, true);
		train.displayAdjecentCompartment();


		// Applying operation to move forward and backward & displaying adjacent
		// compartment details
		train.moveForward();
		
		//removing compartment
		train.removeCompartment("B2");
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveBackward();
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveBackward();
		train.displayAdjecentCompartment();
		train.moveBackward();
		train.displayAdjecentCompartment();
	}

}