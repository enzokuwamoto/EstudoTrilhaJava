package ZZJdesignpatterns.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case EUA:
                return new UsDollar();
            case BRASIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency for the given country");
        }

    }
}
