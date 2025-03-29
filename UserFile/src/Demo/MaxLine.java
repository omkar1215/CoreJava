package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxLine {
	public static void main(String[] args) throws IOException{
		File file=new File("E:\\MyFiles\\Demo1.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		int maxLength=0;
		int countLineno=0;
		int lineno=0;
		String maxString="";
		String str;
		while((str=br.readLine())!=null)
			countLineno++;
			if(maxLength<str.length()) {
				maxLength=str.length();
				maxString=str;
				lineno=countLineno;
			}
		System.out.println("Line no:"+lineno+"\nMax String: "+maxString+"\n String Length");
			
		
		
	} 
}
