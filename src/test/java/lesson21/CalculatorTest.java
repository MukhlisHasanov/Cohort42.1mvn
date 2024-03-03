package lesson21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void testSub() {
        Assertions.assertEquals(6, calculator.sub(9,3));
    }

    @Test
    public void testMul() {
        Assertions.assertEquals(8,calculator.mul(2,4));
    }

    @Test
    public void testDiv() {
        Assertions.assertEquals(4,calculator.div(16,4));
    }
}
