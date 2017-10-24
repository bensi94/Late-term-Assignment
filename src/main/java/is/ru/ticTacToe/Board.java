package is.ru.ticTacToe;

public class Board {

	private char arrayBoard[][];

	public Board() {
		arrayBoard = new char[3][3];
	}

	public void FillInBoard() {
		char counter = '1';
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
		 		arrayBoard[i][j] = counter;
		 		counter++;
			}
		}
	}

	
	public void markBoard(int index, char input) {
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
		 		if (arrayBoard[i][j] == Character.forDigit(index,10)) {
		 			arrayBoard[i][j] = input;
		 			break;
		 		}
			}
		}
	}

	public char getcolumn(int indexX, int indexY) {
		return arrayBoard[indexX][indexY];
	}
}


