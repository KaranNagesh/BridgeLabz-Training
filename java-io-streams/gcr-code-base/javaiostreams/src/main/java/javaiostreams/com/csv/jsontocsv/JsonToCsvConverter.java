package javaiostreams.com.csv.jsontocsv;

import com.fasterxml.jackson.databind.ObjectMapper; // JSON mapper
import com.opencsv.CSVWriter; // CSV writer
import java.io.FileWriter; // Writes CSV file
import java.io.InputStream; // Reads JSON file
import java.io.File; // File handling
import java.util.List; // List interface

public class JsonToCsvConverter {

	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // Jackson object mapper

		// Read JSON file from resources
		InputStream is = JsonToCsvConverter.class.getClassLoader().getResourceAsStream("data/json/students.json");

		// Convert JSON array to List<Student>
		List<Student> students = mapper.readValue(is,
				mapper.getTypeFactory().constructCollectionType(List.class, Student.class));

		// Create output directory if not exists
		File dir = new File("output");
		if (!dir.exists()) {
			dir.mkdir();
		}

		// Write CSV file
		try (CSVWriter writer = new CSVWriter(new FileWriter("output/students.csv"))) {

			// Write CSV header
			writer.writeNext(new String[] { "ID", "Name", "Age", "Marks" });

			// Write student records
			for (Student s : students) {
				writer.writeNext(
						new String[] { String.valueOf(s.id), s.name, String.valueOf(s.age), String.valueOf(s.marks) });
			}
		}

		System.out.println("JSON converted to CSV successfully!");
	}
}