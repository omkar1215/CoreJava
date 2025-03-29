package Binary;

import java.util.Scanner;

public class BinaryClass {
	public static void main(String[] args){
		//length of string 1-8
		//only 0's and 1's
		//hint - math.pow(2,1)*1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary value: ");
		String Binary=sc.nextLine();
		int count=0;
		double ans=0;
		int size=Binary.length();
		boolean flagSize=false;
		if(size>=1 || size<=8)
			flagSize=true;
		boolean flagBinary=true;
		for(int i=0; i<size ;i++){
			if(Binary.charAt(i)!='0') {
				if(Binary.charAt(i)!='1') {
					flagBinary=false;
					break;
				}
			}
		}
		if(flagSize && flagBinary) {
			for(int j=size-1;j>=0;j--){
				if(Binary.charAt(count)=='1'){
					System.out.println("\npow\n"+ans);
					ans+=Math.pow(2, count)*1;
					}
				count++;
			}
			System.out.println(ans);
		}
		else
			System.out.println("Invalid Binary Data!");
	}
}
