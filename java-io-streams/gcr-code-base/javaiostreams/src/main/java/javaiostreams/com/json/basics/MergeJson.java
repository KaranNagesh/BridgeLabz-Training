package javaiostreams.com.json.basics;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON mapper

		JsonNode json1 = mapper.readTree("{\"name\":\"Karan\",\"email\":\"Karan@example.com\"}");
		JsonNode json2 = mapper.readTree("{\"age\":21,\"city\":\"Delhi\"}");

		ObjectNode merged = mapper.createObjectNode(); // result JSON

		merged.setAll((ObjectNode) json1); // add first JSON
		merged.setAll((ObjectNode) json2); // add second JSON

		System.out.println(merged.toPrettyString()); // output
	}
}
