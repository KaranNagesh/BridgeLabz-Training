package stacksandqueues;


public class CircularTour {

    // Function to find starting petrol pump
    public static int findStartingPump(int[] petrol, int[] distance) {

        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {

            surplus += petrol[i] - distance[i];

            // If surplus becomes negative, reset start
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }

        // Check if circular tour is possible
        return (surplus + deficit >= 0) ? start : -1;
    }

    // Main method
    public static void main(String[] args) {

        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};

        int startIndex = findStartingPump(petrol, distance);

        if (startIndex == -1)
            System.out.println("No possible circular tour");
        else
            System.out.println("Start at petrol pump index: " + startIndex);
    }
}