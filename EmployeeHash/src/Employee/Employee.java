package Employee;

public class Employee implements Comparable<Employee>{
	float Salary;
	int id;
	String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(float salary, int id, String name) {
		super();
		Salary = salary;
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [Salary=" + Salary + ", id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee s) {
		int diff=0;
		if(this.Salary>s.Salary)
			diff=1;
		else if(this.Salary<s.Salary)
			diff=-1;
		else {
			diff=s.name.compareTo(this.name);
			if(diff==0){
				diff=this.id-s.id;
			}
		}
		return diff;
	}
	
}
