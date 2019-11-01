package com.company.factorymodetwo;

public class CheesePizza extends Pizza{

    String name;
    String type;

//    String souce;
//    String cheese;
//    String cream;
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "CheesePizza";
        type = "Cheese";

    }

    @Override
    void prepare() {
        System.out.println("CheesePizza:prepare");
    }

    @Override
    public String toString() {
        return "CheesePizza{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pizzaIngredientFactory=" + pizzaIngredientFactory +
                '}';
    }
}
