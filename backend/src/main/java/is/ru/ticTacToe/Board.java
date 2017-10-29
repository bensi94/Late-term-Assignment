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
		for (int i = 0; i < this.x; i++) {
			for(int j = 0; j < this.y; j++) {
		 		arrayBoard[i][j] = ' ';
			}
		}
	}

	public boolean markBoard(int index, char input) throws IllegalArgumentException {
		if(index < 1 || index > this.x * this.y)
			return false;

		int x = (index - 1) / this.x;
		int y = (index - 1) % this.y;

		if (arrayBoard[x][y] == ' ') {
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
