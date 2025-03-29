package staff;

public abstract class Employee extends Person{
	//Aditional state - empid, salary;
	//complete state - name, bdate, empid, salary;
	private int empid;
	protected double salary;
	
	public Employee(){
		super("ABC",11,11,2001);
	}

	public Employee(String name,int dd, int mm,int yy,int empid, double salary) {
		super(name,dd,mm,yy);
		this.empid = empid;
		this.salary = salary;
	}
	//overridden method
	public void display(){
		super.Display();
		System.out.println("Empid: "+empid);
		System.out.println("Salary: "+salary);
	}

	
	public String toString() {
		return super.toString()+" "+empid+" : "+salary;
	}
	
	/*public Employee() {
		//super()  //no-ard constructor of super class
		//empid = 0;
		//salary = 0;
	}
	
	public Employee(String name, int dd,int mm, int yy,int empid, double salary) {
		//super(name, dd, mm,yy);
		this.empid = empid;		
		this.salary = salary;
	}*/
	
	/*public double calSalary() {
		return salary;
	}*/
	
	//no method body
	//incomplete
	public abstract double calSalary();

	public int getEmpid() {
		return empid;
	}
	
	
}
