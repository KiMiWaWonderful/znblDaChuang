package com.company.factorymodetwo;

public class CheesePizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public void getSource() {
        System.out.println("from CheesePizzaIngredientFactory:getSource");
    }

    @Override
    public void getCheese() {
        System.out.println("from CheesePizzaIngredientFactory:getCheese");
    }

    @Override
    public void getCream() {
        System.out.println("from CheesePizzaIngredientFactory:getCream");
    }
}
