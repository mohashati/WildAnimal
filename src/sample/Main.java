package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.security.SecureRandom;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Views/sample.fxml"));
        primaryStage.setTitle("Wild Animals");
        primaryStage.setScene(new Scene(root, 735, 590));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
