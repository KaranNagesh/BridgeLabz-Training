package SwiftCart;

//Base Product class
class Product {

 protected String name;
 protected double price;
 protected String category;

 // Constructor to initialize product details
 public Product(String name, double price, String category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Polymorphic discount method (default: no discount)
 public double getDiscount() {
     return 0.0;
 }

 // Getter for price (no setter to protect price updates)
 public double getPrice() {
     return price;
 }

 // Getter for product name
 public String getName() {
     return name;
 }
}