package Pexception.runtime.test;

public class RuntimeExceptionTest03 {
    static void main(String[] args) {
        division(1,0);
    }

    private static int division(int a, int b) {
        return a / b;
    }
}


