package is.ru.ticTacToe;

public class GameLogic {
    private Board board;
    private Player playerOne, playerTwo;
    //X(playerOne) is FALSE, O(playerTwo) is TRUE
    private boolean playerTurn;
    private boolean gameRunning;

    GameLogic(){
        board = new Board();
        playerOne = new Player();
        playerTwo = new Player();
        playerTurn = false;
        gameRunning = true;
    }

    public boolean gameRunning(){
        return gameRunning;
    }

    public boolean winner(){
  /*  0,0 0,1 0,2
      1,0 1,1 1,2
      2,0 2,1 2,2
    */  // Horizontal
        for(int i = 0; i < 3; i++){
          if(NAMEOFARRAY[i][0] && NAMEOFARRAY[i][1] && NAMEOFARRAY[i][2] == ('X' | 'O')){
             return true
          }
        }

        // Vertial
        for(int j = 0; j < 3; j++) {
          if(NAMEOFARRAY[0][j] && NAMEOFARRAY[1][j] && NAMEOFARRAY[2][j] == ('X' | 'O')){
             return true
          }
        }

        // Diagonally left
          if (NAMEOFARRAY[0][0] && NAMEOFARRAY[1][1] && NAMEOFARRAY[2][2] == ('X' | 'O')){
            return true
        }
        // Diagonally Right
        if (NAMEOFARRAY[0][2] && NAMEOFARRAY[1][1] && NAMEOFARRAY[2][0] == ('X' | 'O')){
          return true
      }
        return false;
    }


}
