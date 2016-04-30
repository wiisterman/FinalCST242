import controller.Controller;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Student;
import view.LogInView;
import view.MainView;

public class Demo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		MainView window = new MainView(stage);
		//LogInView window1 = new LogInView(stage);
		Student model = new Student();
		Controller controller = 
		new Controller(model, window);
	}

}
