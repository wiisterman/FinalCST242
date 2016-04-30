package model;

public class Major 
{


	private String title;
	private String id;
	private Course[] majorCourses;
	private Course[] engCourses;
	private Course[] sciCourses;
	private Course[] matCourses;
	private Course[] sscCourses;			
	private Course[] humCourses;		
			
	public Major(String title, String id, Course[] majorCourses, Course[] engCourses, Course[] sciCourses,
			Course[] matCourses, Course[] sscCourses, Course[] humCourses) {
		super();
		this.title = title;
		this.id = id;
		this.majorCourses = majorCourses;
		this.engCourses = engCourses;
		this.sciCourses = sciCourses;
		this.matCourses = matCourses;
		this.sscCourses = sscCourses;
		this.humCourses = humCourses;
	}

	public String getTitle() {
		return title;
	}

	public String getId() {
		return id;
	}

	public Course[] getMajorCourses() {
		return majorCourses;
	}

	public Course[] getEngCourses() {
		return engCourses;
	}

	public Course[] getSciCourses() {
		return sciCourses;
	}

	public Course[] getMatCourses() {
		return matCourses;
	}

	public Course[] getSscCourses() {
		return sscCourses;
	}

	public Course[] getHumCourses() {
		return humCourses;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMajorCourses(Course[] majorCourses) {
		this.majorCourses = majorCourses;
	}

	public void setEngCourses(Course[] engCourses) {
		this.engCourses = engCourses;
	}

	public void setSciCourses(Course[] sciCourses) {
		this.sciCourses = sciCourses;
	}

	public void setMatCourses(Course[] matCourses) {
		this.matCourses = matCourses;
	}

	public void setSscCourses(Course[] sscCourses) {
		this.sscCourses = sscCourses;
	}

	public void setHumCourses(Course[] humCourses) {
		this.humCourses = humCourses;
	}

	@Override
	public String toString() {
		return "Major [title=" + title + ", id=" + id + ", majorCourses=" + majorCourses + ", engCourses=" + engCourses
				+ ", sciCourses=" + sciCourses + ", matCourses=" + matCourses + ", sscCourses=" + sscCourses
				+ ", humCourses=" + humCourses + "]";
	}		
	
	
	
	
	
}
