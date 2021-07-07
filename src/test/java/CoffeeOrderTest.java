import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

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
  
  private final String warning = "Check your outputs carefully. Any extra character "
            + "like space can fail this test case.\n"
            + "There should be 1 space after \':\' and you should print "
            + "out new line using .println or \\n at the end of each line.\n";
    
  @Test
  public void test0drink() {
    systemInMock.provideLines("0");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning 
                + " This case tests 0 drinks, so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "OK, so you do not want any espressos today!\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "OK, so you do not want any espressos today!\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test2drink_AmericanoGrande_MochaTall() {
    systemInMock.provideLines("2", "1", "2", "3", "1");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 2 drinks: Americano (size Grande) and "
                + "Mocha (size Tall), so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 6.80\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 6.80\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test2drink_LatteGrande_MochaGrande() {
    systemInMock.provideLines("2", "2", "2", "3", "2");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 2 drink: Latte (size Grande) and "
                + "Mocha (size Grande), so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 8.40\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 8.40\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test2drink_LatteGrande_AmericanoGrande() {
    systemInMock.provideLines("2", "2", "2", "1", "2");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning 
                + "This case tests 2 drink: Latte (size Grande) and "
                + "Americano (size Grande), so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 6.90\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 6.90\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test4drink() {
    boolean error = false;
    try {
      systemInMock.provideLines("4");
      CoffeeOrder.main(new String[] {});
    } catch (AssertionError e) {
      error = true;
      Assert.assertEquals("User enters 4 drinks and it is invalid, "
                    + "so you need to check invalid inputs with assert()", 
                    e.toString(), "java.lang.AssertionError");
    }
    Assert.assertTrue("User enters 4 drinks and it is invalid, "
                + "so you need to check invalid inputs with assert()",  error);
  }
    
  @Test
  public void test_Negativedrink() {
    boolean error = false;
    try {
      systemInMock.provideLines("-1");
      CoffeeOrder.main(new String[] {});
    } catch (AssertionError e) {
      error = true;
      Assert.assertEquals("User enters -1 drinks and it is invalid, "
                    + "so you need to check invalid inputs with assert()", 
                    e.toString(), "java.lang.AssertionError");
    }
    Assert.assertTrue("User enters -1 drinks and it is invalid, "
                + "so you need to check invalid inputs with assert()",  error);
  }
    
  @Test
  public void test_NegativeType() {
    boolean error = false;
    try {
      systemInMock.provideLines("1", "-1");
      CoffeeOrder.main(new String[] {});
    } catch (AssertionError e) {
      error = true;
    } catch (Exception e) {
      error = true;
    }
    Assert.assertTrue("User enters -1 for type of drinks and it is invalid, "
                + "so you need to check invalid inputs with assert()",  error);
  }
    
  @Test
  public void test_Type4() {
    boolean error = false;
    try {
      systemInMock.provideLines("1", "4");
      CoffeeOrder.main(new String[] {});
    } catch (AssertionError e) {
      error = true;
    } catch (Exception e) {
      error = true;
    }
    Assert.assertTrue("User enters 4 for type of drinks and it is invalid, "
                + "so you need to check invalid inputs with assert()",  error);
  }
    
  @Test
  public void test_NegativeSize() {
    boolean error = false;
    try {
      systemInMock.provideLines("1", "1", "-1");
      CoffeeOrder.main(new String[] {});
    } catch (AssertionError e) {
      error = true;
      Assert.assertEquals("User enters -1 for size of drinks and it is invalid, "
                    + "so you need to check invalid inputs with assert()", 
                    e.toString(), "java.lang.AssertionError");
    }
    Assert.assertTrue("User enters -1 for size of drinks and it is invalid, "
                + "so you need to check invalid inputs with assert()",  error);
  }
    
  @Test
  public void test_Size3() {
    boolean error = false;
    try {
      systemInMock.provideLines("1", "1", "3");
      CoffeeOrder.main(new String[] {});
    } catch (AssertionError e) {
      error = true;
      Assert.assertEquals("User enters 3 for size of drinks and it is invalid, "
                    + "so you need to check invalid inputs with assert()", 
                    e.toString(), "java.lang.AssertionError");
    }
    Assert.assertTrue("User enters 3 for size of drinks and it is invalid, "
                + "so you need to check invalid inputs with assert()",  error);
  }
  
  @Test
  public void test1drink_MochaTall() {
    systemInMock.provideLines("1", "3", "1");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 1 drink: Mocha (size Tall)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 3.85\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 3.85\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test1drink_MochaGrande() {
    systemInMock.provideLines("1", "3", "2");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 1 drink: Mocha (size Grande)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 4.45\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 4.45\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test1drink_AmericanoTall() {
    systemInMock.provideLines("1", "1", "1");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 1 drink: Americano (size Tall)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 2.65\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 2.65\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test1drink_AmericanoGrande() {
    systemInMock.provideLines("1", "1", "2");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 1 drink: Americano (size Grande)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 2.95\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 2.95\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test1drink_LatteGrande() {
    systemInMock.provideLines("1", "2", "2");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 1 drink: Latte (size Grande)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 3.95\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 3.95\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test1drink_LatteTall() {
    systemInMock.provideLines("1", "2", "1");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 1 drink: Latte (size Tall)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 3.35\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 3.35\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test3Drinks_AT_LG_MT() {
    systemInMock.provideLines("3", "1", "1", "2", "2", "3", "1");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 3 drinks: Americano (size Tall), Latte "
                + "(size Grande), and Mocha (size Tall)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #3\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 10.45\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #3\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 10.45\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
    
  @Test
  public void test3Drinks_AG_MG_MT() {
    systemInMock.provideLines("3", "3", "2", "1", "2", "3", "1");
    CoffeeOrder.main(new String[] {});
    Assert.assertEquals(warning
                + "This case tests 3 drinks: Americano (size Grande), Mocha "
                + "(size Grande), and Mocha (size Tall)"
                + "so your program should print out:\n\n"
                
                + "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #3\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 11.25\n"
                + "Thank you for using CoffeeOrder 3000\n\n", 
                
                "Welcome to CoffeeOrder 3000\n"
                + "How many espresso drinks would you like today (0-3): \n"
                + "Getting order for espresso drink #1\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #2\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Getting order for espresso drink #3\n"
                + "What type (1: Americano, 2: Latte, 3: Mocha): \n"
                + "What size (1: Tall, 2: Grande): \n"
                + "Your total is 11.25\n"
                + "Thank you for using CoffeeOrder 3000\n", 
                outputStreamCaptor.toString());
  }
}
