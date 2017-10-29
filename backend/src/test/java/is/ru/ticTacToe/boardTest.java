package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class boardTest {

	private Board boardTest;
	
	@Before
    public void setUp() throws Exception {
        boardTest = new Board(3);
    }

	@Test
	public void TestValue() {
		boardTest.markBoard(9, 'X');
		assertEquals('X', boardTest.getBoard()[2][2]);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testException() {
		boardTest = new Board(0);
	}

	@Test
	public void TestInvalidIndex() {
		assertEquals(false, boardTest.markBoard(0, 'X'));
		boardTest.markBoard(1, 'X');
		assertEquals(false, boardTest.markBoard(1, 'X'));
		assertEquals(false, boardTest.markBoard(10, 'X'));
	}

	@Test
	public void TestSize() {
		assertEquals(3, boardTest.size());
	}
}
