package org.example;

import org.example.enums.Drink;
import org.example.enums.Sandwich;
import org.example.model.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant subway = new Restaurant("Subway");

        Sandwich sandwich1 = Sandwich.SALAD_SANDWICH;
        Sandwich sandwich2 = Sandwich.SALAMI_SANDWICH;
        Sandwich sandwich3 = Sandwich.OLIVE_SANDWICH;

        Drink drink1 = Drink.COCACOLA;
        Drink drink2 = Drink.FANTA;
        Drink drink3 = Drink.ICETEA;


        subway.addNewOrder(subway.createOrderDrink(drink1));
        subway.addNewOrder(subway.createOrderDrink(drink2));
        subway.addNewOrder(subway.createOrderDrink(drink3));
        subway.addNewOrder(subway.createOrderSandwich(sandwich1));
        subway.addNewOrder(subway.createOrderSandwich(sandwich2));
        subway.addNewOrder(subway.createOrderSandwich(sandwich3));

//        subway.getAllOrdersDetails();
//        System.out.println(subway.getOrdersTotalPrice());
    }
}