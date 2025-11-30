package Pexception.error.test;

public class StackOverflowTest01 {
    static void main(String[] args) {
        recursion();
    }
    public static void recursion(){
        recursion();
    }
}
