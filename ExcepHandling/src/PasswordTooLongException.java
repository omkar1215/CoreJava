
public class PasswordTooLongException extends Exception{
	private String msg;
	public PasswordTooLongException(){
		msg="Password too long Exception";
	}
	public String getMessage() {
		return "Error Occured"+msg;
	}
	public String toString() {
		return "Error Occured"+msg;
	}
	
	
}
