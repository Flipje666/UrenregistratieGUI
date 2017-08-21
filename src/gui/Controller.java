package gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.*;
import service.*;

import java.io.IOException;

public class Controller {
    private static UrenregistratieService service = new UrenregistratieService();
    private static IUrenregistratieService server = service.getBasicHttpBindingIUrenregistratieService();

    private Scene mainScene;
    private AppUser user;
    private String username;
    private String password;
    private Project userProject;

    @FXML
    private Label loginMessage;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;




    public void setMainScene(Scene scene) {
        mainScene = scene;
    }

    public void openMainScene() {
        Stage window = (Stage) loginMessage.getScene().getWindow();
        window.setScene(mainScene);
    }

    public void handleLogin() {
        if (!server.login(usernameField.getText(), passwordField.getText())) {
            loginMessage.setText("Gebruikersnaam of wachtwoord ongeldig!");
        }
        else {
            user = server.getUser(usernameField.getText(), passwordField.getText());

            try {
                Stage window = (Stage) loginMessage.getScene().getWindow();
                FXMLLoader mainLoader = new FXMLLoader(getClass().getResource("main.fxml"));
                Parent mainPane = mainLoader.load();
                Scene mainScene = new Scene(mainPane, 600, 400);
                window.setScene(mainScene);
                window.setTitle("Hoofdscherm");
                MainController mainController = mainLoader.getController();
                mainController.setUser(user);

            } catch (IOException e) {
                loginMessage.setText(e.getMessage());
            }
        }
    }

    public void handleRegister() {
        if (!server.register(usernameField.getText())) {
            loginMessage.setText("Deze gebruikersnaam bestaat al!");
        }
        else {
            String password = new StringBuffer(usernameField.getText()).reverse().toString();
            loginMessage.setText(String.format("Registratie voltood.\nUw gegenereerde wachtwoord is %s", password));
        }
    }
}
