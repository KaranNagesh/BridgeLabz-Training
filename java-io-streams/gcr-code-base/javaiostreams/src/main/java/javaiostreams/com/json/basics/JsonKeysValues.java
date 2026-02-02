package javaiostreams.com.json.basics;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonKeysValues {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON parser

		// load JSON file from resources
		InputStream is = JsonKeysValues.class.getClassLoader().getResourceAsStream("data\\json\\user.json");

		JsonNode root = mapper.readTree(is); // read JSON

		printNode(root); // print all keys and values
	}

	static void printNode(JsonNode node) {
		if (node.isObject()) {
			Iterator<Map.Entry<String, JsonNode>> fields = node.fields();
			while (fields.hasNext()) {
				Map.Entry<String, JsonNode> entry = fields.next();
				System.out.println(entry.getKey() + " : " + entry.getValue());
				printNode(entry.getValue()); // handle nested objects
			}
		}
	}
}
