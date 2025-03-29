package ModelofBook;

public class Category {
	private int id;
	private String name;
	private Book[] b;
	
	public Category(int i,String n,Book []books) {
		id=i;
		name=n;
		b=books;
	}
	
	public Book getBookWithMaxPrice(){
		float max=b[0].getPrice();
		int i;
		int max1=0;
		for(i=0;i<5;i++) {
		if(b[i].getPrice()>max){
			max1=i;
			max=b[i].getPrice();
		}
	}
		return b[max1];
	}
}
