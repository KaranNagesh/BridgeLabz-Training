package FuntionalInterface.paymentgatewayintegration;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor p1 = new PaytmProcessor();
        PaymentProcessor p2 = new RazorpayProcessor();

        p1.pay(500);
        p1.refund(200);

        p2.pay(1000);
        p2.refund(300);
    }
}
