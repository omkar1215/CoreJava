package IOdemos;
import java.io.*;

public class CharInput {
	public static void main(String[] args){
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q to quit'");
			int i;
			int count=0;
			int alphabets=0;
			int digit=0;
			while((i=br.read())!='q') {
				System.out.println((char)i);
				if(i>='A' && i<='Z' || i>='a' && i<='z')
					alphabets++;
				else if(i>='0' && i<='9')
					digit++;
				else
					count++;
			}
			System.out.println("Count: "+count+" Alphabets: "+alphabets+" Digit: "+digit);
			System.out.println("Read Write Operator is over!");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				br.close();
			}catch(Exception e) {
				e.getStackTrace();
			}
		}
		
	}
}
