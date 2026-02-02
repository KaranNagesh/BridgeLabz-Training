package javaiostreams.com.json.objecttojson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	public static void main(String[] args) throws Exception {

		Car car = new Car("Toyota", "Corolla", 2022); // create object

		ObjectMapper mapper = new ObjectMapper(); // Jackson mapper

		String json = mapper.writeValueAsString(car); // Java → JSON

		System.out.println(json); // output
	}
}
