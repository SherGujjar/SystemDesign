package org.example.Toppings;

import org.example.BasePIzza.BasePizza;

public class ExtraChees extends Topping{

    public BasePizza basePizza;

    public ExtraChees(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+10;
    }
}
