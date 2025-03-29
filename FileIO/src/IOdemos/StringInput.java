package IOdemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInput {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'quit' to stop ");
			String str;
			int maxlen =0;
			String maxstr = "";
			while( !(str= br.readLine()).equals("quit")) {
				if(str.length() > maxlen) {
					maxlen = str.length();
					maxstr = str;
				}				
			}
			System.out.println(maxstr+" : "+maxlen);	
			System.out.println("reading lines over");			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	}

}
