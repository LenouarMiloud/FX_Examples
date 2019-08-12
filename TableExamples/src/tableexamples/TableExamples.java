/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableexamples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class TableExamples extends Application {

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn firstname = new TableColumn("Name");
        TableColumn lastname = new TableColumn("Price $");
        TableColumn email = new TableColumn("Quantity");

        tableView.getColumns().addAll(firstname, lastname, email);

        tableView.setPrefSize(440, 300);

        firstname.setPrefWidth(120);
        lastname.setPrefWidth(120);
        email.setPrefWidth(220);

        tableView.setTranslateX(10);
        tableView.setTranslateY(10);

        Group root = new Group();
        root.getChildren().addAll(tableView);

        Scene scene = new Scene(root, 460, 320);

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
