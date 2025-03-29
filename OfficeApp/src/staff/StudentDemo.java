package staff;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDemo extends Student {
	public static void main(String[] args) throws IOException{
		Course c=new Course(1,"DAC",35000.00);
		Student[] sn= {
				new Student(c,"2502430002031",23),
				new Student(c,"2502430002016",23),
				new Student(c,"2502430002006",23)
		};
		File fl=new File("E:\\MyFiles\\Student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fl));
		for(Student e : sn){
			oos.writeObject(e);
		}
		System.out.println("Data Entered!!");
		//Read
		List<Student> emps=new ArrayList<>();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fl));
		while(true){
			try {
				Object o=ois.readObject();
				if(o instanceof Student) {
					Student e=(Student)o;
					emps.add(e);
				}
			}catch(Exception e){
				break;        //read object() method when fails
			}
		}
		System.out.println(emps);
		
	}
}
