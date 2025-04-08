package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(5, 3);

        System.out.println("Addition Result: " + sum);
        System.out.println("Subtraction Result: " + difference);
    }
}
