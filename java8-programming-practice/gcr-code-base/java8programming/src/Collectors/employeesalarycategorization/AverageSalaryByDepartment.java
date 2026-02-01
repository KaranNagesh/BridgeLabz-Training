package Collectors.employeesalarycategorization;


import java.util.*;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "IT", 60000),
                new Employee("Amit", "IT", 70000),
                new Employee("Neha", "HR", 45000),
                new Employee("Pooja", "HR", 50000)
        );

        Map<String, Double> avgSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        avgSalary.forEach((k, v) ->
                System.out.println(k + " → " + v));
    }
}