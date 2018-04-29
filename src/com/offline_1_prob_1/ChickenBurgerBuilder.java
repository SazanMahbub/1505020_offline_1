package com.offline_1_prob_1;

public class ChickenBurgerBuilder implements BurgerBuilder {

    private Burger burger = new Burger();

    @Override
    public void addType() {

        burger.setType("Chicken Burger");

    }

    @Override
    public void addPatty() {

        burger.setPatty("Chicken Burger Patty");

    }

    @Override
    public void addSauce() {

        burger.setSauce("Chicken Burger Sauce");

    }

    @Override
    public void addCheese() {

        burger.setCheese("Chicken Burger Cheese");

    }

    @Override
    public Burger getBurger() {
        return burger;
    }
}
