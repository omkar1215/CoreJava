package ModelofBook;

public class BookApp {
	public static void main(String[] args){
		Book[] books=new Book[5];
		books[0]=new Book("Java",500);
		books[1]=new Book("C++",200);
		books[2]=new Book("Python",900);
		books[3]=new Book("MySql",200);
		books[4]=new Book("MongoDB",500);
		Category c1=new Category(1,"IT",books);
		Book b3=c1.getBookWithMaxPrice();
		b3.display();
		
		Book b2=new PaperBook();
		b2.display();
		Book b1=new PaperBook("Java",400,100,17,6,2001);
		b1.display();
		Book b4=new eBook();
		b4.display();
		Book b5=new eBook("Java", 222, 0, "www.google.com", 54.55f);
				
		b5.display();
	}
}
