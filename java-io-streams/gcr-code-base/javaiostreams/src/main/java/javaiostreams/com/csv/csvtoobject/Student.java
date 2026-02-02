package javaiostreams.com.csv.csvtoobject;


//Student POJO class
public class Student {

	private int id;
	private String name;
	private int age;
	private int marks;

	// Constructor to initialize student object
	public Student(int id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	// Override toString() for readable output
	@Override
	public String toString() {
		return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Marks=" + marks + "]";
	}
}