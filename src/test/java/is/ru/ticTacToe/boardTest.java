package is.ru.ticTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class boardTest {	

	Board board = new Board();
	@Test
	public void TestValue() {
		board.FillInBoard();
		board.markBoard(9, 'X');
		assertEquals('X', board.getcolumn(2,2));
	}
	
}
