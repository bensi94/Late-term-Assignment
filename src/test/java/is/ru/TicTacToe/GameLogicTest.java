package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
    public void testmarkBoard_2(){
      assertEquals(false,gameLogicTest.markBoard(100));
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
}
