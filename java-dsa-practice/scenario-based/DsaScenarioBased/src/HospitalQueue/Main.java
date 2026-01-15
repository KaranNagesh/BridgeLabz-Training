package HospitalQueue;

public class Main {
	public static void main(String[] args) {
		
		//creating 12 patients
		Patient p1 = new Patient("Manish",4);
		Patient p2  = new Patient("Rahul", 1);
		Patient p3  = new Patient("Amit", 2);
		Patient p4  = new Patient("Suresh", 3);
		Patient p5  = new Patient("Rohit", 5);
		Patient p6  = new Patient("Kunal", 6);
		Patient p7  = new Patient("Vikas", 7);
		Patient p8  = new Patient("Ankit", 8);
		Patient p9  = new Patient("Deepak", 9);
		Patient p10 = new Patient("Nikhil", 10);
		Patient p11 = new Patient("Arjun", 4);
		Patient p12 = new Patient("Pranav", 6);
		
		
		//array of patient with shuffle critical level
		Patient[] arr = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12};
		
		
		//Bubble sort
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			
			for(int j = i + 1; j < arr.length;j++) {
				if(arr[i].criticalLevel < arr[j].criticalLevel) {
					Patient temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		//Checking our output
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i].name + " with critical level : " + arr[i].criticalLevel);
		}
		
	}
}
