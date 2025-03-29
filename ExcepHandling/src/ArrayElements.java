import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayElements {
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter Array Size: ");
			int size=sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter "+size+" Array Elements");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter Index: ");
			int ind=sc.nextInt();
			System.out.println("Element at"+ind+" index is: "+arr[ind]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter Valid Index");
		}catch(InputMismatchException e){
			System.out.println("Invalid Input");
		}
		}
}
