/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progressindicatorexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class ProgressIndicatorExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label_1 = new Label("User");
        Label label_2 = new Label("Password");
        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();
        Button button = new Button("Login");
        ProgressIndicator progressIndicator = new ProgressIndicator(-1);
        label_1.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        label_2.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        button.setStyle("-fx-font-weight: bold; -fx-font-size: 16px;");
        progressIndicator.setVisible(false);
        label_1.setTranslateX(80);
        label_1.setTranslateY(40);
        textField.setTranslateX(165);
        textField.setTranslateY(40);
        label_2.setTranslateX(80);
        label_2.setTranslateY(85);
        passwordField.setTranslateX(165);
        passwordField.setTranslateY(85);
        button.setTranslateX(80);
        button.setTranslateY(130);
        progressIndicator.setTranslateX(100);
        progressIndicator.setTranslateY(190);
        label_1.setPrefSize(80, 30);
        textField.setPrefSize(160, 30);
        label_2.setPrefSize(80, 30);
        passwordField.setPrefSize(160, 30);
        button.setPrefSize(245, 35);
        progressIndicator.setPrefWidth(200);
        Group root = new Group();
        root.getChildren().add(label_1);
        root.getChildren().add(textField);
        root.getChildren().add(label_2);
        root.getChildren().add(passwordField);
        root.getChildren().add(button);
        root.getChildren().add(progressIndicator);
        Scene scene = new Scene(root, 400, 250);
        primaryStage.setTitle("JavaFX ProgressIndicator");
        primaryStage.setScene(scene);
        primaryStage.show();

        progressIndicator.progressProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue.doubleValue() >= 1.0) {
                Text doneText = (Text) progressIndicator.lookup(".percentage");
                doneText.setText("Login Succefully");
            }
        });

        button.setOnAction((ActionEvent e) -> {
            if (textField.getText().equals("") || passwordField.getText().equals("")) {
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("Missing Information");
                alert.setHeaderText("Missing Information");
                alert.setContentText("User name & password are required!");
                alert.show();
            } else {
                progressIndicator.setVisible(true);
                LoginTask task = new LoginTask();
                progressIndicator.progressProperty().bind(task.progressProperty());
                new Thread(task).start();
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
