public class SpringSeason {

    // Non-static method to check Spring Season
    public boolean isSpringSeason(int month, int day) {

        if ((month == 3 && day >= 20) ||     // March 20 onwards
            (month == 4) ||                  // April
            (month == 5) ||                  // May
            (month == 6 && day <= 20)) {     // Up to June 20
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        // Read command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Create object to call non-static method
        SpringSeason ss = new SpringSeason();

        // Call method
        boolean result = ss.isSpringSeason(month, day);

        // Print result
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
