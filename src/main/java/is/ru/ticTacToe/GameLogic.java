package is.ru.ticTacToe;

public class GameLogic {
    private Board board;
    private Player playerOne, playerTwo;
    //X(playerOne) is FALSE, O(playerTwo) is TRUE
    private boolean playerTurn;
    private boolean gameRunning;

    GameLogic(){
        board = new Board();
        playerOne = new Player('X');
        playerTwo = new Player('O');
        playerTurn = false;
        gameRunning = true;
    }

    public boolean gameRunning(){
        return gameRunning;
    }


}
