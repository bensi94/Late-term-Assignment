package is.ru.ticTacToe;

public class GameLogic {
    private Board board;
    private Player playerOne, playerTwo;

    GameLogic(){
        board = new Board();
        playerOne = new Player();
        playerTwo = new Player();
    }
}
