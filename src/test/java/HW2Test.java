import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

import java.io.*;
import java.util.Locale;

public class HW2Test {


	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
    	System.setOut(new PrintStream(outputStreamCaptor));
	}

	
	@Test
	public void testProgramOne() {
    	HW2.runProgramOne();
        
    	Assert.assertEquals("abc", outputStreamCaptor.toString());
	}
	
	
	@After
	public void tearDown() {
    	System.setOut(standardOut);
	}
}
