package com.tigerit.registrationsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {

    public static List<User> userList = new ArrayList<>();
    public static User loggedUser;

    public static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage= stage ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("registration.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void changeScene(String name){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(name +".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setScene(scene);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
