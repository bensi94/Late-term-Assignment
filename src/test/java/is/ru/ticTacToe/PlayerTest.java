package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player playerTest;

    @Before
    public void setUp() throws Exception {
        playerTest = new Player('X');
        playerTest.wins();
        playerTest.wins();
        playerTest.loses();
        playerTest.ties();
    }

    @Test
    public void testWinPercentage() {
        assertEquals(50.0, playerTest.getWinPercentage());
        playerTest.wins();
        assertEquals(60.0, playerTest.getWinPercentage());
        playerTest.loses();
        playerTest.loses();
        playerTest.ties();
        assertEquals(37.5, playerTest.getWinPercentage());
    }

    @Test
    public void testIcon() {
        assertEquals('X', playerTest.getIcon());
        playerTest.setIcon('O');
        assertEquals('O', playerTest.getIcon());
    }

    @Test
    public void testWins() {
        assertEquals(2, playerTest.getWins());
        playerTest.wins();
        assertEquals(3, playerTest.getWins());
    }

    @Test
    public void testLosses() {
        assertEquals(1, playerTest.getLosses());
        playerTest.loses();
        assertEquals(2, playerTest.getLosses());
    }

    @Test
    public void testTies() {
        assertEquals(1, playerTest.getTies());
        playerTest.ties();
        assertEquals(2, playerTest.getTies());
    }
}