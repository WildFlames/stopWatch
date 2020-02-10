package model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StopWatchModel extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Stopwatch");
		Parent root = FXMLLoader.load(getClass().getResource("/view/stopWatch.fxml"));
		Scene main = new Scene(root);
		primaryStage.setScene(main);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
