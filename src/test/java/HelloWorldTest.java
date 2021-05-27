import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

import java.io.*;
import java.util.Locale;

public class HelloWorldTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
    	System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	public void testMainMethod() {
    	HelloWorld.main(new String[] {"arg1", "arg2", "arg3"});
        
    	Assert.assertEquals("Hello, World!", outputStreamCaptor.toString()
      	.trim());
	}
	
	@Test
	public void testpPrintStarPiramidMethod() {
    	HelloWorld.printStarPiramid();
        
    	Assert.assertEquals("    */n" +
        		    "   ***/n" +
         		    "  *****/n" +
        		    " *******/n" +
        		    "*********"
			    ,outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testPrintFaceMethod() {
    	HelloWorld.printFace();
        
    	Assert.assertEquals(" +\"\"\"\"\"+ /n" +
        		   "[| o o |]/n" +
         		   " |  ^  | /n" +
        		   " | '-' | /n" +
        		   " +-----+ /n"
			    , outputStreamCaptor.toString().trim());
	}
	
	@After
	public void tearDown() {
    	System.setOut(standardOut);
	}
}
