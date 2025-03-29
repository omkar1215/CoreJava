package IOdemos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Student {
	public static void main(String[] args) {
		BufferedReader br=null;
		try {
		br=new BufferedReader(new InputStreamReader(System.in));
		int rollno;
		String name;
		int marks;
		System.out.println("Enter RollNo:");
		rollno=Integer.parseInt(br.readLine());
		System.out.println("Enter Name:");
		name=br.readLine();
		System.out.println("Enter Marks:");
		marks=Integer.parseInt(br.readLine());
		if(marks>90 && marks<=100){
			System.out.println("Grade A");
		}else if(marks>75 && marks<=90) {
			System.out.println("Grade B");
		}else if(marks>60 && marks<=75){
			System.out.println("Grade C");
		}else if(marks>=35 && marks<=60){
			System.out.println("Grade D");
		}else {
			System.out.println("Fail!");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		}
}
