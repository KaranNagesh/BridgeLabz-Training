import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    public static int findYoungest(int[] age) {
        int youngestIndex = 0;

        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }

    // Method to find the tallest friend
    public static int findTallest(double[] height) {
        int tallestIndex = 0;

        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] age = new int[3];
        double[] height = new double[3];

        // Take input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Find youngest and tallest
        int youngestIndex = findYoungest(age);
        int tallestIndex = findTallest(height);

        // Display results
        System.out.println("\nYoungest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        sc.close();
    }
}
