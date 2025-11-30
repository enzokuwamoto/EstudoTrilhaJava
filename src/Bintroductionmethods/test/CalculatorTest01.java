package Bintroductionmethods.test;
import java.util.Scanner;

import Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero a ser divido:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero a ser divido:");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        System.out.println("Finished execute.");
        calculator.multiplyTwoNumbers(10, 20);
        double result = calculator.divideTwoNumbers(num1, num2);
        System.out.println(result);
    }
}

