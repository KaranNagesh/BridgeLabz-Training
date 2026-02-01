package StreamAPI.hospitaldoctoravailability;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr Rahul", "Cardiology", true),
                new Doctor("Dr Neha", "Dermatology", false),
                new Doctor("Dr Amit", "Orthopedic", true),
                new Doctor("Dr Anjali", "Neurology", true)
        );

        System.out.println("\n===== Weekend Available Doctors =====");

        doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .forEach(System.out::println);
	}
}
