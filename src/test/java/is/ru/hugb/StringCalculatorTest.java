package is.ru.hugb;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void TestEmptyStringPass(){
      StringCalculator calc = new StringCalculator();
      assertEquals(1, calc.Add(""));
    }
}
