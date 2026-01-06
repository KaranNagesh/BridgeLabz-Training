package CampusConnect;

public abstract class Person {
	String name;
	String email;
	int id;
	
	Person(String name,String email,int id){
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	
	
	 abstract void printDetails() ;
}
