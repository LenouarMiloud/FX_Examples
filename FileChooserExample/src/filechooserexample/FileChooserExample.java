package filechooserexample;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class FileChooserExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        FileChooser fileChooser = new FileChooser();
        
        fileChooser.setTitle("Open File");
        
        fileChooser.getExtensionFilters().addAll(
        new ExtensionFilter("Text Files", "*.txt"),
        new ExtensionFilter("Java Files", "*.java"),
        new ExtensionFilter("Web Files", "*.html", "*.css", "*.js", "*.php"),
        new ExtensionFilter("All Files", "*.*")
        );
        File selectedFile = fileChooser.showOpenDialog(primaryStage);
        
        if( selectedFile != null )
        {
            
        }
        
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
