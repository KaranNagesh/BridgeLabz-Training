package StreamAPI.top5trendingmovies;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Movie> movies = Arrays.asList(
                new Movie("Avengers", 9.1, 2024),
                new Movie("Batman", 8.7, 2023),
                new Movie("Spiderman", 9.0, 2024),
                new Movie("Inception", 8.9, 2020),
                new Movie("Interstellar", 9.3, 2025),
                new Movie("Joker", 8.8, 2021),
                new Movie("Avatar", 9.2, 2023)
        );


        movies.stream()
                .filter(m -> m.getReleaseYear() >= 2020)
                .sorted(
                        Comparator.comparing(Movie::getRating)
                                .thenComparing(Movie::getReleaseYear)
                                .reversed()
                )
                .limit(5)
                .forEach(System.out::println);

    }
}