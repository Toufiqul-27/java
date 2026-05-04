package com.tigerit.registrationsystem;

import javafx.fxml.FXML;
import javafx.scene.control.*;

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
            emailError.setText("Error");
             return;
        }

        for(User user : HelloApplication.userList){
            if(user.getEmail().equals(email) && user.getPassword().equals(pass)){
                HelloApplication.loggedUser = user;
                HelloApplication.changeScene("dashboard");
                return;
            }
        }
       Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Wrong email password");
        alert.show();

    }


    @FXML
    public void  registerLabelClick(){
        IO.println("reg");
        HelloApplication.changeScene("registration");
    }
}
