package javaiostreams.com.json.basics;

import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJson {
	public static void main(String[] args) throws Exception {

		CsvMapper csvMapper = new CsvMapper(); // CSV mapper
		CsvSchema schema = CsvSchema.emptySchema().withHeader(); // first row as header

		InputStream is = CsvToJson.class.getClassLoader().getResourceAsStream("data\\csv\\students.csv");

		MappingIterator<Object> it = csvMapper.readerFor(Object.class).with(schema).readValues(is);

		List<Object> data = it.readAll(); // CSV rows

		ObjectMapper jsonMapper = new ObjectMapper(); // JSON mapper
		String json = jsonMapper.writeValueAsString(data); // CSV → JSON

		System.out.println(json);
	}
}
