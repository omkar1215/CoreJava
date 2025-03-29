package staff;

public class Admin extends Employee {
	//reveived some state
	private double bonus;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int empid, double salary, double bonus) {
		super(name, dd, mm, yy, empid, salary);
		this.bonus = bonus;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Bonus : "+bonus);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nBonus : "+bonus;
	}
	
	public double calSalary() {
		//basic salary+bonus
		//return super.calSalary()+bonus;
		return salary+bonus;
	}
	
	

}
