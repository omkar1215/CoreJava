package Validation;

public class NameValidationException extends Exception {
	private String msg;
	public NameValidationException(){
		msg="Name is Invalid";
	}
	public String getMessage() {
		return "Error Occured: "+msg;
	}
	public String toString() {
		return "Error Occured: "+msg;
	}
	
}
