package separatorexample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class SeparatorExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Separator separator = new Separator(Orientation.VERTICAL);
        separator.setTranslateX(250);
        separator.setTranslateY(50);
        separator.setPrefHeight(200);
        
        Group root = new Group();
        root.getChildren().add(separator);
        
        Scene scene = new Scene(root, 500, 350);
        scene.getStylesheets().add("css/style.css");
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
