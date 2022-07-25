package com.example.tictactoe;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import src.main.files.Game;
import src.main.files.Player;

import java.io.IOException;

public class HelloApplication extends Application {
//    @Override
    static String p1Name;
    static String p2Name;
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }



    public static void main() {
        Player p1 = new Player(p1Name,'X');
        Player p2 = new Player(p2Name,'O');
        Game game = new Game(p1,p2,p1.name);
        launch();

    }
}