package hi.verkefni.vidmot;

import hi.verkefni.vinnsla.Pipemania;
import hi.verkefni.vinnsla.Pipa;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PipeManiaController {

    @FXML
    private Label stigLabel;
    private Pipemania mania;
    @FXML
    private Button button;

    // onAction="#fxVeljaReit
    @FXML
    public void fxVeljaReit() {
        System.out.println("Velja reit");
        // mania.setNumberOfPipes(mania.numberOfPipes + 1);
    }

    // onAction="#fxAthFlaedir"
    public void fxAthFlaedir() {
        System.out.println("Athuga flæði");
    }

    public void initialize() {
        System.out.println("Initialize");
        this.mania = new Pipemania(4);
        stigLabel.textProperty().bind(mania.stigProperty().asString());

        // stigLabel.setText(mania.getNumberOfPipes());

    }
}