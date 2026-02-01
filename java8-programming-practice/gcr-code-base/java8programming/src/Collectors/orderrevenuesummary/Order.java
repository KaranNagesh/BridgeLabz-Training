package Collectors.orderrevenuesummary;

public class Order {

    private String customerId;
    private double amount;

    public Order(String customerId, double amount) {
        this.customerId = customerId;
        this.amount = amount;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }
}
