package javaiostreams.com.json.basics;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJson {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON parser

		String json = "{\"name\":\"Karan\",\"email\":\"Karan@example.com\"}";
		JsonNode root = mapper.readTree(json); // parse JSON

		boolean isValid = root.has("name") && // check name field
				root.has("email"); // check email field

		if (isValid) {
			System.out.println("JSON structure is valid");
		} else {
			System.out.println("JSON structure is invalid");
		}
	}
}
