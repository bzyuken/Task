package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class TestTask extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        TextField textField = new TextField();
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        Button btn = new Button("output");
        btn.setOnAction(event -> {
            if ((textField1.getText().length() != 0 && textField2.getText().length() != 0 && textField3.getText().length() != 0)
                    && (!textField1.getText().matches("\\d*") && !textField2.getText().matches("\\d*") && !textField3.getText().matches("\\d*"))) {
                textField.setText(textField1.getText() + textField2.getText() + textField3.getText());
            }
        });
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, textField1, textField2, textField3, btn, textField);
        Scene scene = new Scene(root, 800, 400);

        stage.setScene(scene);
        stage.setTitle("TestTask");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
