import org.example.Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);

        System.out.println("Calculated Result of a and b is: " + result);
        Assert.assertEquals(result, 8, "Addition result is incorrect");
    }
}
