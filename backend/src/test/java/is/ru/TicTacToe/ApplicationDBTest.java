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
		db = new ApplicationDB();
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
		db.addGameResult("X", 10);
	}
	
	@Test
	public void testDisconnecting() throws Exception {
		db.connect();
		db.disconnect();
	}
}
