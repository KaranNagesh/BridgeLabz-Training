import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Read the number for which table is to be generated
        int num = sc.nextInt();

        // Array to store multiplication table values
        int table[] = new int[10];

        // Calculate multiplication table values
        for (int i = 0; i < table.length; i++) {
            table[i] = (i + 1) * num;
        }

        // Print the multiplication table
        for (int i = 0; i < table.length; i++) {
            System.out.println(num + " * " + (i + 1) + " = " + table[i]);
        }

        // Close the scanner
        sc.close();
    }
}
