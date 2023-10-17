package ru.job4.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        Calculator calculator = new Calculator();
        return Calculator.sum(10) + Calculator.minus(10)
                + calculator.multiply(5) + calculator.divide(20);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        int rslMinus = Calculator.minus(10);
        System.out.println(result);
        System.out.println(rslMinus);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rslDivide = calculator.divide(20);
        int allOperations = calculator.sumAllOperation(20);
        System.out.println(rsl);
        System.out.println(rslDivide);
        System.out.println(allOperations);
    }
}
