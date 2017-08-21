package gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import service.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    private static UrenregistratieService service = new UrenregistratieService();
    private static IUrenregistratieService server = service.getBasicHttpBindingIUrenregistratieService();

    private ObservableList<String> defaultTasks = FXCollections.observableArrayList("Programmeren", "Ontwerpen", "Adviseren", "Deskundigheid", "Overig");
    private AppUser user;


    @FXML
    private Label mainProjectLabel;
    @FXML
    private Label mainMessageLabel;
    @FXML
    private TextField taskField;
    @FXML
    private TextField hourField;
    @FXML
    private ListView taskList;
    @FXML
    private ListView hourList;




    void setUser(AppUser u) {
        user = u;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        taskList.setItems(defaultTasks);
    }

    public void handleOnMouseEnterMain() {
        mainProjectLabel.setText(user.getProject().getValue().getProjectName().getValue());
        mainMessageLabel.setText("Voer uw gewerkte uren in vorm van een geheel getal in.");
        RefillHourList();
    }

    public void handleOnSaveClick() {
        try {
            if (!(hourField.getText().isEmpty() && taskField.getText().isEmpty())) {
                int hours = Integer.parseInt(hourField.getText());
                server.saveHours(taskField.getText(),hours,user);
                mainMessageLabel.setText("Uren toegevoegd!");
                RefillHourList();
            } else {
                mainMessageLabel.setText("Vul aub alle velden in!");
            }
        } catch (NumberFormatException e) {
            mainMessageLabel.setText("Voer een heel getal in voor uren!");
        }



    }

    public void handleOnEditClick() {
        try {
            if (!(hourField.getText().isEmpty() && taskField.getText().isEmpty())) {
                int hours = Integer.parseInt(hourField.getText());
                server.editHours(taskField.getText(),hours,user);
                mainMessageLabel.setText("Uren gewijzigd!");
                RefillHourList();
            } else {
                mainMessageLabel.setText("Vul aub alle velden in!");
            }
        } catch (NumberFormatException e) {
            mainMessageLabel.setText("Voer een heel getal in voor uren!");
        }
    }

    public void handleOnDeleteClick() {
        if (!taskField.getText().isEmpty()) {
            server.deleteHours(taskField.getText(),user);
            mainMessageLabel.setText("Uren verwijderd!");
            RefillHourList();
        } else {
            mainMessageLabel.setText("Kies een taak om uren te verwijderen!");
        }
    }

    public void handleTaskSelect() {
        taskField.setText((String) taskList.getSelectionModel().getSelectedItem());
        hourField.setText("");
    }

    public void handleHourSelect() {
        String[] content = hourList.getSelectionModel().getSelectedItem().toString().split(" - ");
        taskField.setText(content[0]);
        hourField.setText(content[1]);
    }

    public void handleWipeTaskField() {
        taskField.setText("");
    }

    public void handleWipeHourField() {
        hourField.setText("");
    }

    private void RefillHourList() {
        List<Task> userTasks = server.getUserTasks(user).getTask();
        ArrayList<String> tasks = new ArrayList<String>();

        for (Task task : userTasks) { tasks.add(String.format("%s - %d",task.getName().getValue(),task.getHours())); }

        ObservableList<String> boxTasks = FXCollections.observableArrayList(tasks);
        hourList.setItems(boxTasks);
    }
}
