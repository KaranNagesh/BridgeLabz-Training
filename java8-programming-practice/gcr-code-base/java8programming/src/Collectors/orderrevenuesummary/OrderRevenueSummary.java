package Collectors.orderrevenuesummary;


import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("CUST1", 2500),
                new Order("CUST1", 1800),
                new Order("CUST2", 3000),
                new Order("CUST2", 1200)
        );

        Map<String, Double> revenue =
                orders.stream()
                        .collect(Collectors.groupingBy(
                                Order::getCustomerId,
                                Collectors.summingDouble(Order::getAmount)
                        ));

        revenue.forEach((k, v) ->
                System.out.println(k + " → ₹" + v));
    }
}