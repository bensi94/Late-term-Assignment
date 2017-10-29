package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GameLogicTest {

    private GameLogic gameLogicTest;

    @Before
    public void setUp() throws Exception {
        gameLogicTest = new GameLogic();
    }

    @Test
    public void testGameRunning(){
        assertEquals(true, gameLogicTest.gameRunning());
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
      gameLogicTest.markBoard(4);
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
    public void testWinnerVertical(){
      gameLogicTest.markBoard(2);
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(3);
      gameLogicTest.markBoard(8);
      assertEquals(1,gameLogicTest.winner());
    }

    @Test
    public void testWinnerDigonally(){
      gameLogicTest.markBoard(1);
      gameLogicTest.markBoard(4);
      gameLogicTest.markBoard(5);
      gameLogicTest.markBoard(3);
      gameLogicTest.markBoard(9);
      assertEquals(1,gameLogicTest.winner());
    }
}
