package org.example;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");

//        Pizza basePizza= new Pizza(false);
//        basePizza.getPizzaPrice();
//        basePizza.addExtraCheese();
//        basePizza.addExtraToppings();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza dp=new DeluxPizza(true);
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.getBill();
    }
}