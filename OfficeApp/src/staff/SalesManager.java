package staff;

import utility.ITraveller;

public class SalesManager extends Employee implements ITraveller {
	private double target;
	private double comm;
	private int daysTravlled;
	
	public SalesManager() {
		//super();
		//target = comm=0;
	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, double salary, double target, double comm,
			int daysTravlled) {
		super(name, dd, mm, yy, empid, salary);
		this.target = target;
		this.comm = comm;
		this.daysTravlled = daysTravlled;
	}
	
	public void display() {
		super.display();
		System.out.println("Target : "+target);
		System.out.println("Commission : "+comm);
	}
	
	public String toString() {		
		return super.toString()+"\ntarget : "+target+"\nCommission : "+comm;
	}

	public double calSalary() {
		//basic salary+commision
		//return super.calSalary()+(target*comm/100);
		//return salary+(target*comm/100);
		return salary+(target*comm/100)+calculateTA();   //gross - basic +comm+TA
	}

	public double calculateTA() {
		//DA in Rs * no of days travelled
		return daysTravlled*(salary*DA/100);
	}

	public int getDaysTravlled() {
		return daysTravlled;
	}	
}
