package Stud;

import java.util.HashSet;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		Set<Student> std=new HashSet<>();
		std.add(new Student(11,"Omkar","Pune",86.9f));
		std.add(new Student(12,"Kajol","Sambhajinagar",85.9f));
		std.add(new Student(13,"Amay","Nagar",76.9f));
		std.add(new Student(14,"Aman","Nashik",75.9f));
		std.add(new Student(11,"Nandita","Chhattisgarh",84.9f));
		std.add(new Student(11,"Akash","Gorakpur",76.9f));
		System.out.println("Size: "+std.size());
		for(Student c:std) {
			System.out.println(c);
		}
	}
}
