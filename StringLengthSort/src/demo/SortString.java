package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortString {
	public static void main(String[] args){
		Set<String> s=new TreeSet<>(new Comparator<String>() {
			public int compare(String s1, String s2) {
				int diff=0;
				diff=s1.length()-s2.length();
				if(diff==0) {
					diff=s1.compareTo(s2);
				}
				return diff;
			}});
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Names: ");
		for(int i=0;i<5;i++){
			s.add(sc.nextLine());
		}
		System.out.println(s);
	}
}
