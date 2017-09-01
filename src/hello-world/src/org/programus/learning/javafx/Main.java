package org.programus.learning.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * refer: http://docs.oracle.com/javafx/2/get_started/hello_world.htm
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");

        KeyCombination closeKey = new KeyCodeCombination(KeyCode.W, KeyCombination.SHORTCUT_DOWN);
        if (System.getProperty("os.name").toLowerCase().indexOf("mac") >= 0) {
            primaryStage.addEventHandler(KeyEvent.KEY_RELEASED, (event) -> {
                if (closeKey.match(event)) {
                    primaryStage.close();
                }
            });
        }

        Button btn = new Button();
        btn.setText("Say 'hello world'");
        btn.setOnAction((event) -> {
            new Alert(Alert.AlertType.INFORMATION, "Hello world!").showAndWait();
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
