package org.example.model;

public class OrderItem {
    private double price;

    public OrderItem(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "price=" + price +
                '}';
    }
}
