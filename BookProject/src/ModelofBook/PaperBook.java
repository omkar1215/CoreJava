package ModelofBook;

public class PaperBook extends Book{
	private int numberofPages;
	Date dateofpublication;
	public PaperBook(){
		super();
		numberofPages=1;
		dateofpublication=new Date();
	}
	
	public PaperBook(String title, float price, int numberofPages,int dd,int mm, int yy){
		super(title,price);
		this.numberofPages=numberofPages;
		dateofpublication = new Date(11,2,2001);
	}
	public void display() {
		super.display();
	}
	
}
