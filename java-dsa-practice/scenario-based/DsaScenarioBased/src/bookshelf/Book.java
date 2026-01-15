package bookshelf;

public class Book {
	protected String title;
	protected String author;
	protected int bookId;
	protected boolean available = true;
	
	Book(String title, String author, int bookId){
		this.title = title;
		this.author = author;
		this.bookId = bookId;;
	}
	
	public void borrow(Book b1) {
		if(b1.available) {
			b1.available = false;
			System.out.println("Book issued successfully : " + b1.title);
		} else {
			System.out.println("Book is not available : " + b1.title);
		}
	}
	
	public void returned(Book b1) {
		b1.available = true;
		System.out.println("Book is returned now successfully : " + b1.title);
	}
}
