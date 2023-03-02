package com.themaestrocode.createaccount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSceneController {

    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    Button createAccBtn;
    @FXML
    Button logInBtn;



    public void changeBtnColor() {
        logInBtn.setStyle("-fx-border-color: green;");
        createAccBtn.setStyle("-fx-border-color: green;");
    }

    @FXML
    public void goToLogInPage(ActionEvent event) throws IOException {


        root = FXMLLoader.load(getClass().getResource("logInScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Log in System");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void goToCreateAccPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("createAccScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Log in System");
        stage.setScene(scene);
        stage.show();

    }


    public void setLogInBtn(Button logInBtn) {
        this.logInBtn = logInBtn;
    }
}