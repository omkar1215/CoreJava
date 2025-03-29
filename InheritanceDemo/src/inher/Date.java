package inher;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date(int dd,int mm,int yy) {
		super();
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public Date() {
		dd=01;
		mm=01;
		yy=2001;
	}
	public void display() {
		System.out.println( dd+"/"+mm+"/"+yy);
	}
}
