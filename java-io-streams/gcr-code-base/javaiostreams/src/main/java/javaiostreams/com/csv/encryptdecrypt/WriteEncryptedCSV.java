package javaiostreams.com.csv.encryptdecrypt;


import java.io.BufferedWriter; // Writes CSV efficiently
import java.io.FileWriter; // Writes characters to file
import java.io.File; // Represents file path

public class WriteEncryptedCSV {

	public static void main(String[] args) throws Exception {

		String outputDir = "output";
		String filePath = outputDir + "/employees_encrypted.csv";

		// Create output directory if not exists
		File dir = new File(outputDir);
		if (!dir.exists()) {
			dir.mkdir();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			// Write CSV header
			bw.write("ID,Name,Email,Salary");
			bw.newLine();

			// Encrypt sensitive fields before writing
			bw.write("101,Karan," + AESUtil.encrypt("Karan@gmail.com") + "," + AESUtil.encrypt("60000"));
			bw.newLine();

			bw.write("102,Rahul," + AESUtil.encrypt("rahul@yahoo.com") + "," + AESUtil.encrypt("52000"));
			bw.newLine();

			System.out.println("Encrypted CSV file created successfully!");
		}
	}
}