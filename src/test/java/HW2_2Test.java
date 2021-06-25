
import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class HW2_2Test {
  @Rule
  public final TextFromStandardInputStream systemInMock
    = emptyStandardInputStream();

  @Test
  public void summarizesTwoNumbers() {
    systemInMock.provideLines("1", "2");
    assertEquals(4, Summarize.sumOfNumbersFromSystemIn());
  }
}
