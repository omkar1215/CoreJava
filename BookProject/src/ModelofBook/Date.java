package ModelofBook;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date(int dd,int mm, int yy) {
		super();
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	public Date() {
		dd=15;
		mm=8;
		yy=2001;
	}
	public int getDd(){
		return dd;
	}
	public void setDd(int dd){
		this.dd=dd;
	}
	public int getMm(){
		return mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	
}
