package Gassociation.test;

import java.util.Scanner;

public class InputKeyboardDataTest02 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ask some question and i will answer for you:");
        String question = in.nextLine();
        if (question.charAt(0) == ' ') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
