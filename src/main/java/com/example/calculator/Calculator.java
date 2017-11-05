package com.example.calculator;

import com.example.calculator.exception.ComputationException;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ComputationException("Division by zero not possible");
        }
        return a / b;
    }
}
