package com.example.calculator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Calculator {
    @Id
    @GeneratedValue
    private Long id;
    private double number1;
    private double number2;
    private double result;
    private String operation;

    public Calculator() {
    }

    public Calculator(String operation, double number1, double number2, double result) {
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }
}
