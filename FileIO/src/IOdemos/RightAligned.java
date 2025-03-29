package IOdemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightAligned {
	public static void main(String[] args) throws IOException{
		File fl=new File("E:\\MyFiles\\Aligned.txt");
		BufferedReader br=new BufferedReader(new FileReader(fl));
		String str;
		int maxLength=0;
		while((str=br.readLine())!=null){
			if(maxLength<str.length()){
				maxLength=str.length();
			}
		}
		br.close();
		BufferedReader br1=new BufferedReader(new FileReader(fl));
		while((str=br1.readLine())!=null){
			for(int i=0;i<maxLength-str.length();i++) {
				System.out.print("-");
			}
			System.out.println(str);
		}
		br1.close();
		
	}
}
