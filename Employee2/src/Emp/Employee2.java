package Emp;

import Emp.Employee2;

public class Employee2 implements Comparable<Employee2>{
	float Salary;
	int id;
	String name;
	String dept;
	public Employee2() {
		super();
	}
	public Employee2(float salary, int id, String name,String dept) {
		super();
		Salary = salary;
		this.id = id;
		this.name = name;
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		return "Employee2 [Salary=" + Salary + ", id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee2 s) {
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
