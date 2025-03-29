package staff;

import java.io.Serializable;

import utility.Date;

public class Person implements Serializable{
	private String name;
	private Date bdate;
	
	public Person() {
		//super();
		//name=bdate=null;
	}

	public Person(String name,int dd,int mm,int yy) {
		super();
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	
	public void Display(){
		System.out.println("Name: "+name);
		if(bdate!=null){
			System.out.println("Birthdate: ");
			bdate.display();
		}
	}
	
	public String toString(){
		if(bdate!=null){
			return "Name: "+name+"\nBirthdate: "+bdate;
		}else {
			return "Name: "+name; 
		}
	}
	
}
