package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Stage window = primaryStage;
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("login.fxml"));
        Parent loginPane = loginLoader.load();
        Scene loginScene = new Scene(loginPane, 520, 220);



        window.setTitle("Inlogscherm");
        window.setScene(loginScene);
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
