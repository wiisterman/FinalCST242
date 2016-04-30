package model;

import java.util.ArrayList;

public class Student 
{
	private String name;
	private String userId;
	private String password;
	private Address address;
	private String majorID;
	private double gpa;
	
	private Course[] coursesTakenMajor;
	private Course[] coursesTakenOther;
	private Course[] coursesTakenFailed;
	private Course[] coursesTaking;
	private Course[] coursesNeeded;
	
	
	
	public Student(String name, String userId, String password, Address address, String majorID, double gpa,
			Course[] coursesTakenMajor, Course[] coursesTakenOther, Course[] coursesTakenFailed, Course[] coursesTaking,
			Course[] coursesNeeded) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.address = address;
		this.majorID = majorID;
		this.gpa = gpa;
		this.coursesTakenMajor = coursesTakenMajor;
		this.coursesTakenOther = coursesTakenOther;
		this.coursesTakenFailed = coursesTakenFailed;
		this.coursesTaking = coursesTaking;
		this.coursesNeeded = coursesNeeded;
	}
	public String getName() {
		return name;
	}
	public String getUserId() {
		return userId;
	}
	public String getPassword() {
		return password;
	}
	public Address getAddress() {
		return address;
	}
	public String getMajorID() {
		return majorID;
	}
	public double getGpa() {
		return gpa;
	}
	public Course[] getCoursesTakenMajor() {
		return coursesTakenMajor;
	}
	public Course[] getCoursesTakenOther() {
		return coursesTakenOther;
	}
	public Course[] getCoursesTakenFailed() {
		return coursesTakenFailed;
	}
	public Course[] getCoursesTaking() {
		return coursesTaking;
	}
	public Course[] getCoursesNeeded() {
		return coursesNeeded;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setMajorID(String majorID) {
		this.majorID = majorID;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public void setCoursesTakenMajor(Course[] coursesTakenMajor) {
		this.coursesTakenMajor = coursesTakenMajor;
	}
	public void setCoursesTakenOther(Course[] coursesTakenOther) {
		this.coursesTakenOther = coursesTakenOther;
	}
	public void setCoursesTakenFailed(Course[] coursesTakenFailed) {
		this.coursesTakenFailed = coursesTakenFailed;
	}
	public void setCoursesTaking(Course[] coursesTaking) {
		this.coursesTaking = coursesTaking;
	}
	public void setCoursesNeeded(Course[] coursesNeeded) {
		this.coursesNeeded = coursesNeeded;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", userId=" + userId + ", password=" + password + ", address=" + address
				+ ", majorID=" + majorID + ", gpa=" + gpa + ", coursesTakenMajor=" + coursesTakenMajor
				+ ", coursesTakenOther=" + coursesTakenOther + ", coursesTakenFailed=" + coursesTakenFailed
				+ ", coursesTaking=" + coursesTaking + ", coursesNeeded=" + coursesNeeded + "]";
	}
	
}
