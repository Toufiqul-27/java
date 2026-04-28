module bd.edu.seu.loginform {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.loginform to javafx.fxml;
    exports bd.edu.seu.loginform;
}