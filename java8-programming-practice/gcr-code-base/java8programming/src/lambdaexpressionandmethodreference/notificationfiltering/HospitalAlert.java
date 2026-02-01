package lambdaexpressionandmethodreference.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class HospitalAlert {
	public static void main(String[] args) {
        List<Alert> alerts = List.of(
                new Alert("EMERGENCY", "Heart rate critical"),
                new Alert("MEDICATION", "Take insulin at 8 AM"),
                new Alert("LAB", "Blood test report ready"),
                new Alert("APPOINTMENT", "Doctor visit tomorrow")
        );
        
        Predicate<Alert> emergencyOnly = alert -> alert.type.equalsIgnoreCase("Emergency");
        Predicate<Alert> medicationOnly = alert -> alert.type.equalsIgnoreCase("Medication");
        Predicate<Alert> lab = alert -> alert.type.equalsIgnoreCase("lab");
        Predicate<Alert> appointment = alert -> alert.type.equalsIgnoreCase("appointment");
        
        alerts.stream().filter(emergencyOnly).forEach(a -> System.out.println(a.message));
		alerts.stream().filter(medicationOnly).forEach(a -> System.out.println(a.message));
	}
	
}
