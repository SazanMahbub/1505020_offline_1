package com.offline_1_prob_2;

// factory design pattern
// singleton design pattern

public class CoffeeFactory {

    private static CoffeeFactory coffeeFactory = null;

    private CoffeeFactory(){}

    public static CoffeeFactory getFactory(){

        if(coffeeFactory == null) {
            coffeeFactory = new CoffeeFactory();
        }

        return coffeeFactory;

    }

    public Coffee produceCoffee(String coffeeType){

        if(coffeeType == null){
            return null;
        }
        else if(coffeeType.equalsIgnoreCase("A")){
            return new CoffeeA();
        }
        else if(coffeeType.equalsIgnoreCase("B")){
            return new CoffeeB();
        }
        else if(coffeeType.equalsIgnoreCase("C")){
            return new CoffeeC();
        }

        return null;

    }



}
