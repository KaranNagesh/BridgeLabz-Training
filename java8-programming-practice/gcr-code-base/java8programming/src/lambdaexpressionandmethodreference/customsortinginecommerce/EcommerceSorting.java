package lambdaexpressionandmethodreference.customsortinginecommerce;
import java.util.*;

public class EcommerceSorting {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 55000, 4.6, 20));
        products.add(new Product(2, "Phone", 30000, 4.3, 10));
        products.add(new Product(3, "Headphones", 2000, 4.8, 40));
        products.add(new Product(4, "TV", 45000, 4.4, 25));

    
        String campaign = "DISCOUNT";

        Comparator<Product> comparator;

        switch (campaign) {

            case "PRICE":
                comparator = (p1, p2) ->
                        Double.compare(p1.price, p2.price);
                break;

            case "RATING":
                comparator = (p1, p2) ->
                        Double.compare(p2.rating, p1.rating);
                break;

            case "DISCOUNT":
                comparator = (p1, p2) ->
                        Double.compare(p2.discount, p1.discount);
                break;

            default:
                comparator = (p1, p2) -> 0;
        }

        products.sort(comparator);

        products.forEach(p ->
                System.out.println(
                        p.name + " | ₹" + p.price +
                        " | rating: " + p.rating +
                        " | discount: " + p.discount + "%"
                ));
    }
}