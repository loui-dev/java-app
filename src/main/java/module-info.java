module net.louiml.testappplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.louiml.testappplication to javafx.fxml;
    exports net.louiml.testappplication;
}