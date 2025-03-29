package inher;

public class Person {
	private String name;
	private int id;
	Date bdob;
	
	public Person() {
		id=0;
		name="NA";
		bdob=new Date();
	}
	public Person(String name, int id,int dd,int mm,int yy) {
		super();
		this.name=new String(name);
		this.id=id;
		this.bdob = new Date(dd,mm,yy);
	}
	public void display() {
		System.out.println("id ="+id);
		System.out.println("Name ="+name);
		if(bdob!=null) {
			System.out.println("bdate = ");
			bdob.display();	
			}
	}
}
