package org.example.operations;
import org.example.interfaces.OperationStrategy;

public class AddOperation implements OperationStrategy {
    @Override
    public Number calculate(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}