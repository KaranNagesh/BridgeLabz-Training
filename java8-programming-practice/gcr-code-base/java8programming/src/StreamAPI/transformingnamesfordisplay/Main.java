package StreamAPI.transformingnamesfordisplay;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<String> customers =
                Arrays.asList("rahul", "amit", "neha", "pooja", "karan");

        System.out.println("\n===== Customer Names =====");

        customers.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
	}
}
