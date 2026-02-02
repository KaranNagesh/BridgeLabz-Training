package javaiostreams.com.json.basics;

import java.io.InputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonFiles {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON mapper

		InputStream is1 = MergeJsonFiles.class.getClassLoader().getResourceAsStream("data\\json\\file1.json");

		InputStream is2 = MergeJsonFiles.class.getClassLoader().getResourceAsStream("data\\json\\file2.json");

		ObjectNode json1 = (ObjectNode) mapper.readTree(is1); // first JSON
		ObjectNode json2 = (ObjectNode) mapper.readTree(is2); // second JSON

		json1.setAll(json2); // merge (json2 overrides duplicates)

		System.out.println(json1.toPrettyString()); // output
	}
}
