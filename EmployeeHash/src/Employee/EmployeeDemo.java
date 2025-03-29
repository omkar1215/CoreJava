package Employee;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDemo {
	public static void main(String[] args){
		Set<Employee> s=new TreeSet<>(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				int diff=0;
				if(e1.Salary>e2.Salary) {
					diff=1;
				}else if(e1.Salary<e2.Salary) {
					diff=-1;
				}else {
					diff=e1.id-e2.id;
					if(diff==0) {
						diff=e1.name.compareTo(e2.name);
					}
				}
				return diff;
			}});
		s.add(new Employee(9000.99f,2,"Omkar"));
		s.add(new Employee(8500.45f,3,"Amey"));
		s.add(new Employee(7000.68f,3,"Aman"));
		s.add(new Employee(7100.99f,5,"Akash"));
		System.out.println("The Record is Diplayed on the Basis of Salary");
		for(Employee e:s){
			System.out.println(e);
		}
	}
}
