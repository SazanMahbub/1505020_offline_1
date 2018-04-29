package com.offline_1_prob_2;

public class CoffeeC implements Coffee {

    private String sugar = "sugar";

    @Override
    public void showCoffeeIngredients() {

        System.out.println("CoffeeC ingredients:\n\t(1)"+milk+", (2)"+caffeine+", (3)"+sugar);

    }
}
