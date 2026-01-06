package CampusConnect;

public class Faculty extends Person{
	Faculty(String name, String email, int id, String department) {
		super(name, email, id);
		this.name = name;
		this.email = email;
		this.id = id;
		this.department = department;

	}
	private String department;
	Course course;
	
	
	@Override
	void printDetails() {
		// TODO Auto-generated method stub
		System.out.println(name + " is a faculty of " + department );
	}
	
	
	 
}
