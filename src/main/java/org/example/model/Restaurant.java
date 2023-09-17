package org.example.model;

import org.example.enums.Drink;
import org.example.enums.Ingredient;
import org.example.enums.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<OrderItem> orderItems;

    public Restaurant(String name) {
        this.name = name;
        this.orderItems = new ArrayList<>();
    }

    public void addNewOrder(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public double getOrdersTotalPrice() {
        return orderItems.stream()
                .mapToDouble(OrderItem::getPrice)
                .sum();
    }

    public OrderItem createOrderDrink(Drink drink) {
        return new OrderItem(drink.getPrice());
    }

    public OrderItem createOrderSandwich(Sandwich sandwich) {
        return new OrderItem(sandwich.getIngredients().stream()
                .mapToDouble(Ingredient::getPrice)
                .sum());
    }

    public void getAllOrdersDetails() {
        orderItems.forEach(System.out::println);
    }
}