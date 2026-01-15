package Tformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main(String[] args) {
        Locale localeBR = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
        nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);
        double value = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(NumberFormat.getInstance().getMaximumFractionDigits());
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(value));
        }
        String stringValue = "R$123.412,00";
        try {
            System.out.println(nfa[1].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
