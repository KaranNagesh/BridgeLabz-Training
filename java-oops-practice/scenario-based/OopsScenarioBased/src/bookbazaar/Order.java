
package bookbazaar;
//Order class linking user to books
class Order {

 private String userName;

 // Order status must not be modified directly
 private String orderStatus;

 private double totalAmount;

 // Constructor
 public Order(String userName) {
     this.userName = userName;
     this.orderStatus = "CREATED";
     this.totalAmount = 0;
 }

 // Add book to order
 public void addBook(Book book, int quantity) {

     // Check stock availability
     if (book.getStock() < quantity) {
         System.out.println("Order failed: Not enough stock for " + book.getTitle());
         return;
     }

     // Calculate total cost using operators
     double price = book.getPrice() * quantity;
     double discount = book.applyDiscount(quantity);
     double finalCost = price - discount;

     totalAmount += finalCost;

     // Reduce inventory stock
     book.reduceStock(quantity);

     System.out.println(quantity + " × " + book.getTitle() + " added to order.");
 }

 // Internal method to update order status
 protected void updateStatus(String status) {
     this.orderStatus = status;
 }

 // Confirm order
 public void confirmOrder() {
     updateStatus("CONFIRMED");
 }

 // Display order summary
 public void showOrderSummary() {
     System.out.println("User: " + userName);
     System.out.println("Order Status: " + orderStatus);
     System.out.println("Total Amount Payable: ₹" + totalAmount);
 }
}
