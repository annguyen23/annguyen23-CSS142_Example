
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.After;

import java.io.*;
import java.util.Locale;

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
                + "out new line using .println or at the end of each line."
                + " This case tests 0 drink, so your program should print out:\n\n"
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): "
                + "OK, so you do not want any espressos today!\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): "
                + "OK, so you do not want any espressos today!\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
    }
    
    @Test
    public void test1drink_MochaGrande() {
        systemInMock.provideLines("1", "3", "2");
        CoffeeOrder.main(new String[] {});
        Assert.assertEquals( "Check your outputs carefully. Any extra character "
                + "like space can fail this test case.\n"
                + "There should be 1 space  after (0-3): and you should print "
                + "out new line using .println or at the end of each line."
                + " This case tests 0 drink, so your program should print out:\n\n"
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): "
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): "
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 4.45"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): "
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): "
                + "What size (1: Tall, 2: Grande): "
                + "Your total is 4.45\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
    }
}


