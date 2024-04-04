package org.example;

public class NyPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            return new NyCheesePizza();
        }
        else if(type.equalsIgnoreCase("veggie")){
            return new NyVeggiePizza();
        }
        return null;
    }
}
