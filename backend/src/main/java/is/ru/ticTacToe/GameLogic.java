package is.ru.ticTacToe;

public class GameLogic {
    private Board board;
    private Player playerOne, playerTwo;
    //X(playerOne) is FALSE, O(playerTwo) is TRUE
    private boolean playerTurn;
    // Lock the game when it has been won
    private boolean gameLocked;
	private ApplicationDB db;
	private int xmoves;
	private int omoves;

    GameLogic(boolean test){
        board = new Board(3);
        playerOne = new Player('X');
        playerTwo = new Player('O');
        playerTurn = false;
        gameLocked = false;
		if(test) {
			db = new ApplicationDB(true);
		}
		else {
			db = new ApplicationDB(false);
		}
		db.connect();
		db.initDB();
		db.disconnect();
		xmoves = 0;
		omoves = 0;
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
          if(board.markBoard(input,'X') == true){
            playerTurn = !playerTurn;
			xmoves += 1;
            return true;
          }
        }
        if(board.markBoard(input,'O') == true){
          playerTurn = !playerTurn;
		  omoves += 1;
          return true;
        }
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
                    if(board.getBoard()[i][0] == 'X'){
						updateResultTable("x");
						return 1;
					}
                    else{
						updateResultTable("o");
						return 2;
					}
                  }
          }
        }

        // Vertial
        for(int j = 0; j < 3; j++) {
            if(board.getBoard()[0][j] != ' ') {
                if(board.getBoard()[0][j] == board.getBoard()[1][j] &&
                    board.getBoard()[1][j] == board.getBoard()[2][j]){
                      if(board.getBoard()[0][j] == 'X'){
						  updateResultTable("x");
						  return 1;
					  }
                      else{
						  updateResultTable("o");
						  return 2;
					  }
                    }
            }
        }

        // Diagonally left
        if(board.getBoard()[0][0] != ' ') {
            if(board.getBoard()[0][0] == board.getBoard()[1][1] &&
                board.getBoard()[1][1] == board.getBoard()[2][2]){
                  if(board.getBoard()[0][0] == 'X'){
					  updateResultTable("x");
					  return 1;
				  }
                  else{
					  updateResultTable("o");
					  return 2;
				  }
            }
        }

        // Diagonally Right
        if(board.getBoard()[0][2] != ' ') {
            if(board.getBoard()[0][2] == board.getBoard()[1][1] &&
                board.getBoard()[1][1] == board.getBoard()[2][0]){
                  if(board.getBoard()[0][2] == 'X'){
					  updateResultTable("x");
					  return 1;
				  }
                  else{
					  updateResultTable("o");
					  return 2;
				  }

            }
        }
        gameLocked = false;
        return -1;

    }
	
	private void updateResultTable(String winner){
		db.connect();
		if(winner == "x") {
			db.addGameResult(winner, xmoves);
		}
		else {
			db.addGameResult(winner, omoves);
		}
		db.disconnect();
	}
	
	public int getXWinCount() {
		db.connect();
		return db.getXWinCount();
	}
	
	public int getOWinCount() {
		db.connect();
		return db.getOWinCount();
	}
}
