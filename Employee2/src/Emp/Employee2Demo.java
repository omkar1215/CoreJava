package Emp;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Employee2Demo {
	public static void main(String[] args){
		Set<Employee2> s=new TreeSet<>(new Comparator<Employee2>() {
			public int compare(Employee2 e1, Employee2 e2) {
				int diff=0;
				diff=e1.dept.compareTo(e2.dept);
				if(diff==0) {
				if(e2.Salary>e1.Salary) {
					diff=1;
				}else if(e2.Salary<e1.Salary) {
					diff=-1;
				}else {
					diff=e1.name.compareTo(e2.name);
					if(diff==0) {
						diff=e1.id-e2.id;
					}
				}
				}
				return diff;
			}});
		s.add(new Employee2(9000.99f,2,"Omkar","Admin"));
		s.add(new Employee2(8500.45f,3,"Amey","Account"));
		s.add(new Employee2(7000.68f,4,"Aman","HR"));
		s.add(new Employee2(7000.67f,6,"Aman","HR"));
		s.add(new Employee2(7100.99f,5,"Akash","Manager"));
		System.out.println("The Record is Diplayed on the Basis of Salary");
		for(Employee2 e:s){
			System.out.println(e);
		}
	}
}
