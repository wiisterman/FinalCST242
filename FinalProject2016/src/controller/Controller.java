package controller;

import java.util.ArrayList;

import model.Bag;
import model.Person;
import model.Student;

import view.MainView;
import view.SaveButtonEventObject;
import view.SaveButtonListener;

public class Controller
{
	Data data = new Data();
	public Controller(Student model, MainView window) {
	/*window.setSaveButton(new SaveButtonListener() {
		
		@Override
		public void saveButtonClicked(SaveButtonEventObject ev) {
			model.setName(ev.getName());
			model.setId(ev.getId());
			Student student = new Student(ev.getName(), ev.getId(), null, null, null, 0, null, null);
			data.getStudentList().add(student);
			data.saveArrayDataToBinaryFile(data);
			int id = Integer.parseInt(ev.getId());
			Person person = data.searchArray(id, data);
		    
		}
	});
	*/
}
}