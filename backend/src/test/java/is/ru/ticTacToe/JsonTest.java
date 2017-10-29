package is.ru.ticTacToe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class JsonTest {
    
    private JsonResponse jsonTest;

    @Before
    public void setUp() throws Exception {
        jsonTest = new JsonResponse();
    }

	@Test
	public void TestGetSetResponse() {
        jsonTest.setResponse("response");
        assertEquals("response", jsonTest.getResponse());
    }
}
