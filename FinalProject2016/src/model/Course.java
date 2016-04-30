package model;

public class Course 
{

	private String courseNum;
	private String courseTitle;
	private double credits;
	private String grade;
	
	public Course(String courseNum, String courseTitle, double credits, String grade) {
		super();
		this.courseNum = courseNum;
		this.courseTitle = courseTitle;
		this.credits = credits;
		this.grade = grade;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public double getCredits() {
		return credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Course [courseNum=" + courseNum + ", courseTitle=" + courseTitle + ", credits=" + credits + ", grade="
				+ grade + "]";
	}
	
	
	
	
	
	
}
