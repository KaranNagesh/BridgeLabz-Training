
package bookbazaar;

//Base class representing a book
abstract class Book implements IDiscountable {

 protected String title;
 protected String author;
 protected double price;

 // Inventory count must be protected (encapsulation)
 private int stock;

 // Constructor without offer
 public Book(String title, String author, double price, int stock) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.stock = stock;
 }

 // Constructor with offer (discounted base price)
 public Book(String title, String author, double price, int stock, double offerPrice) {
     this.title = title;
     this.author = author;
     this.price = offerPrice;
     this.stock = stock;
 }

 // Getter for price
 public double getPrice() {
     return price;
 }

 // Getter for title
 public String getTitle() {
     return title;
 }

 // Reduce stock only via method (encapsulation)
 public void reduceStock(int quantity) {
     if (quantity <= stock) {
         stock -= quantity;
     } else {
         System.out.println("Insufficient stock for " + title);
     }
 }

 // Check available stock
 public int getStock() {
     return stock;
 }
}
