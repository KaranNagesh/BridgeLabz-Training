package hospitalpatientmanagementsystem;

public class OutPatient extends Patient {
	int admittedDays;
	
	public OutPatient(String name, int age , int id, int admittedDays) {
		super(age,id,name);
		this.admittedDays = admittedDays;
	}

	@Override
	void displayInfo() {
		System.out.println("Patient name : " + name);
		System.out.println("Age : " + age );
		System.out.println("ID : " + id);
		System.out.println("Admitted days : " + admittedDays);
	}
	
	
	
	
}
