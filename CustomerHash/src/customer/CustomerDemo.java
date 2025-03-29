package customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDemo {
	public static void main(String[] args) throws Exception  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ObjectOutputStream oos=null;

		System.out.println("Enter File Name=");
		String path=br.readLine();

		File file=new File("C:\\Users\\user\\Desktop\\Core Java\\"+path);
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));


		oos=new ObjectOutputStream(new FileOutputStream(file));

		Customer []cust =new Customer[3];
		String nm,em;
		int n;
		int m;


		for(int i=0;i<cust.length;i++) {
		System.out.println("Enter c if u want customer or r");
		char ch=br.readLine().charAt(0);

		System.out.println("Enter Name=");
		nm=((BufferedReader)br).readLine();


		System.out.println("Enter the Email=");
		em=((BufferedReader)br).readLine();

		System.out.println("Enter the Contact Number");
		m=Integer.parseInt(br.readLine());
		if(ch=='r') {
		System.out.println("Enter the Register");
		n=Integer.parseInt(br.readLine());

		cust[i]=new RegisteredCustomer(nm,em,m,n);
		}
		else {
		cust[i]=new Customer(nm,em,m);
		}
		}
		for(int i=0;i<cust.length;i++) {
		System.out.println("written");
		oos.writeObject(cust[i]);
		}
		System.out.println("Customer saved in file...");
		oos.close();

		//Deserialization

		List<Customer> c1= new ArrayList<>();
		List <RegisteredCustomer> c2= new ArrayList<>();
		ObjectInputStream oi= new ObjectInputStream(new FileInputStream(file));
		while(true) {
		try {
		Object o=oi.readObject();
		if(o instanceof Customer) {
		Customer c=(Customer)o;
		c1.add(c);
		}
		else {
		c2.add((RegisteredCustomer) o);
		}
		}
		catch (Exception e) {
		break;
		}
		}
		oi.close();
		for(Customer c: c1)
		{
		System.out.println(c);
		System.out.println("********************************************************************");
		}
		}

}
