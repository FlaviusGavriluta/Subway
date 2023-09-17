package org.example.enums;

public enum Drink {
    COCACOLA(5),
    FANTA(4),
    ICETEA(3);
    private final double price;

    Drink(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
