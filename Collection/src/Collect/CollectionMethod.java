package Collect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionMethod {
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
		System.out.println("ArrayList: "+stringL);
		System.out.println("Number of Elements in the collections are: "+stringL.size());
		//Advance for loop (For each)

		System.out.println("------------------------------------------");
		for(String s : stringL){
			System.out.println(" "+s+" ");
		}
		
		//Iterator
		System.out.println("------------------------------------------");
		Iterator<String> itr=stringL.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------------------");
		Collections.reverse(stringL);
		System.out.println(stringL);
		System.out.println("------------------------------------------");
		//stringL.forEach(System.out.println()); lambda
		Collections.sort(stringL);
		System.out.println("Sorted");
		System.out.println(stringL);
		System.out.println("------------------------------------------");
		//Check if exists
		System.out.println("Enter the String to check: ");
		String checkString=br.readLine();
		boolean flag=false;
		int id=0;
		for(String s : stringL) {
			if(s.equals(checkString))
				id=stringL.indexOf(s);
				flag=true;
		}
		if(flag) {
			System.out.println("Element Found!!");
			System.out.println(id);
		}else {
			System.out.println("Element Not Found!!");
		}
		
		br.close();
	}

}



