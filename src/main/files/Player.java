package src.main.files;

import src.main.files.Grid;

public class Player {
    public String name;
    public int score;
   public  char Symbol;
    public boolean isYourTurn;

    public Player(String name, char c)
    {
        this.name = name;
        Symbol = c;
    }

    public void play(int row, int col , Grid grid)
    {
        grid.mark(row , col , this.Symbol);
    }

    public String win(Game game) {
        game.endGame(this.name);
        return "src.main.files.Player "+ this.name +" WON!!";
    }
}
