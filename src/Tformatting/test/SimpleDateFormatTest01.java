package Tformatting.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    static void main(String[] args) {
        String pattern = "'Mogi das Cruzes,' dd 'of' MMMM',' YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Mogi das Cruzes, 26 of novembro, 2025"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
