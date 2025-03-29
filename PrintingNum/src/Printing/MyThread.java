package Printing;

public class MyThread extends Thread{
	

	@Override
	public void run() {
		//Task Definition
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
