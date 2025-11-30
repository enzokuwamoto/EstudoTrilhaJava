package Rstring.test;

public class StringPerfomanceTest01 {
    static void main(String[] args) {
        long begin = System.currentTimeMillis();
        concatString(100_000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuilder(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder " + (end - begin) + "ms");

        begin = System.currentTimeMillis();
        concatStringBuffer(100_000);
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer " + (end - begin) + "ms");
    }

    public static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    public static void concatStringBuilder(int size) {
        // StringBuilder text = new StringBuilder(size); Nem sempre é positivo devido sua complexidade no entender do código
        // text.append("Hello my name is Enzo");
        StringBuilder text = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }

    public static void concatStringBuffer(int size) { // access a multiple threads on the same time
        StringBuffer text = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            text.append(i);
        }
    }
}
