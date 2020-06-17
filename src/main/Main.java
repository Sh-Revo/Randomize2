package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.awt.FlowLayout;
import java.awt.*;
import java.util.Random;

import static javafx.application.Application.launch;

public class Main extends Application implements Tools {
    public static void main(String[] args) throws Exception {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        saveVbox();
        setButton();
        setLabel();
        mainStage.setScene(scene);
        mainStage.setTitle("Рандомайзер");
        mainStage.sizeToScene();
        mainStage.show();
    }


    void saveVbox(){
        vBox.setSpacing(20);
        vBox.setAlignment(Pos.BASELINE_CENTER);
        vBox.getChildren().addAll(press,result);
    }
    void setButton(){
        press.setPrefSize(100, 70);
        press.setFont(Font.font(18));
        press.setOnAction(actionEvent -> result.setText(String.valueOf(1+(int)(Math.random()*12))));
    }
    void setLabel(){
        result.setFont(Font.font("Arial", FontWeight.BOLD, 50));
    }
}
