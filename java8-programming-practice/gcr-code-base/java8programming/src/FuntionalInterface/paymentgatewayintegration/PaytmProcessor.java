package FuntionalInterface.paymentgatewayintegration;

class PaytmProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paytm payment: ₹" + amount);
    }
}
