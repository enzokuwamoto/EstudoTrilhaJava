package Bintroductionmethods.domain;

public class Calculator {
    public int onenum;
    public int twonum;

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    // parameters
    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Can't divide by 0.");
            return 0;
        }
        return num1 / num2;
    }

    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers");
        System.out.println("Num1 = " + num1);
        System.out.println("Num2 = " + num2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
