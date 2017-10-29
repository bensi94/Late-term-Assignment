package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class ApplicationDBTest {
	
	private ApplicationDB db;
	
	@Before
	public void setUp() throws Exception {
		db = new ApplicationDB(true);
	}
	
	@Test
	public void testClearResultTable() throws Exception {
		db.connect();
		db.clearResultTable();
	}
	
	@Test
	public void testConnection() throws Exception {
		db.connect();
	}
	
	@Test
	public void testInit() throws Exception {
		db.connect();
		db.initDB();
	}

	@Test
	public void testAddResult() throws Exception {
		db.connect();
		db.clearResultTable();
		db.addGameResult("x", 10);
	}
	
	@Test
	public void testDisconnecting() throws Exception {
		db.connect();
		db.disconnect();
	}
	
	@Test
	public void testgetXWinCount() throws Exception {
		db.connect();
		db.clearResultTable();
		db.addGameResult("x", 10);
		db.addGameResult("x", 10);
		int count = db.getXWinCount();
		assertEquals(2, count);
	}
	
	@Test
	public void testgetOWinCount() throws Exception {
		db.connect();
		db.clearResultTable();
		db.addGameResult("o", 10);
		db.addGameResult("o", 10);
		int count = db.getOWinCount();
		assertEquals(2, count);
		db.clearResultTable();
	}
}
