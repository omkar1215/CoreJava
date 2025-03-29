package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringMap {
	public static void main(String[] args) {
	Map<Integer,String> mp=new HashMap<>();
	mp.put(1,"Omkar");
	mp.put(2,"Amey");
	mp.put(3,"Aman");
	mp.put(4,"Akash");
	mp.put(5,"Nandita");
	mp.put(6,"Kajol");
	mp.put(7,"Purva");
	mp.put(8,"Yuti");
	Set<Entry<Integer,String>> st=mp.entrySet();
	for(Entry<Integer,String> enty : st){
		System.out.println(enty.getKey()+" : "+enty.getValue());
	}
	}
}
