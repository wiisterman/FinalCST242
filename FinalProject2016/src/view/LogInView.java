package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogInView 
{

	private GridPane logInPane;
	private TextField usernameField;
	private Label usernameLbl;
	private PasswordField passwordField;
	private Label passwordLbl;
	private Button logInBtn;
	private int lock;
	private boolean access = false;
	private TextArea status;
	
	public LogInView(Stage logInStage) 
	{
		logInPane = new GridPane();
		usernameLbl = new Label("UserName: ");
		usernameField = new TextField();
		logInPane.add(usernameLbl, 0, 0);
		logInPane.add(usernameField, 1 ,0);
		passwordLbl = new Label("Password: ");
		passwordField = new PasswordField();
		logInPane.add(passwordLbl, 0, 1);
		logInPane.add(passwordField, 1, 1);
		logInBtn = new Button("Log In");
		status = new TextArea();
		logInPane.add(logInBtn, 0, 2);
		logInPane.add(status, 0, 3);
		logInBtn.setOnAction(e -> {
			String name = usernameField.getText();
			String pass = passwordField.getText();
		
			if(pass.equals("me") && name.equals("kyle"))
			{
				access = true;
				status.clear();
			}
			else
			{
				status.setText("Try Again");
			}
				
			
		});
		
		logInStage.setScene(new Scene(logInPane, 600, 200));
		logInStage.show();
		
	}
}
