package Collectors.studentresultgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Karan", "A"),
                new Student("Amit", "B"),
                new Student("Neha", "A"),
                new Student("Pooja", "C"),
                new Student("Rahul", "B")
        );

        Map<String, List<String>> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(
                                        Student::getName,
                                        Collectors.toList()
                                )
                        ));

        result.forEach((k, v) ->
                System.out.println(k + " → " + v));
    }
}
