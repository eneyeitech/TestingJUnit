import com.eneyeitech.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add 1 and 2, result should be 3")
    void testAddition() {
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(2, 3);

        assertEquals(6 , result);
    }

    @Test
    void testMaxFirstArgGreaterThanSecondArg() {
        int result = calculator.maxOf(2, 1);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void testMaxFirstArgLessThanSecondArg() {
        int result = calculator.maxOf(1, 2);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void testMaxFirstArgEqualToSecondArg() {
        int result = calculator.maxOf(2, 2);
        int expected = 2;

        assertEquals(expected, result);
    }
}
