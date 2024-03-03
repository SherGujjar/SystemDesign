package org.example;

import org.example.BasePIzza.BasePizza;
import org.example.BasePIzza.Margherita;
import org.example.Toppings.ExtraChees;
import org.example.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraChees(new Margherita());

        BasePizza pizza2 = new Mushroom(pizza1);

        BasePizza pizza3 = new ExtraChees(pizza2);

        System.out.println("Price of pizza1 "+pizza1.cost());

        System.out.println("Price of pizza2 "+pizza2.cost());

        System.out.println("Price of pizza3 "+pizza3.cost());

    }
}