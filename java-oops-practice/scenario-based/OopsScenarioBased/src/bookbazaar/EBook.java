
package bookbazaar;

//EBook class
class EBook extends Book {

 public EBook(String title, String author, double price, int stock) {
     super(title, author, price, stock);
 }

 // EBooks get higher discount
 @Override
 public double applyDiscount(int quantity) {
     return (price * quantity) * 0.20; // 20% discount
 }
}
