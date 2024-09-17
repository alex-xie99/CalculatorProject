import org.example.Calculator;
import org.example.CalculatorConfiguration;
import org.example.enums.Operation;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testBasicOperations() {
        Calculator calculator = CalculatorConfiguration.getCalculator();

        assertEquals(5.0, calculator.calculate(Operation.ADD, 2, 3));
        assertEquals(1.0, calculator.calculate(Operation.SUBTRACT, 3, 2));
        assertEquals(6.0, calculator.calculate(Operation.MULTIPLY, 2, 3));
        assertEquals(2.0, calculator.calculate(Operation.DIVIDE, 6, 3));
    }

    @Test
    public void testChainedOperations() {
        Calculator calculator = CalculatorConfiguration.getCalculator();
        Map<Operation, Number> operations = new LinkedHashMap<>();  // Use LinkedHashMap to preserve order
        operations.put(Operation.ADD, 3);
        operations.put(Operation.MULTIPLY, 2);

        assertEquals(16.0, calculator.chain(5, operations));
    }

    @Test
    public void testUnsupportedOperation() {
        Calculator calculator = CalculatorConfiguration.getCalculator();
        Exception exception = assertThrows(UnsupportedOperationException.class, () -> {
            calculator.calculate(null, 2, 3);
        });

        String expectedMessage = "Operation not supported";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = CalculatorConfiguration.getCalculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(Operation.DIVIDE, 4, 0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
