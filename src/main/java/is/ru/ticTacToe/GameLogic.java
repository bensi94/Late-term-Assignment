package is.ru.ticTacToe;

public class GameLogic {
    private Board board;
    private Player playerOne, playerTwo;
    //X(playerOne) is FALSE, O(playerTwo) is TRUE
    private boolean playerTurn;
    private boolean gameRunning;

    GameLogic(){
        board = new Board(3);
        playerOne = new Player('X');
        playerTwo = new Player('O');
        playerTurn = false;
        gameRunning = true;
    }

    public boolean gameRunning(){
        return gameRunning;
    }

    public boolean validateInput(int input) {
      return input > 0 && input < 10;
    }

    public boolean markBoard(int input){
      if(!validateInput(input)) {
        throw new IllegalArgumentException("Input out of bounds");
      }

      if(playerTurn == false){
        playerTurn = !playerTurn;
          return board.markBoard(input,'X');
      }
      playerTurn = !playerTurn;
      return board.markBoard(input,'O');
    }

    // returns 1 if X wins, 2 if O wins and -1 if not won
    public int winner(){
  /*  0,0 0,1 0,2
      1,0 1,1 1,2
      2,0 2,1 2,2
    */  // Horizontal
        for(int i = 0; i < 3; i++){
          if(board.getBoard()[i][0] == 'X' && board.getBoard()[i][1] == 'X' &&
              board.getBoard()[i][2] == 'X'){
             return 1;
          }
          if(board.getBoard()[i][0] == 'O' && board.getBoard()[i][1] == 'O' &&
              board.getBoard()[i][2] == 'O'){
             return 2;
          }
        }

        // Vertial
        for(int j = 0; j < 3; j++) {
          if(board.getBoard()[0][j] == 'X' && board.getBoard()[1][j] == 'X' &&
              board.getBoard()[2][j] == 'X'){
             return 1;
          }
          if(board.getBoard()[0][j] == 'O' && board.getBoard()[1][j] == 'O' &&
              board.getBoard()[2][j] == 'O'){
             return 2;
          }
        }

        // Diagonally left
        if(board.getBoard()[0][0] == 'X' && board.getBoard()[1][1] == 'X' &&
            board.getBoard()[2][2] == 'X'){
           return 1;
        }
        if(board.getBoard()[0][0] == 'O' && board.getBoard()[1][1] == 'O' &&
            board.getBoard()[2][2] == 'O'){
           return 2;
        }

        // Diagonally Right
        if(board.getBoard()[0][2] == 'X' && board.getBoard()[1][1] == 'X' &&
            board.getBoard()[2][0] == 'X'){
           return 1;
        }
        if(board.getBoard()[0][2] == 'O' && board.getBoard()[1][1] == 'O' &&
            board.getBoard()[2][0] == 'O'){
           return 2;
        }

        return -1;
    }


}
