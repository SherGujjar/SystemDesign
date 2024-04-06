package org.example;

public class Main {
    public static void main(String[] args) {
        Tea t = new Tea();
        CoffeeWithHook c = new CoffeeWithHook();

        t.prepareDrink();
        c.prepareDrink();

    }
}