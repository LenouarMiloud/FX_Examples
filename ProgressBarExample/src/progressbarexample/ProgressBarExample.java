package progressbarexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class ProgressBarExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label label1 = new Label("Password");
        Label label2 = new Label("Strenght");
        PasswordField passwordField = new PasswordField();
        ProgressBar progressBar = new ProgressBar(0f);
        progressBar.setStyle("-fx-text-box-border: transparent;");
        label1.setPrefSize(60, 30);
        label2.setPrefSize(60, 30);
        passwordField.setPrefSize(200, 30);
        progressBar.setPrefSize(200, 10);
        
        label1.setTranslateX(60);
        label1.setTranslateY(90);
        label2.setTranslateX(60);
        label2.setTranslateY(135);
        passwordField.setTranslateX(120);
        passwordField.setTranslateY(90);
        progressBar.setTranslateX(120);
        progressBar.setTranslateY(142);
        
        Group root = new Group();
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        root.getChildren().add(passwordField);
        root.getChildren().add(progressBar);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("Progress FX Example !!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        passwordField.setOnKeyReleased((KeyEvent event) -> {
           
            double passLenght = passwordField.getText().length();
            progressBar.setProgress(passLenght/10);
            if(passLenght < 5)
                progressBar.setStyle("-fx-accent: red; -fx-text-box-border: transparent;");
            else if(passLenght >= 5 && passLenght < 8)
                progressBar.setStyle("-fx-accent: yellow; -fx-text-box-border: transparent;");
            else if(passLenght > 8)
                progressBar.setStyle("-fx-accent: green; -fx-text-box-border: transparent;");
        });
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
