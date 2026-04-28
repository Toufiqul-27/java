package com.tigerit.registrationsystem;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IO;

public class RegistrationController {


    @FXML
    public TextField nameTextField ;

    @FXML
    public TextField emailTextField ;

    @FXML
    public PasswordField passwordField;

    @FXML
    public void saveButtonClickEvent (){
        IO.println("Save buttoon click");
        String name = nameTextField.getText();
        IO.println("name is = " + name);
        String email = emailTextField.getText();
        IO.println("email is = " + email);
        String pass = passwordField.getText();
        IO.println("not showing : " + pass);
    }

}
