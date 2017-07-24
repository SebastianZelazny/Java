package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		try {
			Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/View/MainPane.fxml"));
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Start Page");
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public Main() {
		System.out.println("Konstruktor"); }
		//cia³o aplikacji
	
		@Override
	public void init() throws Exception {
		System.out.println("Init"); }
		@Override
	public void stop() throws Exception {
		System.out.println("Stop"); }
}
