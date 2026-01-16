package SwiftCart;

//Interface defining checkout-related operations
interface ICheckout {

// Method to generate final bill
void generateBill();

// Method to apply discount
double applyDiscount();
}