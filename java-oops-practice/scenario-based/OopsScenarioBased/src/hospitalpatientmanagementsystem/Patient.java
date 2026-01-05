package hospitalpatientmanagementsystem;

abstract class Patient {
	
    public int id;
    public String name;
    public int age;
    private String medicalHistory;

    
    public Patient(int id, int age , String name) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    
    public Patient(int id, String history) {
        this.id = id;
        this.name = "Unknown/Emergency";
        this.medicalHistory = history;
    }
    
    public String getmedicalHistory() {
    	return medicalHistory;
    }
    
    public void setMedicalHistory(String medicalHistory) {
    	this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + id + " | Condition: " + medicalHistory;
    }

    abstract void displayInfo() ;
}