import java.util.*;
import java.io.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import org.junit.rules.Timeout; 

public class Tests {
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor 
              = new ByteArrayOutputStream();
  @Rule
  public final TextFromStandardInputStream systemInMock
          = emptyStandardInputStream();
  
  @Rule
  public Timeout globalTimeout = new Timeout(5000);
  
  @Before
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
    
  @After
  public void tearDown() {
    System.setOut(standardOut);
  }
  
  @Test
  public void testPrintPiramid() {
    String output = 
          "*\n"
        + "**\n"
        + "***\n"
        + "****\n"
        + "*****\n";
    Main.printPiramid(5);
    Assert.assertEquals(output, outputStreamCaptor.toString());
  }
  
  @Test
  public void testReadFile() {
    int[] result = {5, 7, 12, -9, 100, 345, 44};
    Assert.assertEquals(Main.readFile("number.text"), result);
  }
  
  @Test
  public void testSort() {
    int[] result = {5, 7, 12, -9, 100, 345, 44};
    Arrays.sort(result);
    int[] test = {5, 7, 12, -9, 100, 345, 44};
    Main.sort(test);
    Assert.assertEquals(result, test);
  }
  
  @Test
  public void testCreatPascalTriangle() {
    int[][] result = new int[5][0];
    result[0] = new int[]{1};
    result[1] = new int[]{1, 1};
    result[2] = new int[]{1, 2, 1};
    result[3] = new int[]{1, 3, 3, 1};
    result[4] = new int[]{1, 4, 6, 4, 1};
    Assert.assertEquals(result, Main.creatPascalTriangle(5));
  }
  
  @Test
  public void testMaxInput() {
    systemInMock.provideLines("1", "5", "9", "7", "9", "15", "11", "-1");
    Assert.assertEquals(15, Main.maxInput());
  }
  
  @Test
  public void testGetDay() {
    Assert.assertEquals("Friday", getDay(19, 11, 2021));
  }
}
