package cropmonitor;


public class CropMonitor {

	// Method to apply Quick Sort on sensor timestamps
	public static void quickSort(int[] timestamps, int low, int high) {

		// Check if the partition size is valid
		if (low < high) {

			int pivotIndex = partition(timestamps, low, high);

			quickSort(timestamps, low, pivotIndex - 1);

			quickSort(timestamps, pivotIndex + 1, high);
		}
	}

	// Method to partition the array around pivot
	public static int partition(int[] timestamps, int low, int high) {

		// Choose the last element as pivot
		int pivot = timestamps[high];

		// Index of smaller element
		int i = low - 1;

		// Traverse and rearrange elements based on pivot
		for (int j = low; j < high; j++) {

			if (timestamps[j] <= pivot) {

				i++;

				int temp = timestamps[i];
				timestamps[i] = timestamps[j];
				timestamps[j] = temp;
			}
		}

		int temp = timestamps[i + 1];
		timestamps[i + 1] = timestamps[high];
		timestamps[high] = temp;

		return i + 1;
	}

	// Main method to sort sensor data
	public static void main(String[] args) {

		// Unordered sensor timestamps collected from drones
		int[] timestamps = { 105, 320, 210, 450, 150, 90, 300 };

		// Apply quick sort for fast ordering
		quickSort(timestamps, 0, timestamps.length - 1);

		// Display sorted sensor timestamps
		for (int time : timestamps) {
			System.out.print(time + " ");
		}
	}
}