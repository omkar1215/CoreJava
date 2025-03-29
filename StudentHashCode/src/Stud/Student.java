package Stud;

public class Student {
	private int studentid;
	private String name;
	private String city;
	private float percentage;
	public Student() {
		super();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		if(obj instanceof Student){
			Student c=(Student)obj;
			if(this.studentid==c.studentid && this.name.equals(name) && this.city.equals(city)) {
				flag=true;
			}
		}
		return flag;
	}



	@Override
	public int hashCode() {
		int code=0;
		if(city.equals("Pune")){
			code=10;
		}else if(city.equals("Ahmednagar")) {
			code=11;
		}else if(city.equals("Banglore")){
			code=12;
		}else if(city.equals("Hydrabad")){
			code=13;
		}else if(city.equals("Mumbai")){
			code=14;
		}
		return code;
	}

	public Student(int studentid, String name, String city, float percentage) {
		
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + ", percentage=" + percentage
				+ "]";
	}
	
	
	
}
