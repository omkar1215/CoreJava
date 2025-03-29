package Thread;

import java.io.BufferedWriter;
import java.io.IOException;

public class DivisorApp implements Runnable {
	private Thread t;
	int num;
	BufferedWriter br=null;
	
	
	public DivisorApp(int num, BufferedWriter br) {
		super();
		t=new Thread(this);
		this.num = num;
		this.br = br;
	}

	@Override
	public  void run() {
		synchronized(br) {
		try {
		br.write("-----------------------------\n");
		for(int i=1; i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				br.write(i+"\n");
				}
		}
		br.write("-----------------------------\n");
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
	public Thread getT() {
		return t;
	}
	

}
