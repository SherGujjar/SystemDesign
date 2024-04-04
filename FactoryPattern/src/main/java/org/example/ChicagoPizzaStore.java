package org.example;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoCheesePizza();
        }
        else if(type.equalsIgnoreCase("veggie")){
            return new ChicagoVeggiePizza();
        }
        return null;
    }
}
