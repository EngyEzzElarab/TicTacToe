package com.example.tictactoe;

public class DataSingleton {

    private static final DataSingleton instance = new DataSingleton();
    private String playerOne;
    private String playerTwo;
    private DataSingleton(){}

    public static DataSingleton getInstance()
    {
        return instance;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }
}
