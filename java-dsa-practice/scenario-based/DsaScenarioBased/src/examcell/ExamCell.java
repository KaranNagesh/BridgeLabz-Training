package examcell;



public class ExamCell {
	public static Student[] scoreList = new Student[20];
	private static int index = 0;

	// Method to add student score
	public static void addStudent(String name, int score, String testCenter) {
		if (index < scoreList.length) {
			Student student = new Student(name, score, testCenter);
			scoreList[index] = student;
			index++;
		} else {
			System.out.println("Student score list is full");
		}
	}

	// Method to display student score
	public static void displayInfo() {
		System.out.println("--------------------------------");
		System.out.println("Displaying Student details");
		System.out.println("--------------------------------");
		System.out.println("Name\tScore\tTest Center");
		System.out.println("--------------------------------");
		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(scoreList[i].name + "\t" + scoreList[i].score + "\t" + scoreList[i].testCenter);
		}
	}

	// ---------------------- Merge Sort (Date) ----------------------

	// Main method to perform merge sort on Dates
	public static void mergeSort(Student[] arr, int l, int r) {
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

	private static void merge(Student[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays

		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

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
			if (L[i].testCenter.compareTo(R[j].testCenter) <= 0) {
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

	public static void sortScore(Student[] arr) {
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (!arr[i].testCenter.equals(arr[j].testCenter)) {
				mergeSortScore(arr, i, j - 1);
				i = j;
			} else {
				j++;
			}
		}
	}

	public static void mergeSortScore(Student[] arr, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSortScore(arr, l, m);
			mergeSortScore(arr, m + 1, r);

			// Merge the sorted halves
			mergeScore(arr, l, m, r);
		}
	}

	private static void mergeScore(Student[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

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
			if (L[i].score <= R[j].score) {
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

		// Adding Student object to array
		addStudent("Arif", 180, "Students Care");
		addStudent("Rahul", 165, "Bright Future Academy");
		addStudent("Sneha", 172, "Success Point");
		addStudent("Amit", 158, "Students Care");
		addStudent("Pooja", 190, "Knowledge Hub");
		addStudent("Rohan", 145, "Career Zone");
		addStudent("Neha", 168, "Bright Future Academy");
		addStudent("Vikas", 155, "Students Care");
		addStudent("Anjali", 182, "Success Point");
		addStudent("Karan", 160, "Career Zone");
		addStudent("Priya", 175, "Knowledge Hub");
		addStudent("Suresh", 140, "Students Care");
		addStudent("Nikita", 188, "Bright Future Academy");
		addStudent("Manish", 150, "Career Zone");
		addStudent("Kavita", 170, "Success Point");
		addStudent("Deepak", 162, "Students Care");
		addStudent("Ritu", 185, "Knowledge Hub");
		addStudent("Akash", 148, "Bright Future Academy");
		addStudent("Meena", 178, "Success Point");
		addStudent("Sanjay", 155, "Career Zone");

		// Diaplying student information
		displayInfo();
		System.out.println("Student score center wise");
		mergeSort(scoreList, 0, 19); // Calling method to sort record according to test center
		displayInfo();
		System.out.println("Student score center wise sorted");
		sortScore(scoreList); // Calling method to sort record accoriding to scores
		displayInfo();

	}

}
