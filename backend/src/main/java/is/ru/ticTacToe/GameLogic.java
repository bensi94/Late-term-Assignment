package is.ru.ticTacToe;

public class GameLogic {
    private Board board;
    private Player playerOne, playerTwo;
    //X(playerOne) is FALSE, O(playerTwo) is TRUE
    private boolean playerTurn;
    // Lock the game when it has been won
    private boolean gameLocked;

    GameLogic(){
        board = new Board(3);
        playerOne = new Player('X');
        playerTwo = new Player('O');
        playerTurn = false;
        gameLocked = false;
    }

    public boolean validateInput(int input) {
      return input > 0 && input < 10;
    }

    public char[][] getBoard(){
        return board.getBoard();
    }

    public boolean markBoard(int input){
      if(gameLocked == false){
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
      return false;
    }

    // returns 1 if X wins, 2 if O wins and -1 if not won
    public int winner(){
      gameLocked = true;
    // Horizontal
        for(int i = 0; i < 3; i++){
            if(board.getBoard()[i][0] != ' ') {
              if(board.getBoard()[i][0] == board.getBoard()[i][1] &&
                  board.getBoard()[i][1] == board.getBoard()[i][2]){
                    if(board.getBoard()[i][0] == 'X'){return 1;}
                    else{return 2;}
                  }
          }
        }

        // Vertial
        for(int j = 0; j < 3; j++) {
            if(board.getBoard()[0][j] != ' ') {
                if(board.getBoard()[0][j] == board.getBoard()[1][j] &&
                    board.getBoard()[1][j] == board.getBoard()[2][j]){
                      if(board.getBoard()[0][j] == 'X'){return 1;}
                      else{return 2;}
                    }
            }
        }

        // Diagonally left
        if(board.getBoard()[0][0] != ' ') {
            if(board.getBoard()[0][0] == board.getBoard()[1][1] &&
                board.getBoard()[1][1] == board.getBoard()[2][2]){
                  if(board.getBoard()[0][0] == 'X'){return 1;}
                  else{return 2;}
            }
        }

        // Diagonally Right
        if(board.getBoard()[0][2] != ' ') {
            if(board.getBoard()[0][2] == board.getBoard()[1][1] &&
                board.getBoard()[1][1] == board.getBoard()[2][0]){
                  if(board.getBoard()[0][2] == 'X'){return 1;}
                  else{return 2;}

            }
        }
        gameLocked = false;
        return -1;

    }

}
