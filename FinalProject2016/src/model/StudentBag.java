package model;

import java.util.ArrayList;

import project.Students;

public class StudentBag 
{

	ArrayList<Student> studentArr = new ArrayList<Student>();
	public StudentBag()
	{
		studentArr = new ArrayList<Student>();
	}
	
	public void add(Student o)
	{
		studentArr.add((Student) o);
	}
	
	public Student remove(Student o)
	  {
		Student i = (Student) o;
	    int index = studentArr.indexOf(i);
	    if (index == -1)
	      return null;
	    else
	      return studentArr.remove(studentArr.indexOf(i));
	  }
	public Student findByID(String id)
	{
		for(Student student: studentArr)
		{
			if(student.getUserId() == id)
				{
					return student;
				}
			
		}
	}
	
}
	
	

