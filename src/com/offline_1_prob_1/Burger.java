package com.offline_1_prob_1;

public class Burger implements Burger_Interface {

    private String type;
    private String patty;
    private String sauce;
    private String cheese;

    @Override
    public void setType(String type) {

        this.type = type;

    }

    @Override
    public void setPatty(String patty) {

        this.patty = patty;

    }

    @Override
    public void setSauce(String sauce) {

        this.sauce = sauce;

    }

    @Override
    public void setCheese(String cheese) {

        this.cheese = cheese;

    }

    @Override
    public String toString() {

        return("Burger Type: " + type +
                ", \nPatty: " + patty + ", Sauce: " + sauce + ", Cheese: " + cheese+"\n");

    }
}
