package StreamAPI.foreachmethod;

import java.util.*;

public class EventWelcome {

    public static void main(String[] args) {

        List<String> attendees =
                Arrays.asList("Rahul", "Anjali", "Amit", "Neha");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
