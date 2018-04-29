package com.offline_1_prob_1;

public class BeefBurgerBuilder implements BurgerBuilder {

    private Burger burger = new Burger();

    @Override
    public void addType() {

        burger.setType("Beef Burger");

    }

    @Override
    public void addPatty() {

        burger.setPatty("Beef Burger Patty");

    }

    @Override
    public void addSauce() {

        burger.setSauce("Beef Burger Sauce");

    }

    @Override
    public void addCheese() {

        burger.setCheese("Beef Burger Cheese");

    }

    @Override
    public Burger getBurger() {
        return burger;
    }
}
