package com.tigerit.registrationsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IO;

public class LoingController {
    @FXML
    public TextField emailTextFIeld;

    @FXML
    public PasswordField passwordField;
    @FXML
    public Button button;
    @FXML
    public Label emailError;

    @FXML
    public void loginButtonClick(){
        String email = emailTextFIeld.getText();
        String pass = passwordField.getText();
        if(email.isEmpty()){
            emailError.setText("gffgfgfg");
             return;
        }

    }


    @FXML
    public void  registerLabelClick(){
        IO.println("reg");
        HelloApplication.changeScene("registration");
    }
}
