package Tformatting.test;

import java.util.Locale;

public class LocaleTest02 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage+" ");
        }
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry+" ");
        }

    }
}
