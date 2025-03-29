package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberDisplayContent {
	public static void main(String[] args) throws IOException{
		File file=new File("E:\\MyFiles\\Demo.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		int countLine=0;
		String str;
		while((str=br.readLine())!=null)
			System.out.println(++countLine+". "+str);
		br.close();
		
		
	}
}
