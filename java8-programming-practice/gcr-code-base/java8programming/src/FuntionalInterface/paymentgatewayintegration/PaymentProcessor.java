package FuntionalInterface.paymentgatewayintegration;

interface PaymentProcessor {

    void pay(double amount);

    // NEW FEATURE — default method
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated");
    }
}