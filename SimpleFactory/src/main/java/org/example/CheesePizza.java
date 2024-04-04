package org.example;

public class CheesePizza extends Pizza{
    public void prepare(){
        System.out.println("Preparing the cheese pizza");
    }

    public void bake(){
        System.out.println("Baking the cheese pizza");
    }

    public void cut(){
        System.out.println("Cutting the cheese Pizza");
    }

    public void box(){
        System.out.println("Packing the cheese Pizza");
    }
}
