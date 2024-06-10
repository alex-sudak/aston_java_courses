import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FactorialTest {

    @Test
    public void positiveDigitalsTest() {
        assertEquals(2,
                Calculator.calculate(2));
        assertEquals(24,
                Calculator.calculate(4));
        assertEquals(720,
                Calculator.calculate(6));
        assertEquals(40320, Calculator.calculate(8));
    }

    @Test
    public void zeroTest() {
        assertEquals(1, Calculator.calculate(0));
    }

    @Test
    public void negativeDigitalsTest() {
        assertThrows(IllegalArgumentException.class,
                () -> Calculator.calculate(-1));
    }

}
