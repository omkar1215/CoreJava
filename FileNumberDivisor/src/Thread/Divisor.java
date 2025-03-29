package Thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Divisor {
	public static void main(String[] args) throws IOException{
		BufferedWriter br=new BufferedWriter(new FileWriter("E:\\MyFiles\\Divisor.txt"));
		DivisorApp d1=new DivisorApp(980,br);
		DivisorApp d2=new DivisorApp(890,br);
		DivisorApp d3=new DivisorApp(789,br);
		//start
		d1.getT().start();
		d2.getT().start();
		d3.getT().start();
		//main thread waits
		try {
			d1.getT().join();   
			d2.getT().join();
			d3.getT().join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		br.close();
		
	}
}
