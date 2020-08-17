package appLog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;

public class Main extends Application {

	public Font cascadia;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("AppLog.fxml"));
			Scene scene = new Scene(root);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Application Logger");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// start

	public static void main(String[] args) {
		launch(args);
	}// main

}/// class Main
