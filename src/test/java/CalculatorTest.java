import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);

        System.out.println("Calculated Result of a and b is: " + result);
        assertEquals(8, result);
    }
}
