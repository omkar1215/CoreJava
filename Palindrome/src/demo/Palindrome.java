package demo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean flag=true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag=false;
			}
		}
		if(flag)
			System.out.println("Palindrom");
		else
			System.out.println("Not a Palindrom");
	}

}
