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
}
