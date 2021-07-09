import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class UpArrowTest {
  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor 
              = new ByteArrayOutputStream();
  
  @Before
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
    
  @After
  public void tearDown() {
    System.setOut(standardOut);
  }
  
  private final String warning = "Check your outputs carefully. Any extra characters "
      + "like space can fail this test case.\n";
  
  @Test
  public void testSize9() {
    UpArrow.arrow(9);
    String output = "....*....\n"
        + "...***...\n"
        + "..*****..\n"
        + ".*******.\n"
        + "*********\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n"
        + "...**...\n";
    Assert.assertEquals(warning 
                + " This case tests size 9, so your program should print out:\n\n"
                + output, output, outputStreamCaptor.toString());
  }
  
  @Test
  public void testSize15() {
    UpArrow.arrow(15);
    String output = ".......*.......\n"
        + "......***......\n"
        + ".....*****.....\n"
        + "....*******....\n"
        + "...*********...\n"
        + "..***********..\n"
        + ".*************.\n"
        + "***************\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n"
        + "......***......\n";
    Assert.assertEquals(warning 
                + " This case tests size 15, so your program should print out:\n\n"
                + output, output, outputStreamCaptor.toString());
  }
  
  @Test
  public void testSize31() {
    UpArrow.arrow(31);
    String output = "...............*...............\n"
        + "..............***..............\n"
        + ".............*****.............\n"
        + "............*******............\n"
        + "...........*********...........\n"
        + "..........***********..........\n"
        + ".........*************.........\n"
        + "........***************........\n"
        + ".......*****************.......\n"
        + "......*******************......\n"
        + ".....*********************.....\n"
        + "....***********************....\n"
        + "...*************************...\n"
        + "..***************************..\n"
        + ".*****************************.\n"
        + "*******************************\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n"
        + "............*******............\n";
    Assert.assertEquals(warning 
                + " This case tests size 31, so your program should print out:\n\n"
                + output, output, outputStreamCaptor.toString());
  }
}
