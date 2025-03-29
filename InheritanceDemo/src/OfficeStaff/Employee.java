package OfficeStaff;

import inher.Person;

public class Employee extends Person {
	private int empid;
	private double salary;
	
	public Employee() {}

	public Employee(int empid, double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
}
