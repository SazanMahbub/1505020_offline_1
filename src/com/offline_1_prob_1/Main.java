package com.offline_1_prob_1;

public class Main {

    public static void main(String[] args) {

        System.out.println("**Takeout Burgers**\n");

        Waiter waiter = new Waiter();
        BurgerBuilder beefBurgerBuilder = new BeefBurgerBuilder();
        BurgerBuilder chickenBurgerBuilder = new ChickenBurgerBuilder();

        waiter.makeBurger(beefBurgerBuilder);
        Burger burger1 = beefBurgerBuilder.getBurger();
        System.out.println(burger1);

        waiter.makeBurger(chickenBurgerBuilder);
        Burger burger2 = chickenBurgerBuilder.getBurger();
        System.out.println(burger2);

    }
}
