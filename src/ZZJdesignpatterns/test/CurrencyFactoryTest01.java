package ZZJdesignpatterns.test;

import ZZJdesignpatterns.domain.Country;
import ZZJdesignpatterns.domain.Currency;
import ZZJdesignpatterns.domain.CurrencyFactory;

public class CurrencyFactoryTest01 {
    static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRASIL);
        System.out.println(currency.getSymbol());
    }
}
