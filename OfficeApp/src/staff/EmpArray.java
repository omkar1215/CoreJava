package staff;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmpArray {
	public static void main(String args[]) throws IOException{
		//Write
		Employee[] allemp= 
			{new SalesManager(),
			new Programmer(),
			new Admin()};
		File fl=new File("E:\\MyFiles\\Emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fl));
		for(Employee e : allemp){
			oos.writeObject(e);
		}
		System.out.println("Data Entered!!");
		//Read
		List<Employee> emps=new ArrayList<>();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fl));
		while(true){
			try {
				Object o=ois.readObject();
//				if(o instanceof Employee) {
//					Employee e=(Employee)o;
//					emps.add(e);
//				}
				emps.add((Employee) o);
			}catch(Exception e){
				break;        //read object() method when fails
			}
		}
		System.out.println(emps);
		
	}
}
