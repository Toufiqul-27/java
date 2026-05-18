module com.toufiqul.studentmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.toufiqul.studentmanagement to javafx.fxml;
    exports com.toufiqul.studentmanagement;
}