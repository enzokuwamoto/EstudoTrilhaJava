package Opolymorphism.domain;

public class Computer extends Product{
    public static final double TAX_PERCENTAGE = 0.21;
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax value for computer");
        return this.price * TAX_PERCENTAGE;
    }
}
