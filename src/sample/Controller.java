package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.util.Date;
import java.util.Random;

public class Controller {

    @FXML // fx:id="hej"
    private Button hejKnap; // Value injected by FXMLLoader

    @FXML // fx:id="nu"
    private Button nuKnap; // Value injected by FXMLLoader

    @FXML // fx:id="terning"
    private Button terningKnap; // Value injected by FXMLLoader

    @FXML // fx:id="textArea1"
    private TextArea textArea1; // Value injected by FXMLLoader

    @FXML
    private Pane terningPane;

    @FXML
    private Label talLabel;


    @FXML
    void hej() {
        textArea1.appendText("Hej! \n");
    }

    @FXML
    void nu() {
        textArea1.setText("Nu er det " + new Date().toString());
    }

    @FXML
    void terning() {
        int terningeKast = new Random().nextInt(6) + 1;
        textArea1.setText("Terningen viser " + terningeKast + "\n");
    }

    @FXML
    void terningAvanceret() {
        terningPane.setVisible(true);
        int terningeKast = new Random().nextInt(6) + 1;
        talLabel.setText(terningeKast + "");
    }

}
