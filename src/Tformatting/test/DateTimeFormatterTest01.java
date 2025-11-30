package Tformatting.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("2021-02-19", DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);

        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ITALY);
        String formatIT = LocalDate.now().format(formatterIT);
        System.out.println(formatIT);
        LocalDate parseIT = LocalDate.parse("27.novembre.2025", formatterIT);
        System.out.println(parseIT);
    }
}
