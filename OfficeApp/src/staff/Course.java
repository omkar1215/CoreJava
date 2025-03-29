package staff;

import java.io.Serializable;

public class Course implements Serializable{
	int courseid;
	String coursename;
	double fees;
	
	public Course() {
		
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Course(int courseid, String coursename, double fees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.fees = fees;
	}

	public String toString() {
		return "CourseID:"+courseid+" Name: "+coursename+" Fees: "+fees;
	}
	
}
