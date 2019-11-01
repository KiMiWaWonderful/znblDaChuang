package com.company.factorymodetwo;

public class SoucePizza extends Pizza{

    String name;
    String type;
    PizzaIngredientFactory pizzaIngredientFactory;

    public SoucePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        name = "SoucePizza";
        type = "Souce";
    }

    @Override
    void prepare() {
        System.out.println("SoucePizza:prepare");
    }

    @Override
    public String toString() {
        return "SoucePizza{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pizzaIngredientFactory=" + pizzaIngredientFactory +
                '}';
    }
}
