package com.company.factorymodetwo;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory ;

        if(type == "cheese"){
            pizzaIngredientFactory = new CheesePizzaIngredientFactory();
            pizza = new CheesePizza(pizzaIngredientFactory);
            return pizza;
        }else if(type == "cream"){
            pizzaIngredientFactory = new CreamPizzaIngredientFactory();
            pizza = new CreamPizza(pizzaIngredientFactory);
            return pizza;
        }else if(type == "souce"){
            pizzaIngredientFactory = new SoucePizzaIngredientFactory();
            pizza = new SoucePizza(pizzaIngredientFactory);
            return pizza;
        }else {
            return null;
        }


    }
}
