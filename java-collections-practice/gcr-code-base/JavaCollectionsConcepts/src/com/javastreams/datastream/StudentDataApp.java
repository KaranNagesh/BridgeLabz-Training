package com.javastreams.datastream;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Program to store and retrieve student data using Data Streams
public class StudentDataApp {

    private static final String FILE_PATH =
            "src/com/javastreams/datastream/StudentData.txt";

    public static void main(String[] args) {

        // Write student data to binary file
        writeStudentData();

        // Read student data from binary file
        readStudentData();
    }

    // Method to write primitive data
    private static void writeStudentData() {

        DataOutputStream dos = null;

        try {
            dos = new DataOutputStream(new FileOutputStream(FILE_PATH));

            // Writing student details
            dos.writeInt(101);          // roll number
            dos.writeUTF("Arif");       // name
            dos.writeDouble(8.75);      // GPA

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
            e.printStackTrace();

        } finally {
            // Close stream
            try {
                if (dos != null)
                    dos.close();
            } catch (IOException e) {
                System.out.println("Error while closing DataOutputStream.");
            }
        }
    }

    // Method to read primitive data
    private static void readStudentData() {

        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new FileInputStream(FILE_PATH));

            // Reading student details
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Details:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
            e.printStackTrace();

        } finally {
            // Close stream
            try {
                if (dis != null)
                    dis.close();
            } catch (IOException e) {
                System.out.println("Error while closing DataInputStream.");
            }
        }
    }
}