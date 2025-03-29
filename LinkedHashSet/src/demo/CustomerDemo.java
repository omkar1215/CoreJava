package demo;

import java.util.LinkedHashSet;

public class CustomerDemo {
	public static void main(String[] args) {
		LinkedHashSet<Customer> CustL=new LinkedHashSet<>();
		CustL.add(new Customer(1,"Kajol"));
		CustL.add(new Customer(2,"Omkar"));
		CustL.add(new Customer(3,"Amey"));
		CustL.add(new Customer(4,"Aman"));
		CustL.add(new Customer(5,"Akash"));
		System.out.println(CustL);
	}
}
