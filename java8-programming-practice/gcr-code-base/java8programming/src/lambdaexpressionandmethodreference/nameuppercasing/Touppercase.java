package lambdaexpressionandmethodreference.nameuppercasing;

import java.util.*;

public class Touppercase {
	public static void main(String args[]) {
		List<String> employeeNames = Arrays.asList("Rahul" , "Anjali","Amit","Pooja");
		List<String> upperCaseName = employeeNames.stream().map(String::toUpperCase).toList();
		
		upperCaseName.forEach(System.out::println);
	}
}
