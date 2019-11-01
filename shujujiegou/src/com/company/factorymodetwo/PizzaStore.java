package com.company.factorymodetwo;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
            Pizza pizza;

            pizza = createPizza(type);

            pizza.bake();
            pizza.box();;
            pizza.cut();

            return pizza;
    }

    public abstract Pizza createPizza(String type);
}
