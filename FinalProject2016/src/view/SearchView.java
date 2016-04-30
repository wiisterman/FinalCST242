package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SearchView 
{
	
	private GridPane searchPane;
	private Label idSearhLbl;
	private TextField idSearhField;
	private Label nameSearchLbl;
	private PasswordField nameSearchField;
	private Button adminSearchBtn;
	private String studentName;
	private String studentID;
	
	public SearchView(Stage searchStage) 
	{
		searchPane = new GridPane();
		idSearhLbl = new Label("Search By ID: ");
		idSearhField = new TextField();
		searchPane.add(idSearhLbl, 0, 0);
		searchPane.add(idSearhField, 1 ,0);
		nameSearchLbl = new Label("Search By Name: ");
		nameSearchField = new PasswordField();
		searchPane.add(nameSearchLbl, 0, 1);
		searchPane.add(nameSearchField, 1, 1);
		adminSearchBtn = new Button("Search");
		searchPane.add(adminSearchBtn, 0, 2);

		adminSearchBtn.setOnAction(e -> {
			studentID = idSearhField.getText();
			studentName = nameSearchField.getText();
			
		});
		
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
}
