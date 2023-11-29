package com.example.facelite;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FaceLite extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FaceLite-view.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("FaceLite");
        stage.show();
    }
}