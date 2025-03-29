package ModelofBook;

public class eBook extends Book{
	private String downloadUrl;
	private double sizeinMBs;
	public eBook() {
		super();
		downloadUrl="www.google.com";
		sizeinMBs=228.2;
	}
	public eBook(String title,float price,int dd, String downloadUrl,double sizeinMBs) {
		super(title,price);
		this.downloadUrl=downloadUrl;
		this.sizeinMBs=sizeinMBs;
	}
	public void display(){
		super.display();
		System.out.println("Download URL"+downloadUrl);
		System.out.println("Size in MBs"+sizeinMBs);
	}
}
