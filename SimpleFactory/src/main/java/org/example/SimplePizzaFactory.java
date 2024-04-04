package org.example;

public class SimplePizzaFactory{

    public Pizza createPizza(String type){
        Pizza pizza =null;
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }

}
