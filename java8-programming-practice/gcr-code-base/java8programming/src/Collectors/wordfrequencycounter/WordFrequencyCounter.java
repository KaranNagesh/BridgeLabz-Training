package Collectors.wordfrequencycounter;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "java stream java lambda stream api java";

        Map<String, Integer> count =
                Arrays.stream(text.split(" "))
                        .collect(Collectors.toMap(
                                word -> word,
                                word -> 1,
                                Integer::sum
                        ));

        count.forEach((k, v) ->
                System.out.println(k + " → " + v));
    }
}