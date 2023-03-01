package com.themaestrocode.createaccount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    Label welcomeLabel;

    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    public void welcomeMessage(String name, String username) {

        welcomeLabel.setText("Welcome, " + name + " (@" + username + ")! " + "Your account has been successfully created.");

    }

}
