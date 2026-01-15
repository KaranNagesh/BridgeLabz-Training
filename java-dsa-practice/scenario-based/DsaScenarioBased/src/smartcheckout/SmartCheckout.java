package smartcheckout;
import java.util.*;

public class SmartCheckout {
	public static void main(String[] args) {
		Queue<Customer> customer = new LinkedList<>();
		
		
		HashMap<String,Item> listOfItems = new HashMap<>();
		
		listOfItems.put("oil",new Item(75,10));
		listOfItems.put("soap",new Item(30.0,2));
		listOfItems.put("pohaa",new Item(40,15));
		listOfItems.put("sugar",new Item(45,5));
		listOfItems.put("peanuts",new Item(20,10));
		
		
		List<String> c1List = new ArrayList<>();
		c1List.add("oil");
		c1List.add("soap");
		c1List.add("sugar");
		
		List<String> c2List = new ArrayList<>();
		c2List.add("pohaa");
		c2List.add("peanuts");
		c2List.add("oil");
		c2List.add("sugar");
		
		Customer c1 = new Customer("Karan",c1List);
		Customer c2 = new Customer("Ansh",c2List);
		Customer c3 = new Customer("Pranshi", c1List);
		
	    //Adding customer on queue;
		customer.add(c1);
		customer.add(c2);
		
		
		//checking who is on first place in a queue by name
		String name = customer.peek().name;
		
		
		//printing the name of the customer who is on first place and first get free after checkout
		System.out.println(name);
		System.out.println();
		
		
		
		System.out.println("Welcome to store !! "+ customer.peek().name);
			
		double totalPrice = 0;
			
		//Iterating through the list and make a bill
		for(String item : c1.shopppingList) {
			totalPrice += listOfItems.get(item).price;
			listOfItems.get(item).stock -= 1;
		}
		
		System.out.println("Your total bill is of : " + totalPrice);
		
		
		System.out.println();
		
		
		//Stock gets decrease by 1 after we purchase
		System.out.println("The stock of oil after purchase is " + listOfItems.get("oil").stock);

			
}
	
}
