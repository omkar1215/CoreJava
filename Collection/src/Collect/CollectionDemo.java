package Collect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) throws IOException{
		List<String> stringL=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String idx;
		System.out.println("Enter Elements: ");
		String str;
		while(!(str=br.readLine()).equals("quit")) {
			stringL.add(str);
		}
		System.out.println(stringL);
		System.out.println("Enter index of which element you want to delete: ");
		idx=br.readLine();
		stringL.remove(Integer.parseInt(idx));
		System.out.println(stringL);
		br.close();
	}

}



//if((br.readLine()).equals("quit"))
//	break;
