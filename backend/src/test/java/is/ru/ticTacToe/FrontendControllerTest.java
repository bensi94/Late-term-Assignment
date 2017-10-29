package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class FrontendControllerTest {

	private FrontendController frontEndTest;
	
	@Before
    public void setUp() throws Exception {
		frontEndTest = new FrontendController();
    }

	@Test
	public void TestBoard() {
		String jsonBoard = frontEndTest.board();
		assertNotNull(jsonBoard);
		assertTrue(jsonBoard.length() > 0);
	}

	@Test
	public void TestWinner() {
		assertNotNull(frontEndTest.Winner());
	}

	@Test
	public void TestmarkBoard() {
		frontEndTest.markBoard("3");
		assertNotNull(frontEndTest.board());
	}

	@Test
	public void TestrestartGame() {
		frontEndTest.restartGame("");
		assertNotNull(frontEndTest.board());
	}
}