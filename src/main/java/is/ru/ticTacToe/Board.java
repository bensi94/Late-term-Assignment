package is.ru.ticTacToe;

public class Board {

	private char arrayBoard[][];
	private int x, y;
	
	public Board(int size) throws IllegalArgumentException {
		if(size < 1)
			throw new IllegalArgumentException("The size of the board is too small.");
		this.x = size;
		this.y = size;
		arrayBoard = new char[x][y];
		initializeBoard();
	}

	private void initializeBoard() {
		char counter = '1';
		for (int i = 0; i < this.x; i++) {
			for(int j = 0; j < this.y; j++) {
		 		arrayBoard[i][j] = counter;
		 		counter++;
			}
		}
	}

/*
	public boolean markBoard(int index, char input) {
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
		 		if (arrayBoard[i][j] == Character.forDigit(index,10)) {
		 			arrayBoard[i][j] = input;
		 			return true;
		 		}
			}
		}
		return false;
	}
*/
	public boolean markBoard(int index, char input) throws IllegalArgumentException {
		if(index < 1 || index > this.x * this.y)
			throw new IllegalArgumentException("Index: " + index + " is out of bounds.");

		int x = (index - 1) / this.x;
		int y = (index - 1) % this.y;

		if (arrayBoard[x][y] == Character.forDigit(index,10)) {
			arrayBoard[x][y] = input;
			return true;
		}
		return false;
	}

	public int size() {
		return this.x;
	}

	public char[][] getBoard() {
		return arrayBoard;
	}
}
