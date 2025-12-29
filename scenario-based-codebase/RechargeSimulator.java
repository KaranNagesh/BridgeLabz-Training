import java.util.Scanner;

class RechargeSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operator;          // Stores operator choice
        int recharge;          // Stores recharge amount
        int balance = 1000;    // Initial wallet balance

        System.out.println("Welcome to Recharge App");
        System.out.println("Available Balance : Rs." + balance);
        System.out.println();

        // Loop runs until balance is less than minimum recharge
        while (balance >= 99) {

            // Operator Menu
            System.out.println("Select Mobile Operator:");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");
            System.out.println("4. BSNL");
            System.out.print("Enter your choice: ");
            operator = sc.nextInt();

            switch (operator) {

                // jio operator offers and plans
                case 1:
                    System.out.println("\nJIO Recharge Plans:");
                    System.out.println("Rs. 299 : 1.5GB/day for 28 days");
                    System.out.println("Rs. 399 : 2GB/day for 56 days");
                    System.out.println("Rs. 155 : 2GB total for 28 days");
                    System.out.println("Rs. 99  : 1GB total for 14 days");
                    System.out.print("Enter recharge amount: ");
                    recharge = sc.nextInt();

                    if (recharge == 299 || recharge == 399 || recharge == 155 || recharge == 99) {
                        if (recharge <= balance) {
                            balance -= recharge;
                            System.out.println("Jio Recharge Successful ");
                        } else {
                            System.out.println("Insufficient balance ");
                        }
                    } else {
                        System.out.println("Invalid recharge amount ");
                    }
                    break;

                // airtel offer and recharge plans
                case 2:
                    System.out.println("\nAIRTEL Recharge Plans:");
                    System.out.println("Rs. 265 : 1GB/day for 28 days");
                    System.out.println("Rs. 479 : 1.5GB/day for 56 days");
                    System.out.println("Rs. 179 : 2GB total for 28 days");
                    System.out.println("Rs. 99  : Talktime + 200MB");
                    System.out.print("Enter recharge amount: ");
                    recharge = sc.nextInt();

                    if (recharge == 265 || recharge == 479 || recharge == 179 || recharge == 99) {
                        if (recharge <= balance) {
                            balance -= recharge;
                            System.out.println("Airtel Recharge Successful ");
                        } else {
                            System.out.println("Insufficient balance ");
                        }
                    } else {
                        System.out.println("Invalid recharge amount ");
                    }
                    break;

                // vi recharge offers and plans
                case 3:
                    System.out.println("\nVI Recharge Plans:");
                    System.out.println("Rs. 249 : 1.5GB/day for 28 days");
                    System.out.println("Rs. 359 : 2GB/day for 28 days");
                    System.out.println("Rs. 199 : 1GB/day for 18 days");
                    System.out.println("Rs. 99  : Talktime plan");
                    System.out.print("Enter recharge amount: ");
                    recharge = sc.nextInt();

                    if (recharge == 249 || recharge == 359 || recharge == 199 || recharge == 99) {
                        if (recharge <= balance) {
                            balance -= recharge;
                            System.out.println("VI Recharge Successful ");
                        } else {
                            System.out.println("Insufficient balance ");
                        }
                    } else {
                        System.out.println("Invalid recharge amount ");
                    }
                    break;

                // Bsnl recharges and plans
                case 4:
                    System.out.println("\nBSNL Recharge Plans:");
                    System.out.println("Rs. 187 : 2GB/day for 28 days");
                    System.out.println("Rs. 397 : 2GB/day for 150 days");
                    System.out.println("Rs. 153 : 1GB/day for 28 days");
                    System.out.println("Rs. 99  : Talktime + validity");
                    System.out.print("Enter recharge amount: ");
                    recharge = sc.nextInt();

                    if (recharge == 187 || recharge == 397 || recharge == 153 || recharge == 99) {
                        if (recharge <= balance) {
                            balance -= recharge;
                            System.out.println("BSNL Recharge Successful ");
                        } else {
                            System.out.println("Insufficient balance");
                        }
                    } else {
                        System.out.println("Invalid recharge amount");
                    }
                    break;

                // Invalid operator
                default:
                    System.out.println("Invalid operator selected ");
            }

            // Display remaining balance
            System.out.println("Remaining Balance : Rs." + balance);
            System.out.println("----------------------------------\n");
        }

        // When balance becomes too low
        System.out.println("You do not have sufficient balance for further recharges.");
        System.out.println("Thank you for using Recharge App ");

        sc.close();
    }
}
