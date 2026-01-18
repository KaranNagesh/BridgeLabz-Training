
package eventmanager;

public class EventManager {
	// Array to store object of ticket class
	static Ticket[] ticketList = new Ticket[20];
	static int index = 0;

	// Method to add event
	public static void addEvent(String eventName, int price) {
		if (index < ticketList.length) {
			Ticket ticket = new Ticket(eventName, price);
			ticketList[index] = ticket;
			index++;
		} else {
			System.out.println("Ticket list is full");
		}

	}

	// Method to display events
	public static void displayEvent() {
		System.out.println("-----------------------------------");
		System.out.println("\t Event Details");
		System.out.println("-----------------------------------");
		for (int i = 0; i < ticketList.length; i++) {
			System.out.println("Event -> " + ticketList[i].eventName + "\t\tPrice -> " + ticketList[i].price);
		}
	}

	// --------------- Quick Sort (Price) ------------------------

	// The main function that implements QuickSort()
	public static void quickSort(Ticket[] arr, int low, int high) {
		if (low < high) {
			// pi is partitioning index, arr[pi] is now at right place
			int pi = partition(arr, low, high);

			// Recursively sort elements before partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	public static int partition(Ticket[] arr, int low, int high) {
		int pivot = arr[high].price; // Choosing the last element as the pivot
		int i = (low - 1); // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is smaller than or equal to pivot
			if (arr[j].price <= pivot) {
				i++;

				// swap arr[i] and arr[j]
				Ticket temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		Ticket temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

	public static void main(String[] args) {

		// Adding events on array
		addEvent("Tech Conference 2026	", 1500);
		addEvent("Startup Networking Meetup", 500);
		addEvent("Coding Hackathon	", 1000);
		addEvent("AI & ML Workshop	", 2000);
		addEvent("Cyber Security Seminar	", 1200);
		addEvent("Web Development Bootcamp", 1800);
		addEvent("Digital Marketing Summit", 1300);
		addEvent("Cloud Computing Workshop", 1600);
		addEvent("Entrepreneurship Talk	", 700);
		addEvent("Career Guidance Seminar	", 400);
		addEvent("Data Science Conference	", 2200);
		addEvent("Open Source Contribution Meetup", 300);
		addEvent("Mobile App Development Workshop", 1500);
		addEvent("UI/UX Design Masterclass", 1400);
		addEvent("Blockchain Awareness Session", 1100);
		addEvent("Placement Preparation Program", 900);
		addEvent("Leadership & SoftSkills Seminar", 800);
		addEvent("Freelancing & Remote Work ", 600);
		addEvent("Product Management Workshop", 1700);
		addEvent("Annual Tech Fest	", 2500);

		// Displaying event before sorted
		displayEvent();

		// Calling method to sort ticket on the basis of price
		quickSort(ticketList, 0, 19);

		// Displaying event after sorted
		displayEvent();

	}

}
