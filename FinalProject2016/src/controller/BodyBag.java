package controller;

import model.Student;

public interface BodyBag 
{

	
	public void add(Student s);
	
	public Student findByID(int id);
	
	public Student removeByID(int id);
}
