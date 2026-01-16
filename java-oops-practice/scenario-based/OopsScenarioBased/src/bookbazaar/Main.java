package bookbazaar;

public class Main {

	 public static void main(String[] args) {

	     // Create books
	     Book ebook = new EBook(
	             "Clean Code",
	             "Robert C. Martin",
	             500,
	             50
	     );

	     Book printedBook = new PrintedBook(
	             "Java: The Complete Reference",
	             "Herbert Schildt",
	             800,
	             30
	     );

	     // Create order
	     Order order = new Order("Karan Nagesh");

	     // Add books to order
	     order.addBook(ebook, 2);        // price × quantity − discount
	     order.addBook(printedBook, 1);

	     // Confirm order
	     order.confirmOrder();

	     System.out.println();

	     // Display order summary
	     order.showOrderSummary();
	 }
}
