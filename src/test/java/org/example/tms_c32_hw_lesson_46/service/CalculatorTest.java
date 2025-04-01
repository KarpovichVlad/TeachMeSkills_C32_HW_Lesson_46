package org.example.tms_c32_hw_lesson_46.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd_Success(){
        Assertions.assertEquals(3, calculator.add(1,2),"Addition of two positive numbers");
        Assertions.assertEquals(7, calculator.add(8,-1),"Addition of a positive and negative number");
        Assertions.assertEquals(-13, calculator.add(-9,-4), "Addition of two negative numbers");
        Assertions.assertEquals(0, calculator.add(0,0),"Addition of zeros");

    }

    @Test
    void testSubtract_Success(){
        Assertions.assertEquals(99, calculator.subtract(100,1), "Subtraction of two positive numbers");
        Assertions.assertEquals(-27, calculator.subtract(-15,12), "Subtraction of a positive and negative number");
        Assertions.assertEquals(1, calculator.subtract(-33,-34), "Subtraction of two negative numbers");
        Assertions.assertEquals(0, calculator.subtract(0,0), "Subtraction with zeros");
    }

    @Test
    void testMultiply_Success(){
        Assertions.assertEquals(200, calculator.multiply(20, 10), "Multiplication of two positive numbers");
        Assertions.assertEquals(-50, calculator.multiply(-5, 10), "Multiplication of a positive and negative number");
        Assertions.assertEquals(56, calculator.multiply(-7, -8), "Multiplication of two negative numbers");
        Assertions.assertEquals(0, calculator.multiply(0, 9999), "Multiplication with zero");

    }

    @Test
    void testDivide_Success() {
        Assertions.assertEquals(9.9, calculator.divide(99, 10), "Division of two positive numbers");
        Assertions.assertEquals(-4, calculator.divide(-20, 5), "Division of a negative and positive number");
        Assertions.assertEquals(3, calculator.divide(-9, -3), "Division of two negative numbers");
    }

    @Test
    void testDivide_Failure() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw an exception");
    }
}
