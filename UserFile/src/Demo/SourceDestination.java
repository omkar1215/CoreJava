package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SourceDestination {
	public static void main(String[] args) throws IOException{
		//source to destination //take files name from user
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Source File Name: ");
		String sourceName=br.readLine();
		System.out.println("Enter Destination File Name:");
		String destinationName=br.readLine();
		File sFile=new File("E:\\MyFiles\\"+sourceName+".txt");
		File dFile=new File("E:\\MyFiles\\"+destinationName+".txt");
		BufferedReader sBR=new BufferedReader(new FileReader(sFile));
		BufferedWriter dBR=new BufferedWriter(new FileWriter(dFile));
		String data;
		while((data=sBR.readLine())!=null){
			dBR.write(data+"\n");
		}
		System.out.println("Data Transfered Successfully!");
		br.close();
		sBR.close();
		dBR.close();
		
	}
}
