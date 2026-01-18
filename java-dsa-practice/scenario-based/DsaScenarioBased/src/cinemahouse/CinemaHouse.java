package cinemahouse;


public class CinemaHouse {

	// Method to sort movie showtimes using Bubble Sort
	public static void bubbleSort(int[] showTimes) {

		// Loop through all showtimes
		for (int i = 0; i < showTimes.length - 1; i++) {

			// Compare adjacent showtimes in each pass
			for (int j = 0; j < showTimes.length - i - 1; j++) {

				// Swap if the current showtime is greater than the next
				if (showTimes[j] > showTimes[j + 1]) {

					int temp = showTimes[j];

					showTimes[j] = showTimes[j + 1];

					showTimes[j + 1] = temp;
				}
			}
		}
	}

	// Main method to manage daily movie shows
	public static void main(String[] args) {

		// Movie showtimes entered manually (in minutes)
		int[] showTimes = { 180, 120, 150, 90, 210, 165 };

		// Sort the showtimes in ascending order
		bubbleSort(showTimes);

		// Display sorted movie showtimes
		for (int time : showTimes) {
			System.out.print(time + " ");
		}
	}
}
