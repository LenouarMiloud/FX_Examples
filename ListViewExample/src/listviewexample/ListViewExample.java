package listviewexample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class ListViewExample extends Application {

    @Override
    public void start(Stage primaryStage) {Label totalSelected = new Label("Total selected: 0");
        Label selectedItems = new Label("Selected colors:");
        ListView<String> listView = new ListView<>();
 
        ObservableList<String> items = FXCollections.observableArrayList(
            "red", "blue", "green", "yellow", "orange", "brown", "pink", "purple", "gray", "black", "white"
        );
 
        listView.setItems(items);
 
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        listView.setPrefSize(120, 250);
        totalSelected.setPrefSize(250, 30);
        selectedItems.setPrefSize(250, 30);
 
        totalSelected.setTranslateX(150);
        totalSelected.setTranslateY(90);
        selectedItems.setTranslateX(150);
        selectedItems.setTranslateY(120);
        listView.setTranslateX(0);
        listView.setTranslateY(0);
 
        Group root = new Group();
 
        root.getChildren().add(totalSelected);
        root.getChildren().add(selectedItems);
        root.getChildren().add(listView);
 
        Scene scene = new Scene(root, 400, 250);
 
        primaryStage.setTitle("JavaFX ListView");
 
        primaryStage.setScene(scene);
 
        primaryStage.show();
        listView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            totalSelected.setText("Total selected:   " + listView.getSelectionModel().getSelectedItems().size());
            selectedItems.setText("Selected colors:  " + listView.getSelectionModel().getSelectedItems());
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
