package callcenter;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CallCenter {
	
	//Method to display customer call details
	static void displayDetails(Map<String, Integer> customerRecord, Queue<String> vip, Queue<String> generalPublic) {
		System.out.println("============= VIP Customers =================");
		int vipSize = vip.size();
		int generalSize = generalPublic.size();
		for(int i=0; i<vipSize;i++) {
			System.out.println(vip.poll());
		}
		
		System.out.println("============= General Customers =================");
		for(int i=0; i<generalSize;i++) {
			System.out.println(generalPublic.poll());
		}
		
		System.out.println("============= Customers Calling records in this month =================");
		
		System.out.println(customerRecord);
		
		
		
		
	}
	
	public static void main(String[] args) {
	
		Queue<String> generalPublic = new ArrayDeque<>();
		Queue<String> vip =  new PriorityQueue<>();
		Map<String,Integer> customerRecord = new HashMap<>();
		
		
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("Enter customer name");
			String customer = input.next();
			System.out.println("-------------------------------");

			System.out.println("Choose customer type");
			System.out.println("\n1 -> Vip\n2 -> Normal");
			System.out.println("-------------------------------");

			int customerType = input.nextInt();
			
			if(customerType == 1) {
				vip.add(customer);
					
			}
			else {
				generalPublic.add(customer);
				
			}
			customerRecord.put(customer,customerRecord.getOrDefault(customer,0)+1);
			
			System.out.println("Want to continue\n1 -> Yes\n2 -> No ");
			int check = input.nextInt();
			if(check==2) {
				break;
			}
		}
		
		//calling method to display customer records
		displayDetails(customerRecord,vip,generalPublic );
		
		//Closing Scanner object
		input.close();
		

	}

}