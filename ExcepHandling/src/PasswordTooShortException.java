
public class PasswordTooShortException extends Exception {
	private String msg;
	public PasswordTooShortException() {
		msg="Password Too Short Exception";
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Error Occured"+msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Error Occured"+msg;
	}
	
}
