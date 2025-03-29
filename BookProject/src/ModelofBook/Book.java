package ModelofBook;

public class Book {
	private static int book_id;
	private String title;
	private float price;
	
	static {
		book_id=101;
	}
	public Book(){
		
	}
	public Book(String title, float price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book(Book b){
		title=b.title;
		price=b.price;
	}
	public static void bookId() {
		book_id++;
	}
	public float getPrice() {
		return price;
	}
	public void display() {
		System.out.println("Book id"+book_id+"Title"+title+"Price"+price);
	}
	
}
