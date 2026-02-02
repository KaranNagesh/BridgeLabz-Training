package javaiostreams.com.csv.encryptdecrypt;


import java.io.BufferedReader; // Reads CSV file
import java.io.FileReader; // Reads file from disk

public class ReadDecryptedCSV {

	public static void main(String[] args) throws Exception {

		try (BufferedReader br = new BufferedReader(new FileReader("output/employees_encrypted.csv"))) {

			String line;
			boolean isHeader = true;

			// Read CSV file line by line
			while ((line = br.readLine()) != null) {

				// Skip header row
				if (isHeader) {
					isHeader = false;
					continue;
				}

				String[] data = line.split(",");

				String id = data[0];
				String name = data[1];

				// Decrypt sensitive fields
				String email = AESUtil.decrypt(data[2]);
				String salary = AESUtil.decrypt(data[3]);

				// Print decrypted data
				System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Salary: " + salary);
			}
		}
	}
}