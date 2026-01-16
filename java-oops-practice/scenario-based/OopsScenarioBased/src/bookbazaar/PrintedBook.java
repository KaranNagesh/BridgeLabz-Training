package bookbazaar;


//Printed book class
class PrintedBook extends Book {

public PrintedBook(String title, String author, double price, int stock) {
   super(title, author, price, stock);
}

// Printed books get lower discount
@Override
public double applyDiscount(int quantity) {
   return (price * quantity) * 0.10; // 10% discount
}
}