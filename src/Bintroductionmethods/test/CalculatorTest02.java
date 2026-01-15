package Bintroductionmethods.test;

import Bintroductionmethods.domain.Calculator;

public class CalculatorTest02 {
    static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(num1, num2);
        System.out.println("Inside CalculatorTest02");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }
}
