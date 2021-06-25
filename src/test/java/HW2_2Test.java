
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

import java.io.*;
import java.util.Locale;

public class HW2_2Test {
  
  private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@Before
	public void setUp() {
    	System.setOut(new PrintStream(outputStreamCaptor));
	}
  
  @Rule
  public final TextFromStandardInputStream systemInMock
    = emptyStandardInputStream();

  @Test
  public void summarizesTwoNumbers() {
    systemInMock.provideLines("1", "2");
    assertEquals(4, Summarize.sumOfNumbersFromSystemIn());
  }
  
  @Test
	public void testProgramTwo() {
      systemInMock.provideLines(">-<0", "@");
    	HW2.runProgramTwo();

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
  
  @After
	public void tearDown() {
    	System.setOut(standardOut);
	}
}
