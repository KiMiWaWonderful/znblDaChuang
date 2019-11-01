package com.company.factorymodetwo;

public class CreamPizza extends Pizza{

    String name;
    String type;
    PizzaIngredientFactory pizzaIngredientFactory;

    public CreamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "CreamPizza";
        type = "Cream";
    }

    @Override
    void prepare() {
        System.out.println("CreamPizza:prepare");
    }

    @Override
    public String toString() {
        return "CreamPizza{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pizzaIngredientFactory=" + pizzaIngredientFactory +
                '}';
    }
}
