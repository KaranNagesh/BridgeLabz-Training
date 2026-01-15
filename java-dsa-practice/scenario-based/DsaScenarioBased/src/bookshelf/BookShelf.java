package bookshelf;
import java.util.*;

public class BookShelf {
	public static void main(String[] args) {
		HashMap<String , LinkedList<Book>> map = new HashMap<>();
		LinkedList<Book> fiction = new LinkedList<>();
		LinkedList<Book> science = new LinkedList<>();
		Book b1 = new Book("Harry Potter","J.K Rowling", 1);
		Book b2 = new Book("The Great Gatsby","F.Scott", 2);
		Book b3 = new Book("Silent Srping","Rachel Carson", 3);
		Book b4 = new Book("Cosmos","Carl Sagan", 4);
		
		fiction.add(b1);
		fiction.add(b2);
		
		science.add(b3);
		science.add(b4);
		
		map.put("Fiction", fiction);
		map.put("Science", science);
		
		
		System.out.println("Heyy welcome to BookShelf");
		System.out.println("The books available : ");
		System.out.println();
		
		//iterating an map and showing all the books of every genre
		for(Map.Entry<String,LinkedList<Book>> entry : map.entrySet()) {
			String key = entry.getKey();
			LinkedList<Book> values = entry.getValue();
			
			System.out.println(key + " : ");
			
			for(Book value : values) {
				System.out.print("title : " + value.title + ",  author : " + value.title + ", availability : " + ((value.available) ?  "Available" : "Not Available"));
				System.out.println();
			}
			
			System.out.println();
		}
		
		
		//borrowing a book
		b1.borrow(b1);
		
		//borrowing same book again and this time give us not available
		b1.borrow(b1);
		
		
		//returning the book to the bookself
		b1.returned(b1);
		
		//again trying to borrow now its available
		b1.borrow(b1);
	}
}
