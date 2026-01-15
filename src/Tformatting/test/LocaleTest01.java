package Tformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");
        Locale localeBrazil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));

    }
}
