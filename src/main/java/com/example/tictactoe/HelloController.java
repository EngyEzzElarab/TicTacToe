package com.example.tictactoe;//package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.fxml.FXMLLoader.*;

public class HelloController {
    @FXML
    private Label startGame;

    @FXML
    public TextField nameOne;
    @FXML
    public TextField nameTwo;

    private Stage stage;
    private Scene scene;
    private Parent root;

    DataSingleton data = DataSingleton.getInstance();

    @FXML
    protected void onStartGameClick(ActionEvent event) throws IOException {
        startGame.setText("Game Starts!");
        data.setPlayerOne(nameOne.getText());
        data.setPlayerTwo(nameTwo.getText());
        //send these two
//        data.setPlayerOne( nameOne.getText());
//        data.setPlayerTwo(nameTwo.getText());
        viewSceneTwo(event);

    }

    public void viewSceneTwo(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gridGame.fxml"));
        scene = new Scene(fxmlLoader.load(), 500, 500);
        stage = new Stage();
       // stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();

    }




}