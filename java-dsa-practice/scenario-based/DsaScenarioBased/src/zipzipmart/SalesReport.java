
package zipzipmart;

import java.time.LocalDate;

public class SalesReport {
	static Transaction[] sellList = new Transaction[11];
	static int index = 0;

	// Method to add transaction
	static void addTransaction(LocalDate date, double amount) {
		Transaction sell = new Transaction(date, amount);
		if (index < sellList.length) {
			sellList[index] = sell;
			index++;
		} else {
			System.out.println("Transaction list full");
		}
	}

	// Method to display transaction
	static void displayTransaction() {
		System.out.println("------------------------------------");
		System.out.println("\tDisplaying Transactions");
		System.out.println("------------------------------------");
		for (int i = 0; i < sellList.length; i++) {
			System.out.println("Date -> " + sellList[i].date + " Amount -> " + sellList[i].amount);
		}

	}

	// ---------------------- Merge Sort (Date) ----------------------

	// Main method to perform merge sort on Dates
	public static void mergeSort(Transaction[] arr, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	private static void merge(Transaction[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		Transaction[] L = new Transaction[n1];
		Transaction[] R = new Transaction[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			// Use compareTo() for date comparison
			if (L[i].date.compareTo(R[j].date) <= 0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// ------------------- Merge sort (Amount) ----------------------------

	public static void sortAmount(Transaction[] arr) {
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (arr[i].date.compareTo(arr[j].date) != 0) {
				mergeSortAmount(arr, i, j - 1);
				i = j;
			} else {
				j++;
			}
		}
	}

	public static void mergeSortAmount(Transaction[] arr, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSortAmount(arr, l, m);
			mergeSortAmount(arr, m + 1, r);

			// Merge the sorted halves
			mergeAmount(arr, l, m, r);
		}
	}

	private static void mergeAmount(Transaction[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		Transaction[] L = new Transaction[n1];
		Transaction[] R = new Transaction[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			// Use compareTo() for date comparison
			if (L[i].amount <= R[j].amount) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {

		// Adding transaction to array
		addTransaction(LocalDate.of(2025, 10, 10), 500);
		addTransaction(LocalDate.of(2025, 8, 2), 700);
		addTransaction(LocalDate.of(2025, 10, 10), 900);
		addTransaction(LocalDate.of(2025, 10, 10), 100);
		addTransaction(LocalDate.of(2025, 8, 2), 5000);
		addTransaction(LocalDate.of(2025, 8, 2), 100);
		addTransaction(LocalDate.of(2025, 9, 10), 150);
		addTransaction(LocalDate.of(2025, 9, 10), 720);
		addTransaction(LocalDate.of(2025, 8, 2), 450);
		addTransaction(LocalDate.of(2025, 9, 10), 320);
		addTransaction(LocalDate.of(2025, 10, 10), 320);

		// Displaying method to display transaction
		System.out.println("\n\n------------- Transaction before sorting --------------");
		displayTransaction();
		System.out.println("\n\n------------- Transaction after date sorting ----------");
		mergeSort(sellList, 0, 10);// Calling method to sort list on the basis of dates
		displayTransaction();
		System.out.println("\n\n------------- Transaction after date & amount sorting ----------");
		sortAmount(sellList); // Calling method to sort list on the basis of amount
		displayTransaction();
	}
}
