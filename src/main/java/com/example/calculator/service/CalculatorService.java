package com.example.calculator.service;

import com.example.calculator.model.Calculation;
import com.example.calculator.repository.CalculationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorService {

    private final CalculationRepository calculationRepository;

    public CalculatorService(CalculationRepository calculationRepository) {
        this.calculationRepository = calculationRepository;
    }

    public double add(double number1, double number2) {
        double result = number1 + number2;
        saveCalculation("ADD", number1, number2, result);
        return result;
    }

    public double subtract(double number1, double number2) {
        double result = number1 - number2;
        saveCalculation("SUBTRACT", number1, number2, result);
        return result;
    }

    public double multiply(double number1, double number2) {
        double result = number1 * number2;
        saveCalculation("MULTIPLY", number1, number2, result);
        return result;
    }

    public double divide(double number1, double number2) {
        double result = number1 * number2;
        saveCalculation("DIVIDE", number1, number2, result);
        return result;
    }

    public List<Calculation> getAllCalculation(){
        return calculationRepository.findAll();
    }

    private void saveCalculation(String operation, double number1, double number2, double result) {
        Calculation calculation = new Calculation(operation, number1, number2, result);
        calculationRepository.save(calculation);
    }
}
