package net.louiml.testappplication;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        String name = "loui";
        System.out.print(45 + 24);
        System.out.println(" by loui");
        Text text = new Text("Username");
        Text text1 = new Text("Email");
        Text text2 = new Text("Password");
        Text crdit = new Text("כל הזכויות שמורות ל-louiml.net");
        TextField textField = new TextField();
        TextField textField1 = new TextField();
        PasswordField textField2 = new PasswordField();
        Button button1 = new Button("Submit");
        Button button2 = new Button("X");
        Button boxlock = new Button("⬜");
        Button button3 = new Button("by louiml.net");
        GridPane app = new GridPane();
        app.setMinSize(400, 200);
        app.setPadding(new Insets(10, 10, 10, 10));
        app.setVgap(5);
        app.setHgap(5);
        app.setAlignment(Pos.CENTER);
        app.add(text, 0, 0);
        app.add(textField, 1, 0);
        app.add(text1, 0, 1);
        app.add(textField1, 1, 1);
        app.add(text2, 0, 2);
        app.add(textField2, 1, 2);
        app.add(button1, 0, 3);
        app.add(button2, 10, 0);
        app.add(boxlock, 8, 0);
        app.add(button3, 4, 45);
        app.add(crdit, 2, 45);
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        boxlock.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: white; -fx-text-fill: black;");
        text.setStyle("-fx-font: normal bold 20px 'serif'");
        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        crdit.setStyle("-fx-font: normal bold 20px 'serif'");
        app.setStyle("-fx-background-color: GREY;");
        button2.setOnMouseClicked(
                e -> {
                    System.out.println("Exit Successful");
                    System.exit(1);
                    setUserAgentStylesheet("https://louiml.net");
                });
        boxlock.setOnMouseClicked(
                e -> {
                    System.out.println("Exit Successful");
                });
        button1.setOnMouseClicked(
                e -> {
                    System.out.println("username " + name);
                    button1.setText("Error");
                    button1.setStyle("-fx-background-color: rgb(229,21,21);");
                }
        );
        Scene scene = new Scene(app);
        stage.setTitle("מה אני עושה עם החיים שלי?");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
