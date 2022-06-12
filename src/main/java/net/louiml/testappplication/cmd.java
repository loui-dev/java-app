package net.louiml.testappplication;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class cmd extends Application {
    @Override
    public void start(Stage stage) {
        System.out.print(45 + 24);
        System.out.println(" by loui");
        Text cmdtext = new Text("command:");
        TextField textField = new TextField();
        Button cmdsendbtn = new Button("send!");
        GridPane app = new GridPane();
        app.setMinSize(700, 400);
        app.setPadding(new Insets(10, 10, 10, 10));
        app.setVgap(5);
        app.setHgap(5);
        app.setAlignment(Pos.CENTER);
        app.add(cmdtext, 0, 65);
        app.add(textField, 2, 65);
        app.add(cmdsendbtn, 4, 65);
        cmdtext.setStyle("-fx-fill: green; -fx-font-size: 20px;");
        cmdsendbtn.setStyle("-fx-background-color: #3f8630; -fx-text-fill: #ffffff;");
        app.setStyle("-fx-background-color: #000000;");
        Scene scene = new Scene(app);
        stage.setTitle("louiml.net - CMD");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
