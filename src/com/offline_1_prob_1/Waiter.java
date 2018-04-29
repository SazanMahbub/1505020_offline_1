package com.offline_1_prob_1;

public class Waiter {

    private BurgerBuilder burgerBuilder;

    public void makeBurger(BurgerBuilder builder){

        burgerBuilder = builder;
        burgerBuilder.addType();
        burgerBuilder.addPatty();
        burgerBuilder.addSauce();
        burgerBuilder.addCheese();

    }

}
