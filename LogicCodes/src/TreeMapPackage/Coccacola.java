package TreeMapPackage;

import java.util.Map;
import java.util.TreeMap;

public class Coccacola {
	public static void main(String[] args){
		Map<Character,Integer> mp=new TreeMap<>();
		String s="COCCACOLA";
		//int count=1;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(mp.containsKey(ch)){
				int count=mp.get(ch);
				count++;
				mp.put(ch, count);
			}else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
	}

}
