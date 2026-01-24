package com.javastreams.filehandling;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("src/com/javastreams/filehandling/input.txt");
				FileOutputStream fos = new FileOutputStream("src/com/javastreams/filehandling/output.txt")){
			int byteData;
			while((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}
			System.out.println("File copied Successully");
		} catch(FileNotFoundException e) {
			System.out.println("Source file does not  exist");
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} 
	}
	
}
