package com.example.calculator.controller;

import com.example.calculator.model.Calculation;
import com.example.calculator.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/calculator")
public class CalculationController {
    private final CalculatorService calculatorService;

    public CalculationController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public ResponseEntity<Double> add(@RequestParam Double number1,@RequestParam Double number2 ){
        double result = calculatorService.add(number1,number2);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/subtract")
    public ResponseEntity<Double> subtract(@RequestParam Double number1,@RequestParam Double number2 ){
        double result = calculatorService.subtract(number1,number2);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestParam Double number1,@RequestParam Double number2 ){
        double result = calculatorService.multiply(number1,number2);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/divide")
    public ResponseEntity<Double> divide(@RequestParam Double number1,@RequestParam Double number2 ){
        double result = calculatorService.divide(number1,number2);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/history")
    public ResponseEntity<List<Calculation>> getHistory(){
        List<Calculation> calculationHistoryList = calculatorService.getAllCalculation();
        return ResponseEntity.ok(calculationHistoryList);
    }
}
