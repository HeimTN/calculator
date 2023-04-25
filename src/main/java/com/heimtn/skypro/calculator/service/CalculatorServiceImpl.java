package com.heimtn.skypro.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String plus(int num1, int num2) {
        return num1+" + "+num2+" = "+(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1+" - "+num2+" = "+(num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return num1+" * "+num2+" = "+(num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        if(num2 != 0) return num1+" / "+num2+" = "+(num1 / num2);
        else return "На ноль делить нельзя";
    }
}
