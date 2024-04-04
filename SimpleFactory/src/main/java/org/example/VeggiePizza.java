package org.example;

public class VeggiePizza extends Pizza{
    public void prepare(){
        System.out.println("Preparing the veggie pizza");
    }

    public void bake(){
        System.out.println("Baking the veggie pizza");
    }

    public void cut(){
        System.out.println("Cutting the veggie Pizza");
    }

    public void box(){
        System.out.println("Packing the veggie Pizza");
    }
}
