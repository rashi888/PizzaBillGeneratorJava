package org.example;

public class DeluxPizza extends Pizza{
    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }

    public DeluxPizza(Boolean veg){
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
