package linkedlist.singlylinkedlist.studentmanagement;

public class Student {
	int rollNo;
	String name;
	int age;
	char grade;
	Student next;
	
	Student(int rollNo, String name, int age, char grade){
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		this.grade = grade;
		this.next = null;
	}
}
