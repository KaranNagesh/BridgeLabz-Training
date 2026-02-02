package javaiostreams.com.json.basics;

import java.io.InputStream;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class EmailValidation {
	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper(); // JSON mapper

		// load schema from resources
		InputStream schemaStream = EmailValidation.class.getClassLoader().getResourceAsStream("data\\json\\userschema.json");

		JsonSchema schema = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012).getSchema(schemaStream);

		JsonNode jsonData = mapper.readTree("{\"email\":\"arif@example.com\"}");

		Set<ValidationMessage> errors = schema.validate(jsonData); // validate

		if (errors.isEmpty()) {
			System.out.println("Email is valid");
		} else {
			errors.forEach(e -> System.out.println(e.getMessage()));
		}
	}
}
