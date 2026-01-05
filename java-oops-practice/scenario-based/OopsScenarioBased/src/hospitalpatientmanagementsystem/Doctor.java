package hospitalpatientmanagementsystem;

public class Doctor {
	String name;
	int doctorID;
	String specialization;
	int yOE ; // year of experieance
	
	Doctor(String name, int doctorID, String specialization , int yOF){
		this.name = name;
		this.doctorID = doctorID;
		this.specialization = specialization;
		this.yOE = yOF;
	}
	
	public void displayInfo() {
		System.out.println("Dr." + name + " ID - " + doctorID + " has specialization in " + specialization + " and has " + yOE + " years of experience");
	}
	
}
