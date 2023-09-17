package org.example.enums;

public enum Ingredient {
    BREAD(3),
    SALAMI(5),
    SALAD(7),
    OLIVES(10);

    private final double price;

    Ingredient(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}