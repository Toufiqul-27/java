package com.tigerit.registrationsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IO;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
   public Label welcome;

    @FXML
    public Button button;



    @FXML
    public void logoutButtonClicked(){
        HelloApplication.loggedUser = null;
        HelloApplication.changeScene("login");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        IO.println("I am from Dashboard");
        welcome.setText(HelloApplication.loggedUser.getName());
    }
}
