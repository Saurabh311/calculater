package com.example.calculator.repository;

import com.example.calculator.model.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator, Long> {
}
