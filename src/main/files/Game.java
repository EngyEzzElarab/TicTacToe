package src.main.files;

public class Game {
    Player playerOne;
    Player playerTwo;
    Double timer;
    String whosTurn;
    String Winner;
    Grid grid;

    public Game(Player pOne , Player pTwo , String turn)
    {
        playerOne = pOne;
        playerTwo = pTwo;
        whosTurn = turn;
        grid = new Grid();
    }
    public void startGame()
    {

    }
    public void endGame(String winner)
    {

    }
}
