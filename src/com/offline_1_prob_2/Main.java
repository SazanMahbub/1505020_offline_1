package com.offline_1_prob_2;

public class Main {
    public static void main(String[] args) {

        CoffeeFactory coffeeFactory = CoffeeFactory.getFactory();

        Coffee coffee = null;

        coffee = coffeeFactory.produceCoffee("A");
        coffee.showCoffeeIngredients();

        coffee = coffeeFactory.produceCoffee("B");
        coffee.showCoffeeIngredients();

        coffee = coffeeFactory.produceCoffee("C");
        coffee.showCoffeeIngredients();

    }
}
