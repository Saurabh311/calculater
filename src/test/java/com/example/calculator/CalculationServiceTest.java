package com.example.calculator;

import com.example.calculator.service.CalculationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    private CalculationService calculationService;

    @BeforeEach
    void setUp() {
        calculationService = new CalculationService();
    }

    @Test
    @DisplayName("Test Addition Operation")
    void testAdd() {
        // Arrange
        double a = 5;
        double b = 3;

        // Act
        double result = calculationService.add(a, b);

        // Assert
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    @DisplayName("Test Subtraction Operation")
    void testSubtract() {
        // Arrange
        double a = 10;
        double b = 4;

        // Act
        double result = calculationService.subtract(a, b);

        // Assert
        assertEquals(6, result, "10 - 4 should equal 6");
    }

    @Test
    @DisplayName("Test Multiplication Operation")
    void testMultiply() {
        // Arrange
        double a = 7;
        double b = 6;

        // Act
        double result = calculationService.multiply(a, b);

        // Assert
        assertEquals(42, result, "7 * 6 should equal 42");
    }

    @Test
    @DisplayName("Test Division Operation")
    void testDivide() {
        // Arrange
        double a = 20;
        double b = 5;

        // Act
        double result = calculationService.divide(a, b);

        // Assert
        assertEquals(4, result, "20 / 5 should equal 4");
    }

    @Test
    @DisplayName("Test Division by Zero Throws Exception")
    void testDivideByZero() {
        // Arrange
        double a = 10;
        double b = 0;

        // Act and Assert
        assertThrows(ArithmeticException.class, () -> calculationService.divide(a, b),
                "Division by zero should throw ArithmeticException");
    }
}