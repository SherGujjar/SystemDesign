package org.example;

public class NyVeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing the pizza"+this.getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking the pizza"+this.getClass().getSimpleName());
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza"+this.getClass().getSimpleName());
    }

    @Override
    public void pack() {
        System.out.println("packing the pizza"+this.getClass().getSimpleName());
    }
}
