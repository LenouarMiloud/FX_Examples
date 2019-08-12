/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicetooletip;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class NiceTooleTip extends Application {

    @Override
    public void start(Stage primaryStage) {

        Tooltip tooltip = new Tooltip("The password must at least 8 characters ");
        tooltip.setStyle("-fx-text-fill: white;"
                + "-fx-background-color: #52F2CA;"
                + "-fx-opacity: 0.8;"
                + "-fx-font-size: 12px;"
                + "-fx-font-weight: bold;");
        PasswordField passwordField = new PasswordField();
        passwordField.setTooltip(tooltip);
        passwordField.setTranslateX(100);
        passwordField.setTranslateY(110);
        passwordField.setPrefWidth(200);
        Group root = new Group();
        root.getChildren().add(passwordField);
        Scene scene = new Scene(root, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tool Tip Examples !!");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
