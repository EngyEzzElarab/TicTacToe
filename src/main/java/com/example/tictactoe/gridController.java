package com.example.tictactoe;//package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gridController implements Initializable {
    public char C = 'X';
    public String playerTurnName;

    {
        playerTurnName = "";
    }
    public String playerOne;
    public String playerTwo;
    @FXML
    private Label turn;
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    public Label score;

    public int scorePlayerOne=0;
    public int scorePlayerTwo=0;

    private Stage stage;
    private Scene scene;
    private Parent root;
    DataSingleton data = DataSingleton.getInstance();
    public void isGameOver()
    {
        String res = "";
        for(int i=0;i<9;i++)
        {
            switch(i)
            {
                case 0: res = b1.getText()+b2.getText()+b3.getText() ; break;
                case 1: res = b1.getText()+b4.getText()+b7.getText() ; break;
                case 2: res = b1.getText()+b5.getText()+b9.getText() ; break;
                case 3: res = b3.getText()+b5.getText()+b7.getText() ; break;
                case 4: res = b4.getText()+b5.getText()+b6.getText() ; break;
                case 5: res = b2.getText()+b5.getText()+b8.getText() ; break;
                case 6: res = b3.getText()+b6.getText()+b9.getText() ; break;
                case 7: res = b7.getText()+b8.getText()+b9.getText() ; break;
                default: res="";break;
            }

            if(res.equals("XXX")) {
                System.out.println("Player One Won!!!!!");
                turn.setText("Player "+playerOne+" Won!!!!!");
                scorePlayerOne++;
                score.setText("Score:"+scorePlayerOne+"-"+scorePlayerTwo);
                disableButtons();
            }
            if(res.equals("OOO")) {
                System.out.println("Player Two Won!!!!!");
                turn.setText("Player "+playerTwo+" Won!!!!!");
                scorePlayerTwo++;
                score.setText("Score:"+scorePlayerOne+"-"+scorePlayerTwo);
                disableButtons();
            }

        }

    }
    @FXML
    protected void markOnGUI(ActionEvent ae) {


        Button b = ((Button)ae.getSource());
        b.setText(C+"");
        b.setDisable(true);
        System.out.println(playerTurnName+"TURNNN");
//        turn.setText("Player "+playerTurnName+"'s Turn");
        //System.out.println(nameOne.getText() + "MARK GUI player 1");

        if(playerTurnName.equals(playerOne) || playerTurnName.equals(""))
        {
            playerTurnName = playerTwo;
            System.out.println("ENTERED HERE");
            turn.setText("Player "+playerTwo+ "'s Turn");
        }
        else {
            playerTurnName = playerOne;
            turn.setText("Player "+playerOne+ "'s Turn");
        }

        C = C=='X'?'O':'X';
        isGameOver();
    }


    public void startNewGame(ActionEvent ae) throws IOException {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        score.setText("Score:"+scorePlayerOne+"-"+scorePlayerTwo);
//        restart();
        turn.setText("");
        switchToSceneOne(ae);
    }
    public void restart()
    {
        C = 'X';
        enableButtons();
        //
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        //
        playerTurnName = playerOne;
        turn.setText("Player " + playerOne+"'s Turn");



    }

    private void disableButtons() {
        b1.setDisable(true);
        b2.setDisable(true);
        b3.setDisable(true);
        b4.setDisable(true);
        b5.setDisable(true);
        b6.setDisable(true);
        b7.setDisable(true);
        b8.setDisable(true);
        b9.setDisable(true);
    }
    private void enableButtons() {
        b1.setDisable(false);
        b2.setDisable(false);
        b3.setDisable(false);
        b4.setDisable(false);
        b5.setDisable(false);
        b6.setDisable(false);
        b7.setDisable(false);
        b8.setDisable(false);
        b9.setDisable(false);
    }

    public void initialize(URL url, ResourceBundle resourceBundle)
    {
            playerOne = data.getPlayerOne();
            playerTwo = data.getPlayerTwo();
            turn.setText("Player "+data.getPlayerOne()+"'s Turn");
    }

    public void switchToSceneOne(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 500, 500);
//        stage.setTitle("Tic Tac Toe");
        stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
