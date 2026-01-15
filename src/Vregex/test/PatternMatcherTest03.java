package Vregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    static void main(String[] args) {
        // \d - All the digits 0-9
        // \D - Everything that is not \d
        // \s - all the blank space \t \r \f \n
        // \S - everything that is not \s
        // \w - all the letters a-zA-Z, 0-9, _
        // \W - everything that is not \w
        // []

//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
//        String text = "abaaba";
        String text2 = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println(" Text: " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found.");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
        int hexNumber = 0X1;
        System.out.println(hexNumber);
    }
}
