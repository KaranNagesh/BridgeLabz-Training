package SwiftCart;


import java.util.ArrayList;

//Cart class manages products and pricing
class Cart implements ICheckout {

 // Only Cart can modify total price
 private ArrayList<Product> products;
 private double totalPrice;

 // Default constructor (empty cart)
 public Cart() {
     products = new ArrayList<>();
     totalPrice = 0.0;
 }

 // Constructor with pre-selected items
 public Cart(ArrayList<Product> products) {
     this.products = products;
     calculateTotal();
 }

 // Add product to cart
 public void addProduct(Product product, int quantity) {
     for (int i = 0; i < quantity; i++) {
         products.add(product);
     }
     calculateTotal();
 }

 // Private method to protect price calculation
 private void calculateTotal() {
     totalPrice = 0.0;

     // Operator usage: price * quantity
     for (Product p : products) {
         totalPrice += p.getPrice();
     }
 }

 // Apply discount polymorphically
 @Override
 public double applyDiscount() {
     double discount = 0.0;

     // Polymorphism: discount varies by product type
     for (Product p : products) {
         discount += p.getDiscount();
     }

     return discount;
 }

 // Generate final bill
 @Override
 public void generateBill() {
     double discount = applyDiscount();

     // Operator usage: totalPrice - discount
     double finalAmount = totalPrice - discount;

     System.out.println("----- SwiftCart Bill -----");
     System.out.println("Total Price: ₹" + totalPrice);
     System.out.println("Discount: ₹" + discount);
     System.out.println("Final Amount Payable: ₹" + finalAmount);
 }
}