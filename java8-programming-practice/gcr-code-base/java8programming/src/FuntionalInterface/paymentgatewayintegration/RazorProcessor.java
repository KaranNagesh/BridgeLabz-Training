package FuntionalInterface.paymentgatewayintegration;


class RazorpayProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Razorpay payment: ₹" + amount);
    }
}