package Collectors.librarybookstatistics;


import java.util.*;
import java.util.stream.Collectors;

public class LibraryStatistics {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java", "Programming", 350),
                new Book("Spring", "Programming", 500),
                new Book("History", "History", 420),
                new Book("Science", "Science", 600)
        );

        Map<String, IntSummaryStatistics> stats =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        stats.forEach((genre, s) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total: " + s.getSum());
            System.out.println("Average: " + s.getAverage());
            System.out.println("Max: " + s.getMax());
            System.out.println();
        });
    }
}
