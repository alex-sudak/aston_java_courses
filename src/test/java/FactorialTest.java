import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    Calculator calculator = new Calculator();

    @Test
    public void factorialForZero() {
        Assert.assertEquals(calculator.factorial(0), 1);
    }

    @Test
    public void factorialPositiveDigitals() {
        Assert.assertEquals(calculator.factorial(4), 24);
    }

    @Test
    public void factorialNegativeDigitals() {
        try {
            calculator.factorial(-4);
            Assert.fail("Вы ввели отрицательное число - расчет факториала возможен только для чисел >=0 ");
        } catch (IllegalArgumentException e) {
        }
    }
}
