package javaiostreams.com.json.listtojson;

import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJson {
	public static void main(String[] args) throws Exception {

		List<Student> students = Arrays.asList( // list of objects
				new Student("Karan", 21), new Student("Ansh", 22));

		ObjectMapper mapper = new ObjectMapper(); // JSON mapper

		String jsonArray = mapper.writeValueAsString(students); // List → JSON array

		System.out.println(jsonArray); // output
	}
}
