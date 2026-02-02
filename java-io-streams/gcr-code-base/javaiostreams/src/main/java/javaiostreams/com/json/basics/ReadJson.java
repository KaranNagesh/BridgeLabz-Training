package javaiostreams.com.json.basics;

import java.io.InputStream;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON parser

		InputStream is = ReadJson.class.getClassLoader().getResourceAsStream("data/json/user.json");

		JsonNode root = mapper.readTree(is); // read JSON

		String name = root.get("name").asText(); // extract name
		String email = root.get("email").asText(); // extract email

		System.out.println("Name: " + name); // output
		System.out.println("Email: " + email);
	}
}
