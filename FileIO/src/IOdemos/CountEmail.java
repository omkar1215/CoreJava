package IOdemos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CountEmail {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("E:\\MyFiles\\emails.txt"));
		String str;
		Map<String,Integer> mp=new TreeMap<>();
		while((str=br.readLine())!=null) {
			int index=str.indexOf("@");
			String domain=str.substring(index+1);
			if(mp.containsKey(domain)) {
				int count = mp.get(domain);
				count++;
				mp.put(domain, count);
			}else {
				mp.put(domain, 1);
			}
		}
		Set<Entry<String,Integer>> st=mp.entrySet();
		for(Entry<String,Integer> ent: st) {
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}
		
		
	}
}
