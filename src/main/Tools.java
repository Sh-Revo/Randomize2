package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public interface Tools {

    VBox vBox = new VBox();
    Button press = new Button("Press");

    Label result = new Label();
    Stage mainStage = new Stage();
    Scene scene = new Scene(vBox, 250, 200);

}
