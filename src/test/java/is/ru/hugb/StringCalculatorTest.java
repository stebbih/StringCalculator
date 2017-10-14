package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void TestEmptyStringPass(){
      StringCalculator calc = new StringCalculator();
      assertEquals(0, calc.Add(""));
    }

    @Test
    public void TestOneNumber(){
      StringCalculator calc = new StringCalculator();
      assertEquals(1, calc.Add("1"));
    }

    @Test
    public void TestTwoNumber(){
      StringCalculator calc =  new StringCalculator();
      assertEquals(12, calc.Add("10,2"));
    }

    @Test
    public void TestUnknownNumbers(){
        StringCalculator calc = new StringCalculator();
        assertEquals(20, calc.Add("2,2,2,2,2,2,2,2,2,2"));
    }

    @Test
    public void TestNewLine() {
      StringCalculator calc = new StringCalculator();
      assertEquals(3, calc.Add("1\n2"));
    }

    @Test
    public void TestMinusSingleNumber(){
      StringCalculator calc = new StringCalculator();
      try {
          calc.Add("-1");
      }
      catch (IllegalArgumentException exception) {
          assertEquals("Negative not allowed -1", exception.getMessage());
      }
    }
}
