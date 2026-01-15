package Vregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    static void main(String[] args) {
        // \d - All the digits 0-9
        // \D - Everything that is not \d
        // \s - all the blank space \t \r \f \n
        // \S - everything that is not \s
        // \w - all the letters a-zA-Z, 0-9, _
        // \W - everything that is not \w
        // []
        // ? zero or one
        // * zero or more
        // + one or more
        // {0,m} from n to m
        // () persons or persona
        // $ end of the line
        // . 1.3 123, 133, 1A3, 1@3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text2 = "luffy@hotmail.com, 123jotaro@gmail.com.br, #@!zoro@mail.br, test@gmail.com, sakura@mail";
        String[] emails = text2.split(",");
        System.out.println(emails[1].trim().matches(regex));
        System.out.println("#@!zoro@mail.br".matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text: " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found.");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
