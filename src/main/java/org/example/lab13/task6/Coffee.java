package org.example.lab13.task6;

import java.util.ArrayList;
import java.util.List;

class Coffee {
    private String type;
    private String size;
    private List<String> toppings;

    public Coffee(String type, String size, List<String> toppings) {
        this.type = type;
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Coffee type=" + type + ", size=" + size + ", toppings=" + toppings;
    }
}

interface CoffeeBuilder {
    void buildType();
    void buildSize();
    void buildToppings();
    Coffee getCoffee();
}

class EspressoBuilder implements CoffeeBuilder {
    private String type;
    private String size;
    private List<String> toppings = new ArrayList<>();

    public void buildType() {
        type = "Espresso";
    }

    public void buildSize() {
        size = "Small";
    }

    public void buildToppings() {
        toppings.add("None");
    }

    public Coffee getCoffee() {
        return new Coffee(type, size, toppings);
    }
}

class CoffeeDirector {
    public Coffee constructCoffee(CoffeeBuilder builder) {
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
        return builder.getCoffee();
    }
}

class Main{
    public static void main(String[] args){
        CoffeeDirector director = new CoffeeDirector();
        CoffeeBuilder espressoBuilder = new EspressoBuilder();
        Coffee espresso = director.constructCoffee(espressoBuilder);
        System.out.println(espresso);
    }
}

