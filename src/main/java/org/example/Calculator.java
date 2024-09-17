package org.example;


import org.example.enums.Operation;
import org.example.interfaces.OperationStrategy;

import java.util.Map;

public class Calculator {
    private final Map<Operation, OperationStrategy> operations;

    public Calculator(Map<Operation, OperationStrategy> operations) {
        this.operations = operations;
    }

    public Number calculate(Operation operation, Number num1, Number num2) {
        OperationStrategy strategy = operations.get(operation);
        if (strategy == null) {
            throw new UnsupportedOperationException("Operation not supported");
        }
        return strategy.calculate(num1, num2);
    }

    public Number chain(Number initial, Map<Operation, Number> operationSequence) {
        Number result = initial;
        for (Map.Entry<Operation, Number> entry : operationSequence.entrySet()) {
            result = calculate(entry.getKey(), result, entry.getValue());
        }
        return result;
    }
}
