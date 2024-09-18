package com.example.calculator;

import com.example.calculator.service.CalculationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationServiceTests {

    @Autowired
    private CalculationService calculationService = new CalculationService();

    @Test
    void testAddition() {
        assertEquals(5, calculationService.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculationService.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculationService.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculationService.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        try {
            calculationService.divide(1, 0);
        } catch (ArithmeticException e) {
            assertEquals("Division by zero is not allowed", e.getMessage());
        }
    }
}
