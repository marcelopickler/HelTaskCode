package task.main;

import javafx.application.Application;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

	public static void main(String[] args) throws SQLException {
		launch(args);

	}
	public void start(Stage arg0) throws Exception{


		new ControllerSaved().menuTask();
	}

}
