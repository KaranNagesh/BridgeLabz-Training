package ambulanceroute;

//Manages hospital units using a circular linked list
class AmbulanceRoute {

	// Head of the circular linked list
	private Unit head = null;

	// Tail of the circular linked list
	private Unit tail = null;

	// Adds a new hospital unit to the circular route
	public void addUnit(String name, boolean available) {

		// Create a new unit node
		Unit newUnit = new Unit(name, available);

		// If the list is empty, initialize head and tail
		if (head == null) {
			head = tail = newUnit;
			tail.next = head; // Make list circular
		}
		// Otherwise, add unit at the end and maintain circular link
		else {
			tail.next = newUnit;
			tail = newUnit;
			tail.next = head;
		}
	}

	// Finds the nearest available unit for emergency treatment
	public void findAvailableUnit() {

		// If no units exist
		if (head == null) {
			System.out.println("No hospital units available");
			return;
		}

		// Start searching from head
		Unit temp = head;

		// Traverse the circular list
		do {
			System.out.println("Checking: " + temp.name);

			// If an available unit is found
			if (temp.available) {
				System.out.println("Patient redirected to: " + temp.name);
				return;
			}

			// Move to the next unit
			temp = temp.next;

		} while (temp != head);

		// If no available unit is found after full rotation
		System.out.println("No available unit found");
	}

	// Removes a unit if it is under maintenance
	public void removeUnit(String name) {

		// If list is empty
		if (head == null) {
			System.out.println("No units to remove");
			return;
		}

		// Initialize traversal pointers
		Unit curr = head;
		Unit prev = tail;

		// Traverse the circular list
		do {
			// If the unit to be removed is found
			if (curr.name.equals(name)) {

				// If removing the head unit
				if (curr == head) {
					head = head.next;
					tail.next = head;
				}
				// If removing the tail unit
				else if (curr == tail) {
					tail = prev;
					tail.next = head;
				}
				// If removing a middle unit
				else {
					prev.next = curr.next;
				}

				System.out.println(name + " removed (Under Maintenance)");
				return;
			}

			// Move pointers forward
			prev = curr;
			curr = curr.next;

		} while (curr != head);

		// If unit is not found
		System.out.println(name + " not found");
	}

	// Displays the circular hospital route
	public void displayRoute() {

		// If no units exist
		if (head == null) {
			System.out.println("No hospital units in route");
			return;
		}

		// Start displaying from head
		Unit temp = head;
		System.out.print("Route: ");

		// Traverse and display units
		do {
			System.out.print(temp.name + " -> ");
			temp = temp.next;
		} while (temp != head);

		// Show circular connection
		System.out.println("(back to " + head.name + ")");
	}
}