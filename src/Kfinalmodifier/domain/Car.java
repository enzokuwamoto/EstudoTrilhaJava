package Kfinalmodifier.domain;

public class Car {
    private String name;
    public static final double SPEED_LIMIT;
    public final Buyer BUYER = new Buyer();



    static {
        SPEED_LIMIT = 250;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

