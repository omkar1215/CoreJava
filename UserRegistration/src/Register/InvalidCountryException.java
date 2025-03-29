package Register;

public class InvalidCountryException extends Exception{
	private String msg;
	public InvalidCountryException(){
		msg="User out side india can not be Registered";
	}
	public String getMessage() {
		return "Error Occured: "+msg;
	}
	public String toString() {
		return "Error Occured: "+msg;
	}
	
}
