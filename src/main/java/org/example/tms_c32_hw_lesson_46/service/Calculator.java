package org.example.tms_c32_hw_lesson_46.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Divide by zero");
        }
        return (double) a / b;
    }
}
