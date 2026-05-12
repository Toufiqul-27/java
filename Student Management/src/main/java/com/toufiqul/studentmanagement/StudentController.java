package com.toufiqul.studentmanagement;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    @FXML
    public TextField IdTExtField;

    @FXML
    public Button button;

    @FXML
    public TableColumn<StudentTable, Number> cgpaColum;

    @FXML
    public TextField cgpaTextfield;

    @FXML
    public TableColumn<StudentTable, Number> idColum;

    @FXML
    public TableColumn<StudentTable, String> nameColum;

    @FXML
    public TextField nameTextField;
    @FXML
    public TableView<StudentTable> studentTable;

    @FXML
    void saveButtonClick(ActionEvent event) {
        int id = Integer.parseInt(IdTExtField.getText());
        String name = nameTextField.getText();
        double cgpa = Double.parseDouble(cgpaTextfield.getText());

        IO.println("");

        StudentTable studentTable = new StudentTable(id,name,cgpa);
        observableList.add(studentTable);


    }
    ObservableList<StudentTable>observableList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idColum.setCellValueFactory(cell -> new SimpleIntegerProperty(cell.getValue().getId()));
        nameColum.setCellValueFactory(cell -> new SimpleStringProperty(cell.getValue().getName()));
        cgpaColum.setCellValueFactory(cell -> new SimpleDoubleProperty(cell.getValue().getCgpa()));

        observableList = FXCollections.observableArrayList();
        studentTable.setItems(observableList);

    }
}
