package customer;

public class RegisteredCustomer extends Customer {
	private int Regno;

	public RegisteredCustomer() {
		super();
	}

	public RegisteredCustomer(String name,String emailId,int contactno,int regno) {
		super(name,emailId,contactno);
		Regno = regno;
	}

	@Override
	public String toString() {
		return super.toString()+"RegisteredCustomer [Regno=" + Regno + "]";
	}

}
