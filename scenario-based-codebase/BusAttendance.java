import java.util.Scanner;

public class BusAttendance{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String status;
		
		//Counter variable for absent and present
		int present = 0;
		int absent = 0;
		
		//array of 10 students name
		String[] students = {"Karan","Ansh","Sam","Animesh","Chandan","Himendra","Uday","Pranjal","Gajendra","Sumit"};
		
		//Iterating through for-each loop and checking present and absent
		for(String name : students){
			System.out.println(name + " Present or Absent?");
			status = sc.nextLine();
			
			//If present the present increment if absent then absent increment if anything else it will also count in absent
			if(status.equalsIgnoreCase("Present")){
				present++;
			} else if(status.equalsIgnoreCase("Absent")){
				absent++;
			} else{
				System.out.println("Answer in present and absent only otherwise you will be absent");
				absent++;
			}
		}
		
		//Displaying the total numbers of present and absent
		System.out.println("The Total Students which are present out of 10 are : " + present);
		System.out.println("The Total Students which are absent out of 10 are : " + absent);
	}
}