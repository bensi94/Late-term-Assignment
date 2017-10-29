package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GameLogicTest {

    private GameLogic gameLogicTest;
	private ApplicationDB db;
	
    @Before
    public void setUp() throws Exception {
        gameLogicTest = new GameLogic(true);
		db = new ApplicationDB(true);
    }

    @Test
    public void testmarkBoard(){
      assertEquals(true, gameLogicTest.markBoard(1));
    }

    @Test
    public void testWinnerPlayerOne(){
      gameLogicTest.markBoard(1);
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(2);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(3);
      assertEquals(1,gameLogicTest.winner());
    }

    @Test
    public void testWinnerPlayerTwo(){
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(1);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(2);
      gameLogicTest.markBoard(7);
      gameLogicTest.markBoard(3);
      assertEquals(2,gameLogicTest.winner());
    }

    @Test
    public void testWinnerNoWinner(){
      gameLogicTest.markBoard(1);
      assertEquals(-1,gameLogicTest.winner());
    }

    @Rule
    public ExpectedException argumentException = ExpectedException.none();

    @Test
    public void validateInput() throws Exception {
        argumentException.expect(IllegalArgumentException.class);
        argumentException.expectMessage("Input out of bounds");
        gameLogicTest.markBoard(-5);
    }


    @Test
    public void testWinnerVerticalX(){
      gameLogicTest.markBoard(2);
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(3);
      gameLogicTest.markBoard(8);
      assertEquals(1,gameLogicTest.winner());
    }

    @Test
    public void testWinnerVerticalO(){
      gameLogicTest.markBoard(1);
      gameLogicTest.markBoard(2);
      gameLogicTest.markBoard(3);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(8);
      assertEquals(2,gameLogicTest.winner());
    }

    @Test
    public void testWinnerDiagonallyLeftX(){
      gameLogicTest.markBoard(1);
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(3);
      gameLogicTest.markBoard(9);
      assertEquals(1,gameLogicTest.winner());
    }
	
	@Test
    public void testXWinCount(){
	  db.connect();
	  db.clearResultTable();
	  db.addGameResult("x", 10);
	  db.addGameResult("x", 10);
	  
      assertEquals(2,gameLogicTest.getXWinCount());
    }
	
	public void testOWinCount(){
	  db.connect();
	  db.clearResultTable();
	  db.addGameResult("o", 10);
	  db.addGameResult("o", 10);
      assertEquals(2,gameLogicTest.getOWinCount());

    @Test
    public void testWinnerDiagonallyLeftO(){
      gameLogicTest.markBoard(2);
      gameLogicTest.markBoard(1);
      gameLogicTest.markBoard(3);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(7);
      gameLogicTest.markBoard(9);
      assertEquals(2,gameLogicTest.winner());
    }

    @Test
    public void testGetBoard() {
        assertEquals(gameLogicTest.getBoard()[0][0], ' ');
    }

    @Test
    public void testWinnerDiagonallyRightX() {
        gameLogicTest.markBoard(3);
        gameLogicTest.markBoard(6);
        gameLogicTest.markBoard(5);
        gameLogicTest.markBoard(2);
        gameLogicTest.markBoard(7);
        assertEquals(1, gameLogicTest.winner());
    }

    @Test
    public void testWinnerDiagonallyRightO() {
        gameLogicTest.markBoard(1);
        gameLogicTest.markBoard(3);
        gameLogicTest.markBoard(2);
        gameLogicTest.markBoard(5);
        gameLogicTest.markBoard(9);
        gameLogicTest.markBoard(7);
        assertEquals(2, gameLogicTest.winner());
    }

    @Test
    public void testValidate() {
        assertEquals(false, gameLogicTest.validateInput(0));
        assertEquals(true, gameLogicTest.validateInput(1));
    }
}
