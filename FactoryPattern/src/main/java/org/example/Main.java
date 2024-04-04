package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        Pizza pizza1 = nyStore.orderPizza("cheese");
        Pizza pizza2 = nyStore.orderPizza("veggie");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza3 = chicagoStore.orderPizza("cheese");
        Pizza pizza4 = chicagoStore.orderPizza("veggie");
    }
}