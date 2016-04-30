package view;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainView 
{

	private GridPane gridPane;
	private HBox infoBox;
	private VBox courseBox;
	private HBox requireBox;
	
	private TextArea infoArea;
	private TextArea courseArea;
	private TextArea requireArea;
	String info;
	String courseInfo;
	String requireInfo;
	
	
	public MainView(Stage stage) {
		gridPane = new GridPane();
		infoBox = new HBox();
		courseBox = new VBox();
		requireBox = new HBox();
		
		infoArea = new TextArea();
		infoArea.setText(info);
		courseArea = new TextArea();
		courseArea.setText(courseInfo);
		requireArea = new TextArea();
		requireArea.setText(requireInfo);
		
		infoBox.getChildren().add(infoArea);
		courseBox.getChildren().add(courseArea);
		requireBox.getChildren().add(requireArea);
		
		gridPane.add(infoBox, 0, 0);
		gridPane.add(courseBox, 0, 1);
		gridPane.add(requireBox, 0, 2);
		
		
		stage.setScene(new Scene(gridPane, 600, 600));
		stage.show();
		
		
}


	public String getInfo() {
		return info;
	}


	public String getCourseInfo() {
		return courseInfo;
	}


	public String getRequireInfo() {
		return requireInfo;
	}


	public void setInfo(String info) {
		this.info = info;
	}


	public void setCourseInfo(String courseInfo) {
		this.courseInfo = courseInfo;
	}


	public void setRequireInfo(String requireInfo) {
		this.requireInfo = requireInfo;
	}
	
	}


/*
 * 
		saveBtn.setOnAction(e -> {
			String name = nameField.getText();
			String id = idField.getText();
			SaveButtonEventObject ev = 
					new SaveButtonEventObject(this, name, id);
			if (saveButtonListener != null) {
				saveButtonListener.saveButtonClicked(ev);
			}
		});
		
		public void setSaveButton(SaveButtonListener saveButtonListener1){
		this.saveButtonListener = saveButtonListener;
		
		
		
 */

