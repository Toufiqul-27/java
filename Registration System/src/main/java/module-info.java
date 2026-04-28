module com.tigerit.registrationsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tigerit.registrationsystem to javafx.fxml;
    exports com.tigerit.registrationsystem;
}