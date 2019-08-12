package toggleButton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.NodeOrientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author ANONYME
 */
public class ToggleButton1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Text Alignement");
        ToggleButton tgbnrt = new ToggleButton("", new ImageView(new Image(getClass().getResourceAsStream("/images/align-right.png"))));
        ToggleButton tgbnlt = new ToggleButton("", new ImageView(new Image(getClass().getResourceAsStream("/images/align-left.png"))));
        TextArea textArea = new TextArea();
        label.setTranslateX(30);
        label.setTranslateY(20);
        tgbnlt.setTranslateX(170);
        tgbnlt.setTranslateY(20);
        tgbnrt.setTranslateX(220);
        tgbnrt.setTranslateY(20);
        textArea.setTranslateX(20);
        textArea.setTranslateY(60);
        label.setFont(new Font("Arial", 18));
        textArea.setFont(new Font("Arial", 18));
        textArea.setWrapText(true);
        textArea.setPrefSize(360, 140);
        ToggleGroup toggleGroup = new ToggleGroup();
        tgbnlt.setToggleGroup(toggleGroup);
        tgbnrt.setToggleGroup(toggleGroup);
        toggleGroup.selectToggle(tgbnlt);
        Group root = new Group();
        root.getChildren().add(label);
        root.getChildren().add(tgbnlt);
        root.getChildren().add(tgbnrt);
        root.getChildren().add(textArea);
        Scene scene = new Scene(root, 400, 220);
        primaryStage.setTitle("Toggle Button Example !!");
        primaryStage.setScene(scene);
        primaryStage.show();

        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (toggleGroup.getSelectedToggle().equals(tgbnlt)) {
                textArea.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
            } else {
                textArea.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
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
