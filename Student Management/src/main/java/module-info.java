module com.toufiqul.studentmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.toufiqul.studentmanagement to javafx.fxml;
    exports com.toufiqul.studentmanagement;
}