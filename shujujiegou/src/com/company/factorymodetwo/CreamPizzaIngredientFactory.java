package com.company.factorymodetwo;

public class CreamPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public void getSource() {
        System.out.println("from CreamPizzaIngredientFactory:getSource");
    }

    @Override
    public void getCheese() {
        System.out.println("from CreamPizzaIngredientFactory:getCheese");
    }

    @Override
    public void getCream() {
        System.out.println("from CreamPizzaIngredientFactory:getCream");
    }
}
