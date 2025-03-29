package demo;

public class Customer {
	String name;
	int id;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean flag=false;
		if(o instanceof Customer) {
			Customer c=(Customer) o;
			if(this.name==c.name && this.id==c.id)
				flag=true;
		}
		return flag;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
