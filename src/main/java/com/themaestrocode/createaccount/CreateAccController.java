package com.themaestrocode.createaccount;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class CreateAccController {

//    @FXML
//    Label createAccCheckBox;
    @FXML
    TextField fNameTextField;
    @FXML
    TextField lNameTextField;
    @FXML
    TextField emailTextField;
    @FXML
    TextField phoneNoTextField;
    @FXML
    TextField uNameTextField;
    @FXML
    PasswordField pWordTextField;
    @FXML
    PasswordField confirmPWordTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;
    private static ArrayList <User> users = new ArrayList();
    private static String email;
    private static String phoneNumber;
    private static String username;
    private static String password;

    @FXML
    public void createAccount(ActionEvent event) throws IOException {
        String firstName = fNameTextField.getText();
        String lastName = lNameTextField.getText();
        //time to check and test email;
        email = emailTextField.getText();
        phoneNumber = phoneNoTextField.getText();
        username = uNameTextField.getText();
        password = pWordTextField.getText();
        String confirmPassWord = confirmPWordTextField.getText();

        User newUser = new User(firstName, lastName, email, phoneNumber, username, password);
        users.add(newUser);
        newUser.profileDetails();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("homePageScene.fxml"));
        root = loader.load();

        HomePageController homePageController = loader.getController();
        homePageController.welcomeMessage(firstName, username);

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        System.out.println("\nCongratulations. You have successfully created your account!");

    }

    /**
     * takes the user back to the main page where they can choose to log in or create account
     * this method is called via the @goBackBtn
     * @param event
     * @throws IOException
     */
    public void switchToMainScene(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
