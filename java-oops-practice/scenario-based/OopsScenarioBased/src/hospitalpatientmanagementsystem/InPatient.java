package hospitalpatientmanagementsystem;

public class InPatient extends Patient {
	private String visitDate;
	
	public InPatient(String name ,int age , int id, String visitDate){
		super(id,age,name);
		this.visitDate = visitDate;
	}

	@Override
	void displayInfo() {
		System.out.println("Patient name : " + name);
		System.out.println("Age : " + age );
		System.out.println("ID : " + id);
		System.out.println("Visit Date : " + visitDate);
	}
	
	
}
