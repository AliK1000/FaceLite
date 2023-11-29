package com.example.facelite;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.text.Text;
import javafx.scene.image.ImageView;


public class Controller {

    @FXML TextField nameTextField;
    @FXML TextField changeStatusTextField;
    @FXML TextField changePictureTextField;
    @FXML TextField addFriendTextField;
    @FXML Label systemMassage;
    @FXML ImageView imageViewer;
    Image image;

    public void add (ActionEvent e) {
        String name = nameTextField.getText();

    }

    public void delete (ActionEvent e) {
        String name = nameTextField.getText();

    }

    public void lookup (ActionEvent e) {
        String name = nameTextField.getText();

    }

    public void changeStatus (ActionEvent e) {
        String status = changeStatusTextField.getText();

    }

    public void changePicture (ActionEvent e) {
        String picturePath = changePictureTextField.getText();
        image = new Image(getClass().getResourceAsStream(picturePath));
        imageViewer.setImage(image);
    }

    public void addFriend (ActionEvent e) {
        String friendName = addFriendTextField.getText();

    }

}
