package com.example.calculator.service;

import com.example.calculator.model.Calculation;
import com.example.calculator.repository.CalculationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CalculationService {

    @Autowired
    private CalculationRepository calculationRepository;

    // In-memory list to store calculation history
    private final List<Calculation> history = new ArrayList<>();

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
        double result = number1 / number2;
        saveCalculation("DIVIDE", number1, number2, result);
        return result;
    }

    public List<Calculation> getHistory(){
        //return calculationRepository.findAll();
        return history;
    }

    private void saveCalculation(String operation, double number1, double number2, double result) {
        Calculation calculation = new Calculation(operation, number1, number2, result);
        //calculationRepository.save(calculation);
        history.add(calculation);
    }
}
