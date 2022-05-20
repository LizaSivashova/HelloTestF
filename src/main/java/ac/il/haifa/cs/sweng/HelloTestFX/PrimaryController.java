package ac.il.haifa.cs.sweng.HelloTestFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    @FXML
    private Button button;

    @FXML
    void sayHello(ActionEvent event) {

        textField.setText("Hello World");
    }

    @FXML
    void initialize() {
    }
}
