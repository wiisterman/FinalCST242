package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import model.Student;



public class Data implements Serializable 
{

	private ArrayList<Student> studentList;

	public Data()
	{
		this.studentList =studentList;
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	public void loadBinaryDataToArrays(Data data)
	{
		FileInputStream fileIn = null;
		ObjectInputStream input = null;
		
		try
		{
			fileIn = new FileInputStream("Sain.dat");
			input = new ObjectInputStream(fileIn);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;
		}
		try
		{
			data.setStudentList((ArrayList<model.Student>) input.readObject());
			input.close();
		}
		catch(IOException | ClassNotFoundException j)
		{
			
			/*Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("");
			alert.setContent();
			*/
			j.printStackTrace();
			return;
		}
	}

	public void saveArrayDataToBinaryFile(Data data)
	{
		
		FileOutputStream fileOut = null;
		ObjectOutputStream output = null;
		
		try
		{
			fileOut = new FileOutputStream("Sain.dat");
			output = new ObjectOutputStream(fileOut);
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;
		}
		try
		{
			output.writeObject(data.getStudentList());
		
			output.close();
		}
		catch(IOException j)
		{
			j.printStackTrace();
			return;
		}
		
	}
	
	public model.Person searchArray(int id, Data data)
	{
		for(Student student: data.getStudentList())
		{
			if(student.getId().equals(id))
				{
					return student;
				}
			
		}
			
		
		return null;
	}
	
}
