package org.example.operations;
import org.example.interfaces.OperationStrategy;

public class DivideOperation implements OperationStrategy {
    @Override
    public Number calculate(Number num1, Number num2) {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}