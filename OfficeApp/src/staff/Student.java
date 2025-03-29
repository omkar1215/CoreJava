package staff;

public class Student extends Person{
		private Course c;
		private String PRN;
		private int Age;
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Student(Course c, String pRN, int age){
			super();
			this.c = c;
			PRN = pRN;
			Age = age;
		}
		@Override
		public String toString() {
			return super.toString()+"[PRN=" + PRN + ", Age=" + Age + "]"+c.toString();
		}
		
		
		
		
		
		
}
