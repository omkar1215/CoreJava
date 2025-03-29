package customer;

public class Customer {
	private String name;
	private String emailId;
	private int contactno;
	public Customer() {
		super();
	}
	public Customer(String name, String emailId, int contactno) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailId=" + emailId + ", contactno=" + contactno + "]";
	}
	
	

}
