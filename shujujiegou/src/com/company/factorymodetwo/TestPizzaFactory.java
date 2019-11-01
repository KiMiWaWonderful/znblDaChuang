package com.company.factorymodetwo;

public class TestPizzaFactory {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();

        Pizza pizza1 = null;
        Pizza pizza2 = null;
        Pizza pizza3 = null;

        String cheese = "cheese";
        String cream = "cream";
        String souce = "souce";

        pizza1 = nyPizzaStore.createPizza("cheese");
        pizza2 = nyPizzaStore.createPizza("cream");
        pizza3 = nyPizzaStore.createPizza("souce");

        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());
        System.out.println(pizza3.toString());


    }
}
