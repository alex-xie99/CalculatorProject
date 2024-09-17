package org.example;

import org.example.enums.Operation;

import org.example.interfaces.OperationStrategy;
import org.example.operations.AddOperation;
import org.example.operations.DivideOperation;
import org.example.operations.MultiplyOperation;
import org.example.operations.SubtractOperation;

import java.util.HashMap;
import java.util.Map;

public class CalculatorConfiguration {

    public static Calculator getCalculator() {
        Map<Operation, OperationStrategy> operations = new HashMap<>();
        operations.put(Operation.ADD, new AddOperation());
        operations.put(Operation.SUBTRACT, new SubtractOperation());
        operations.put(Operation.MULTIPLY, new MultiplyOperation());
        operations.put(Operation.DIVIDE, new DivideOperation());

        return new Calculator(operations);
    }
}
