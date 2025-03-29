import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Password");
			String pwd=sc.next();
			if(pwd.length()<8){
				throw new PasswordTooShortException();
			}else if(pwd.length()>12){
				throw new PasswordTooLongException();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	} 
}
