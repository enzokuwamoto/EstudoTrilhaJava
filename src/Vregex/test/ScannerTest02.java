package Vregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    static void main(String[] args) {
        String text = "Levi,Eren,Mikasa,true,200";
        Scanner sc = new Scanner(text);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                System.out.println("Int " + i);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("Boolean " + b);
            } else {
                System.out.println(sc.next());
            }
        }
    }
}
