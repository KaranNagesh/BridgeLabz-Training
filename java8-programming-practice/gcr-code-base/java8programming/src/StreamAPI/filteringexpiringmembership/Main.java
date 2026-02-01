package StreamAPI.filteringexpiringmembership;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Karan", LocalDate.now().plusDays(10)),
                new Member("Amit", LocalDate.now().plusDays(40)),
                new Member("Neha", LocalDate.now().plusDays(25)),
                new Member("Pooja", LocalDate.now().plusDays(5))
        );

        System.out.println("\n===== Memberships Expiring in 30 Days =====");

        LocalDate today = LocalDate.now();

        members.stream()
                .filter(m ->
                        m.getExpiryDate().isAfter(today) &&
                                m.getExpiryDate().isBefore(today.plusDays(30))
                )
                .forEach(System.out::println);
	}
}
