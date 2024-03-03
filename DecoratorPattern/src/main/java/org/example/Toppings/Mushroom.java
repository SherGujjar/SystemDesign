package org.example.Toppings;

import org.example.BasePIzza.BasePizza;

public class Mushroom extends Topping{
    BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+25;
    }
}
