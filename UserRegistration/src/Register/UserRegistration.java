package Register;

import java.util.Scanner;

public class UserRegistration {
	public static void registerUser(String userCountry,String username){
		try {
		if(!(userCountry.equals("India"))){
			throw new InvalidCountryException();
		}else {
			System.out.println("User "+username+" is Register");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username=sc.nextLine();
		String userCountry=sc.nextLine();
		registerUser(userCountry,username);
		
	}
}
