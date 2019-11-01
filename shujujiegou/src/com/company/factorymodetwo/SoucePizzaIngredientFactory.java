package com.company.factorymodetwo;

public class SoucePizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public void getSource() {
        System.out.println("from SoucePizzaIngredientFactory:getSource");
    }

    @Override
    public void getCheese() {
        System.out.println("from SoucePizzaIngredientFactory:getCheese");
    }

    @Override
    public void getCream() {
        System.out.println("from SoucePizzaIngredientFactory:getCream");
    }
}
