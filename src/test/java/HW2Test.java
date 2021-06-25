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
        
    	Assert.assertEquals("\nCheck carefully!" 
			    + "One missing/extra character like space can make this test case failed\n"
    			+ "If your program prints out similar Mario level, please don't worry if this test case fails!\n"
    			+ "The runProgramOne() method should print out:"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n\n"			    
			    
			    + "||" +  "\n"
			    + "||||" +  "\n"
			    + "||||||" +  "\n"
			    + "||||||||" +  "\n"
			    + "||||||||||" +  "\n"
			    + "||||||||||||" +  "\n"
			    + "||" +  "\n"
			    + "||              ^" +  "\n"
			    + "|----------------" +  "\n"
			    
			    	,"||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n\n"
					    
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n\n"			    
			    
			    + "||" +  "\n"
			    + "||||" +  "\n"
			    + "||||||" +  "\n"
			    + "||||||||" +  "\n"
			    + "||||||||||" +  "\n"
			    + "||||||||||||" +  "\n"
			    + "||" +  "\n"
			    + "||              ^" +  "\n"
			    + "|----------------" +  "\n"
					    , outputStreamCaptor.toString());
	}
	
	/*
	@Test
	public void testProgramTwo() {
    	HW2.runProgramTwo();
        
    	Assert.assertEquals("\nCheck carefully!" 
			    + "One missing/extra character like space can make this test case failed\n"
    			+ "If your program prints out similar Mario level, please don't worry if this test case fails!\n"
			+ "This test case assume the Mario = \">-<0\" and Coin = \"@\", so don't worry if it fails due to different values!\n"
    			+ "The runProgramOne() method should print out:"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||    |?|@" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|@" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||@" + "\n"
			    + "||@" + "\n"
			    + "||@" + "\n"
			    + "||" + "\n\n"			    
			    
			    + "||" +  "\n"
			    + "||||" +  "\n"
			    + "||||||" +  "\n"
			    + "||||||||" +  "\n"
			    + "||||||||||" +  "\n"
			    + "||||||||||||>-<0" +  "\n"
			    + "||" +  "\n"
			    + "||              ^" +  "\n"
			    + "|----------------" +  "\n"
			    
			    	,"||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n"
				+ "||" + "\n\n"
					    
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||    |?|@" + "\n"
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||    |?|@" + "\n"
			    + "||" + "\n\n"
			    
			    + "||" + "\n"
			    + "||" + "\n"
			    + "||@" + "\n"
			    + "||@" + "\n"
			    + "||@" + "\n"
			    + "||" + "\n\n"			    
			    
			    + "||" +  "\n"
			    + "||||" +  "\n"
			    + "||||||" +  "\n"
			    + "||||||||" +  "\n"
			    + "||||||||||" +  "\n"
			    + "||||||||||||>-<0" +  "\n"
			    + "||" +  "\n"
			    + "||              ^" +  "\n"
			    + "|----------------" +  "\n"
					    , outputStreamCaptor.toString());
	}
	*/
	
	@After
	public void tearDown() {
    	System.setOut(standardOut);
	}
}
