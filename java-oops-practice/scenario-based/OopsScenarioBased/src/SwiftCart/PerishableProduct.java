package SwiftCart;

//Perishable products like milk, vegetables, fruits
class PerishableProduct extends Product {

// Constructor
public PerishableProduct(String name, double price) {
   super(name, price, "Perishable");
}

// Higher discount for perishable items
@Override
public double getDiscount() {
   return price * 0.10;  // 10% discount
}
}