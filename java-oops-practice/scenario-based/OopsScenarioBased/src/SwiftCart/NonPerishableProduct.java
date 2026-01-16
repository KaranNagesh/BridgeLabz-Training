package SwiftCart;


//Non-perishable products like rice, oil, pulses
class NonPerishableProduct extends Product {

// Constructor
public NonPerishableProduct(String name, double price) {
   super(name, price, "Non-Perishable");
}

// Lower discount for non-perishable items
@Override
public double getDiscount() {
   return price * 0.05;  // 5% discount
}
}