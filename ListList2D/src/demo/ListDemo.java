package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<List<Integer>> Lt=new ArrayList<>();
		List<Integer> subLt=null;
		String str;
		while(!(str=br.readLine()).equals("stop")){
			subLt= new ArrayList<>();
			String[] sub=str.split(" ");
			for(int i=0;i<sub.length;i++) {
				subLt.add(Integer.parseInt(sub[i]));
				
			}
			Lt.add(subLt);
		}
		System.out.println(Lt);
		br.close();
	}

}
