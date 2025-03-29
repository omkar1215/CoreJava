package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserFile {
	public static void main(String[] args) throws IOException{
		//Write
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File name: ");
		String Filen=br.readLine();
		File file=new File("E:\\MyFiles\\"+Filen+".txt");
		BufferedWriter brw=new BufferedWriter(new FileWriter(file));
		System.out.println("Enter Data to be stored in data:\nEnter 'quit' to Exit.");
		String data;
		while(!(data=br.readLine()).equals("quit"))
			brw.write(data+"\n");		
		System.out.println("Data Created");
		br.close();
		brw.close();
		//Read
		String str;
		BufferedReader brR=new BufferedReader(new FileReader(file));
		if(file.exists()){
			while((str=brR.readLine())!=null){
				System.out.println(str);
			}
		}
		brR.close();
		
	}
}
