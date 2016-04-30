package view;

import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AdminView 
{

	private GridPane adminPane;
	private Label nameLbl;
	private TextField nameField;
	private Label gpaLbl;
	private TextField gpaField;
	private Label creditLbl;
	private TextField creditField;
	private Label majorLbl;
	private TextField majorField;
	
	private Button saveBtn;
	
	private Button exitBtn;
	private ArrayList<String> info;
	private SaveButtonListener saveButtonListener;
	
	public AdminView(Stage adminStage)
	{
		
		//r0
		
		adminPane = new GridPane();
		nameLbl = new Label("Name: ");
		nameField = new TextField();
		adminPane.add(nameLbl, 0, 0);
		adminPane.add(nameField, 1 ,0);
		
		//r1
		
		gpaLbl = new Label("gpa: ");
		gpaField = new TextField();
		adminPane.add(gpaLbl, 0, 1);
		adminPane.add(gpaField, 1, 1);
		
		//r2
		
		creditLbl = new Label("Credits: ");
		creditField = new TextField();
		adminPane.add(creditLbl, 0, 2);
		adminPane.add(creditField, 1 ,2);
		
		//r3
		
		majorLbl = new Label("Major ID: ");
		majorField = new TextField();
		adminPane.add(majorLbl, 0, 3);
		adminPane.add(majorField, 1, 3);
		
		//r4
		
		saveBtn = new Button("Save");
		adminPane.add(majorLbl, 0, 4);
		
		saveBtn.setOnAction(e -> {
			
			
		});
		adminStage.setScene(new Scene(adminPane, 600, 200));
		adminStage.show();
	}
	
}
