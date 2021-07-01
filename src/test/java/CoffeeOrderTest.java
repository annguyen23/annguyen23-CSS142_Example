
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CoffeeOrderTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor 
            = new ByteArrayOutputStream();

    @Rule
      public final TextFromStandardInputStream systemInMock
          = emptyStandardInputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @After
    public void tearDown() {
        System.setOut(standardOut);
    }
    
    @Test
    public void test0drink() {
        systemInMock.provideLines("0");
        CoffeeOrder.main(new String[] {});
        Assert.assertEquals( "Check your outputs carefully. Any extra character "
                + "like space can fail this test case.\n"
                + "There should be 1 space  after (0-3): and you should print "
                + "out new line using .println or \n at the end of each line."
                + "This case tests 0 drink, and your program should print out:\n"
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "OK, so you do not want any espressos today!\n"
                + "Thank you for using CoffeeOrder 3000", 
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): 0\n"
                + "OK, so you do not want any espressos today!\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
    }
}
