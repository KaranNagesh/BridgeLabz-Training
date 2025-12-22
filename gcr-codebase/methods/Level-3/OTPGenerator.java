public class OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generates number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All OTPs are unique
    }

    // Main method
    public static void main(String[] args) {

        int[] otpArray = new int[10];

        // Generate OTPs 10 times and store them in array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }

        // Validate uniqueness
        boolean unique = areOTPsUnique(otpArray);

        System.out.println("\nAre all OTPs unique? " + unique);
    }
}
