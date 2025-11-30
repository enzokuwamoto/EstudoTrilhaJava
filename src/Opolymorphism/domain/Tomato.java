package Opolymorphism.domain;

public class Tomato extends Product{
    public String BestConsumedBefore;
    public static final double TAX_PERCENTAGE = 0.06;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for tomato");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumedBefore() {
        return BestConsumedBefore;
    }

    public void setBestConsumedBefore(String bestConsumedBefore) {
        BestConsumedBefore = bestConsumedBefore;
    }
}
