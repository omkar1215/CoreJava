package staff;

import utility.ITraveller;

public class Programmer extends Employee implements ITraveller{
	//some state received
	private double extraHours;
	private double chargesPerHour;
	private int daysTravelled;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, double extraHours,
			double chargesPerHour, int daysTravlled) {
		super(name, dd, mm, yy, empid, salary);
		this.extraHours = extraHours;
		this.chargesPerHour = chargesPerHour;
		this.daysTravelled = daysTravlled;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Extra hours : "+extraHours);
		System.out.println("Chrages per hour : "+chargesPerHour);
	}

	@Override
	public String toString() {
		return super.toString()+"\nExtra hours : "+extraHours+"\nCharges : "+chargesPerHour;
	}
	
	public double calSalary() {
		//basic salary+charges
		//return super.calSalary()+(extraHours*chargesPerHour);
		//return salary+(extraHours*chargesPerHour);
		return salary+(extraHours*chargesPerHour)+calculateTA();  //gross = basic+charges+TA
	}

	@Override
	public double calculateTA() {
		// DA in RS * no of days travelled
		return daysTravelled*(salary*DA/100);
	}

	public int getDaysTravelled() {
		return daysTravelled;
	}
	
	

}
