package Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckDirectoryOrFile {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File Name: ");
		String fname=br.readLine();
		File path=new File("E:\\MyFiles\\"+fname);
		//String[] list=new String[];
		if(path.isDirectory()) {
			File[] files=path.listFiles();
			System.out.println("Directories: ");
			for(File i: files){
				System.out.println(i);
			}
		}else{
			long size=path.length();
			String str;
			int charr;
			if(size>25) {
				BufferedReader brf=new BufferedReader(new FileReader(path));
				while((str=brf.readLine())!=null)
					System.out.println(str);
				System.out.println("Using BufferedReader");
				brf.close();
			}else {
				FileReader fsr=new FileReader(path);
				while((charr=fsr.read())!=-1)
					System.out.println(charr);
				System.out.println("Using FlieReader");
				fsr.close();
			}
			
		}
		}
}
